package main;

public class AlignRight implements AlignStrategy {

    @Override
    public void render(String content, Context context) {
        System.out.println("Align Right:"+content);
    }
}
