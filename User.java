public class User{

    private int id;
    private String email;
    public String name;

    private static int count = 101;
    //constructor
    User(){
        id = count++;  // id will be assigned automatically 
    }

    // setter
    void setDetails(String email, String name){
        this.email = email;
        this.name = name;
    }

    void getDetails(){
        System.out.println("Name: " +name + " Email: " + email + " ID: " + id);       
    }

    public static void main(String args[]){
        User user1 = new User();
        user1.setDetails("goutamlayek0653@gmail.com", "Goutam Layek");

        User user2 = new User();
        user2.setDetails("ricky02523@gmail.com", "John");

        user1.getDetails();
        user2.getDetails();
    }

}