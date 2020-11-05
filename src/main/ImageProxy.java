package main;

public class ImageProxy implements Element{
    String url;
    int dim;
    Image realimg;
    AlignStrategy strategy;

    public ImageProxy(String url)
    {
        this.url = url;
    }

    public void setAlignStrategy(AlignStrategy strategy)
    {
        this.strategy = strategy;
    }

    Image loadImage()
    {
        if(realimg == null)
        {
            realimg = new Image(url);
            realimg.setAlignStrategy(strategy);
        }
        return realimg;
    }

    @Override
    public void print() {
        loadImage().print();
    }
}
