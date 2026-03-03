package com.example

// Expect declarations (in common module)
expect class Platform() {
    fun getPlatformName(): String
}

expect object Database {
    fun connect(): Connection
    fun disconnect()
}

expect fun getPlatformType(): String

expect val platformVersion: String

// Actual declarations (in platform-specific module)
actual class Platform {
    actual fun getPlatformName(): String = "JVM"
}

actual object Database {
    actual fun connect(): Connection = RealConnection()
    actual fun disconnect() = println("Disconnected")
}

actual fun getPlatformType(): String = "JVM"

actual val platformVersion: String = "1.0.0"

class Connection {
    fun close() = println("Closed")
}

class RealConnection : Connection()
