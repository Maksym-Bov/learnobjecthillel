package init.devices;

public class Phone {

    private  String phoneNumber;
    private  String model;
    private  double weight;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public  void  receiveCall (String name){
        System.out.println("Key it's" +  name + "is calling");
    }

}
