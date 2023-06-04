import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

        private ArrayList<Item> products = new ArrayList<>();
        private ArrayList<User> user = new ArrayList<>();

        public Cart() {
            this.products = products;
        }

    public Cart(ArrayList<User> user) {
        this.user = user;
    }

    public void addProduct(Item product){
            products.add(product);
        }

    public void adduser(User user){
        products.add(user);
    }



        public void removeProduct(Item product){
            products.remove(product);
        }

        public double calculateTotalPrice(){
            double totalprice =  0.0;
            for(Item p : products){
                totalprice += p.getUnitPrice()* p.getQuantity();
            }
            return totalprice;
        }

        public void displayCart(){
            System.out.println("Shopping cart : ");
            for(Item p : products){
                p.display();
                System.out.println();
            }
            System.out.println("Total Price : $" + calculateTotalPrice());
        }
    public void displayUserCart(){
        System.out.println("Shopping cart : ");
        for(User u : user){
            u.display();
            System.out.println();
        }
    }

        public void payment (){
            System.out.println("You have to pay : " + calculateTotalPrice());
            System.out.println("Enter 1 or 2 :");
            Scanner s = new Scanner(System.in);
            System.out.println("**** MENU ****");
            System.out.println("1. CASH ");
            System.out.println("2. CARD ");
            int val = s.nextInt();
            switch(val){
                case 1 :
                    int amount = s.nextInt();
                    if(amount> calculateTotalPrice()){
                        int back = (int) (amount-calculateTotalPrice());
                        System.out.println("Succesfully back : " + back);
                    }
                    else{
                        System.out.println("payment complete...");
                    }
                    break;
                case 2 :
                    System.out.println("enter your card number : ");
                    String  cardnum = s.next();
                    if(cardnum.length()==10){
                        System.out.println("payment complete !!!");
                    }
                    else{
                        System.out.println("please enter valid card");
                    }
                    break;
                default:
                    System.out.println("Enter 1 or 2");
            }


            }
        }


