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
		void debeLanzarExcepcion(){
			Integer[] arregloNumeros = null;
			
			Integer x = 1;
			
			String mensage="Arreglo vacio";
			
			Exception exc= assertThrows(Exception.class, ()->{
				demoRestApplication.contarVecesNumero(x, arregloNumeros);
			});
			System.out.println(exc);
			assertEquals(exc.getMessage() , mensage);
			
		}
	}

}
