package exercises.treeSet;

import java.util.Set;
import java.util.TreeSet;

class TreeSetExample{
    public static void main(String[] args) {
        Set<Integer> grades = new TreeSet<>();
        grades.add(100);
        grades.add(1);
        grades.add(12);
        grades.add(34);
        grades.add(23);
        grades.add(56);
        grades.add(40);

        for (Integer grade: grades){
            if(grade < 7) System.out.println(grade);
        }
    }
}