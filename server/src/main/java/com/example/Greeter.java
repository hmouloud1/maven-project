package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
	/**
	 * This read excel file into arraylist with filters
	 * @param someone: someone 
	 */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
