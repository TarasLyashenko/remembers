import models.dictophone.Cartridge;
import models.dictophone.Dictaphone;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Dictaphone dictaphone = new Dictaphone();


        while (true)
        {
            System.out.println("1 - Включить диктофон\n" +
                    "2 - Выключить диктофон\n" +
                    "3 - Начать запись, пока - кодовое слово для остановки записи\n" +
                    "4 - Показать все записи\n" +
                    "5 - Создать новый картридж\n" +
                    "6 - Вынуть картридж ");
            String userText = scanner.nextLine();


            if (userText.contains("1"))
            {
                dictaphone.powerOn();
            }
            else if (userText.contains("2"))
            {
                dictaphone.powerOff();
            }
            else if (userText.contains("3"))
            {
                dictaphone.startRecording();
            }
            else if (userText.contains("4"))
            {
                dictaphone.showRecord();
            }
            else if (userText.contains("5"))
            {
                Cartridge cartridge = new Cartridge();
                System.out.println("Введите название картриджа");
                String choiceTittle = scanner.nextLine();
                cartridge.setTittle(choiceTittle);
                dictaphone.insertCartridge(cartridge);

            }
            else if (userText.contains("6"))
            {
                Cartridge cartridge = dictaphone.putCartridge();
            }
        }
    }
}


