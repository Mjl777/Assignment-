public class MobilePhone<mobileNum> {

    private String brandName;
    private int mobileNum;
    private String color;

    public void setMobileNum(int mobileNum) {
        this.mobileNum = mobileNum;
    }

    public int getMobileNum() {
        if (mobileNum > 50 && mobileNum < 25) {
            System.out.println("11");
        } else {
            System.out.println(mobileNum);
        }
        return mobileNum;
    }


    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getBrandName(){
        return brandName;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public static void main(String[] args){
        MobilePhone phone = new MobilePhone();
        phone.setBrandName("iPhone");
        phone.setMobileNum(99);
        phone.setColor("Gray");

        System.out.println("Brand Name - " + phone.getBrandName() + "-Mobile Number - "+ phone.getMobileNum()+ phone.getBrandName() + "-Phone Color - " + phone.getColor());

    }

}
