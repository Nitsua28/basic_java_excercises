package exercises.grades;

import java.util.ArrayList;
import java.util.Scanner;

class grades{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade;
        ArrayList<Integer> gradeArr = new ArrayList<Integer>();
        System.out.println("Input your grades! type exit to stop");
        while (true){
            grade = scanner.nextLine();
            if (grade.equals("exit")) break;
            gradeArr.add(Integer.parseInt(grade));
        }
        
        for (Integer elem:gradeArr){
            if (elem < 101 && elem > 92){
                System.out.println(elem + " -> A");
            }
            else if (elem < 93 && elem > 89){
                System.out.println(elem + " -> A-");
            }
            else if (elem < 90 && elem > 86){
                System.out.println(elem + " -> B+");
            }
            else if (elem < 87 && elem > 82){
                System.out.println(elem + " -> B");
            }
            else if (elem < 83 && elem > 79){
                System.out.println(elem + " -> B-");
            }
            else if (elem < 80 && elem > 76){
                System.out.println(elem + " -> C+");
            }
            else if (elem < 77 && elem > 72){
                System.out.println(elem + " -> C");
            }
            else if (elem < 73 && elem > 69){
                System.out.println(elem + " -> C-");
            }
            else if (elem < 70 && elem > 64){
                System.out.println(elem + " -> D");
            }
            else if (elem < 64 && elem > 0){
                System.out.println(elem + " -> F");
            }
            else{
                System.out.println(elem + " -> error");
            }
        }
        scanner.close();
    }
}