package models.dictophone;

import java.util.ArrayList;
import java.util.List;

public class Cartridge
{
    private String tittle;
    private List<String> records = new ArrayList<>();

    public String getTittle()
    {
        return tittle;
    }

    public void setTittle(String tittle)
    {
        this.tittle = tittle;
    }

    public List<String> getRecords()
    {
        return records;
    }

    public void setRecords(List<String> records)
    {
        this.records = records;
    }
}
