import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        
        map.put(1, "A");
        map.get(1);
        map.remove(1);
    }
}