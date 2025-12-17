package com.jetbrains.kmpapp

import androidx.compose.runtime.Composable
import com.sample.shared.SharedFeatureScreen
import kotlinx.serialization.Serializable

@Serializable
object ListDestination

@Serializable
data class DetailDestination(val objectId: Int)

@Composable
fun App() {
    SharedFeatureScreen()
}
