import java.util.*; 


class cafeprogram{
   
      //class methods and class variables  
    public static Scanner scan = new Scanner (System.in);
    public static String order, again;
    public static int press, quantity = 1;
    public static double total, pay, change, price;
      //Array of menu = iced
    public static String [] iced = {"CHOCOLATE", "MOCHA",
                                    "MATCHA","CAFFب LATTE",
                                    "HAZELNUT"};
      //Array of menu = hot
    public static String [] hot = { "AMERICANO","CAPPUCCINO",
                                    "ESPRESSO", "HOT CHOCO",
                                    "CREAMYLATTE"};
      //Array of prices
    public static int [] iprice = {85, 90, 80, 95, 100};
    public static int [] hprice = {90, 85, 90, 100, 95};
    public static Date today=new Date();
    public static void menuboard () {
      
    
   
      System.out.println( ); 
      System.out.println("********************************");
      System.out.println("***** WELCOME TO STI-CAFE! *****");
      System.out.println("************* MENU *************");
      System.out.println("********************************");
      
      System.out.println( ); 
      System.out.println("         < ICED COFFEE >        " ); 
      System.out.println( ); 
      
      //for loop to display ICED MENU
      for (int i =0; i<iced.length; i++){
      		
      System.out.println(iced[i] + "................." + iprice[i]);}
      
      
      System.out.println( ); 
      System.out.println("         < HOT COFFEE >         " ); 
      System.out.println( );  
     
     for (int i =0; i<hot.length; i++){
      System.out.println(hot[i] + "................." + hprice[i]);}
      
      System.out.println( ); 
   }
   
   
      public static void menu () {
          
          int select;
          //do while loop(for drink type)
          do{
          //drink type choices
          System.out.println( ); 
          System.out.println("********* WELCOME! *********");
          System.out.println( );
          System.out.println("PICK YOUR DRINKS");
          System.out.println("PRESS 1 FOR ICED: " ); 
          System.out.println("PRESS 2 FOR HOT: " ); 
          System.out.println( );
          select = scan.nextInt();
          
          } while(select > 2 || select < 1);
         
          switch(select){
              
          case 1:
          //do while loop(for 
          do{
          //listing out menu + iced array iteration
          System.out.println( );
          System.out.println("SELECT ITEMS: " );
          System.out.println( );
          System.out.println("PRESS 1 FOR " + iced[0]);
          System.out.println("PRESS 2 FOR " + iced[1]);
          System.out.println("PRESS 3 FOR " + iced[2]);
          System.out.println("PRESS 4 FOR " + iced[3]);
          System.out.println("PRESS 5 FOR " + iced[4]);
          System.out.println("PRESS 6 TO GO BACK");
          System.out.println( );
          
          press = scan.nextInt();
          
          System.out.println( );
          
          } while(press > 6);
              //case 1 1st condition
            if (press==1) {
            order = iced[0];
            price = iprice[0];
            System.out.println("YOU CHOSE " + order );
            System.out.println("INPUT THE QUANTITY: " );
            quantity = scan.nextInt();
            total = price * quantity;
            System.out.println( order + ": " + price + " x " + quantity + " = " + total ); 
            
              //case 1 2nd condition        
            }else if (press==2) {
            order = iced[1];
            price = iprice[1];
            System.out.println("YOU CHOSE " + order );
            System.out.println("INPUT THE QUANTITY: " );
            quantity = scan.nextInt();
            total = price * quantity;
            System.out.println( );
            System.out.println( order + ": " + price + " x " + quantity + " = " + total ); 
            
              //case 1 3rd condition
            }else if (press==3) {
            order = iced[2];
            price = iprice[2];
            System.out.println("YOU CHOSE " + order );
            System.out.println("INPUT THE QUANTITY: " );
            quantity = scan.nextInt();
            total = price * quantity;
            System.out.println( order + ": " + price + " x " + quantity + " = " + total ); 
        
              //case 1 4th condition
            }else if (press==4) {
            order = iced[3];
            price = iprice[3];
            System.out.println("YOU CHOSE " + order );
            System.out.println("INPUT THE QUANTITY: " );
            quantity = scan.nextInt();
            total = price * quantity;
            System.out.println( order + ": " + price + " x " + quantity + " = " + total ); 
              //case 1 5th condition
            }else if (press==5) {
            order = iced[4];
            price = iprice[4];
            System.out.println("YOU CHOSE " + order );
            System.out.println("INPUT THE QUANTITY: " );
            quantity = scan.nextInt();
            total = price * quantity;
            System.out.println( order + ": " + price + " x " + quantity + " = " + total );
              //case 1 6th condition
            }else if (press==6) {
            System.out.println("You pressed back.");
            System.out.println( );
            menu();
            break;
            }
            
          //order confirmation
          System.out.println( );
          System.out.println("Your order is " + order);
          System.out.println("Is that correct?");
          System.out.println("Press Y for Yes and N for No : ");
          
          again = scan.next();
          
                if(again.equalsIgnoreCase("N")){ menu();
                break;
        
                }else{System.out.println( );
                System.out.println("The total price is " + total);
                System.out.print("Please enter payment: ");
                pay = scan.nextDouble();
            
                    
                        //payment process
                        if(pay < total){
                        System.out.println("Payment declined!");
                        System.out.println("Reason: Amount is not enough.");
                        System.out.println( );
                        System.out.println("Please restart your order.");
                        System.out.println( );
                        menu();
                        break;
                        
                        //receipt
                        }else{
                        System.out.println("Payment has been processed.");
                        System.out.println("Thank you!");
                        System.out.println( );
                        System.out.println( );
                        System.out.println("============================");
                        System.out.println("********  STI CAFE  ********");
                        System.out.print(today.getDate()+"/");
                        System.out.print((today.getMonth()+1)+"/");
                        System.out.print((today.getYear()+1900)+" ");
                        System.out.print(today.getHours()+":");
                        System.out.println(today.getMinutes());
                        System.out.println("============================");
                        System.out.println("============================");
                        System.out.println("Order(Q)              Amount");
                        System.out.println(order + "("+quantity+")         " + price);                       
                        change = pay-total;
                        System.out.println("____________________________");
                        System.out.println("Total                 " + total); }
                        System.out.println(" Cash                 " + pay); }
                        System.out.println(" Change               " + change);
                        
          break;
              
                
      
          case 2 :
          //do while loop
          do{
          //listing out menu + iced array iteration
          System.out.println( );
          System.out.println("SELECT ITEMS: " );
          System.out.println( );
          System.out.println("PRESS 1 FOR " + hot[0]);
          System.out.println("PRESS 2 FOR " + hot[1]);
          System.out.println("PRESS 3 FOR " + hot[2]);
          System.out.println("PRESS 4 FOR " + hot[3]);
          System.out.println("PRESS 5 FOR " + hot[4]);
          System.out.println("PRESS 6 TO GO BACK");
          System.out.println( );
          
          press = scan.nextInt( );
          System.out.println( );
          
          } while(press > 6);
              //case 2 1st condition
            if (press==1) {
            order = hot[0];
            price = hprice[0];
            System.out.println("YOU CHOSE " + order );
            System.out.println("INPUT THE QUANTITY: " );
            quantity = scan.nextInt();
            total = price * quantity;
            System.out.println( order + ": " + price + " x " + quantity + " = " + total ); 
            
              //case 2 2nd condition        
            }else if (press==2) {
            order = hot[1];
            price = hprice[1];
            System.out.println("YOU CHOSE " + order );
            System.out.println("INPUT THE QUANTITY: " );
            quantity = scan.nextInt();
            total = price * quantity;
            System.out.println( order + ": " + price + " x " + quantity + " = " + total ); 
            
              //case 2 3rd condition
            }else if (press==3) {
            order = hot[2];
            price = hprice[2];
             System.out.println("YOU CHOSE " + order );
            System.out.println("INPUT THE QUANTITY: " );
            quantity = scan.nextInt();
            total = price * quantity;
            System.out.println( order + ": " + price + " x " + quantity + " = " + total ); 
        
              //case 2 4th condition
            }else if (press==4) {
            order = hot[3];
            price = hprice[3];
            System.out.println("YOU CHOSE " + order );
            System.out.println("INPUT THE QUANTITY: " );
            quantity = scan.nextInt();
            total = price * quantity;
            System.out.println( order + ": " + price + " x " + quantity + " = " + total ); 
              //case 2 5th condition
            }else if (press==5) {
            order = hot[4];
            price = hprice[4];
            System.out.println("YOU CHOSE " + order );
            System.out.println("INPUT THE QUANTITY: " );
            quantity = scan.nextInt();
            total = price * quantity;
            System.out.println( order + ": " + price + " x " + quantity + " = " + total );
              //case 2 6th condition
            }else if (press==6) {
            System.out.println("You pressed back.");
            System.out.println( );
            menu();
            break;
            }
          System.out.println( );
          System.out.println("Your order is " + order);
          System.out.println("Is that correct?");
          System.out.println("Press Y for Yes and N for No : ");
          
          again = scan.next();
          
                if(again.equalsIgnoreCase("N")){ menu();
                break;
        
                }else{System.out.println( );
                System.out.println("The total price is " + total);
                System.out.print("Please enter payment: ");
                pay = scan.nextDouble();
            
                        //payment process
                        if(pay < total){
                        System.out.println("Payment declined!");
                        System.out.println("Reason: Amount is not enough.");
                        System.out.println( );
                        System.out.println("Please restart your order.");
                        System.out.println( );
                        menu();
                        break;
                        
                        //receipt
                        }else{
                        System.out.println("Payment has been processed.");
                        System.out.println("Thank you!");
                        System.out.println( );
                        System.out.println( );
                        System.out.println("============================");
                        System.out.println("********  STI CAFE  ********");
                        System.out.print(today.getDate()+"/");
                        System.out.print((today.getMonth()+1)+"/");
                        System.out.print((today.getYear()+1900)+" ");
                        System.out.print(today.getHours()+":");
                        System.out.println(today.getMinutes());
                        System.out.println("============================");
                        System.out.println("============================");
                        System.out.println("Order(Q)              Amount");
                        System.out.println(order + "("+quantity+")         " + price);                       
                        change = pay-total;
                        System.out.println("____________________________");
                        System.out.println("Total                 " + total); }
                        System.out.println(" Cash                 " + pay); }
                        System.out.println(" Change               " + change);
          break;
    }
} 
      
      
      public static void main (String [] args) {
          menuboard();
          menu();
          
          
}
        
      
      
      
   
          }
