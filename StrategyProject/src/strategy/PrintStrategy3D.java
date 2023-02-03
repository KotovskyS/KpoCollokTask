package strategy;

public class PrintStrategy3D implements PrintStrategy {

    @Override
    public void printContent(String content) {
        for (int i = 0; i < content.length() - 1; i++) {
            System.out.print(content.charAt(i));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Something went wrong. Please, try again");
                e.printStackTrace();
            }
        }
        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.print("▋");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.out.println("Something went wrong. Please, try again");
                    e.printStackTrace();
                }
            }
            System.out.println("\n");
        }
    }
}
