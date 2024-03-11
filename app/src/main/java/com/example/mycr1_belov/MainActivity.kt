package com.example.mycr1_belov

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycr1_belov.ui.theme.Mycr1_BelovTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mycr1_BelovTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainWindow()
                }
            }
        }
    }
}

@Composable
fun MainWindow( modifier: Modifier = Modifier) {
    val iconPhone = Icons.Default.Phone
    val iconSocials=Icons.Default.Share
    val iconMail=Icons.Default.Email

    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                //.background(color = colorBackTile)
                .align(alignment = Alignment.CenterHorizontally)
                .padding(top = 22.dp, bottom = 23.dp, start = 16.dp, end = 16.dp)
        ) {
            Box(
                modifier = Modifier
                    .padding(bottom = 0.dp, top = 250.dp, end = 0.dp, start = 0.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.ava),
                    contentDescription = "Avatar",
                    modifier = Modifier
                        .size(100.dp)
                )

            }


        }
        Text(
            text = "Dmitro Belov",
            fontSize = 36.sp,
            modifier = Modifier
                //.padding(start = 12.dp, bottom = 23.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = "Android Developer",
            fontSize = 18.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )


        Box(
            modifier = modifier
                .align(alignment = Alignment.Start)
                //.background(color = Color(red = 226, blue = 216, green = 227))
                .padding(top = 100.dp, start= 80.dp)
        ) {
            Icon(
                imageVector = iconPhone,
                tint = Color.Black,
                contentDescription = "Phone",
                modifier = Modifier
                    .padding(all = 12.dp)
                    .size(24.dp)
            )
            Text(
                text = "+11 (123) 444 555 666",
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(bottom = 12.dp, top = 12.dp, end = 12.dp, start = 60.dp)

            )
        }
        Box(
            modifier = modifier
                .align(alignment = Alignment.Start)
                //.background(color = Color(red = 226, blue = 216, green = 227))
                .padding(top = 0.dp, start= 80.dp)
        ) {
            Icon(
                imageVector = iconSocials,
                tint = Color.Black,
                contentDescription = "Share",
                modifier = Modifier
                    .padding(bottom = 12.dp, top = 12.dp, end = 12.dp, start = 12.dp)
                    .size(24.dp)
            )
            Text(
                text = "@AndroidDev",
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(bottom = 12.dp, top = 12.dp, end = 12.dp, start = 60.dp)

            )
        }
        Box(
            modifier = modifier
                .align(alignment = Alignment.Start)
                //.background(color = Color(red = 226, blue = 216, green = 227))
                .padding(top = 0.dp, start= 80.dp)
        ) {
            Icon(
                imageVector = iconMail,
                tint = Color.Black,
                contentDescription = "Email",
                modifier = Modifier
                    .padding(all = 12.dp)
                    .size(24.dp)
            )
            Text(
                text = "Azazak142@gmail.com",
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(bottom = 12.dp, top = 12.dp, end = 12.dp, start = 60.dp)

            )
        }



    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Mycr1_BelovTheme {
        MainWindow()
    }
}