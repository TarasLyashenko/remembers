import models.ATM;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        while (true)
        {

            System.out.println("Добро пожаловать в лучший банкомат \n" +
                    " Запросы: \n" +
                    "1 - Проверить баланс \n" +
                    "2 - Снять со счета \n" +
                    "3 - Пополнить счет \n" +
                    "4 - Выход");
            String userText = scanner.nextLine();

            if (userText.equals("4"))
            {
                break;
            }
            else if (userText.equals("1"))
            {
                atm.checkBalance();
            }
            else if (userText.equals("2"))
            {
                atm.removeCash();
            }
            else if (userText.equals("3"))
            {
                atm.putCash();
            }
        }


    }
}
