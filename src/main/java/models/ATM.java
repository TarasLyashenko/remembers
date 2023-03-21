package models;

import java.util.Scanner;

public class ATM
{
    private int currentAmount = 10;

    public void checkBalance()
    {
        System.out.println(currentAmount);
    }

    public void removeCash()
    {
        if (currentAmount != 0)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите какую сумму хотите снять, на вашем счету -  ");
            checkBalance();
            int takeOff = scanner.nextInt();
            currentAmount -= takeOff;
            System.out.println("\n Сумма успешно снята, баланс - ");
            checkBalance();
        }
        else
        {
            System.out.println("На вашем счету недостаточно средств");
        }
    }

    public void putCash()
    {
        if (currentAmount != 0)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите какую сумму хотите внести, на вашем счету -  ");
            checkBalance();
            int throwCash = scanner.nextInt();
            currentAmount += throwCash;
            System.out.println("\n Сумма успешно пополнена, баланс - ");
            checkBalance();
        }

    }

    public int getCurrentAmount()
    {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount)
    {
        this.currentAmount = currentAmount;
    }
}
