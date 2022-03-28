package com.DoOrDie.test;

import org.testng.annotations.Test;

public class TryParametertest {
@Test
public void parametr() {
	System.out.println(System.getProperty("browser"));
	System.out.println(System.getProperty("username"));
}
}
