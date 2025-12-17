package com.cunningham.sharedfeature

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

fun createSharedFeatureViewController(): UIViewController {
    return ComposeUIViewController {
        SharedFeatureScreen()
    }
}
