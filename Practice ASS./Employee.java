public class Employee {

    private String name;
    private String email;
    private int id;
    private float salary;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {

        {
            if (id >= 50) {
                System.out.println("0");
            } else ;
            System.out.println(id);
        }
       return id;
    }
public void setSalary(float salary) {
        this.salary = salary;
        }
    public float getSalary() {

        {
            if (salary >= 10000 || salary <= 50000) {
                System.out.println("It is not a good salary");
            } else;
            System.out.println(salary);
        }
        return salary;

    }
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
public static void main(String[] args){
        Employee hj = new Employee();
        hj.setName("Anna");
        hj.setEmail("jsagkdj@gmail.com");
        hj.setSalary(88888);
        hj.setId(90);

        System.out.println( hj.getEmail() + hj.getName());
        System.out.println(hj.getSalary() + hj.getId() );

        }

        }

