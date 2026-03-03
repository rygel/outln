package com.example

class PropertyAccessors {
    // Property with custom getter
    val isEmpty: Boolean
        get() = size == 0

    // Property with custom setter
    var counter: Int = 0
        set(value) {
            if (value >= 0) field = value
        }

    // Property with both getter and setter
    var name: String = ""
        get() = field.uppercase()
        set(value) { field = value.trim() }

    // Computed property
    val size: Int
        get() = items.size

    // Backing field usage
    private var _items = mutableListOf<String>()
    var items: List<String>
        get() = _items
        set(value) { _items = value.toMutableList() }
}
