import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, Pokemon> pokedex = new HashMap<>();
        pokedex.put("피카츄", new Pokemon("피카츄"));
        pokedex.put("라이츄", new Pokemon("라이츄"));
        pokedex.put("이상해씨", new Pokemon("이상해씨"));
        pokedex.put("이상해풀", new Pokemon("이상해풀"));
        pokedex.put("이상해꽃", new Pokemon("이상해꽃"));

        pokedex.remove("이상해풀");
        Pokemon poke003 = pokedex.get("이상해꽃");

        System.out.println(pokedex.get("피카츄"));

        for (String key : pokedex.keySet()) {
            System.out.println(pokedex.get(key));
        }
    }
}
