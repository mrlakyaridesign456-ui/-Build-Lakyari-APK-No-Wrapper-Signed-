package com.lakyari.auroraluxe

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.lifecycle.lifecycleScope
import com.airbnb.lottie.compose.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier.fillMaxSize().background(Brush.verticalGradient(listOf(Color(0xFF000000), Color(0xFF060606)))), contentAlignment = Alignment.Center) {
                val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.lakyari_intro))
                val progress by animateLottieCompositionAsState(composition, iterations = 1)
                LottieAnimation(composition, progress)
            }
        }
        lifecycleScope.launch {
            delay(3800) // slightly longer than animation
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }
    }
}
