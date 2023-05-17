package com.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHookExamples {
		@Before("@tag1")// For before the order will execute from 0 to 1.
			public void beforetest() {
			System.out.println("Tag1 with tag");
		}
		@After("@tag1")// For after the order will execute from 1 to 0.
			public void aftertest() {
			System.out.println("Tag1");
		}
		@After
			public void aftertesting() {
			System.out.println("Without tag");

		}
		@Before
			public void beforetesting() {
			System.out.println("Without tag");
		}
		
		@Before("@tag2")// For before the order will execute from 0 to 1.
			public void beforetestingconcept() {
			System.out.println("Tag2");
		}
		@After("@tag2")// For after the order will execute from 1 to 0.
			public void aftertestingconcept() {
			System.out.println("Tag2");
		}
		@After("@tag2")
			public void aftertestingexample() {
			System.out.println("Tag2");

		}
		@Before("@tag2") 
			public void beforetestingexample() {
			System.out.println("Tag2");
		}

}
