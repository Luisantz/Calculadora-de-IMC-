# Calculadora de IMC em Java

Este projeto é um programa em Java que solicita ao usuário sua altura e peso, calcula o **IMC (Índice de Massa Corporal)** e informa em qual faixa de classificação o resultado se encontra.

## 📋 Funcionalidades
- Solicita a altura do usuário.
- Solicita o peso do usuário.
- Calcula o IMC utilizando a fórmula:
  IMC = Peso/(Altura * Altura)
- Exibe o valor do IMC e a classificação correspondente:
  - **Abaixo do peso** (IMC ≤ 18.5)
  - **Peso ideal** (18.6 – 24.9)
  - **Levemente acima do peso** (25.0 – 29.9)
  - **Obesidade grau I** (30.0 – 34.9)
  - **Obesidade grau II (Severa)** (35.0 – 39.9)
  - **Obesidade grau III (Mórbida)** (≥ 40.0)

## 🖥️ Exemplo de uso
Digite a sua altura:

1.75

Digite o seu peso:

70

Seu IMC é: 22.857142857142858 você esta no peso ideal!

## 📂 Estrutura do código
- Scanner é utilizado para capturar entradas do usuário.
- System.out.println exibe mensagens no console.
- System.out.printf formata a saída mostrando o IMC calculado.
- Estruturas condicionais (if, else if) determinam a classificação do IMC.

## 🔧 Requisitos
- Java 11 ou superior.
- Console/terminal para execução.
 
Feito para fins de aprendizado e prática de estruturas condicionais e cálculos matemáticos em Java.
