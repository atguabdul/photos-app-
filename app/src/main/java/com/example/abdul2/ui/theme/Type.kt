package com.example.abdul2.ui.theme

import android.hardware.lights.Light
import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.abdul2.R

val fontFamily = FontFamily(
    Font(R.font.roboto_slab,FontWeight.Light)
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    subtitle2 = TextStyle(
        color = Color(0xFF3f51b5),
        shadow = Shadow(Color(0xFF000000)),
        textAlign = TextAlign.Center,
        fontFamily = fontFamily,
        letterSpacing = 0.50.sp,
        fontSize = 30.sp
    )
)