public class While {
    public void inte() {
        int i=1;
        while(i<=4) {
            System.out.println(i);
            i++;
        }}
            public void chars(){
                char y='a';
                while(y<='c') {
                    System.out.println(y);
                    y++;
                }}
   public void names(){
       int i = 1;
       do {

           System.out.println("Hello");
           i++;
       }
       while (i < 6);
   }



    public static void main(String[] args) {
    While n = new While();
    n.inte();
    n.chars();
    n.names();



    }
}

