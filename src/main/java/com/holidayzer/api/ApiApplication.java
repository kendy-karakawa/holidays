package com.holidayzer.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

	}

	 public static void tipoNumero(int num){
        if(num > 0 && num % 2 == 0){
            System.out.println(num + " é par e positivo");
        }else if (num > 0 && num % 2 != 0){
            System.out.println(num + " é impar e positivo");
        }else if (num < 0 && num % 2 == 0){
            System.out.println(num + " é par e negativo");
        }else {
            System.out.println(num + " é impar e negativo");
        }
        
    }

    public static void fibonacci(int num){
        List<Integer> lista = new ArrayList<>();
        for (int i=0; i<num; i++){
            if( i < 2){
                lista.add(i);
            }else{
                lista.add(lista.get(i-1) + lista.get(i-2));
            }
        }
        System.out.println(lista);
    }

    public static void multiplicaAi(int num){
        for (int i=0; i<=10; i++){
            if(i == 0){
                System.out.println("Tabela de multiplicação por " + num);
            }else {
                System.out.println( num + " x " + i + " = " + num*i);
            }
        }
    }

    public static void piramide( int num){
        for (int i=1; i<= num; i++){
            String posi = String.valueOf(i);
            String result = "";
            for (int k = 0; k< i; k++){
                result += posi;
            }
            System.out.println(result);
        }
    }

    public static void duplicadoNao(String[] ary1, String[] ary2){
        for (int i=0; i < ary1.length; i++){
            for (int k = 0; k < ary2.length ; k++){
                if(ary1[i] == ary2[k]){
                    System.out.println(ary1[i]);
                }
            }

        }
    }


}


