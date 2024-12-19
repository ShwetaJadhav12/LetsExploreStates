package com.example.letsexplore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.letsexplore.ui.theme.LetsExploreTheme
//import android.os.Bundle
//import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
//import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LetsExploreTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = "main") {
                        composable("main") {
                            MainView(navController = navController)
                        }
                        composable("detail/{NameOfPlace}") { backStackEntry ->
                            val stateName = backStackEntry.arguments?.getString("NameOfPlace") ?: ""
                            DetailScreen(navController = navController, NameOfPlace = stateName)
                        }
                    }
                }
            }
        }
    }



    val Images = listOf(
        R.drawable.gujrat,
        R.drawable.wb,
        R.drawable.rajasthan,
        R.drawable.punjab,
        R.drawable.tamilnadu,
        R.drawable.kerela,
        R.drawable.maharastra,
        R.drawable.karnataka,
        R.drawable.madhyapradesh,
        R.drawable.up
    )
    val text = listOf(
        "Gujarat",
        "West Bengal",
        "Rajasthan",
        "Punjab",
        "Tamil Nadu",
        "Kerala",
        "Maharashtra",
        "Karnataka",
        "Madhya Pradesh",
        "Uttar Pradesh"
    )


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MainView(navController: NavHostController) {
        val customPink = Color(0xFFE1E5E5)
        val customBlue = Color(0xFF57C5C5)

        // Scaffold layout
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "Lets Explore") },
                    colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = customBlue),
                    modifier = Modifier.fillMaxWidth()
                )
            },
            content = { innerPadding ->
                Column(modifier = Modifier.padding(innerPadding)) {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        modifier = Modifier.padding(8.dp)
                    ) {

                        items(Images.size) { index ->

                            Card(
                                modifier = Modifier
                                    .padding(8.dp)
                                    .height(150.dp)
                                    .fillMaxWidth(),
                                shape = RoundedCornerShape(10.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = customPink,
                                    contentColor = Color.White
                                ),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 10.dp
                                ),
                                onClick = {
                                    navController.navigate("detail/${text[index]}")

                                }
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(10.dp), // Padding for the column inside the card
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = Images[index]),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .width(170.dp)
                                            .height(170.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        )
    }
}