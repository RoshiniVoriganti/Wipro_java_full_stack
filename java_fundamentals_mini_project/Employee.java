package MiniProject;
public class Employee {
	private int[] emp_id = {1001, 1002, 1003, 1004, 1005, 1006, 1007}; 
	private String[] emp_name = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Thanmay"}; 
	private String[] joining_date = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000", "12/06/2006"}; 
	private char[] desig_code = {'e', 'c', 'k', 'r', 'm', 'e', 'c'}; 
	private String[] dept = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"}; 
	private int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000}; 
	private int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000}; 
	private int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000}; 

	public int getIndex(int id) {
		for (int i = 0; i < emp_id.length; i++) {
			if (id == emp_id[i]) {
				return i;
			}
		}
		return -1; 
	}
	public int getSalary(int id) {
		int index = getIndex(id);
		if (index == -1) return 0;

		char code = desig_code[index];
		int da = 0;
		switch (code) {
			case 'e':
				da = 20000;
				break;
			case 'c':
				da = 32000;
				break;
			case 'k':
				da = 12000;
				break;
			case 'r':
				da = 15000;
				break;
			case 'm':
				da = 40000;
				break;
			default:
				da = 0;
		}
		return basic[index] + hra[index] + da - it[index];
	}
	public char getDesigCode(int id) {
		int index = getIndex(id);
		if (index == -1) return ' ';
		return desig_code[index];
	}
	public String getName(int id) {
		int index = getIndex(id);
		if (index == -1) return "Unknown";
		return emp_name[index];
	}
	public String getDept(int id) {
		int index = getIndex(id);
		if (index == -1) return "Unknown";
		return dept[index];
	}
	public String getDesignation(int id) {
		char code = getDesigCode(id);
		String title;
		switch (code) {
			case 'e':
				title = "Engineer";
				break;
			case 'c':
				title = "Consultant";
				break;
			case 'k':
				title = "Clerk";
				break;
			case 'r':
				title = "Receptionist";
				break;
			case 'm':
				title = "Manager";
				break;
			default:
				title = "Unknown";
		}

		return title;
	}
}
