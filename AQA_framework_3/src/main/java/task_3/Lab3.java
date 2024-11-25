
import java.util.*;

public class Lab3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }
        for (int num : array2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println("Common elements between both arrays: " + intersection);

        LinkedList<Integer> linkedList = new LinkedList<>(intersection);

        System.out.println("Enter an element to add at the beginning of the list:");
        int firstElement = scanner.nextInt();
        linkedList.addFirst(firstElement);

        System.out.println("Enter an element to add at the end of the list:");
        int lastElement = scanner.nextInt();
        linkedList.addLast(lastElement);

        linkedList.removeFirst();
        System.out.println("Removed the first element");

        linkedList.removeLast();
        System.out.println("Removed the last element");

        System.out.println("Elements of the list in reverse order:");
        ListIterator<Integer> iterator = linkedList.listIterator(linkedList.size());
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();

        try {
            Object x = "This is a string";
            Integer y = (Integer) x;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }

        scanner.close();
    }
}
