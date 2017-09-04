package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * <p>
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 **/
	public static void main(String[] args) {

		EmployeeInfo employee1 = new EmployeeInfo(01);
		EmployeeInfo employee2 = new EmployeeInfo(02, "Zeel");
		EmployeeInfo employee3 = new EmployeeInfo(03, "Sourov", 26, "Cyber Security", 85300, 2);

		employee1.setEmployeeName("Kiren");
		employee1.setEmployeeAge(24);
		employee1.setDepartment("Developer");
		employee1.setSalary(95400);
		employee1.setPerformance(03);

		employee2.setEmployeeAge(24);
		employee2.setDepartment("Selenium Manual");
		employee2.setSalary(90985);
		employee2.setPerformance(04);

		employee1.benefitLayout();

		EmployeeInfo.calculateEmployeeBonus(employee2.getSalary(), employee2.getPerformance());

		EmployeeInfo.calculateEmployeePension(employee3.getSalary());
	}
}