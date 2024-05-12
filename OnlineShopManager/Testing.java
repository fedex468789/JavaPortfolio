package OnlineShopManager;
public class Testing {

    public static void main(String[] args){

        OnlineShop karefur = new OnlineShop();
        Client client1 = new Client("Pedro" , "Sanchez" ,"+54 9 5745664514", "Cochabamba 123" , 0000001);
        Client client2 = new Client("Pete" , "Martinez" ,"+54 9 1456141789", "Maipu 200" , 0000002);

       /*  karefur.addClient(client1);
        karefur.addClient(client2);
        karefur.getSpecificClientInfo("peDro");*/

        client1.makeOrder();
        System.out.println(client1.getClientOrder());



















    }
    
}
