package strategy;

public class LaserPrintStrategy implements PrintStrategy {

    @Override
    public void printContent(String content) {
        for (int i = 0; i < content.length() - 1; i++) {
            System.out.print(content.charAt(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Something went wrong. Please, try again");
                e.printStackTrace();
            }
        }
    }

}
