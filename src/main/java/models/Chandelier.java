package models;

public class Chandelier
{
    private String material;
    private short numberOfLamps;
    private int numberOfWorkingLamps;
    private String tittle;
    private boolean Soviet;

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public short getNumberOfLamps()
    {
        return numberOfLamps;
    }

    public void setNumberOfLamps(short numberOfLamps)
    {
        this.numberOfLamps = numberOfLamps;
    }

    public int getNumberOfWorkingLamps()
    {
        return numberOfWorkingLamps;
    }

    public void setNumberOfWorkingLamps(int numberOfWorkingLamps)
    {
        this.numberOfWorkingLamps = numberOfWorkingLamps;
    }

    public String getTittle()
    {
        return tittle;
    }

    public void setTittle(String tittle)
    {
        this.tittle = tittle;
    }

    public boolean isSoviet()
    {
        return Soviet;
    }

    public void setSoviet(boolean soviet)
    {
        Soviet = soviet;
    }
}
