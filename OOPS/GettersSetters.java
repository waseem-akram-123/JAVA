class Account {
    private String password;


// getters
public String getPassword (){
    return this.password;
}

// setters
public void setPassword (String pass){
    this.password = pass;
}
}

public class GettersSetters {
    public static void main (String args[]){

        Account a1 = new Account();

        a1.setPassword ("abcd");
        System.out.println(a1.getPassword());

    }
}
