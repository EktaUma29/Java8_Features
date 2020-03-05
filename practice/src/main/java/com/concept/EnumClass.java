package com.concept;

enum EnumLevel implements Infer {
	  LOW,
	  MEDIUM,
	  HIGH,
	  NORMAL;
	

	@Override
	public void m1() {
		System.out.println("Interface m1()");
		
	}
	
//	EnumLevel(){
//		System.out.println("EnumLevel constructor");
//	}
	}

	public class EnumClass {
	  public static void main(String[] args) {
		  EnumLevel myVar = EnumLevel.MEDIUM;
		  myVar.m1();
		  
		  for (EnumLevel myVar1 : EnumLevel.values()) {
			  System.out.println(myVar1);
			}
		  
		  
//	    switch(myVar) {
//	      case LOW:
//	        System.out.println("Low level");
//	        break;
//	      case MEDIUM:
//	         System.out.println("Medium level");
//	        break;
//	      case HIGH:
//	        System.out.println("High level");
//	        break;
//	    }
//	    
	    
			
			
	    
//	  }
	  }
	}

	interface Infer{
		void m1();
	}
	
	class CLassName{
		
		void m2() {
			System.out.println("ClassName - m2");
		}
	}
	