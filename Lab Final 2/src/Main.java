public class Main {
    public static void main(String[] args) {
        User p1 = new User("oil",100,5,"shuvo",123456);
        User p2 = new User("rice",70,5,"x",1234567);
        Item p3 = new User("carrot",105,5,"y",523456);
        System.out.println("Item 1 details: ");
        p1.display();
        System.out.println();
        System.out.println("Item 2 details: ");
        p2.display();
        System.out.println();
        System.out.println("Item 3 details: ");
        p3.display();
        System.out.println();

        Cart c = new Cart();
        c.addProduct(p1);
        c.addProduct(p2);
        c.addProduct(p3);
//        c.adduser(p4);

        c.displayCart();

        System.out.println();

        c.calculateTotalPrice();


        c.removeProduct(p1);
        System.out.println("After remove: ");
        c.displayCart();

        c.calculateTotalPrice();


        c.addProduct(p1);
        System.out.println("After adding:");
        c.displayCart();
        c.calculateTotalPrice();
        c.payment();
    }
}