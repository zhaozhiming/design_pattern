package design.principle.dip;

public class Shirt implements Clothes {
    @Override
    public void use() {
        System.out.println("穿衬衣");
    }
}
