package main;

public class AlignLeft implements AlignStrategy{

    @Override
    public void render(String content, Context context)
    {
        System.out.println("Align Left:"+content);
    }
}
