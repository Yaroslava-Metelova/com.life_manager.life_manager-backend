package com.life_manager

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.life_manager.plugins.*

fun main() {
    embeddedServer(Netty, port = System.getenv("PORT").toInt()) {
        configureRouting()
        configureSerialization()
    }.start(wait = true)
}
