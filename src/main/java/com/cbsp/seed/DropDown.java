package com.cbsp.seed;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author sshringarpure
 *
 */
public class DropDown {

	private Select sel;
	
	public DropDown() {
		this.sel = null;
	}

	public Select getSelect() {
		return this.sel;
	}
	
	/**
	 * 
	 * @param select object
	 */
	public void setSelect(Select s) {
		this.sel = s;
	}
	
	/**
	 * 
	 * @param select object.
	 * @return string representation of select object.
	 */
	public String toString(Select s) {
		return this.sel.toString();
	}
	
	/**
	 * 
	 * @param text
	 */
	public void selectByVisibleText(String text) {
		this.sel.selectByVisibleText(text);
	}
	
	/**
	 * 
	 * @param text
	 */
	public void selectByValue(String text) {
		this.sel.selectByValue(text);
	}
	
	/**
	 * 
	 * @param index
	 */
	public void selectByIndex(int index) {
		this.sel.selectByIndex(index);
	}
	
	/**
	 * 
	 * @param text
	 * @return
	 */
	public boolean isMultiple(String text) {
		return this.sel.isMultiple();
	}
	
	/**
	 * 
	 * @return a list of web wlements.
	 */
	public List<WebElement> getOptions() {
		return this.sel.getOptions();
	}
	
	/**
	 * 
	 * @return a web element object
	 */
	public WebElement getFirstSelectedOption() {
		return this.sel.getFirstSelectedOption();
	}
	
	/**
	 * 
	 * @return a list of web elements.
	 */
	public List<WebElement> getAllSelectedOption() {
		return this.sel.getAllSelectedOptions();
	}
	
	/**
	 * 
	 * @param text
	 */
	public void deselectByVisibleText(String text) {
		this.sel.deselectByVisibleText(text);
	}
	
	/**
	 * 
	 * @param text
	 */
	public void deselectByValue(String text) {
		this.sel.deselectByValue(text);
	}
	
	/**
	 * 
	 * @param index
	 */
	public void deselectByIndex(int index) {
		this.sel.deselectByIndex(index);
	}
	
	public void deselectByAll() {
		this.sel.deselectAll();
	}

}
