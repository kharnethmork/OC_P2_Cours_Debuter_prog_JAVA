public class MixingTypes {
    public static void main(String[] args) {  
        int numerator = 10;
        int denominator = 4;
        
        //Modifiez la déclaration ci-dessous pour que la réponse "answer" soit une valeur décimale : int answer = numerator/denominator.
        double answer = numerator/(double) denominator;
        
        //Affiche le résultat.
        System.out.println("" + numerator + "/" + denominator + "=" + answer);
    
    } 
}
