import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

    public static void main(String[] args) {
        String word = StdIn.readString();
        String champion="";
        int ctr=1;
        while(true){
            boolean chance = StdRandom.bernoulli((double) 1 / ctr);
//            System.out.println("For "+word+" it is "+chance);
            if(chance){
                champion=word;
            }
            if(StdIn.isEmpty()){
                break;
            }
            word = StdIn.readString();
//            System.out.println("Just got word "+word);
            ctr++;
        }
        System.out.println(champion);
    }
}
