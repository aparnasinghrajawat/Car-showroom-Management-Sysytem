import java.util.*;
import java.lang.*;

interface utility{
    public void get_deatils();
    public void set_details();
}

public class Main {
    static void main_menu(){
        System.out.println();
        System.out.println("********WELCOME CAR SHOWROOM***********");
        System.out.println();
        System.out.println("**********  ++++ ENTER YOUR CHOICE ++++ *********");
        System.out.println();
        System.out.println("1.) .ADD SHOWROOMS \t\t\t  2.) .ADD EMPLOYEES \t\t\t  3.) .ADD CARS ");
        System.out.println();
        System.out.println("4.) . GET SHOWROOMS  \t\t\t  5.) .GET EMPLOYEES \t\t\t  6.) GET CARS ");
        System.out.println();
        System.out.println("************** ++++ ENTER 0 TO EXIT ++++ ********");


    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Showroom showroom[]=new Showroom[5];
      Employee employee[]=new Employee[5];
      Cars cars[]=new Cars[5];
      int car_counter=0;
      int showroom_counter=0;
      int employee_counter=0;
      int choice=100;
      while (choice!=0){
          main_menu();
          choice=sc.nextInt();
          while (choice!=9 && choice!=0  ){
              switch (choice){
                  case  1 :
                      showroom[showroom_counter]=new Showroom();
                      showroom[showroom_counter].set_details();
                      showroom_counter++;
                      System.out.println();
                      System.out.println(".1) ADD NEW SHOWROOM ");
                      System.out.println(".9) GO BACK TO MAIN MENU ");
                      choice=sc.nextInt();

                  case 2:
                      employee[employee_counter]=new Employee();
                      employee[employee_counter].set_details();
                      employee_counter++;
                      System.out.println();
                      System.out.println(".2) ADD NEW EMPLOYEE ");
                      System.out.println(".9) GO BACK TO MAIN MENU");
                      choice=sc.nextInt();
                      break;

                  case 3:
                      cars[car_counter]=new Cars();
                      cars[car_counter].set_details();
                      car_counter++;
                      System.out.println();
                      System.out.println(".3) ADD NEW CAR ");
                      System.out.println(".9) GO BACK TO MAIN MENU");
                      choice=sc.nextInt();
                      break;

                  case 4:
                      for(int i=0;i<showroom_counter;i++){
                          showroom[i].get_deatils();
                          System.out.println();
                          System.out.println();

                      }
                      System.out.println();
                      System.out.println(".9) Go Back to main menu ");
                      System.out.println(".0) Exit ");
                     choice=sc.nextInt();
                     break;

                  case 5: for(int i=0;i<employee_counter;i++){
                      employee[i].get_deatils();
                      System.out.println();
                      System.out.println();
                  }
                      System.out.println();
                      System.out.println("9) GO back to main menu ");
                      System.out.println(" .0) Exit ");
                      choice=sc.nextInt();
                      break;

                  case 6:
                      for(int i=0;i<car_counter;i++){
                          cars[i].get_deatils();
                          System.out.println();
                          System.out.println();
                      }
                      System.out.println();
                      System.out.println(".9) GO BACK TO MAIN MENU");
                      System.out.println("0.) EXIT ");
                      choice=sc.nextInt();
                      break;
                  default:
                      System.out.println("Enter valid choice : ");
                      break;


              }
          }
      }
    }
}
