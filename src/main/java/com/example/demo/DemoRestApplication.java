package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRestApplication {

	
	public Integer contarVecesNumero(Integer x, Integer[] lista) throws Exception {
		
		if(x == null) {
			throw new Exception("Valor nulo");
		}
		if(lista==null || lista.length == 0) {
			throw new Exception("Arreglo vacio");	
		}
		
		int conteo=0;
		
		for (Integer integer : lista) {
			if(integer==x) {
				conteo++;
			}
		}
		
		return conteo;

	}
	
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(DemoRestApplication.class, args);
		
		Integer[] arregloNumeros = {1,1,3,4};
		
		Integer x = null;
		
		DemoRestApplication dma = new DemoRestApplication();
		
		System.out.println(dma.contarVecesNumero(x, arregloNumeros));
	
	
	}

}
