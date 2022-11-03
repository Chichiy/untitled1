package uppgifter2;

public class Calculaor {

    private int number1;
    private int number2;

    public Calculaor (int n1, int n2){
        number1 = n1;
        number2 = n2;
    }
    public void printAdd(){
        System.out.println(number1 + number2);
    }
    public void printMin(){
        System.out.println(number1 - number2);
    }
    public void printDiv(){
        System.out.println(number1 / number2);
    }
    public void printMult(){
        System.out.println(number1 * number2);
    }

}
