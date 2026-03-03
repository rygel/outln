package com.example;

public class SwitchExpressions {
    // Switch expression with pattern matching
    public String format(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> obj.toString();
        };
    }

    // Switch statement with guards (when)
    public String describe(Object obj) {
        String result = switch (obj) {
            case String s when s.length() > 5 -> "long string";
            case String s -> "short string";
            case Integer i -> "number: " + i;
            default -> "unknown";
        };
        return result;
    }

    // Record pattern matching in switch
    public String describeShape(Shape shape) {
        return switch (shape) {
            case Circle(double r) -> "circle with radius " + r;
            case Rectangle(int w, int h) -> "rectangle " + w + "x" + h;
            default -> "unknown shape";
        };
    }
}

record Circle(double radius) {}
record Rectangle(int width, int height) {}
sealed interface Shape permits Circle, Rectangle {}
