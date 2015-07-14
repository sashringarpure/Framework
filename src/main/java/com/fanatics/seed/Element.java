package com.fanatics.seed;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Element {

	private WebElement p, c;
	
	public Element() {
		p = null;
		c = null;
	}
	
	public void setParentElement(WebElement ele) {
		this.p = ele;
	}
	
	public void setChildElementByClassName(String className) {
		 this.c = this.p.findElement(By.className(className));
	}
	
	public void setChildElementById(String id) {
		 this.c = this.p.findElement(By.id(id));
	}
	
	public void setChildElementByLinkText(String linkText) {
		 this.c = this.p.findElement(By.linkText(linkText));
	}
	
	public void setChildElementByPartialLinkText(String linkText) {
		 this.c = this.p.findElement(By.partialLinkText(linkText));
	}
	
	public void setChildElementByName(String name) {
		 this.c = this.p.findElement(By.name(name));
	}
	
	public void setChildElementByTagName(String name) {
		 this.c = this.p.findElement(By.tagName(name));
	}
	
	public void setChildElementByXpath(String xpath) {
		 this.c = this.p.findElement(By.xpath(xpath));
	}
	
	public WebElement getParentElement() {
		return this.p;
	}
	
	public WebElement getChildElement() {
		return this.c;
	}
	
	public void submitParentElement() {
		this.p.submit();
	}
	
	public void submitChildElement() {
		this.c.submit();
	}
	
	public String toStringParent() {
		return this.p.toString();
	}
	
	public String toStringChild() {
		return this.c.toString();
	}
	
	public void sendKeysParent(String value) {
		this.p.sendKeys(value);
	}
	
	public void sendKeysChild(String value) {
		this.c.sendKeys(value);
	}
	
	public boolean isSelectedParent() {
		return this.p.isSelected();
	}
	
	public boolean isSelectedChild() {
		return this.c.isSelected();
	}
	
	public boolean isDisplayedParent() {
		return this.p.isDisplayed();
	}
	
	public boolean isDisplayedChild() {
		return this.c.isDisplayed();
	}
	
	public boolean isEnabledParent() {
		return this.p.isEnabled();
	}
	
	public boolean isEnabledChild() {
		return this.c.isEnabled();
	}
	
	public String getTextParent() {
		return this.p.getText();
	}
	
	public String getTextChild() {
		return this.c.getText();
	}
	
	public String getTagNameParent() {
		 return this.p.getTagName();
	}
	
	public String getTagNameChild() {
		 return this.c.getTagName();
	}
	
	public Dimension getDimensionParent() {
		 return this.p.getSize();
	}
	
	public Dimension getDimensionChild() {
		 return this.c.getSize();
	}
	
	public Point getLocationParent() {
		 return this.p.getLocation();
	}
	
	public Point getLocationChild() {
		 return this.c.getLocation();
	}
	
	public Class<?> getclassParent() {
		 return this.p.getClass();
	}
	
	public Class<?> getclassChild() {
		 return this.c.getClass();
	}
	
	public String getAttributeParent(String attrName) {
		 return this.p.getAttribute(attrName);
	}
	
	public String getAttributeChild(String attrName) {
		 return this.c.getAttribute(attrName);
	}
	
	public void clickParentElement() {
		 this.p.click();
	}
	
	public void clearParentElement() {
		 this.p.clear();
	}
	
	public void clickChildElement() {
		 this.c.click();
	}
	
	public void clearChildElement() {
		 this.c.clear();
	}

}
