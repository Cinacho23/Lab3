public class BuddyInfo {

    public BuddyInfo(){
        this.name = "Antonio Cinotti";
        this.address = "123 Colonel By Dr.";
        this.phoneNum = "613 123-1234";
    }
    public BuddyInfo(String name, String address, String phoneNum){
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }
    private String name;
    private String address;
    private String phoneNum;
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public static void main(String[] args) {
        BuddyInfo homer = new BuddyInfo("Homer", "123 Elgin st.", "613 111-2222");
        System.out.println("Hello " + homer.getName());
    }
}
