import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> fruitList;

    public Box(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public Integer getWeightList() {
        Integer result = 0;
        for(T t: getFruitList()){
            if(t!=null) {
                Integer value = t.getWeightFruit();
                result += value;
            }
        }
        return result;
    }

    public Boolean compareList(Box<? extends Fruit> box) {
        if (this.getWeightList().intValue() == box.getWeightList().intValue()) return true;
        return false;
    }

    public void toEmptyList(Box<T> box) {
        System.out.println("The weight of a full box is " + this.getWeightList() + " kg.");
        System.out.println("The weight of the box to add is " + box.getWeightList() + " kg.");
        for (T t: this.getFruitList()) {
            box.getFruitList().add(t);
        }
        this.getFruitList().clear();
        System.out.println("The weight of a full box is " + this.getWeightList() + " kg.");
        System.out.println("The weight of the box to add is " + box.getWeightList() + " kg.\n");
    }
}