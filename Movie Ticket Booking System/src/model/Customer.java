package model;

public class Customer extends User{

    @Override
    public void showMenu(){
        System.out.println("1.Watch Movie");
        System.out.println("2. Watch Shows");
        System.out.println("3. Shows Screen");
        System.out.println("4. Show Seats");
        System.out.println("5. Booking a Show");
        System.out.println("6. Ticket Details");
    }

    Customer(int userId, String userName, String userPassword, String userEmail){
        super(userId,userName,userPassword,userEmail);
    }

}
