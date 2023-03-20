package models;

public class Scooter
{
    private String brand;
    private int currentSpeed;
    private boolean active;

    public void powerOn()
    {
        active = true;
    }

    public void powerOff()
    {
        active = false;
        currentSpeed = 0;

    }

    public void speedUp()
    {
        if (active)
        {
            currentSpeed = currentSpeed + 5;
            System.out.println(getCurrentSpeed());
        }
        else
        {
            System.out.println("Скутер не заведен");
        }

    }

    public void speedDown()
    {
        if (active)
        {
            currentSpeed = currentSpeed - 5;
            System.out.println(getCurrentSpeed());
        }
        else
        {
            System.out.println("Скутер не заведен");
        }

    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public int getCurrentSpeed()
    {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed)
    {
        this.currentSpeed = currentSpeed;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }
}
