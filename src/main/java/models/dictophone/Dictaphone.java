package models.dictophone;

import java.util.Scanner;

public class Dictaphone
{
    private final Scanner scanner = new Scanner(System.in);
    private Cartridge cartridge;
    private boolean power;

    public void insertCartridge(Cartridge newCartridge)
    {
        cartridge = newCartridge;
        System.out.println("Кассета вставлена");
    }

    public Cartridge putCartridge()
    {
        Cartridge externalCartridge = cartridge;
        cartridge = null;
        System.out.println("Кассета извлечена");
        return externalCartridge;
    }

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
        if (cartridge == null)
        {
            System.out.println("Внутри нет картриджа.");
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

    public Cartridge getCartridge()
    {
        return cartridge;
    }

    public void setCartridge(Cartridge cartridge)
    {
        this.cartridge = cartridge;
    }
}
