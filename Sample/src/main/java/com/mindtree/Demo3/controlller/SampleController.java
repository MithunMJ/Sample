package com.mindtree.Demo3.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController
{
	@GetMapping("/hlloo")
	public String Hellooo()
	{
		return "Hi MITHUN";
	}

}
