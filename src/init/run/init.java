package init.run;

import init.devices.Phone;

public class init {
    public static void main(String[] args) {

        Phone samsung = new Phone();
        Phone xiaomi = new Phone("38098213", "redmi", 100f);
        Phone iPhone = new Phone("38098213", "iPhone 12");

        samsung.setPhoneNumber("38098213");
        xiaomi.setPhoneNumber("38098213");
        iPhone.setPhoneNumber("38098213");

        System.out.println(samsung.getPhoneNumber());
        System.out.println(xiaomi.getPhoneNumber());
        System.out.println(iPhone.getPhoneNumber());

        samsung.receiveCall("Alex");
        xiaomi.receiveCall("Andrey");
        iPhone.receiveCall("John");


        System.out.println("______________________________________");


        System.out.println("Samsung details");
        System.out.println(samsung.getPhoneNumber());
        System.out.println(samsung.getModel());
        System.out.println(samsung.getWeight());

        System.out.println("Xiaomi details");
        System.out.println(xiaomi.getPhoneNumber());
        System.out.println(xiaomi.getModel());
        System.out.println(xiaomi.getWeight());

        System.out.println("iPhone details");
        System.out.println(iPhone.getPhoneNumber());
        System.out.println(iPhone.getModel());
        System.out.println(iPhone.getWeight());

        System.out.println("______________________________________");

        iPhone.receiveCall("Alex", samsung.getPhoneNumber());

        System.out.println("______________________________________");

        iPhone.sendMessages(samsung.getPhoneNumber(), xiaomi.getPhoneNumber(), iPhone.getPhoneNumber());
        iPhone.sendMessages(samsung.getPhoneNumber());
    }
}