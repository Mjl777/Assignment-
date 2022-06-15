public class Loop {
    public void printStringArray() {
        //Write code to move through array and print all elements of array using for loop
        String[] subjects =  {"math", "computer science", "history", "geography"};
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i]);
        }
    }
    public void printIntegarArray() {
        //Write code to move through array and print all elements of array using for loop
        int[] numbers = {3, 7, 9, 4, 2};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }
    public void printCharArray() {
        //Write code to move through array and print all elements of array using for loop
        char[] alphabets = {'a', 'c', 'e'};
        for (char num : alphabets) {
            System.out.println(alphabets);
        }
    }
    
    public static void main(String[] args) {
        Loop j = new Loop();
        j.printStringArray();
        j.printIntegarArray();
        j.printCharArray();



    }
}

