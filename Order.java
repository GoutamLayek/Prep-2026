public class Order{

    private static int assignID = 100;

    private int ID;
    private int amount;
    private String status;


    // constructor 
    public Order(){
        ID = assignID++;  // avoid business logic in default constructor ---> multiple server , restart reset counters
    } 

    // setter 
    public void setAmount(int amount){
        this.amount = amount;
    }

    public void setStatus(String status){
        this.status = status;
    }

    // getter
    public String getStatus(){
        return this.status;
    }

    public int getID(){
        return this.ID;
    }

    public int getAmount(){
        return this.amount;
    }

    public static void main(String args[]){

        Order od1 = new Order();
        od1.setAmount(1000);
        od1.setStatus("In Transit");

        Order od2 = new Order();
        od2.setAmount(2000);
        od2.setStatus("Packed");

        System.out.println("Order 1 Amount : " + od1.getAmount());
        System.out.println("Order 1 Status : " + od1.getStatus());

    }
}