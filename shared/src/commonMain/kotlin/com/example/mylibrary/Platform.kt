package com.example.mylibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform