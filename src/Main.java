 void main() {

    var scanner = new Scanner(System.in);

    //Solicita a altura:
    System.out.println("Digite a sua altura:");
    var altura = scanner.nextDouble();

    //Solicita o peso:
    System.out.println("Digite o seu peso:");
    var peso = scanner.nextDouble();

    //Calcula o IMC e imprime o resultado
    var IMC = (peso / (altura * altura));
    System.out.printf("Seu IMC é: %s",IMC);

    if (IMC <= 18.5){
         System.out.println(" você esta abaixo do peso!");
     }
     else if (IMC >= 18.6 && IMC <= 24.9){
         System.out.println(" você esta no peso ideal!");
     }
    else if (IMC >= 25.0 && IMC <= 29.9){
        System.out.println(" você esta levemente acima do peso!");
    }
    else if (IMC >= 30.0 && IMC <= 34.9){
        System.out.println(" você esta com Obesidade grau I");
    }
    else if (IMC >= 35.0 && IMC <= 39.9){
        System.out.println(" você esta com Obesidade grau II (Severa)");
    }
    else if (IMC >= 40.0) {
        System.out.println(" você esta com Obesidade grau III (Mórbida)");
    }
}
