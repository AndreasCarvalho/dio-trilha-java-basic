public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valor_solicitado = 28.0;
 
        if (valor_solicitado < saldo){
            saldo = saldo - valor_solicitado;
            System.out.println("seu novo saldo :" + saldo);

        }else
            System.out.println("saldo insuiciente");
    }
}
