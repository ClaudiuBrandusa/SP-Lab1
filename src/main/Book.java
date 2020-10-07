package main;

import java.util.ArrayList;

public class Book {
    String title;
    ArrayList<String> content;

    public Book(String title)
    {
        this.title = title;
        content = new ArrayList<String>();
    }

    public void createNewParagraph(String paragraph)
    {
        content.add(paragraph);
    }

    public void createNewImage(String image)
    {
        content.add(image);
    }

    public void createNewTable(String table)
    {
        content.add(table);
    }

    public void print()
    {
        for(String str : content)
        {
            System.out.println(str);
        }
    }
}
