package EJBPackage;
import java.util.ArrayList;

import javax.ejb.Remote;

import pack2.employeedetails;
import pack2.employeelist;
@Remote
public interface employeeRemote {

	public ArrayList<employeedetails> calc (employeedetails l);
}
