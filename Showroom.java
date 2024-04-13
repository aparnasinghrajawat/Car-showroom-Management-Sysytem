import java.sql.SQLOutput;
import java.util.Scanner;


public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock=0;
    String manager_name;
  //GETTER TO GET THE VALUE OF SHOWROOM
  
    @Override
    public void get_deatils(){
        System.out.println("Showroom Name : "+showroom_name);
        System.out.println("Showroom Address : "+showroom_address);
        System.out.println("Manager  Name : "+manager_name);
        System.out.println("Total employee : "+total_employees);
        System.out.println("Total Cars in stock  : "+total_cars_in_stock);
    }
  
   //SETTER TO GET THE VALUE OF SHOWROOM
    @Override
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************** ++++Enter Showroom Details++++ *****************************************");
        System.out.println();
        System.out.println("Showroom Name : ");
        showroom_name= sc.nextLine();
        System.out.println("Showroom Address : ");
        showroom_address= sc.nextLine();
        System.out.println(" Manager name :");
        manager_name=sc.nextLine();
        System.out.println("Total working employees : ");
        total_employees= sc.nextInt();
        System.out.println("Total Cars in Stock : ");
        total_cars_in_stock=sc.nextInt();

    }
}
