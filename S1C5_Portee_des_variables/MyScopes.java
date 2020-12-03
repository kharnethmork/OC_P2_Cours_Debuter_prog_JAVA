public class MyScopes {

    static String root = "I'm available to all lines of code within my context";

        public static void main(String[] args) {
           String spy = "I'm a spy";
           // Corriger l'erreur
        
                String insideCurlyBrackets="I'm an insider";

           System.out.println(root); 
           System.out.println(spy);
           System.out.println(insideCurlyBrackets);                   
          }
}