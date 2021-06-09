import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class CarWashBookingSystem {
    private static String CustomerName, CustomerNumber, CustomerGender;
    private static String CarType, CarPlateNum, CustomerAge;
    private static String Date, typeofCarService;
    private static double time;

    //Create Constructur
    public CarWashBookingSystem(String name, String age, String num, String gender, String type, String CarNum) {
        this.CustomerName = name;
        this.CustomerAge = age;
        this.CustomerNumber = num;
        this.CustomerGender = gender;
        this.CarType = type;
        this.CarPlateNum = CarNum;
        //this.Date = date;
        //this.typeofCarService = service;
        //this.time = Time;
    }

    public CarWashBookingSystem() {

    }

    // accessor
    public String getName() {
        return CustomerName;
    }

    public String getCusNum() {
        return CustomerNumber;
    }

    public String getGender() {
        return CustomerGender;
    }

    public String getCarType() {
        return CarType;
    }

    public String getPlateNum() {
        return CarPlateNum;
    }

    public String getDate() {
        return Date;
    }

    public String getService() {
        return typeofCarService;
    }

    public double getTime() {
        return time;
    }

    public String getAge() {
        return CustomerAge;
    }

    //mutator
    public void setName(String name) {
        CustomerName = name;
    }

    public void setPhoneNum(String num) {
        CustomerNumber = num;
    }

    public void setGender(String gend) {
        CustomerGender = gend;
    }

    public void setAge(String age) {
        CustomerAge = age;
    }

    public void setCarType(String type) {
        CarType = type;
    }

    public void setPlateNum(String PNum) {
        CarPlateNum = PNum;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setService(String serv) {
        typeofCarService = serv;
    }

    public void setTime(double t) {
        time = t;
    }


    //Linked list
    Node head; //this is head of list

    class Node {
        String data;
        Node next;

        public Node(String d) {
            data = d;
            next = null;
        }
        //Mutators
        public String getData() {
            return data;
        }
        public Node getNext() {
            return next;
        }
        //Acessors
        public void setData(String data) {
            this.data = data;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
    // all this is linked list node

    public void insert(String new_data) {  //Push is= Front insert data
        Node new_node = new Node(new_data); //create a new node
        new_node.next = null;
        if (head == null) //if linked list is empty, new node as head
            head = new_node;
        else {
            Node last = head; //traverse till the last node
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void insertBetween(Node prev_node, String new_data) {
        if(prev_node == null){
            System.out.println("Not avaliable");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }//Add InsertInBetween, can search add through index also can~ @shyvonnee

    public void delete(int position){
        if(head==null)
            return;
        Node temp=head;
        if(position==1){
            head=temp.next;
            System.out.println(temp.data+" Deleted");
            return;
        }

        for(int i=1;temp!=null && i<position-1;i++) {
            temp = temp.next;
            System.out.println(temp.next.data+" Deleted");
        }

        if(temp==null || temp.next==null) {
            System.out.println("Re-enter an accurate index");;
        }
        Node next=temp.next.next;
        temp.next=next;
    }

    public int lengthOfLinkedList() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    //printlist() is to print the linked list starting from given node
    private void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            System.out.println();
            currNode = currNode.next;
        }
    }

    private void printListWithNumber() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            System.out.println();
            currNode = currNode.next;
        }
    }//no function

    private void printDateList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " ,");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        CarWashBookingSystem llist = new CarWashBookingSystem();
        //use Push akan terballikkan which is newest insert will be behind
        llist.insert("Monday");
        llist.insert("Tuesday");
        llist.insert("Wednesday");
        llist.insert("Thursday");
        llist.insert("Friday");
        llist.insert("Saturday");
        llist.insert("Sunday");


        System.out.println("\n    ~~~ Welcome to Car Wash Booking System ~~~");
        System.out.println("\nAvailable Date For Car Wash(Linked list is): ");
        System.out.print("[ ");
        llist.printDateList();//Displaying the Monday to Sunday
        System.out.print("\b\b ]\n");

        CarWashBookingSystem name = new CarWashBookingSystem();
        CarWashBookingSystem age = new CarWashBookingSystem();
        CarWashBookingSystem cusnum = new CarWashBookingSystem();
        CarWashBookingSystem cusgender = new CarWashBookingSystem();
        CarWashBookingSystem cartype = new CarWashBookingSystem();
        CarWashBookingSystem carplatenum = new CarWashBookingSystem();
        CarWashBookingSystem date = new CarWashBookingSystem();
        CarWashBookingSystem carService = new CarWashBookingSystem();

        boolean choice = true;
        while(choice){
            System.out.println("Please Enter your name: ");
            CustomerName = input.next();
            name.insert(CustomerName);
            System.out.println("Please Enter Customer Age: ");
            CustomerAge = input.next();
            age.insert(CustomerAge);
            System.out.println("Please Enter Customer Contact Number: ");
            CustomerNumber = input.next();
            cusnum.insert(CustomerNumber);
            System.out.println("Please Enter Customer Gender(M/F): ");
            CustomerGender = input.next();
            cusgender.insert(CustomerGender);
            System.out.println("Please Enter Car Type[Suv/Sedan]: ");
            CarType = input.next();
            cartype.insert(CarType);
            System.out.println("Please Enter Customer Number Plate: ");
            CarPlateNum = input.next();
            carplatenum.insert(CarPlateNum);

            //book
            System.out.println("Please Enter Date For Car Wash:");
            //printList(); i cannot print back the linkedlist

            System.out.println("[1=Mon, 2=Tue, 3=Wed, 4=Thu, 5=Fri, 6=Sat, 7=Sun]");
            Date = input.next();
            switch(Date){
                case "1" -> date.insert("Monday");
                case "2" -> date.insert("Tuesday");
                case "3" -> date.insert("Wednesday");
                case "4" -> date.insert("Thursday");
                case "5" -> date.insert("Friday");
                case "6" -> date.insert("Saturday");
                case "7" -> date.insert("Sunday");
            }

            System.out.println("Please Enter Type of Car Service: ");
            System.out.println("1=Car Wash Only");
            System.out.println("2=Car Wash and Vacuum Only");
            System.out.println("3=Car Wash and Polish Only");
            typeofCarService=input.next();
            switch(typeofCarService){
                case "1" -> carService.insert("Car Wash only");
                case "2" -> carService.insert("Car Wash and Vacuum Only");
                case "3" -> carService.insert("Car Wash and Polish Only");
            }

            System.out.println("More items for the list? (yes or no): ");
            String ans = input.next();
            System.out.println();
            if (!ans.equalsIgnoreCase("yes"))
                choice = false;
        }

        //Add name,ask their name and insert in index?
        System.out.println("\n~~~~~~~~Booking Slot~~~~~~~~");
        System.out.print("[ ");
        llist.printDateList();
        System.out.print("\b\b ]\n");
        name.printList();
        age.printList();
        cusnum.printList();
        cusgender.printList();
        cartype.printList();
        carplatenum.printList();
        date.printList();
        carService.printList();

        //Delete name position
        boolean done=false;
        while(!done) {
            System.out.println("\n\nDo you want to Delete Name?, Search Name?, or End?");
            System.out.println("Please enter [Delete, Search or End]:");
            String jawapan = input.next();
            if(jawapan.equalsIgnoreCase("Delete")) {
                System.out.println("\nWhich index do you want to delete?[1, 2, 3, 4, 5, 6, 7]");
                int deletePosititon = input.nextInt();
                name.delete(deletePosititon);
                System.out.println("\n~~~~~~~~Booking Slot~~~~~~~~");
                System.out.print("[ ");
                llist.printDateList();
                System.out.print("\b\b ]\n");
                name.printList();
            } else if(jawapan.equalsIgnoreCase("Search")){
                System.out.println("Please enter your booking name: ");
                String searchname = input.next();
                for (int a = 0; a < llist.lengthOfLinkedList(); a++) {
                    if (searchname.equalsIgnoreCase(llist.getName())){
                        System.out.println(searchname + " found!");
                        name.printList();
                        age.printList();
                        cusnum.printList();
                        cusgender.printList();
                        cartype.printList();
                        carplatenum.printList();
                        date.printList();
                        carService.printList();
                    }
                }
            }
            //else +Search @Cho Pao
            else if (jawapan.equalsIgnoreCase("End")){
                done=true;
            }
            else
                done=false;
        }
        //System.out.println("loop");
        //+after Delete or search Looping?
    }
    // add node
    /**public static void Main(){
     CarWashBookingSystem name = new CarWashBookingSystem();
     CarWashBookingSystem age = new CarWashBookingSystem();
     CarWashBookingSystem cusnum = new CarWashBookingSystem();
     CarWashBookingSystem cusgender = new CarWashBookingSystem();
     CarWashBookingSystem cartype = new CarWashBookingSystem();
     CarWashBookingSystem carplatenum = new CarWashBookingSystem();
     boolean choice = true;
     while(choice){
     Scanner input=new Scanner(System.in);
     System.out.println("Please Enter your name: ");
     CustomerName = input.nextLine();
     name.insert(CustomerName);
     System.out.println("Please Enter Customer Age: ");
     CustomerAge = input.next();
     age.insert(CustomerAge);
     System.out.println("Please Enter Customer Contact Number: ");
     CustomerNumber = input.next();
     cusnum.insert(CustomerNumber);
     System.out.println("Please Enter Customer Gender(M/F): ");
     CustomerGender = input.next();
     cusgender.insert(CustomerGender);
     System.out.println("Please Enter Car Type[Suv/Sedan]: ");
     CarType = input.next();
     cartype.insert(CarType);
     System.out.println("Please Enter Customer Number Plate: ");
     CarPlateNum = input.next();
     carplatenum.insert(CarPlateNum);
     //book
     System.out.println("Please Enter Date For Car Wash:");
     //printList(); i cannot print back the linkedlist
     System.out.println("[1=Mon, 2=Tue, 3=Wed, 4=Thu, 5=Fri, 6=Sat, 7=Sun]");
     Date = input.next();
     System.out.println("Please Enter Type of Car Service: ");
     System.out.println("1=Car Wash Only");
     System.out.println("2=Car Wash and Vacuum Only");
     System.out.println("3=Car Wash and polish Only");
     typeofCarService=input.next();
     System.out.println("More items for the list? (yes or no): ");
     String ans = input.next();
     System.out.println();
     if (!ans.equalsIgnoreCase("yes"))
     choice = false;
     break;
     //if u guys saw these message, should we put Time? is it complicated? reply back in group chat yeah hahha
     }**/
}