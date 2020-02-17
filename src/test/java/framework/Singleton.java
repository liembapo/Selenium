package framework;

public class Singleton {
    private Singleton(){}

    private static String word;
    public static String getWord(){
        if(word == null ){
            System.out.println("First set up");
            word = "I have value now";
        }else System.out.println("already has value");

        return word;
    }


}
