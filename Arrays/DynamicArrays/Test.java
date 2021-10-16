package DynamicArrays;

public class Test {
    public static void main(String[] args) {
        DynamicArrays numbers = new DynamicArrays(3);
        numbers.insert(10);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.printArray();
    }
}
