package com.example

// Lateinit properties
class LateinitExample {
    lateinit var name: String
    lateinit var data: List<String>

    fun init() {
        name = "Test"
        data = listOf("a", "b")
    }
}

// Inline properties
class InlinePropertyExample {
    inline val inlineProp: String
        get() = "inline"

    var normal: String = "normal"
}

// Inner classes
class Outer {
    private val outerValue = "outer"

    inner class Inner {
        fun accessOuter() = outerValue
    }

    class Nested {
        // Cannot access outerValue directly
    }
}

// Nested objects
class Container {
    object NestedObject {
        fun doSomething() = "nested object"
    }

    companion object {
        fun create() = Container()
    }
}

// Delegated properties
import kotlin.properties.Delegates

class DelegatedExample {
    var observable: String by Delegates.observable("initial") { property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }

    val lazyValue: String by lazy {
        println("computed!")
        "lazy"
    }

    var vetoable: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        newValue > 0
    }
}

// Init blocks
class InitExample(val name: String) {
    init {
        println("Init 1: $name")
    }

    val upper = name.uppercase()

    init {
        println("Init 2: $upper")
    }
}

// Local classes
fun processLocal() {
    class LocalProcessor(val prefix: String) {
        fun process(input: String): String = prefix + input
    }

    val processor = LocalProcessor("Processed: ")
    println(processor.process("test"))
}

// Anonymous objects
fun createListener() = object {
    fun onClick() = println("clicked")
    fun onHover() = println("hovered")
}

interface ClickListener {
    fun onClick()
}

fun createClickListener(): ClickListener = object : ClickListener {
    override fun onClick() = println("clicked!")
}

// Value classes with inline modifier (Kotlin 1.5+)
inline value class InlineUserId(val value: String)

inline value class InlineEmail(val value: String) {
    fun isValid(): Boolean = value.contains("@")
}

@JvmInline
value class LegacyEmail(val value: String)
