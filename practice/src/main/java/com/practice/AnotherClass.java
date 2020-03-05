package com.practice;

public class AnotherClass {

	public String doSomething() {
		/*return LamdaExpression.doSomthing(new ConcatString() {

			@Override
			public String concatStringMethod(String s1, String s2) {
				// TODO Auto-generated method stub
				return s1 + s2;
			}
		}, "String1", "String2");*/
		ConcatString cs = (s1, s2) -> {
			return s1 + s2;
		};
		return LamdaExpression.doSomthing(cs, "Anaother", "Class");
	}

}
