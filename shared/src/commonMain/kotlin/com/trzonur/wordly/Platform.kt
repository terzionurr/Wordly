package com.trzonur.wordly

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform