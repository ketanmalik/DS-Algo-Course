package DynamicArrays;

public class DynamicArrays {

    private int arr[];
    private int count;

    public DynamicArrays(int length) { arr = new int[length]; }

    public void printArray()
    {

        // Iterating over array using for loop
        for (int i = 0; i < count; i++) {

            // Print the elements of an array
            System.out.print(arr[i] + " ");
        }
    }

    public void insert(int element)
    {

        if (arr.length == count) {

            // Creating a new array double the size
            // of array declared above
            int newArr[] = new int[2 * count];

            // Iterating over new array using for loop
            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }

            // Assigning new array to original array
            // created above
            arr = newArr;
        }

        arr[count++] = element;
    }
}
