package Assignment;

import java.util.Scanner;

public class TextEditor {
    public TextEditor openTextEditor() {
      TextEditor notePad = new TextEditor();
      return notePad;
    }
    public void closeTextEditor(){
        System.out.println("Close Text Editor");
    }

    public static void main(String[] args) {
        TextEditor myEditor = new TextEditor();
        myEditor.openTextEditor();
        Scanner input = new Scanner(System.in);
        System.out.println();
        String m  = input.nextLine();
        myEditor.closeTextEditor();
    }
}
