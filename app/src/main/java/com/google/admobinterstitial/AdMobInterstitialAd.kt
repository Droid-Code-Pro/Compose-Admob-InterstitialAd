package com.google.admobinterstitial

import android.app.Activity
import android.widget.Toast
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class AdMobInterstitialAd {
  private var interstitialAd:InterstitialAd? = null
  
  fun loadAd(activity: Activity,adId:String,onAdLoadComplete:() -> Unit ={}){
    val adRequest = AdRequest.Builder().build()
    InterstitialAd.load(activity,adId,adRequest, object : InterstitialAdLoadCallback() {
      override fun onAdFailedToLoad(p0: LoadAdError) {
        super.onAdFailedToLoad(p0)
      }
      
      override fun onAdLoaded(ad: InterstitialAd) {
        super.onAdLoaded(ad)
        interstitialAd = ad
        Toast.makeText(activity,"Ad Loaded",Toast.LENGTH_SHORT).show()
        onAdLoadComplete()
      }
    })
  }
  
  fun showAd(activity: Activity,onAdShowComplete:() -> Unit ={}){
    interstitialAd?.show(activity)
    interstitialAd?.fullScreenContentCallback = object :FullScreenContentCallback(){
      override fun onAdClicked() {
        super.onAdClicked()
      }
      override fun onAdDismissedFullScreenContent() {
        super.onAdDismissedFullScreenContent()
        onAdShowComplete()
      }
      
      override fun onAdFailedToShowFullScreenContent(p0: AdError) {
        super.onAdFailedToShowFullScreenContent(p0)
      }
      
      override fun onAdImpression() {
        super.onAdImpression()
      }
      
      override fun onAdShowedFullScreenContent() {
        super.onAdShowedFullScreenContent()
      }
    }
  }
}