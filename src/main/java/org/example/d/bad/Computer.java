package org.example.d.bad;

public class Computer {
    private final Monitor monitor;
    private final StandardKeyboard standardKeyboard;

    public Computer() {
        monitor = new Monitor();
        standardKeyboard = new StandardKeyboard();
    }
}
