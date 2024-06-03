public class SistemaMedida {
    public static void main(String[] args) {
        String sigla ="M";
        switch (sigla) {
            case "P":{
                System.out.println("pequeno");
                break;
            }
                
            case "M":{
                System.err.println("medio");
                break;
            }
            case "G":{
                System.out.println("grande");
                break;
            }
            default:
                System.out.println("indefinido");
                break;
        }
    }
}
