package com.sample.shared

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

fun createSharedFeatureViewController(): UIViewController {
    return ComposeUIViewController {
        SharedFeatureScreen()
    }
}
