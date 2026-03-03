package com.example;

public record Person(String name, int age) {
    // Custom constructor
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // Custom method
    public boolean isAdult() {
        return age >= 18;
    }

    // Static factory method
    public static Person of(String name) {
        return new Person(name, 0);
    }

    // Override equals
    public boolean hasSameName(Person other) {
        return this.name.equals(other.name());
    }
}

public record Point(int x, int y) {
    // Custom method
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Static constant
    public static final Point ORIGIN = new Point(0, 0);
}

public record Range(int start, int end) {
    // Validation method
    public boolean isValid() {
        return start <= end;
    }

    // Helper method
    public int length() {
        return end - start;
    }
}
