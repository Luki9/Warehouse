
public class Final {

    public static void main(String[] args) {
        Device1 device1 = new Device1("QE65Q7FAM", "Samsung", "TV", 9499.99); //code, producer, type, price
        Device1 device2 = new Device1("P9 Lite", "Huawei", "Smatyphone"); //code, producer, type
        Device1 device3 = new Device1("Playstation 4", "Sony", "Smatyphone", 1899.99); //code, producer, type, price

        String allDevices = device1.getInfo() + "\n" + device2.getInfo() + "\n" + device3.getInfo();
        System.out.println(allDevices);
    }
}