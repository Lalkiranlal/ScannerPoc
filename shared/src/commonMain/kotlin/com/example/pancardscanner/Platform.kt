package com.example.pancardscanner

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform