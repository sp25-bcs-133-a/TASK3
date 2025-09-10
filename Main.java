public class Main{
	public static void main(String[] args){
		Employee e1 = new Employee("Tayyaba", 102789, 20000, "COMSATS University Islamabad");

		e1.display();
		System.out.println("Updating Name...");
		e1.setName("Tayyaba Riaz");
		System.out.println(e1.getName());
	}
}