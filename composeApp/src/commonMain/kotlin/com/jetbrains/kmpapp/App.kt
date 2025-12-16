package com.jetbrains.kmpapp

import androidx.compose.runtime.Composable
import com.cunningham.sharedfeature.SharedFeatureScreen
import kotlinx.serialization.Serializable

@Serializable
object ListDestination

@Serializable
data class DetailDestination(val objectId: Int)

@Composable
fun App() {
    SharedFeatureScreen()
}
