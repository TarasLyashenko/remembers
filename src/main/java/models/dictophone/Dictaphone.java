package models.dictophone;

import models.Paper;

import java.util.Scanner;

public class Dictaphone
{
    private final Scanner scanner = new Scanner(System.in);
    private Cartridge cartridge;
    private boolean power;
    Paper paper = new Paper();

    public void printCassette()

    {

        paper.setTitle(cartridge.getTittle());
        String delimiter = " ";

        StringBuilder stringBuilder = new StringBuilder();

        int i = 0;
        while (i < cartridge.getRecords().size() - 1)
        {
            stringBuilder.append(cartridge.getRecords().get(i));
            stringBuilder.append(delimiter);
            i++;
        }
        stringBuilder.append(cartridge.getRecords().get(i));

        String res = stringBuilder.toString();
        System.out.println(res);
    }

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
