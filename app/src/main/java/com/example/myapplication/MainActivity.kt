package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                WelcomeScreen()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    MaterialTheme {
        content()
    }
}

@Composable
fun WelcomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.bgsplashcreen), // Replace with your image resource
            contentDescription = "bgsplashsreen",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop

        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent), // Transparan agar gambar latar terlihat
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
//
            // Illustration Image
            Image(
                painter = painterResource(R.drawable.iconorg),
                contentDescription = "iconorg",
                modifier = Modifier
                    .requiredHeight(500.dp)
                    .requiredWidth(337.dp)
                    .size(300.dp)
                    .offset(y = (-50.dp))
            )

            // Text Column
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(20.dp)
                    .offset(y = (-100 .dp))

            ) {
                Spacer(modifier = Modifier.height(10.dp))
                // Title Text
                Text(
                    text = "Konsultasi Walet di Ujung Jari Anda",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color(0xFF17466E),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 1.dp)

                )

                // Description Text
                Text(
                    text = "Tingkatkan hasil sarang walet Anda dengan pengetahuan dan manajemen yang tepat dari para ahli.",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color(0xFF2B3A67),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 4.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Page Indicator
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .background(Color.Gray, shape = RoundedCornerShape(50))
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .background(Color.Black, shape = RoundedCornerShape(50))
                    )
                }
            }

            // Bottom Shape with Button
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .offset(y = (-90.dp))
                    .background(
                        color = Color(0xFFFFFF),
                        shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { /* Handle button click */ },
                    colors = ButtonDefaults.buttonColors(Color(0xFF437BD9)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(horizontal = 70.dp),
                ) {
                    Text(
                        text = "Mulai",
                        color = Color.White,
                        fontSize = 16.sp

                    )

                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        WelcomeScreen()
    }
}