/**
 * 
 */
package pagecode;

import java.io.IOException;
import java.util.ArrayList;

import EJBPackage.employeeRemote;

import com.ibm.faces.component.html.HtmlScriptCollector;

import javax.ejb.EJB;
import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlInputText;
import com.ibm.faces.component.html.HtmlCommandExButton;
import pack2.employeedetails;
import pack2.employeelist;

/**
 * @author admin
 *
 */
public class Employee2 extends PageCodeBase {

	@EJB(mappedName="emp")
	employeeRemote em;
	
	protected HtmlScriptCollector scriptCollector1;
	protected HtmlForm form1;
	protected HtmlInputText text1;
	protected HtmlInputText text2;
	protected HtmlInputText text3;
	protected HtmlCommandExButton button1;

	protected employeelist list;

	protected HtmlScriptCollector getScriptCollector1() {
		if (scriptCollector1 == null) {
			scriptCollector1 = (HtmlScriptCollector) findComponentInRoot("scriptCollector1");
		}
		return scriptCollector1;
	}

	protected HtmlForm getForm1() {
		if (form1 == null) {
			form1 = (HtmlForm) findComponentInRoot("form1");
		}
		return form1;
	}

	protected HtmlInputText getText1() {
		if (text1 == null) {
			text1 = (HtmlInputText) findComponentInRoot("text1");
		}
		return text1;
	}

	protected HtmlInputText getText2() {
		if (text2 == null) {
			text2 = (HtmlInputText) findComponentInRoot("text2");
		}
		return text2;
	}

	protected HtmlInputText getText3() {
		if (text3 == null) {
			text3 = (HtmlInputText) findComponentInRoot("text3");
		}
		return text3;
	}

	protected HtmlCommandExButton getButton1() {
		if (button1 == null) {
			button1 = (HtmlCommandExButton) findComponentInRoot("button1");
		}
		return button1;
	}

	public String doButton1Action() throws IOException {
		// Type Java code that runs when the component is clicked
	 String name= getText1().getValue().toString();
	 String desg= getText2().getValue().toString();
	 
	 float salary=  Integer.parseInt(getText3().getValue().toString());
	 employeedetails e1= new employeedetails(name,desg,salary);
	 ArrayList<employeedetails> E = new ArrayList<employeedetails>();
	 E.add(e1);
	 getList().setL1(E);
	 ArrayList<employeedetails> l1= new ArrayList<employeedetails>();
	 l1=em.calc(e1);
	 getList().setL1(l1);
     
     
	 getFacesContext().getExternalContext().redirect("employee1.faces");
		// TODO: Return outcome that corresponds to a navigation rule
		return "";
	}

	/** 
	 * @managed-bean true
	 */
	protected employeelist getList() {
		if (list == null) {
			list = (employeelist) getManagedBean("list");
		}
		return list;
	}

	/** 
	 * @managed-bean true
	 */
	protected void setList(employeelist list) {
		this.list = list;
	}

}