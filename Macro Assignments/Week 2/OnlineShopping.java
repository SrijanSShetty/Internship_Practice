// Online Shopping System: In an online shopping system, there may be a superclass called Product with a method called calculateDiscount() that calculates the discount on the product's price. Different types of products, such as Electronics and Apparel, may be subclasses of Product and override the calculateDiscount() method to calculate the discount based on their specific sales and promotions. For example, an Electronics product may offer a discount based on the purchase amount or bundle deals, while an Apparel product may offer a discount based on the seasonal trends or inventory clearance.
import java.util.Scanner;
class ProductNotFoundException extends Exception{
  ProductNotFoundException(String str){
    super(str);
  }
}
class Product{
  String pname;
}
class Store{
  int n=3;
  Product p[]=new Product[n];
  Scanner s=new Scanner(System.in);
  void addProduct(){
      for(int i=0;i<p.length;i++){
         p[i]=new Product();
     
        System.out.println("enter Product name");
        p[i].pname=s.next();
       
        }
}
  void display(){
    for(int i=0;i<n;i++){
        System.out.println((i+1)+". "+p[i].pname);
       
      }
  }
  void removeProduct() throws ProductNotFoundException{
     int index=-1;
   
    System.out.println("enter product name to remove");
    String rem=s.next();
    for(int i=0;i<p.length-1;i++){
      if(rem.equals(p[i].pname)){
        index=i;
        break;
      }
    }
    if(index>=0){
      for(int i=index;i<p.length-1;i++){
        p[i]=p[i+1];
      }
      n--;
      display();
    }
    else {
      throw new ProductNotFoundException("Invalid product");
     
    }
  }
}
class OnlineShopping {
  public static void main(String args[]){
    Store s=new Store();
    s.addProduct();
    s.display();
    try{
    s.removeProduct();
    }
    catch(ProductNotFoundException e){
      System.out.println(e);
    }
  }
}