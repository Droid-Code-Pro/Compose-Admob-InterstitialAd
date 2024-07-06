package com.google.admobinterstitial

import android.app.Activity
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import java.util.Collections.rotate

@Composable
fun AdmobInterstitialScreen() {
  val activity = LocalContext.current as Activity
  val adId = stringResource(id = R.string.admob_Interstitial_ad)
  val interstitialAd = remember { AdMobInterstitialAd() }
  var adLoadState by remember { mutableStateOf(false) }
  
  Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.SpaceAround,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Row(verticalAlignment = Alignment.CenterVertically) {
      Text(text = "Ad loaded: ")
    Icon(imageVector = Icons.Default.ThumbUp,
      modifier = Modifier.rotate( if(adLoadState){ 0f}else{180f}),
      contentDescription = null )
    }
    
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
      Button(onClick = { interstitialAd.loadAd(activity,adId){adLoadState = true} }) {
        Text(text = "Load Ad")
      }
      Button(onClick = { interstitialAd.showAd(activity){adLoadState = false} }) {
        Text(text = "Show Ad")
      }
    }
  }
}

  




