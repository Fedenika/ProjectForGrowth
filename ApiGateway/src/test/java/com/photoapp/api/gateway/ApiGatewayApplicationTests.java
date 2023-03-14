package com.photoapp.api.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiGatewayApplicationTests {

	@Test
	public void formate() throws Exception {
		String forTest = "155552.00";
		double b = Double.valueOf(forTest);
		double i = Double.parseDouble(forTest);
//		int i = Integer.parseInt(forTest);
		System.out.println(b);
	}

}
