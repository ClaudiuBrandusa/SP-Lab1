package main;

import java.util.concurrent.TimeUnit;

public class Image implements Element{
    String image;
    AlignStrategy strategy;
    Image(String image) {
        this.image = image;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setAlignStrategy(AlignStrategy strategy)
    {
        this.strategy = strategy;
    }

    @Override
    public String toString() {
        return "Image{" +
                "image='" + image + '\'' +
                '}';
    }

    @Override
    public void print() {
        if(strategy != null)
        {
            strategy.render(this.toString(), new Context());
            return;
        }
        System.out.println(this.toString());
    }
}
