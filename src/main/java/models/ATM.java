package models;

import java.util.Scanner;

public class ATM
{
    private int currentAmount = 10;

    public void checkBalance()
    {
        if (currentAmount != 0)
        {
            System.out.println(currentAmount);
        }
        else
        {
            System.out.println("Недостаточно средств");
        }

    }

    public void removeCash()
    {
        if (currentAmount != 0)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите какую сумму хотите снять, на вашем счету -  ");
            checkBalance();
            int amountMoney = scanner.nextInt();
            if (amountMoney > currentAmount)
            {
                System.out.println("Недостаточно средств для снятия, ошибка\n");
                return;
            }
            else
            {
                currentAmount -= amountMoney;
                System.out.println("\n Сумма успешно снята \nВаш баланс - ");
                checkBalance();
            }

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
