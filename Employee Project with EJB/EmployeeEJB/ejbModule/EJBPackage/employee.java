package EJBPackage;

import java.util.ArrayList;

import javax.ejb.Stateless;

import pack2.employeedetails;
import pack2.employeelist;

/**
 * Session Bean implementation class employee
 */
@Stateless(mappedName = "emp")
public class employee implements employeeRemote, employeeLocal {

    /**
     * Default constructor. 
     */
	public ArrayList<employeedetails> calc(employeedetails e)
	{
		String name = e.getName();
		String desg= e.getDesg();
		float salary= e.getSalary();
		float nsalary;
		employeedetails e1 = new employeedetails(name,desg,salary);
		if(desg=="manager")
			nsalary = (float) (salary *2.5);
		else
		if(desg=="associate")
			nsalary = (float) (salary * 1.5);
		else
		if(desg=="engineer")
			nsalary = (float) (salary * 2.0);
		else
			nsalary = (float ) (salary * 1.1);
		e1.setNewsalary(nsalary);
		ArrayList<employeedetails> l1= new ArrayList<employeedetails>();
		l1.add(e1);
		employeelist l = new employeelist();
		l.setL1(l1);
		return l1;		
	}
    public employee() {
        // TODO Auto-generated constructor stub
    }

}
