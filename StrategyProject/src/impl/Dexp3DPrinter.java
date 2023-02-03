package impl;

import api.Printer;
import strategy.PrintStrategy3D;

public class Dexp3DPrinter extends Printer {

    public Dexp3DPrinter() {
        this.printStrategy = new PrintStrategy3D();
    }

    @Override
    public void turnOn() {
        System.out.println("\nCool 3D printer is launching..");
        try {
            for (int i = 0; i < 15; i++) {
                System.out.print("▋");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Please, try again");
            e.printStackTrace();
        }
        System.out.println("\nThe printer is launched\n");
    }

    @Override
    public void turnOff() {
        System.out.println("\n\nSwitch off the printer");
        try {
            for (int i = 0; i < 15; i++) {
                System.out.print("▋");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Please, try again");
            e.printStackTrace();
        }
        System.out.println("\nThe printer is switched off\n");
    }

    @Override
    public void printContent(String content) {
        printStrategy.printContent(content);
    }
}
