package day42_Static;
/*
Extra Task:
Scenario: We will create three custom classes related around a restaurant
------------------------------------------------------------------
        Create a class called Server

            Attributes:
                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
            Actions: (all void methods)

                setInfo(): sets all of the instance variables with some values taken from the parameters.
                takeOrder(): server's name + "is taking an order"
                cleanTable(): server's name + "is cleaning the table"
                toString(): Returns (String) all the information of a Server
                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
------------------------------------------------------------------
        Create a class called Chef

            Attributes:
                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
            Actions: (all void methods)

                setInfo(): sets all of the instance variables with some values taken from the parameters.
                makeOrder(): chef's name + "is making an order"
                washDishes(): chef's name + "is washing the dishes"
                toString(): Returns (String) all the information of a Chef
                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
------------------------------------------------------------------
        Create a class called Restaurant

            Attributes:
                Owner (String), Location (String), numberOfStars (int)
                Servers (ArrayList of Server objects)
                Chefs (ArrayList of Chef objects)
            Actions: (all void methods)

                setInfo(): sets the owner, location, and number of stars with the given parameters
                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList
                hireServer(String name, int employeeID, double hourlyRate, boolean fullTime): this overloaded version accept the given parameters/information of a Server and will add the given Server to the ArrayList of Servers

                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList
                hireChef(String name, int employeeID, double hourlyRate, boolean fullTime): this overloaded version accept the given parameters/information of a Chef and will add the given Chef to the ArrayList of Chefs

                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information

        - Extra optional tasks
                terminateEmployee(String title, int employeeID): Create a method that will accept a String title which can only be "server" or "chef". If any other String is given it is invalid and the no action should be done (an error message can be given "invalid employee type"). Once you know which type of employee you are terminating use their given employeeID in the correct ArrayList type and remove them (you can give a message if you want: "$name was terminated").
------------------------------------------------------------------

        Create a class LocalRestaurant that has a main method with the following:
            - Make a Restaurant object
            - Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers
            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs
            - Print your whole restaurants information
            - After setting everything up spend some time interacting with the objects, try to call the methods of the objects, access the instance variables.
        - Extra optional tasks (Should still be done in the LocalRestaurant main method)
            - Find out the cost of all the employees (servers + chefs) by checking all of their hourly rates
            - Make two new ArrayLists that will separate all the employees (servers + chefs) by full time and part time. Their position of server or chef does not matter for these ArrayList, only their employment status
            - Make sure the Restaurant is staffed enough for the level of stars it is using the following requirements:
                5 stars: need at least 6 chefs and 10 servers
                4 stars: need at least 3 chefs and 7 servers
                3 stars: need at least 1 chefs and 4 servers

                - if the restaurant does not have the correct number of chefs or servers based on their number of stars you should print a message: "Need to hire more $chefs or $servers (maybe both). Otherwise you can print: "Up to standard"
-----------------------------------------------------------------

 */

import day36_ArrayList.ArrayList_Methods;

import java.util.ArrayList;

public class Server {

    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public void setInfo(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder() {
        System.out.println(name + " is taking an order");
    }

    public void cleanTable() {
        System.out.println(name + " is cleaning the table");
    }

    public String toString() {
        return "Server's name: " + name + ",employee ID: " + employeeID + ",Hourly Rate: " + hourlyRate + "Full Time: " + fullTime;
    }

}
 class Chef{
     String name;
     int employeeID;
     double hourlyRate;
     boolean fullTime;

     public void setInfo(String name, int employeeID, double hourlyRate, boolean fullTime) {
         this.name = name;
         this.employeeID = employeeID;
         this.hourlyRate = hourlyRate;
         this.fullTime = fullTime;
     }

     public void makeOrder(){
         System.out.println(name+" is making an order");
     }
     public void washDishes(){
         System.out.println(name+" is washing the dishes");
     }
     public String toString(){
         return "Chef's name: "+name+",employee ID: "+employeeID+",Hourly Rate: "+hourlyRate+",full time: "+fullTime;
     }
 }
 class restaurant {
     String owner;
     String location;
     int numberOfStars;
     ArrayList<Server> servers = new ArrayList<>();
     ArrayList<Chef> chefs = new ArrayList<>();

     public void setInfo() {
         System.out.println("Owner: " + owner + ", Location: " + location + ",Number of stars: " + numberOfStars);
     }

     public void hireServer(Server server) {
         servers.add(server);
     }

     public void hireServer(Server[] servers) {

     }

     public void hireServer(String name, int employeeID, double hourlyRate, boolean fullTime) {

     }

     public void hireChef(Chef chef) {
         chefs.add(chef);
     }

     public void hireChef(Chef[] chefs) {
     }

     public void hireChef(String name, int employeeID, double hourlyRate, boolean fullTime) {
     }

     public String toString() {
         return "Owner: " + owner + ", location: " + location + ", Number of stars: " + numberOfStars + ", Number of servers: " + servers.size() +
                 ", Number of chefs: " + chefs;
     }
 }


