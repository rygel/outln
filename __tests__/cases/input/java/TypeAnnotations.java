package com.example;

import org.jetbrains.annotations.*;

public class TypeAnnotations {
    // Annotation on type parameter
    List<@NonNull String> names;

    // Annotation on array type
    String @NonNull [] annotatedArray;

    // Annotation on type bound
    <T extends @NonNull Object> T boundedMethod(T value) {
        return value;
    }

    // Multiple annotations on type
    Map<@NonNull String, @Nullable Integer> map;

    // Annotation on wildcard
    List<? extends @NonNull Number> list;

    // Annotation in method signature
    void process(@NonNull String input) {
    }

    // Annotation on return type
    @NonNull String getValue() {
        return "value";
    }
}
