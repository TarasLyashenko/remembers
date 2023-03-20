package models;

public class Char
{
    private String tittle;
    private double durability;
    private byte weight;
    private int yearOfIssue;
    private String material;
    private boolean broken;

    public String getTittle()
    {
        return tittle;
    }

    public void setTittle(String tittle)
    {
        this.tittle = tittle;
    }

    public double getDurability()
    {
        return durability;
    }

    public void setDurability(double durability)
    {
        this.durability = durability;
    }

    public byte getWeight()
    {
        return weight;
    }

    public void setWeight(byte weight)
    {
        this.weight = weight;
    }

    public int getYearOfIssue()
    {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue)
    {
        this.yearOfIssue = yearOfIssue;
    }

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public boolean isBroken()
    {
        return broken;
    }

    public void setBroken(boolean broken)
    {
        this.broken = broken;
    }
}
