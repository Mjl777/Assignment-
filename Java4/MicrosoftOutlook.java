package Assignment;

public class MicrosoftOutlook {
    public MicrosoftOutlook openMicrosoftOutlook() {
        MicrosoftOutlook outlook = new MicrosoftOutlook();
        return outlook;
    }

    public void closeMicrosoftOutlook() {
        System.out.println("Close Microsoft Outlook");
    }

    public static void main(String[] args) {
        MicrosoftOutlook myOutlook = new MicrosoftOutlook();
        myOutlook.closeMicrosoftOutlook();
    }
}
