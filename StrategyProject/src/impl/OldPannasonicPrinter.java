package impl;

import api.Printer;
import strategy.MatrixPrintStrategy;

public class OldPannasonicPrinter extends Printer {

    public OldPannasonicPrinter() {
        this.printStrategy = new MatrixPrintStrategy();
    }

    @Override
    public void turnOn() {
        System.out.println("\nOld pannasonic printer is launching..");
        try {
            for (int i = 0; i < 15; i++) {
                System.out.print("▋");
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Please, try again");
            e.printStackTrace();
        }
        System.out.println("\nThe printer is launched\n");
    }

    @Override
    public void turnOff() {
        System.out.println("\n\nSwitch off the printer. Grr grr grr..");
        try {
            for (int i = 0; i < 15; i++) {
                System.out.print("▋");
                Thread.sleep(300);
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
