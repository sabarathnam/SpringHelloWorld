package com.HelloWorld.HelloWorld

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class HelloWorldApplicationTests {

	@Test
	fun contextLoads() {
	}
	@Test
	fun HelloTest()
	{
		val i=1
		assert(i==1)
	}

}
