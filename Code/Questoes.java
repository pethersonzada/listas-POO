
import java.util.Locale;
import java.util.Scanner;

public class Questoes {
    public static void main(String[] args) throws Exception {

        // Definindo a localidade, para permitir que o usuário digite "." em entradas de texto

        Locale.setDefault(Locale.US);

        // Criação do método Scanner para ler as mensagens digitadas por você, usuário :)

        Scanner sc = new Scanner(System.in);

       
        // 1. **Soma Simples:** Escreva um programa que leia dois números inteiros e imprima a soma.

        System.out.println("1. Escreva um programa que leia dois números inteiros e imprima a soma.");

        int soma_simples_num_1 = 2, soma_simples_num_2 = 4, soma_simples_resultado = soma_simples_num_1 + soma_simples_num_2;

        System.out.printf("O resultado da soma é: %d%n", soma_simples_resultado);

        System.out.println("");


        // 2.  **Média de Notas:** Leia três notas de um aluno e calcule a média.

        System.out.println("2. Leia três notas de um aluno e calcule a média.");

        double media_de_notas_nota_1 = 10, media_de_notas_nota_2 = 9.5, media_de_notas_nota_3 = 4.5, media_de_notas = (media_de_notas_nota_1 + media_de_notas_nota_2 + media_de_notas_nota_3) / 3;

        System.out.printf("O resultado da média é de: %.1f%n", media_de_notas);

        System.out.println("");

        // 3.  **Área do Retângulo:** Peça a base e a altura de um retângulo e calcule sua área.

        System.out.println("3. Peça a base e a altura de um retângulo e calcule sua área.");
        
        System.out.print("Digite a base do retângulo: ");
        double base_retangulo = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: "); 
        double altura_retangulo = sc.nextDouble();

        double area_retangulo = base_retangulo * altura_retangulo;

        System.out.printf("A área do retângulo é de: %.2f%n", area_retangulo);

        System.out.println("");

        // 4.  **Par ou Ímpar:** Verifique se um número digitado pelo usuário é par ou ímpar.

        System.out.println("4. Verifique se um número digitado pelo usuário é par ou ímpar.");

        System.out.print("Digite um número: ");
        int numero_digitado = sc.nextInt();

        if (numero_digitado % 2 == 0) {
            System.out.printf("O número é par! %n");
        }

        else {
            System.out.printf("O número é ímpar! %n");
        }

        System.out.println("");        

        // 5.  **Maior de Dois:** Leia dois números e informe qual deles é o maior.

        System.out.println("5. Leia dois números e informe qual deles é o maior.");

        System.out.printf("Digite o primeiro número: ");
        double maior_de_dois_numero_1 = sc.nextDouble();

        System.out.printf("Digite o segundo número: ");
        double maior_de_dois_numero_2 = sc.nextDouble();

        if (maior_de_dois_numero_1 > maior_de_dois_numero_2) {
            System.out.printf("O número %.1f é maior que %.1f%n", maior_de_dois_numero_1, maior_de_dois_numero_2);
        }

        else if (maior_de_dois_numero_1 == maior_de_dois_numero_2) {
            System.out.printf("Os números %.1f e %.1f são iguais!%n", maior_de_dois_numero_1, maior_de_dois_numero_2);            
        }

        else {
            System.out.printf("O número %.1f é maior que %.1f%n", maior_de_dois_numero_2, maior_de_dois_numero_1);
        }

        System.out.println("");

        // 6.  **Conversor de Moedas:** Leia um valor em Reais (R$) e a cotação do Dólar, e converta o valor para Dólares.

        System.out.println("6.  Leia um valor em Reais (R$) e a cotação do Dólar, e converta o valor para Dólares.");

        System.out.printf("Digite um valor em R$: ");
        double moeda_em_reais = sc.nextDouble(), cotacao_dolar = 0.19, valor_convertido_r_em_d = moeda_em_reais * cotacao_dolar;

        System.out.printf("O valor de R$%.1f em dólar é de: $%.2f%n", moeda_em_reais, valor_convertido_r_em_d);

        System.out.println("");

        // 7.  **Tabuada:** Peça um número e mostre a tabuada de 1 a 10 desse número.

        System.out.println("7.  Peça um número e mostre a tabuada de 1 a 10 desse número.");

        System.out.printf("Digite um número que deseja visualizar a tabuada: ");
        int tabuada = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado_tabuada = tabuada * i;
            System.out.printf("%d x %d = %d%n", i, tabuada, resultado_tabuada );
        }

        System.out.println("");

        // 8.  **Contagem Crescente:** Imprima os números de 1 a 50 na tela.

        System.out.println("8.  Imprima os números de 1 a 50 na tela.");

        for (int i = 1; i <= 50; i++) {
            System.out.printf("Contagem de 1 a 50, Número Atual: %d%n", i);
        }

        System.out.println("");
        
        // 9.  *Contagem Regressiva:* Faça um programa que conte de 10 até 0.

        System.out.println("9.   Faça um programa que conte de 10 até 0.");

        for (int i = 10; i >= 0; i--) {
            System.out.printf("Contagem Regressiva: %d%n", i);
        }

        System.out.println("");

        // 10. **Verificador de Idade:** Peça o ano de nascimento do usuário e o ano atual. Calcule a idade e diga se ele é maior de idade (>= 18 anos).

        System.out.println("10.  Peça o ano de nascimento do usuário e o ano atual. Calcule a idade e diga se ele é maior de idade (>= 18 anos).");

        System.out.print("Digite a sua idade: ");
        int idade_do_usuario = sc.nextInt();

        if (idade_do_usuario >= 18) {
            System.out.printf("Você tem %d anos de idade... Portando você é maior de idade! %n", idade_do_usuario);
        }

        else {
            System.out.printf("Você tem %d anos de idade, e aqui só permitimos maiores de 18 anos... VAZA! %n", idade_do_usuario);
        }

        System.out.println("");

        // 11. **Calculadora de IMC:** Peça o peso (kg) e a altura (m) de uma pessoa e calcule o Índice de Massa Corporal.

        System.out.println("11.  Peça o peso (kg) e a altura (m) de uma pessoa e calcule o Índice de Massa Corporal.");

        System.out.print("Digite o seu peso corporal em KG: ");
        double peso_da_pessoa = sc.nextDouble();

        System.out.print("Digite a sua altura em Metros: ");
        double altura_da_pessoa = sc.nextDouble();

        double calculo_do_imc = peso_da_pessoa / (altura_da_pessoa * altura_da_pessoa);

        System.out.printf("Cálculo do seu IMC: %.1f%n", calculo_do_imc);

        /* 
        Menor que 18,5 	     Magreza 	      0
        Entre 18,5 e 24,9 	 Normal 	          0
        Entre 25,0 e 29,9 	 Sobrepeso 	      I
        Entre 30,0 e 39,9 	 Obesidade 	      II
        Maior que 40,0 	     Obesidade Grave   III
          
        */

        if (calculo_do_imc < 18.5) {
            System.out.printf("Você está em situação de magreza... %n");
        }

        else if (calculo_do_imc >= 18.5 && calculo_do_imc <= 24.9) {
            System.out.printf("Você está normal... %n");
        }

        else if (calculo_do_imc >= 25 && calculo_do_imc <= 29.9) {
            System.out.printf("Você está com sobrepeso, com obesidade de grau tipo I %n");
        }

        else if (calculo_do_imc >= 30 && calculo_do_imc <= 39.9) {
            System.out.printf("Você está com obesidade, com grau tipo II... %n");
        }

        else if (calculo_do_imc >= 40) {
            System.out.printf("Você está com obesidade grave, com tipo III... %n");
        }
        
        System.out.println("");

        // 12. **Aumento Salarial:** Leia o salário de um funcionário e aplique um aumento de 15%. Mostre o novo salário.

        System.out.println("12.  Leia o salário de um funcionário e aplique um aumento de 15%. Mostre o novo salário.");

        System.out.printf("Digite o seu salário: ");
        double salario_funcionario = sc.nextDouble();
        double porcentagem = salario_funcionario * 0.15;
        double salario_ajustado_que_poderia_ser_maior = salario_funcionario + porcentagem;

        System.out.printf("O seu salário que era de R$%f, com um aumento de 0.15, ficou: R$%f %n", salario_funcionario, salario_ajustado_que_poderia_ser_maior);

        System.out.println("");

        // 13. *Soma dos Pares:* Calcule e mostre a soma dos números pares de 1 a 100.

        System.out.println("13.  Calcule e mostre a soma dos números pares de 1 a 100.");

        int soma = 0;

        for (int i = 2; i < 101; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.printf("A soma dos números pares de 1 a 100 é: %d%n", soma);

        System.out.println("");

        // 14. *Fatorial:* Peça um número e calcule o seu fatorial.

        System.out.println("14.  Peça um número e calcule o seu fatorial.");

        System.out.printf("Digite um número que você quer fazer o cálculo fatorial: ");
        int numero_fatorial = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero_fatorial; i++) {
            fatorial *= i; 
        }

        System.out.printf("O fatorial de %d é %d %n", numero_fatorial, fatorial);

        System.out.println("");

        // 15. *Adivinhe o Número:* Crie um "mini-jogo" onde o programa tem um número fixo (ex: 7) e o usuário tenta adivinhar. Diga se ele acertou ou errou.

        System.out.println("15.  Crie um mini jogo onde o programa tem um número fixo (ex: 7) e o usuário tenta adivinhar. Diga se ele acertou ou errou.");

        int numero_secreto = 7;

        System.out.printf("Tente acertar qual o número secreto... de 0 a 10: ");
        int tentativa = sc.nextInt();

        if (tentativa == numero_secreto) {
            System.out.printf("O número secreto era %d... E VOCÊ ACERTOU! %n", numero_secreto);
        }

        else {
            System.out.printf("O número secreto era %d... E VOCê ERROU... HAHAHAHAHAHAHA %n", numero_secreto);    
        }

        System.out.println("");


        // 16. *Login Simples:* Crie duas variáveis, usuario e senha, com valores fixos. Peça para o usuário digitar um usuário e senha e verifique se correspondem aos valores armazenados.

        System.out.println("16.  Crie duas variáveis, usuario e senha, com valores fixos. Peça para o usuário digitar um usuário e senha e verifique se correspondem aos valores armazenados.");

        String usuario = "bananinha442";
        int senha = 1213;

        System.out.printf("Digite o usuário: ");
        sc.nextLine();
        String tentativa_login = sc.nextLine();

        System.out.printf("Digite a senha (DICA: APENAS 4 NÚMEROS): ");
        int tentativa_senha = sc.nextInt();

        if (tentativa_login.equalsIgnoreCase(usuario) && tentativa_senha == senha) { // Pra deixar fácil né véi, não diferenciar maiúscula de minúsculas
            System.out.printf("Brabo po, tu acertou tudo... %n");
        } 

        else {
            System.out.printf("Só tinha uma tentativa. E você errou. K. K. K. K. K. %n");
        }

        System.out.println("");

        // 17.  Leia um número de 1 a 7 e imprima o dia da semana correspondente.

        System.out.println("17. **Dias da Semana:** Leia um número de 1 a 7 e imprima o dia da semana correspondente.");

        System.out.printf("Digite um número de 1 a 7 para descobrir o dia da semana referente: ");
        int tentativa_dia_da_semana = sc.nextInt();

        switch (tentativa_dia_da_semana) {
            case 1 -> System.out.println("Segunda-Feira");
            case 2 -> System.out.println("Terça-Feira");
            case 3 -> System.out.println("Quarta-Feira");
            case 4 -> System.out.println("Quinta-Feira");
            case 5 -> System.out.println("Sexta-Feira");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Apenas números de 1 a 7!");
        }

        System.out.println("");

        // 18. **Vogal ou Consoante:** Peça uma letra e diga se é uma vogal ou consoante.

        System.out.println("18.  Peça uma letra e diga se é uma vogal ou consoante.");

        System.out.printf("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);

        if (Character.isLetter(letra)) {
            if ("aeiou".indexOf(letra) != -1) {
                System.out.printf("É uma vogal! %n");
            }
            else {
                System.out.printf("Isso é uma consoante! %n");
            }
        }

        else {
            System.out.printf("Digite uma letra... %n");
        }

        System.out.println("");

        // 19. **Calculadora Simples:** Peça dois números e um operador (+, -, *, /). Realize a operação e mostre o resultado.

        System.out.println("19.  Peça dois números e um operador (+, -, *, /). Realize a operação e mostre o resultado.");

        System.out.printf("Digite o primeiro número: ");
        double primeiro_numero = sc.nextDouble();

        System.out.printf("Digite o segundo número: ");
        double segundo_numero = sc.nextDouble();

        System.out.printf("Agora digite um operador %n");
        System.out.printf("1 para Soma %n2 para Subtração %n3 para Multiplicação %n4 para Divisão %nDigite aqui: ");
        int operador = sc.nextInt();

        switch (operador) {
            case 1 -> System.out.printf("A Soma dos números %.2f e %.2f é igual a: %.2f%n", primeiro_numero, segundo_numero, (primeiro_numero + segundo_numero));
            case 2 -> System.out.printf("A Subtração dos números %.2f e %.2f é igual a: %.2f%n", primeiro_numero, segundo_numero, (primeiro_numero - segundo_numero));
            case 3 -> System.out.printf("A Multiplicação dos números %.2f e %.2f é igual a: %.2f%n", primeiro_numero, segundo_numero, (primeiro_numero * segundo_numero));
            case 4 -> System.out.printf("A Divisão dos números %.2f e %.2f é igual a: %.2f%n", primeiro_numero, segundo_numero, (primeiro_numero / segundo_numero));
            default -> System.out.printf("Digite um número válido pelo amor de Deus %n");
        }

        System.out.println("");

        // 20. **Triângulo Válido:** Leia os três lados de um triângulo e verifique se eles podem formar um triângulo (a soma de dois lados deve ser sempre maior que o terceiro).

        System.out.println("20.  Leia os três lados de um triângulo e verifique se eles podem formar um triângulo (a soma de dois lados deve ser sempre maior que o terceiro.");

        System.out.printf("Digite o primeiro lado: "); // Com o corpo fechado, ninguém vai me pegar, Lado A Lado B, Lado B Lado A
        double lado_a = sc.nextDouble();

        System.out.printf("Digite o segundo lado: "); // No bê-a-bá da chapa quente eu sou mais Jorge Ben, Tocando bem alto no meu Walkman 
        double lado_b = sc.nextDouble();

        System.out.printf("Digite o terceiro lado: "); // Esperando o carnaval do ano que vem, não sei se o ano vai ser do mal ou se vai ser do bem
        double lado_c = sc.nextDouble();

        if (lado_a + lado_b > lado_c && lado_a + lado_c > lado_b && lado_b + lado_c > lado_a) {
            System.out.printf("Triângulo valido! %n");
        }

        else {
            System.out.printf("Triângulo? Só se for amoroso... porque geométrico não é %n");
        }

        // Fechamento do método Scanner... 
        sc.close();

    }
}
