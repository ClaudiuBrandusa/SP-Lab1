package main;

public class Table implements Element {
    String table;
    AlignStrategy strategy;
    Table (String table) {
        this.table = table;
    }

    public void setAlignStrategy(AlignStrategy strategy)
    {
        this.strategy = strategy;
    }

    @Override
    public String toString() {
        return "Table{" +
                "table='" + table + '\'' +
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