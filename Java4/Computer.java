package Assignment;

public class Computer {
    public void turnOnComputer(){
        System.out.println("Turn On Computer");
    }
    public void turnOffComputer(){
        System.out.println("Turn Off Computer");
    }
    public void cleanCache(){
        System.out.println("Clean Cache");
    }
    public void reduceBrightNess(int percentage){
        System.out.println("Adjust Brightness to: " + percentage + "%");
    }
    public void playMusic(){
        System.out.println("Play Music");
    }
    public void adjustTheVolume(int percentage){
        System.out.println("Adjust Volume to: " + percentage + "%");
    }

    public static void main(String[] args){
        Computer myComputer =  new Computer();
        myComputer.turnOnComputer();
        myComputer.turnOffComputer();
        myComputer.cleanCache();
        myComputer.reduceBrightNess(50);
        myComputer.playMusic();
        myComputer.adjustTheVolume(80);



    }
}
