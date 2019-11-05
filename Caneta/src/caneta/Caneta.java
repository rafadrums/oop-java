package caneta;

public class Caneta { 
    private String modelo;
    private float ponta;
    public String cor;
    protected int carga;
    private boolean tampada;
    
    //exemplo construtor 1
    
    /*  -> exemplo
    public Caneta(){ //já executará ações
        this.tampar();
        this.cor = "Azul";
    }
*/
    
    //CONSTRUTOR
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }
    
    
    
    //Getter e setters
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float ponta){
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
    
    //Metodos
    
    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
     
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
}
