public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 3;
        String resultado = nota >= 7 ? "aprovado" : nota < 7 && nota >=5 ? "recuperação" : "reprovado";
        
        //if (nota >= 7)
          //  System.out.println("aprovado");
        
        //else if (nota < 7 && nota >=5)
          //  System.out.println("em recuperação");
        //else
          //  System.out.println("reprovado");
          System.err.println(resultado);
    }
}
