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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.letsexplore.ui.theme.LetsExploreTheme
//import android.os.Bundle
//import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
//import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController


@Composable
fun DetailScreen(navController: NavController, NameOfPlace: String) {
    val CustomB = Color(0xFFBFECEA)
    val CustomBlue = Color(0xFF26A1A1)
    val Custom = Color(0xFF044F4F)

    Column(modifier = Modifier.padding(16.dp)) {
        Spacer(modifier = Modifier.height(80.dp))
        Text(
            text = "Welcome to $NameOfPlace",
            fontSize = 30.sp,
            color = Custom,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        Column {
            Card(modifier = Modifier.padding(8.dp).height(500.dp).width(400.dp),
                colors = CardDefaults.cardColors(
                    containerColor = CustomB,
                    contentColor = Color.Black
                )) {
                Text(modifier=Modifier.padding(16.dp),
                    fontSize = 20.sp,
                    color = Color.Black,
//                    fontWeight = FontWeight.Bold,
                    text = when (NameOfPlace) {
                        "Maharashtra" -> "Culture: Marathi literature, Lavani dance, and Peshwa Maratha history."
                        "Gujarat" -> "Culture: Gujarati folk music, Garba dance, and Kutch embroidery."
                        "West Bengal" -> "Culture: Rabindra Sangeet, Bengali New Year (Pohela Boishakh), and traditional Bengali cuisine."
                        "Rajasthan" -> "Culture: Folk music, traditional dances like Ghoomar, and vibrant handicrafts."
                        "Punjab" -> "Culture: Bhangra dance, Gidda, and Punjabi folk music."
                        "Tamil Nadu" -> "Culture: Carnatic music, Bharatanatyam dance, and classical Tamil literature."
                        "Kerala" -> "Culture: Kathakali dance, Onam festival, and traditional Ayurveda."
                        "Karnataka" -> "Culture: Carnatic music, Yakshagana, and Mysore silk sarees."
                        "Madhya Pradesh" -> "Culture: Traditional dance forms like Gaur, and beautiful handicrafts from Chanderi and Maheshwar."
                        "Uttar Pradesh" -> "Culture: Hindustani classical music, Kathak dance, and rich Mughal architecture."
                        else -> "Culture: Rich cultural heritage."
                    }
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(modifier=Modifier.padding(16.dp),fontSize = 20.sp,
                    color = Color.Black,
//                    fontWeight = FontWeight.Bold,
                    text = when (NameOfPlace) {
                        "Maharashtra" -> "Festivals: Ganesh Chaturthi (Mumbai), Gudi Padwa (Pune), Makar Sankranti."
                        "Gujarat" -> "Festivals: Navratri, Uttarayan (Kite Festival), and Diwali."
                        "West Bengal" -> "Festivals: Durga Puja, Poila Boishakh, and Kali Puja."
                        "Rajasthan" -> "Festivals: Pushkar Camel Fair, Teej, and Gangaur."
                        "Punjab" -> "Festivals: Baisakhi, Lohri, and Diwali."
                        "Tamil Nadu" -> "Festivals: Pongal, Tamil New Year, and Deepavali."
                        "Kerala" -> "Festivals: Onam, Vishu, and Thrissur Pooram."
                        "Karnataka" -> "Festivals: Ugadi, Dasara (Mysuru), and Karaga."
                        "Madhya Pradesh" -> "Festivals: Tansen Music Festival, Khajuraho Dance Festival, and Diwali."
                        "Uttar Pradesh" -> "Festivals: Kumbh Mela, Diwali, and Holi."
                        else -> "Festivals: Various local festivals."
                    }
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    modifier = Modifier.padding(16.dp),
                    fontSize = 20.sp,
                    color = Color.Black,
//                    fontWeight = FontWeight.Bold,
                    text = when (NameOfPlace) {

                        "Maharashtra" -> "Handicrafts: Warli painting, Kolhapuri chappals, Paithani sarees."
                        "Gujarat" -> "Handicrafts: Bandhej (Tie-dye), Patola sarees, and Kutch embroidery."
                        "West Bengal" -> "Handicrafts: Baluchari sarees, Kantha stitching, and Terracotta art."
                        "Rajasthan" -> "Handicrafts: Blue pottery, Bandhej, and Wooden puppets."
                        "Punjab" -> "Handicrafts: Phulkari embroidery, Patiala Salwar, and Bangles."
                        "Tamil Nadu" -> "Handicrafts: Tanjore paintings, Kanchipuram sarees, and Bronze sculptures."
                        "Kerala" -> "Handicrafts: Mural paintings, Nettur caskets, and Coir products."
                        "Karnataka" -> "Handicrafts: Channapatna toys, Sandalwood carvings, and Mysore silk."
                        "Madhya Pradesh" -> "Handicrafts: Chanderi fabric, Dhokra metal crafts, and Batik painting."
                        "Uttar Pradesh" -> "Handicrafts: Chikan embroidery, Brassware, and Benaras silk sarees."
                        else -> "Handicrafts: Various local handicrafts."
                    }
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    fontSize = 20.sp,
                    color = Color.Black,
//                    fontWeight = FontWeight.Bold,
                    text = when (NameOfPlace) {
                        "Maharashtra" -> "Famous Places: Gateway of India (Mumbai), Ajanta and Ellora Caves, and Shirdi."
                        "Gujarat" -> "Famous Places: Rann of Kutch, Somnath Temple, and Gir National Park."
                        "West Bengal" -> "Famous Places: Howrah Bridge, Sundarbans, and Victoria Memorial."
                        "Rajasthan" -> "Famous Places: Amber Fort, Jaipur, and Udaipur Lake Palace."
                        "Punjab" -> "Famous Places: Golden Temple (Amritsar), Wagah Border, and Anandpur Sahib."
                        "Tamil Nadu" -> "Famous Places: Meenakshi Temple (Madurai), Marina Beach (Chennai), and Ooty."
                        "Kerala" -> "Famous Places: Alleppey Backwaters, Munnar, and Periyar Wildlife Sanctuary."
                        "Karnataka" -> "Famous Places: Hampi, Coorg, and Chikmagalur."
                        "Madhya Pradesh" -> "Famous Places: Khajuraho Temples, Kanha National Park, and Sanchi Stupa."
                        "Uttar Pradesh" -> "Famous Places: Taj Mahal (Agra), Varanasi Ganges, and Lucknow."
                        else -> "Famous Places: Various popular attractions."
                    },modifier=Modifier.padding(16.dp)
                )

            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("main") },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                colors = androidx.compose.material3.ButtonDefaults.buttonColors(containerColor = CustomBlue),
            ) {
                Text(text="Go Back",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    )
            }
        }
    }
}
