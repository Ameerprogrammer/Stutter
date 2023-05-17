//Ameer Ahmed

public class Stuttering {
    public static String stutter(String word){

        //use string method to get the first 2 letters of the word to do the stutter
        String start = word.substring(0,2);

        //format the line
        return start + "... " + start + "... " + word + "?";

    }

    public static void main (String[] args) {
        System.out.println(stutter("incredible"));
        System.out.println(stutter("enthusiastic"));
        System.out.println(stutter("outstanding"));
    }
}