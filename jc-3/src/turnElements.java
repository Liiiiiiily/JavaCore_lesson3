public class turnElements<T> {
    //    1) Написать метод, который меняет два элемента массива местами (массив может быть любого,ссылочного типа)
    private T[] massive;

    public turnElements(T... arr) {
        this.massive = massive;
    }

    public static <T> void turnElement(T[] array, int index0, int index1) {
        T x = array[index0];
        array[index0] = array[index1];
        array[index1] = x;
    }
}