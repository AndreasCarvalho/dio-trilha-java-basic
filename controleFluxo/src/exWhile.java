import java.util.concurrent.ThreadLocalRandom;
public class exWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        
        while (mesada >0 ) {
            double valordoce = valoraleatorio();
            //if (valordoce > mesada)
              //  valordoce = mesada;
                
            System.out.println("valor do doce :" + valordoce + "adicionado no carrinho"); 
            mesada =mesada - valordoce;
        }
        System.out.println("mesada " + mesada);
        System.out.println("joaozinho gastou toda sua mesada");
    
    
    
    }
    private static double valoraleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
