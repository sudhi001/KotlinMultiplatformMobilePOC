package com.stabilix.app.kmm.poc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform