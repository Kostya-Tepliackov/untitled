package DZ1102;

import java.util.HashMap;
import java.util.Map;

public class MAIN {
    public static void main(String[] args){
        HashMap<String, Product> hashMap=new HashMap<String, Product>();

        Product product1 = new Product("Police car", "black", 150);
        Product product2 = new Product("Doll", "orange", 50);
        Product product3 = new Product("Starship", "black", 100);
        Product product4 = new Product("Plane", "white", 75);
        Product product5 = new Product("Train ", "green", 125);

        hashMap.put("Police car", product1);
        hashMap.put("Doll", product2);
        hashMap.put("Starship", product3);
        hashMap.put("Plane", product4);
        hashMap.put("Train", product5);

        System.out.println(hashMap);

    }
}
