package com.example;

public class AnonymousClasses {
    // Anonymous class as field initializer
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Running");
        }
    };

    // Anonymous class in method
    public void process() {
        ActionListener listener = new ActionListener() {
            @Override
            public void onAction(String event) {
                System.out.println("Event: " + event);
            }
        };
    }

    // Anonymous class implementing interface
    public Comparator<String> getComparator() {
        return new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        };
    }
}

interface ActionListener {
    void onAction(String event);
}
