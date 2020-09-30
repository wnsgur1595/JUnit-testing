package org.edwith.webbe.calculatorcli;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// ApplicationConfig.class 설정파일을 읽어들이는 ApplicationContext객체 생성
		// 아래 한줄이 실행되면서 Component 스캔을 하고, Component를 찾으면 인스턴스를 생성하여 ApplicationContext가 관리하게 된다.
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		// ApplicationContext가 관리하는 CalculatorService.class타입의 객체를 요청
		CalculatorService calculatorService = applicationContext.getBean(CalculatorService.class);

		System.out.println(calculatorService.plus(10, 50));
	}

}
