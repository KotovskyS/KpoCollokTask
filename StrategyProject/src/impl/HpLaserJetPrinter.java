package impl;

import api.Printer;
import strategy.LaserPrintStrategy;

public class HpLaserJetPrinter extends Printer {

    public HpLaserJetPrinter() {
        this.printStrategy = new LaserPrintStrategy();
    }

    @Override
    public void turnOn() {
        System.out.println("HP printer is launching..\n");
        try {
            for (int i = 0; i < 15; i++) {
                System.out.print("▋");
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Please, try again");
            e.printStackTrace();
        }
        System.out.println("\n\n");
        System.out.println("██  ██ █████");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Please, try again");
            e.printStackTrace();
        }
        System.out.println("██  ██ ██  ██");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Please, try again");
            e.printStackTrace();
        }
        System.out.println("██████ █████");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Please, try again");
            e.printStackTrace();
        }
        System.out.println("██  ██ ██  ");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Please, try again");
            e.printStackTrace();
        }
        System.out.println("██  ██ ██  ");
        System.out.println("\nThe printer is launched\n\n");
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
