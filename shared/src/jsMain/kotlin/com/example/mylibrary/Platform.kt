package com.example.mylibrary

class JsPlatform : Platform {
    override val name: String = "PlatForm"
}

actual fun getPlatform(): Platform {
    return JsPlatform()
}