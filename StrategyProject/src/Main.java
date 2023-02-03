import api.Printer;
import impl.Dexp3DPrinter;
import impl.HpLaserJetPrinter;
import impl.OldPannasonicPrinter;

public class Main {
    public static void main(String[] args) {
        //Different types of printers with different strategies of printing
        Printer oldPrinter = new OldPannasonicPrinter();
        oldPrinter.turnOn();
        oldPrinter.printContent("Заметался пожар голубой,\n" +
                "Позабылись родимые дали.\n" +
                "В первый раз я запел про любовь,\n" +
                "В первый раз отрекаюсь скандалить.\n");
        oldPrinter.turnOff();

        Printer hpPrinter = new HpLaserJetPrinter();
        hpPrinter.turnOn();
        hpPrinter.printContent("Был я весь — как запущенный сад,\n" +
                "Был на женщин и зелие падкий.\n" +
                "Разонравилось пить и плясать\n" +
                "И терять свою жизнь без оглядки.");
        hpPrinter.turnOff();


        Printer printer3d = new Dexp3DPrinter();
        printer3d.turnOn();
        printer3d.printContent("Мне бы только смотреть на тебя,\n" +
                "Видеть глаз злато-карий омут,\n" +
                "И чтоб, прошлое не любя,\n" +
                "Ты уйти не смогла к другому.");
        printer3d.turnOff();
    }
}