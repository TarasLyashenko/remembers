package models;

public class Paper
{
    private String title;
    private String text;

    public void readPaper()
    {
        System.out.println(text);
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }
}
