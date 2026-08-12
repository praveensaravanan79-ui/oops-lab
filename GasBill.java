import java.util.Scanner;
class GasBill{
    int consumerid;
    String consumername;
    int previousreading;
    int currentreading;
    String consumerType;
    int units;
    double bill;
    void getdata(){
       Scanner Sc = new Scanner(System.in);
       System.out.print("Enter consumer id:");
       consumerid = Sc.nextInt();
       Sc.nextLine();
       System.out.print("Enter consumer name:");
       consumername = Sc.nextLine();
       System.out.print("Enter previous reading:");
       previousreading = Sc.nextInt();
       System.out.print("Enter current reading:");
       currentreading = Sc.nextInt();
       Sc.nextLine();
       System.out.print("Enter consumerType:");
       consumerType = Sc.nextLine();
       units = currentreading - previousreading;
     }
     void calculateBill(){
         if(consumerType.equalsIgnoreCase("Domestic"))
         {
           if(units<=50)
              bill = units*5;
           else if(units<=100)
              bill = (50*5)+((units-50)*7);
          else
             bill = (50*5)+(50*7)+((units-100)*10);
       }
       else if(consumerType.equalsIgnoreCase("Commerical"))
       {
         if(units<=50)
            bill = units*8;
        else if(units<=100)
            bill = (50*8)+((units-50)*12);
        else
           bill = (50*8)+(50*12)+((units-100)*10);
     }
     else{
        System.out.println("Invalid Consumer type");
    }
  }
  void display()
  {
     System.out.println("\n---GasBill---");
     System.out.println("ConsumerID:"+consumerid);     
     System.out.println("ConsumerName:"+consumername);     
     System.out.println("Units consumed:"+units);     
     System.out.println("Total Bill:Rs."+bill);
 }
 public static void main(String args[])
 { 
   GasBill obj = new GasBill();
   obj.getdata();
   obj.calculateBill();
   obj.display();
 }
}          
  
       
       
