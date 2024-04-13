# Car-showroom-Management-Sysytem


-----------------------------------------------------------------**MAIN CLASS**------------------------------------------------------------------


**Purpose**:

The Main class is the entry point of the program.
It provides a menu-driven interface for users to interact with the car showroom system.
Users can add showrooms, employees, and cars, as well as retrieve information about existing showrooms, employees, and cars.

**Usage**:
Run the program.
Follow the on-screen instructions to navigate through the menu options.
Input choices to add or retrieve information about showrooms, employees, and cars.
Enter 0 to exit the program.

********WELCOME CAR SHOWROOM***********

**********  ++++ ENTER YOUR CHOICE ++++ *********

1.) .ADD SHOWROOMS 			  2.) .ADD EMPLOYEES 			  3.) .ADD CARS 

4.) . GET SHOWROOMS  			  5.) .GET EMPLOYEES 			  6.) GET CARS 

************** ++++ ENTER 0 TO EXIT ++++ ********



--------------------------------------------------------------------**Showroom Class**-----------------------------------------------------------

**Purpose** :

The Showroom class represents a car showroom.
It stores details such as showroom name, address, manager name, total employees, and total cars in stock.
It implements the Utility interface to provide methods for setting and getting showroom details.
**Usage**:

Create an instance of the Showroom class.
Use the setDetails() method to set the showroom details.
Use the getDetails() method to retrieve and display the showroom details.

----------------------------------------------------------------------**Employee Class**---------------------------------------------------------

**Purpose**:

The Employee class represents an employee working at a car showroom.
It stores details such as "employee ID"," name", "age", and "department".
It implements the Utility interface to provide methods for setting and getting employee details.
Inherits the Showroom class to associate employees with showrooms.

**Usage**:
Create an instance of the Employee class.
Use the setDetails() method to set the employee details.
Use the getDetails() method to retrieve and display the employee details.

--------------------------------------------------------------------------**Cars Class**---------------------------------------------------------

**Purpose**:
The Cars class represents a car available in the showroom.
It stores details such as car name, color, fuel type, price, type, and transmission.
It implements the Utility interface to provide methods for setting and getting car details.
Inherits the Showroom class to associate cars with showrooms.
**Usag**e:
Create an instance of the Cars class.
Use the setDetails() method to set the car details.
Use the getDetails() method to retrieve and display the car details.




