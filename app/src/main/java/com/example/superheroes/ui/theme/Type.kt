package com.example.superheroes.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.superheroes.R

// Set of Material typography styles to start with

val PixelifySans = FontFamily(
    Font(R.font.pixelifysans_regular),
    Font(R.font.pixelifysans_bold, FontWeight.Bold)
)

val Typography = Typography(
    displayMedium = TextStyle(
        fontFamily = PixelifySans,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    labelSmall = TextStyle(
        fontFamily = PixelifySans,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = PixelifySans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )

)