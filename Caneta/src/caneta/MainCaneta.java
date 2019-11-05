package caneta;

public class MainCaneta {
    
     public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
        
        /*
        c1.setModelo("BIC");
        //c1.modelo = "BIC";(private)
    
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;(private)
        
        c1.status();
        System.out.println("");
        
        System.out.println("Tenho uma caneta " + c1.getModelo() 
                + " de ponta " + c1.getPonta());    
    
*/
        c1.status(); 
    
  }  
}
