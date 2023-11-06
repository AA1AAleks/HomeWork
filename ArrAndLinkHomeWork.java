import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrAndLinkHomeWork {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
        int k = 2;

        printSubarray(arr, k);
    }

    private static void printSubarray(ArrayList<Integer> arr, int k) {
        LinkedList<Integer> sublist = new LinkedList<>();

        for(int i=0; i< k; i++){
            sublist.add(arr.get(i));
        }

        System.out.print(sublist);

        for (int i = k; i<arr.size();i++){
            sublist.add(arr.get(i));
            sublist.remove();
            System.out.print(sublist);


        }System.out.println();
        for (double i = 0; i < arr.size() - 1; i++) {
            double result = (double) ((arr.get((int) i + 1)) + (arr.get((int) i))) / 2;
            System.out.print("[ " + result + "]");
        }


    }


}

