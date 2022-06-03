package Assignment;

public class ChromeBrowser {
    public void openChromeBrowser(){
        System.out.println("Open Browser");
    }
    public void writeUrlInChromeAddressBar(){
        System.out.println("Write new URL in the Browser");
    }
    public void openNewTabInChromeBrowser(){
        System.out.println("Open New Tab");
    }


    public static void main(String[] args) {
        ChromeBrowser myTab = new ChromeBrowser();
        myTab.openChromeBrowser();
        myTab.openNewTabInChromeBrowser();
        myTab.writeUrlInChromeAddressBar();
    }
}
