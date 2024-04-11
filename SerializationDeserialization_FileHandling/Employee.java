package SerializationDeserialization_FileHandling;
import java.io.Serializable;
import java.util.Scanner;

public record Employee(int id,String name,double salary) implements Serializable
{
	public static Employee getEmployeeObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id :");
		int id = sc.nextInt();
		System.out.print("Enter Employee Name :");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter Employee Salary :");
		double salary = sc.nextDouble();
		return new Employee(id, name, salary);
	}
	

}
