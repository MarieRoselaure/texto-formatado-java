public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        system.out.print("textoque nao quebra linha");
        system.outprintIn("texto que nao quebra linha");

        //%s - substitui no texto um valor de string
        system.out.printf("vai imprimir %s" , "Um texto");
        // %d - subtitrui no texto um valor de string
        system.out.printf("vai imprimir %s. %s. %s\n"; "um texto" , "qualquer, pessoa");
        //%d -substitui o corriga %d por um numero inteiro no texto
        system.out.printf("minha idade é:%d", 33);
        //%f- subtituio coringa %f por um numero flutuante
        System.out.printf("\nO valor de PI é: %f" , 3.1415f);
 
    // %2.f - substitui o coringa %2.f por um número flutuante
    //com duas casas decimais
    System.out.printf("\nO valor de PI é %2.f" , 3.1415);
 
    //%b - substitui o coringa %b por um valor booleano
    System.out.printf("\nEsse valor é %b" , true);
    System.out.printf("\nEsse valor é %b" , false);
 
    //%c - substitui o coringa %c por um caractere
    System.out.printf("\nO caractere é: %c" , 'A');
    System.out.printf("\nO caractere é: %c" , '5');
    System.out.printf("\nO caractere é: %c" , '*');
    System.out.printf("\nO caractere é: %c" , '\\');
    System.out.printf("\nO caractere é: %c" , '\"');
 
    //printf com todos os tipos usando variáveis
    String texto = "Alguma Coisa";
    int numeroInteiro = 1;
    float numeroQuebrado = 123.232f;
    boolean valorVerdadeiro = true;
    char umCaractere = '°';
    System.out.printf("\n%s, %d, %2f, %b, %c",
            texto, numeroInteiro, numeroQuebrado,
            valorVerdadeiro, umCaractere);



    }
}
