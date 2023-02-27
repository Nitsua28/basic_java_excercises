package exercises.math;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
class TestMath{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("roll a dice");
        scanner.nextLine();
        int dice = (int)((Math.random() * 5) + 1);
        System.out.println(dice);

        String input;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Input integers! type exit to stop");
        while (true){
            input = scanner.nextLine();
            if (input.equals("exit")) break;
            arr.add(Integer.parseInt(input));
        }
        Integer min = arr.get(0);
        Integer max = arr.get(0);

        for (Integer elem: arr){
            min = Math.min(min,elem);
            max = Math.max(max,elem);
        }
        System.out.println("min= " + min);
        System.out.println("max= " + max);
        System.out.println(arr);
        scanner.close();
    }
}