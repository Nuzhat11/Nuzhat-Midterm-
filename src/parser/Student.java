package parser;

public class Student {

	/*
	 * Student class have 4 variables which will be constructed as Student Object into List<Student>.
	 */
	public String firstName = "Nuzhat";
	public String lastName = "Bhuiyan";
	public String score = "95";
	public String id = "NY1559";

	@Override
	public String toString(){
		return "Student" + "("+"id= "+id+")"+ firstName+" "+lastName+" "+" Grade = "+score;
	}

}
