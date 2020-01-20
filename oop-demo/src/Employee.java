/**
 * 
 */

/**
 * @author novak
 *
 */
public class Employee extends Person {

	private String company;
	/**
	 * @param name
	 * @param lastName
	 */
	public Employee(String name, String lastName, String company) {
		super(name, lastName);
		this.company=company;
		// TODO Auto-generated constructor stub
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public void Show() {
		super.Show();
		System.out.printf("\nCompany: %s", company);
		
	} 

}
