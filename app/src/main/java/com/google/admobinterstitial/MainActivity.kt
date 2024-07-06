package com.google.admobinterstitial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.admobinterstitial.ui.component.DroidTopAppBar
import com.google.admobinterstitial.ui.theme.AdmobInterstitialTheme
import com.google.android.gms.ads.MobileAds

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    MobileAds.initialize(this)
    enableEdgeToEdge()
    setContent {
      AdmobInterstitialTheme {
        Scaffold(modifier = Modifier.fillMaxSize(),
          topBar = { DroidTopAppBar() }) { innerPadding ->
       Surface(modifier = Modifier.padding(innerPadding)) {
         AdmobInterstitialScreen()
       }
        }
      }
    }
  }
}
