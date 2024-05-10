package OnlineShopManager;
import java.util.ArrayList;
import java.util.Scanner;
public class Client {
    String name;
    String surname;
    String phoneNumbre;
    String addres;
    int ID;
    ArrayList<String> products = new ArrayList<String>();

    


    public Client(String name, String surname, String phoneNumbre, String addres, int iD) {
        this.name = name;
        this.surname = surname;
        this.phoneNumbre = phoneNumbre;
        this.addres = addres;
        ID = iD;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPhoneNumbre() {
        return phoneNumbre;
    }
    public void setPhoneNumbre(String phoneNumbre) {
        this.phoneNumbre = phoneNumbre;
    }
    public String getAddres() {
        return addres;
    }
    public void setAddres(String addres) {
        this.addres = addres;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }

    //Methods

    public void makeOrder(){
        Scanner sc = new Scanner(System.in);
        String input = "";
        Ship ship = new Ship();

        do {ship.addProducts(input);
            
        } while (input == "e");

       

        sc.close();
    }

    

    
}
