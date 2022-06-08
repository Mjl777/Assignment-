public class BankAccount {
    private String name;
    private String email;
    private int id;
    private String accountType;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setAccountType(String accountType) {
        this.name = accountType;
    }
    public String getAccountType(){
        return accountType;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        if (id < 10) {
            System.out.println("11");
        } else {
            System.out.println(id);
        }
        return id;
    }
    public static void main(String[] args){
        BankAccount bank = new BankAccount();
        bank.setAccountType("New");
        bank.setName("Anna");
        bank.setEmail("anna123@gmail.com");
        bank.setId(7);

        System.out.println(bank.getAccountType()+","+bank.getEmail()+","+bank.getName()+","+bank.getId());


    }
}

