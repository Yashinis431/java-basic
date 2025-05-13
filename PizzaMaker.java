class Pizza {
String size;
String crust;
String topping;

public Pizza(String size,String crust,String topping){
    this.size=size;
    this.crust=crust;
    this.topping=topping;
}

public void display(){
    System.out.println("size is"+size);
    System.out.println("crust is"+crust);
    System.out.println("topping is"+topping);
}
}
public class PizzaMaker{
    public static void main(String[] args){
        Pizza p= new Pizza("large","cheese","chicken");
        p.display();
    }
}
