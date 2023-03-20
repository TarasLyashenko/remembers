package models;

public class Tv
{
    private float diagonal;
    private String brand;
    private boolean guarantee;
    private boolean power;
    private int tvChanel;



    public void powerOn()
    {
        power = true;
        tvChanel = 1;
    }

    public void powerOff()
    {
        power = false;
        tvChanel = 0;
    }

    public boolean isPower()
    {
        return power;
    }

    public void setPower(boolean power)
    {
        this.power = power;
    }

    public int getTvChanel()
    {
        return tvChanel;
    }

    public void setTvChanel(int tvChanel)
    {
        this.tvChanel = tvChanel;
    }

    public float getDiagonal()
    {
        return diagonal;
    }

    public void setDiagonal(float diagonal)
    {
        this.diagonal = diagonal;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public boolean isGuarantee()
    {
        return guarantee;
    }

    public void setGuarantee(boolean guarantee)
    {
        this.guarantee = guarantee;
    }
}
