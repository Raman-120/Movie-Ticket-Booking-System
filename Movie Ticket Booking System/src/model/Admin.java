package model;

public class Admin extends User{

    @Override
    public void showMenu(){
        System.out.println("1. Add Movies");
        System.out.println("2. Update Movies");
        System.out.println("3. Remove Movie");
        System.out.println("4. View Movie");
        System.out.println("5. Add show");
        System.out.println("6. Update Show");
        System.out.println("7. Remove Show");
        System.out.println("8. View all Shows");
        System.out.println("View Registered Customers");
    }

    Admin(int userId, String userName, String userPassword,String userEmail){
        super(userId, userName,userPassword,userEmail);
    }

}
