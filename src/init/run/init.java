package init.run;

import init.devices.Phone;

public class init {
    public  static  void  main (String [] args){

        Phone samsung = new Phone();
        Phone xiaomi = new Phone();
        Phone iPhone = new Phone();

        samsung.setPhoneNumber("38098213");
        xiaomi.setPhoneNumber("38098213");
        iPhone.setPhoneNumber("38098213");

        System.out.println(samsung.getPhoneNumber());
        System.out.println(xiaomi.getPhoneNumber());
        System.out.println(iPhone.getPhoneNumber());
    }

}
