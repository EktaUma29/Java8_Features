package com.yash.spring.bean.autowiring.byname;

public class Student {
		
		private Integer studentId;
		
		private String studentName;
		
		public Student(){}

		public void setStudentId(Integer studentId) {
			this.studentId = studentId;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
		}

		
	
}
