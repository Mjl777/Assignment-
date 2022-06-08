public class Teacher{

    private String names;
    private int student;
    private String subject;

    public void setStudent(int student) {
        this.student = student;
    }
    public int getStudent(){
        return student;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setNames(String names) {
        this.names = names;
    }
    public String getNames(){
        return names;
    }
    public static void main(String[] args){
        Teacher teach = new Teacher();
        teach.setNames("Anna");
        teach.setStudent(7);
        teach.setSubject("English");

        System.out.println("Student name - " + teach.getNames() + "-Student Number - " + teach.getStudent() + "-Subject - " + teach.getSubject());

    }
    
}
