import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Hashtable;

class sampleDTOTest {
    @Test
    void isSameTest(){
        sampleDTO dto1= new sampleDTO("kim","sungryul");
        sampleDTO dto2= new sampleDTO("kim","sungryul");
        sampleDTO dto3=dto1;
        System.out.println(dto1.equals(dto3));
        System.out.println(dto1.hashCode());
        System.out.println(dto2.hashCode());
        System.out.println(dto3.hashCode());
        Hashtable hashtable = new Hashtable();
        hashtable.put(1,dto1);
        System.out.println(hashtable.get(1).toString());
        //Assertions.assertEquals(dto1,dto2);
    }
    @Test
    void moneyTest(){
        Money2 chickenPriceDollar = new Money2(1000);
        Money chickenPrice = Money.wons(18000);
        Money pizzaPrice = Money.wons(16000);
        System.out.println(chickenPrice.isLessThan(pizzaPrice));
        Money totalPrice = chickenPrice.plus(pizzaPrice);
        System.out.println("totalPrice.getAmount() = " + totalPrice.getAmount());
    }
}