import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("김신의");
        nameList.add("이윤수");
        nameList.add("성태ㄴ");
        nameList.add("이윤ㄱ");
        nameList.add("이윤ㅅ");
        nameList.add("이윤ㅇ");
        nameList.add("이윤ㅠ");
        nameList.add("이윤ㄴ");
        nameList.add("이윤ㅂ");

        nameList.remove(3);


        System.out.println(nameList.size());
        System.out.println(nameList);

        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);

        for (int num : numList) {
            System.out.println(num * num);
        }

    }
}
