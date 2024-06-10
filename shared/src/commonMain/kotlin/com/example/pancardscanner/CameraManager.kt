package com.example.pancardscanner

import androidx.compose.runtime.Composable
import network.chaintech.cmpimagepickncrop.utils.SharedImage

@Composable
expect fun rememberCameraManager(onResult: (SharedImage?) -> Unit): CameraManager


expect class CameraManager(
    onLaunch: () -> Unit
) {
    fun launch()
}
