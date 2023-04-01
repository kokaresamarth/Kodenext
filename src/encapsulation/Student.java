package encapsulation;

 class Student {
	 private String name;
	 private int age;
	 private String gender;
	 public void setData(String a,int b,String c)
	 {
		 name=a;
		 age=b;
		 gender=c;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public int getAge()
	 {
		 return age;
	 }
	 public String getGender()
	 {
		 return gender;
	 }
}
