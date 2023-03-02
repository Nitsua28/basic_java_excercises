package exercises.priorityQueue;

import java.util.PriorityQueue;

import java.util.Queue;

class PriorityQueueExample{
    public static void main(String[] args) {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("white");
        colors.add("black");
        colors.add("red");
        colors.add("orange ");
        colors.add("asdgdg");
        colors.add("pink");
        
        for (String elem: colors){
            System.out.println(elem);
        }

        Queue<NicholasCage> nicholasCageList = new PriorityQueue<>(new RatingCompare());

        nicholasCageList.add(new NicholasCage(1));
        nicholasCageList.add(new NicholasCage(4));
        nicholasCageList.add(new NicholasCage(8));
        nicholasCageList.add(new NicholasCage(2));

        while(!nicholasCageList.isEmpty()) {
            System.out.println(nicholasCageList.poll());
        }

    }
}

class NicholasCage implements Comparable<NicholasCage>{

    private int rating;

    public NicholasCage(int rating){
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int compareTo(NicholasCage o) {
        return this.rating - o.getRating();
        // if names are not the same, there's no tie, so we can return this:
        
    }
    
}