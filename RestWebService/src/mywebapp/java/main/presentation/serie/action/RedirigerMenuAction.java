/**
 * 
 */
package mywebapp.java.main.presentation.serie.action;

import com.opensymphony.xwork2.ActionContext;

/**
 * @author matthieu
 *
 */
public class RedirigerMenuAction {
	
	public String execute(){
		ActionContext.getContext().getSession().remove("numeroQuestion");
		return "SUCCESS";
	}

}
