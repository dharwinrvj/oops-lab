/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dharwin
 */

public class bill{
    public static void main(String args[]){
    customer obj=new customer(101,"Ram",10);
    System.out.println(obj.getId());
    System.out.println(obj.getName());
    System.out.println(obj.getDis());
    System.out.println("After setting discount");
    obj.setDis(25);
    System.out.println(obj.getDis());
    System.out.println(obj);
    customer obj1=new customer(102,"Raj",5);
    invoice obj2=new invoice(1001,obj,2000);
    System.out.println("Invoice details");
System.out.println("Id: "+obj2.id);
System.out.println("Customer details\n"+obj2.getCustomer()+"\nAmount: "+obj2.getAmount());
obj2.setAmount(3000);
obj2.setCustomer(obj1);
System.out.println("New amount: "+obj2.getAmount());
System.out.println("Name: "+obj2.getCustomerName());
System.out.println("Amount after discount: "+obj2.amtAfterDis());
}
}
class customer{
    int id;
    String name;
    int dis;
    customer(int Id,String Name,int Dis){
id=Id;
name=Name;
dis=Dis;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
            }
    int getDis(){
        return dis;
            }    
            void setDis(int Dis1){
dis=Dis1;
            }    
            public String details(){
                return "Id: "+id+" \nName: "+name+" \nDiscount: "+dis;
            }
}
class invoice{
    int id;
    customer o;
    int amount; 
    invoice(int Id,customer obj,int Amount){
        id=Id;
        o=obj;
        amount=Amount;
    }
int getId(){
    return id;
}
customer getCustomer(){
    return o;
}
int getAmount(){
    return amount;
}
void setAmount(int Amount){
    amount=Amount;
}
void setCustomer(customer obj){
    o=obj;
}
String getCustomerName(){
    return o.name;
}
double amtAfterDis(){
    return amount-(amount*o.dis/100);
}
}