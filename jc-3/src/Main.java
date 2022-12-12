import java.util.Arrays;
import java.util.ArrayList;
//  1) Написать метод, который меняет два элемента массива местами (массив может быть любого,ссылочного типа)
public class Main {
    public static void main(String[] args) {
        String[] massive = {"Bandicoot", "Crash"};

        System.out.println("Task 1\n" + Arrays.toString(massive));
        turnElements.turnElement(massive, 0, 1);
        System.out.println(Arrays.toString(massive));

        System.out.println("Task 2\n");

        ArrayList<Apple> appleList1 = new ArrayList<>();
        appleList1.add(new Apple());
        appleList1.add(new Apple());
        appleList1.add(new Apple());
        appleList1.add(new Apple());
        appleList1.add(new Apple());
        Box<Apple> Box1 = new Box<>(appleList1);

        ArrayList<Orange> orangeList1 = new ArrayList<>();
        orangeList1.add(new Orange());
        orangeList1.add(new Orange());
        orangeList1.add(new Orange());
        orangeList1.add(new Orange());
        orangeList1.add(new Orange());
        Box<Orange> Box2 = new Box<>(orangeList1);

        ArrayList<Apple> appleList2 = new ArrayList<>();
        Box<Apple> Box3 = new Box<>(appleList2);

        ArrayList<Orange> orangeList2 = new ArrayList<>();
        Box<Orange> Box4 = new Box<>(orangeList2);

        System.out.println("The weight of the first box is " + Box1.getWeightList() + " kg.");
        System.out.println("The weight of the second box is " + Box2.getWeightList() + " kg.");
        System.out.println("The weight of the third box is " + Box3.getWeightList() + " kg.");
        System.out.println("The weight of the fourth box is " + Box4.getWeightList() + " kg.\n");

        System.out.println(Box1.compareList(Box2));
        System.out.println(Box3.compareList(Box4) + "\n");

        Box1.toEmptyList(Box3);
        Box2.toEmptyList(Box4);

        System.out.println("The weight of the first box is " + Box1.getWeightList() + " kg.");
        System.out.println("The weight of the second box is " + Box2.getWeightList() + " kg.");
        System.out.println("The weight of the third box is " + Box3.getWeightList() + " kg.");
        System.out.println("The weight of the fourth box is " + Box4.getWeightList() + " kg.\n");

        System.out.println(Box1.compareList(Box2));
        System.out.println(Box3.compareList(Box4));
    }
}