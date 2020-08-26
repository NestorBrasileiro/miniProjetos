package exercicio;

import java.util.Scanner;
public class Main {

    public static void main(String[] arg) {
//     algoritimo validador de cpf's;
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------Digite o CPF com ou sem '-' nos ultimos dois digitos-------");
        System.out.println("-------------Exemplo: 123456789-01 ou 12345678901-------------");

        String cpf = scanner.nextLine();
        String j = null;
        String k = null;
        String a = null;
        String b = null;
        String c = null;
        String d = null;
        String e = null;
        String f = null;
        String g = null;
        String h = null;
        String i = null;
        int formulaJ = 0;
        int formulaK = 0;
            if(cpf.length() == 12){
                    String[] arrayCpf = cpf.split("-");
                    System.out.println("CPF computado");
                    j = String.valueOf(arrayCpf[1].charAt(0));
                    k = String.valueOf(arrayCpf[1].charAt(1));
                     a = String.valueOf(arrayCpf[0].charAt(0));
                     b = String.valueOf(arrayCpf[0].charAt(1));
                     c = String.valueOf(arrayCpf[0].charAt(2));
                     d = String.valueOf(arrayCpf[0].charAt(3));
                     e = String.valueOf(arrayCpf[0].charAt(4));
                     f = String.valueOf(arrayCpf[0].charAt(5));
                     g = String.valueOf(arrayCpf[0].charAt(6));
                     h = String.valueOf(arrayCpf[0].charAt(7));
                     i = String.valueOf(arrayCpf[0].charAt(8));

                    formulaK = (Integer.parseInt(a) * 10) + (Integer.parseInt(b) * 9) + (Integer.parseInt(c) * 8) +
                (Integer.parseInt(d) * 7) + (Integer.parseInt(e) * 6) + (Integer.parseInt(f) * 5) + (Integer.parseInt(g) * 4)
                    + (Integer.parseInt(h) * 3) + (Integer.parseInt(i) * 2);

                    formulaJ = (Integer.parseInt(a) * 11) + (Integer.parseInt(b) * 10) + (Integer.parseInt(c) * 9) +
                        (Integer.parseInt(d) * 8) + (Integer.parseInt(e) * 7) + (Integer.parseInt(f) * 6) + (Integer.parseInt(g) * 5)
                        + (Integer.parseInt(h) * 4) + (Integer.parseInt(i) * 3) + (Integer.parseInt(j) * 2);


                }else if(cpf.length() == 11) {
                    System.out.println("CPF computado");
                    j = String.valueOf(cpf.charAt(9));
                     k = String.valueOf(cpf.charAt(10));
                     a = String.valueOf(cpf.charAt(0));
                     b = String.valueOf(cpf.charAt(1));
                     c = String.valueOf(cpf.charAt(2));
                     d = String.valueOf(cpf.charAt(3));
                     e = String.valueOf(cpf.charAt(4));
                     f = String.valueOf(cpf.charAt(5));
                     g = String.valueOf(cpf.charAt(6));
                     h = String.valueOf(cpf.charAt(7));
                     i = String.valueOf(cpf.charAt(8));

                formulaJ = (Integer.parseInt(a) * 11) + (Integer.parseInt(b) * 10) + (Integer.parseInt(c) * 9) +
                        (Integer.parseInt(d) * 8) + (Integer.parseInt(e) * 7) + (Integer.parseInt(f) * 6) + (Integer.parseInt(g) * 5)
                        + (Integer.parseInt(h) * 4) + (Integer.parseInt(i) * 3) + (Integer.parseInt(j) * 2);

                formulaK = (Integer.parseInt(a) * 10) + (Integer.parseInt(b) * 9) + (Integer.parseInt(c) * 8) +
                        (Integer.parseInt(d) * 7) + (Integer.parseInt(e) * 6) + (Integer.parseInt(f) * 5) + (Integer.parseInt(g) * 4)
                        + (Integer.parseInt(h) * 3) + (Integer.parseInt(i) * 2);
                }else System.out.println("não coloque pontos, coloque ou não apenas o ultimo traço");


            float valorJ = 11 - (formulaJ % 11);
            float valorK = 0;
            float verk = (formulaK % 11);
        if(verk == 0 || verk == 1){
                        valorK = 0;
                    }else if(verk >= 2 && verk <= 10){
                        valorK = 11 - verk;
                    }
        if(valorK == Integer.parseInt(k) && valorJ == Integer.parseInt(j)){
            System.out.println("CPF válido");

        }else System.out.println("CPF invalido.");



        }

    }
