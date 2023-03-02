package exercises.linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

class LinkedListExample{
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<Integer>();

        nums.add(1);
        nums.add(76);
        nums.add(44);
        nums.add(80);
        nums.add(0);

        Collections.sort(nums);
        Collections.reverse(nums);

        Iterator<Integer> iterator = nums.iterator();

        while(iterator.hasNext()){
            // .next advances the iterator and returns that next value:
            Integer num = iterator.next();
            System.out.println(num);
        }

    }
    

}