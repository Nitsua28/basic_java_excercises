package exercises.mad_lib;

import java.util.Scanner;


class MadLib{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PatrickSaying saying = new PatrickSaying();

        System.out.println("Input a Adjective");
        saying.input1 = scanner.nextLine();
        System.out.println("Input a Noun");
        saying.input2 = scanner.nextLine();
        System.out.println("Input a Adjective");
        saying.input3 = scanner.nextLine();
        System.out.println("Input a Verb");
        saying.input4 = scanner.nextLine();
        System.out.println("Input a Noun");
        saying.input5 = scanner.nextLine();

        saying.say();
        scanner.close();
    }
}

class PatrickSaying{
    String input1= "";
    String input2= "";
    String input3= "";
    String input4= "";
    String input5= "";

    public void say(){
        System.out.println("Once there was a " + this.input1 + " " + this.input2);
        System.out.println("He was so " + this.input3 + " that everyone " + this.input4);
        System.out.println("The " + this.input5);
    }
}