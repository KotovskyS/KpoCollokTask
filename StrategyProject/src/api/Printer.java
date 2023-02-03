package api;

import strategy.PrintStrategy;

public abstract class Printer {

    protected PrintStrategy printStrategy;

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void printContent(String content);
}
