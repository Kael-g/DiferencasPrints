public class DiferencasPrints {
    public static void main(String[] args) {
        int idade = 26;
        String nome = "Kael";

        // System.out.print (ou "print") junta os textos e variáveis como um texto só. Não quebra linha no final.
        System.out.print("Esse é um print. Meu nome é " + nome);

        //System.out.println (ou "println") funciona como o print, porém qubra a linha no final.
        System.out.println("Esse é um println. Tenho " + idade + " anos.");

        //System.out.printf é o texto formatado. Nele não usaremos o + para concatenar informações, mas usaremos
        // o símbolo de % pra informar que haverá uma variável no meio do texto. Devemos indicar o tipo de variável.
        // %d -> inteiro %f -> número decimal %s -> string (variável tipo texto)
        // ao final, devemos colocar as variáveis na ordem que aparecem, separadas por vírgula
        // Observação: assim como o print, não quebra o texto no final. Para isso, podemos usar %n ou /n
        System.out.printf("Esse é um printf. Meu nome é %s e tenho %d anos.\n", nome, idade);

        System.out.println("Fim");
    }
}
