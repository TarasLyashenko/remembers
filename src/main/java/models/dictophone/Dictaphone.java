package models.dictophone;

import java.util.Scanner;

;

public class Dictaphone
{
    private final Scanner scanner = new Scanner(System.in);
    private Cartridge cartridge = new Cartridge();
    private boolean power;

    public void powerOn()
    {
        power = true;
        System.out.println("Диктофон включен");

    }

    public void startRecording()
    {
        if (!power)
        {
            System.out.println("*Щелк*...Кажется диктофон выключен.");
            return;
        }
        while (true)
        {
            String userText = scanner.nextLine();
            if (userText.contains("пока"))
            {
                return;
            }
            else
            {
                cartridge.getRecords().add(userText);
            }
        }

    }

    public void powerOff()
    {
        power = false;
        System.out.println("Диктофон выключен");
    }

    public void showRecord()
    {
        for (String showRecord : cartridge.getRecords())
        {
            System.out.println(System.lineSeparator() + showRecord);
        }
    }

    public boolean isPower()
    {
        return power;
    }

    public void setPower(boolean power)
    {
        this.power = power;
    }

}
