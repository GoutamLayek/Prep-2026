public class User{

    private int id;
    private String email;
    private String name;

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

    int getId(){
        return this.id;
    }

    String getName(){
        return this.name;
    }

    String getEmail(){
        return this.email;
    }


    public static void main(String args[]){
        User user1 = new User();
        user1.setDetails("goutamlayek0653@gmail.com", "Goutam Layek");

        User user2 = new User();
        user2.setDetails("ricky02523@gmail.com", "John");

        System.out.println(user1.getName()+ " " + user1.getEmail()+ " " + user1.getId());
        System.out.println(user2.getName()+ " " + user2.getEmail()+ " " + user2.getId());   
    }

}