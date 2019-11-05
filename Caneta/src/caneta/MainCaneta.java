package caneta;

public class MainCaneta {
    
     public static void main(String[] args) {
     
         Caneta c1 = new Caneta();
         c1.modelo = "Bic";
         c1.cor = "Azul";
         c1.ponta = 0.5f;
         c1.destampar();
         System.out.println("");
         c1.status();
         System.out.println("");
         c1.rabiscar();
    }
}
