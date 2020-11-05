package main;

public class BookMain {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        ImageProxy img1 = new ImageProxy("first image");
        cap1.add(img1);
        ImageProxy img2 = new ImageProxy("second image");
        cap1.add(img2);
        Table table1 = new Table("first table");
        cap1.add(table1);
        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());
        img1.setAlignStrategy(new AlignCenter());
        img2.setAlignStrategy(new AlignLeft());
        table1.setAlignStrategy(new AlignRight());
        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();
    }
}