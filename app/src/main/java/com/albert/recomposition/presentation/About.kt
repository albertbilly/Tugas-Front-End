package com.albert.recomposition.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.albert.recomposition.R


@Composable
fun About() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        // Menggunakan painterResource() untuk mendapatkan Painter dari gambar
        val imagePainter = painterResource(R.drawable.gue)

        // Menggunakan Image() dengan Painter sebagai argument
        Image(
            painter = imagePainter,
            contentDescription = "Foto Profil",
            modifier = Modifier.fillMaxWidth().padding(20.dp).size(width = 300.dp, height = 300.dp).clip(
                CircleShape)
        )
        Text(
            text = "Email: 211111021@gmail.com",
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(vertical = 4.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Perguruan Tinggi: STIKI Malang",
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(vertical = 4.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Jurusan: Informatika",
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(vertical = 4.dp),
            textAlign = TextAlign.Center
        )


    }
}
