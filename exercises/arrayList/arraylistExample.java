package exercises.arrayList;

import java.util.ArrayList;

class arrayListExample{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("White");
        list.add("Black");
        list.add("red");
        list.add("pink");

        for (String elem: list){
            System.out.println(elem);
        }
    }
}