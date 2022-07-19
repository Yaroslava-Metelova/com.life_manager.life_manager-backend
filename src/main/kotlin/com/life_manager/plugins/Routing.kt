package com.life_manager.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import kotlinx.serialization.Serializable

@Serializable
data class Test(
    val text:String
)

fun Application.configureRouting() {

    routing {
        get("/") {// Коли отримуємо пустий запит (/), у відповідь посилаємо Hello, world
            call.respond(Test(text = "Hello, world!"))
        }
    }
}
