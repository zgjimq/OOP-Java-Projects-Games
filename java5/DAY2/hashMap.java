package java5.DAY2;
import java.util.Map;
import java.util.HashMap;
public class hashMap {
    public static void main(String[] args) {
    Map<String, Double> inver= new HashMap<>();
    inver.put("som",5.7);
    inver.put("som2",4.7);
    inver.put("som4",2.7);
    inver.put("som5",1.7);
    inver.put("som6",7.7);

    System.out.println("Whats the value for som2"+inver.get("som"));
    //System.out.println(inver.get("som"));
    }
}
