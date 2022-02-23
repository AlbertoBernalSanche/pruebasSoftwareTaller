package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
class DemoRestApplicationTests {

	@InjectMocks
	DemoRestApplication demoRestApplication;
	
	
	@Nested
	class demo{
		
		@Test
		void debeLanzarExcepcionArregloNull(){
			Integer[] arregloNumeros = null;
			
			Integer x = 1;
			
			String mensage="Arreglo vacio";
			
			Exception exc= assertThrows(Exception.class, ()->{
				demoRestApplication.contarVecesNumero(x, arregloNumeros);
			});
			assertEquals(exc.getMessage() , mensage);
			
			
		}
		@Test
		void debeLanzarExcepcionArregloVacio(){
			Integer[] arregloNumeros = new Integer[0];
			
			Integer x = 1;
			
			String mensage="Arreglo vacio";
			
			Exception exc= assertThrows(Exception.class, ()->{
				demoRestApplication.contarVecesNumero(x, arregloNumeros);
			});
			assertEquals(exc.getMessage() , mensage);
			
			
		}
		
		@Test
		void debeLanzarExcepcionValorNulo(){
			Integer[] arregloNumeros = {1,2,3};
			
			Integer x = null;
			
			String mensage="Valor nulo";
			
			Exception exc= assertThrows(Exception.class, ()->{
				demoRestApplication.contarVecesNumero(x, arregloNumeros);
			});
			assertEquals(exc.getMessage() , mensage);
			
		}
		
		@Test
		void debeLanzarCeroCoincidencias() throws Exception{
			Integer[] arregloNumeros = {1,2,3};		
			Integer x = 20;
			
			Integer salida= demoRestApplication.contarVecesNumero(x, arregloNumeros);
			
			assertEquals(salida , 0);
			
		}
		
		@Test
		void debeLanzarCoincidencias() throws Exception{
			Integer[] arregloNumeros = {1,2,3};		
			Integer x = 2;
			
			Integer salida= demoRestApplication.contarVecesNumero(x, arregloNumeros);
			
			assertEquals(salida , 1);
			
		}
	}

}
