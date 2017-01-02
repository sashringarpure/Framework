package com.cbsp.seed;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	private WebDriverWait explicitWait;
	
	public ExplicitWait(ChromeDriver driver, int timeOut) {
		this.explicitWait = new WebDriverWait(driver, timeOut);
	}
	
	public ExplicitWait(FirefoxDriver driver, int timeOut) {
		this.explicitWait = new WebDriverWait(driver, timeOut);
	}
	
	public ExplicitWait(SafariDriver driver, int timeOut) {
		this.explicitWait = new WebDriverWait(driver, timeOut);
	}
	
	public ExplicitWait(InternetExplorerDriver driver, int timeOut) {
		this.explicitWait = new WebDriverWait(driver, timeOut);
	}
	
	public WebDriverWait getExplicitWait() {
		return this.explicitWait;
	}
	
	public Alert alertIsPresent() {
		return this.explicitWait.until(ExpectedConditions.alertIsPresent());
	}
	
	public boolean ElementSelectionStateByXpath(String xpathExpression,boolean selected) {
		return this.explicitWait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath(xpathExpression), selected));
	}
	
	public boolean ElementSelectionStateByTagName(String name,boolean selected) {
		return this.explicitWait.until(ExpectedConditions.elementSelectionStateToBe(By.tagName(name), selected));
	}
	
	public boolean ElementSelectionStateByPartialLinkText(String linkText,boolean selected) {
		return this.explicitWait.until(ExpectedConditions.elementSelectionStateToBe(By.partialLinkText(linkText), selected));
	}
	
	public boolean ElementSelectionStateByName(String name,boolean selected) {
		return this.explicitWait.until(ExpectedConditions.elementSelectionStateToBe(By.name(name), selected));
	}
	
	public boolean ElementSelectionStateByLinkText(String linkText,boolean selected) {
		return this.explicitWait.until(ExpectedConditions.elementSelectionStateToBe(By.linkText(linkText), selected));
	}
	
	public boolean ElementSelectionStateById(String id,boolean selected) {
		return this.explicitWait.until(ExpectedConditions.elementSelectionStateToBe(By.id(id), selected));
	}
	
	public boolean ElementSelectionStateByCssSelector(String selector,boolean selected) {
		return this.explicitWait.until(ExpectedConditions.elementSelectionStateToBe(By.cssSelector(selector), selected));
	}
	
	public boolean ElementSelectionStateByClassName(String className,boolean selected) {
		return this.explicitWait.until(ExpectedConditions.elementSelectionStateToBe(By.className(className), selected));
	}
	
	public boolean ElementSelectionStateByWebElement(WebElement element,boolean selected) {
		return this.explicitWait.until(ExpectedConditions.elementSelectionStateToBe(element, selected));
	}
	
	public WebElement ElementToBeClickableByXpath( String xpathExpression ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));
	}
	
	public WebElement ElementToBeClickableByTagName( String name ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeClickable(By.tagName(name)));
	}
	
	public WebElement ElementToBeClickableByPartialLinkText( String linkText ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(linkText)));
	}
	
	public WebElement ElementToBeClickableByName( String name ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeClickable(By.name(name)));
	}
	
	public WebElement ElementToBeClickableByLinkText( String linkText ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeClickable(By.linkText(linkText)));
	}
	
	public WebElement ElementToBeClickableById( String id ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	}
	
	public WebElement ElementToBeClickableByCssSelector( String selector ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selector)));
	}
	
	public WebElement ElementToBeClickableByClassName( String clasName ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeClickable(By.className(clasName)));
	}
	
	public WebElement ElementToBeClickableByWebElement( WebElement element ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public boolean ElementToBeSelectedByXpath( String xpathExpression ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeSelected(By.xpath(xpathExpression)));
	}
	
	public boolean ElementToBeSelectedByTagName( String name ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeSelected(By.tagName(name)));
	}
	
	public boolean ElementToBeSelectedByPartialLinkText( String linkText ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeSelected(By.partialLinkText(linkText)));
	}
	
	public boolean ElementToBeSelectedByName( String name ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeSelected(By.name(name)));
	}
	
	public boolean ElementToBeSelectedByLinkText( String linkText ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeSelected(By.linkText(linkText)));
	}
	
	public boolean ElementToBeSelectedById( String id ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeSelected(By.id(id)));
	}
	
	public boolean ElementToBeSelectedByCssSelector( String selector ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeSelected(By.cssSelector(selector)));
	}
	
	public boolean ElementToBeSelectedByClassName( String clasName ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeSelected(By.className(clasName)));
	}
	
	public boolean ElementToBeSelectedByWebElement( WebElement element ) {
		return this.explicitWait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public FirefoxDriver FrameAvailabilityAndSwitchByXpathForFirefoxDriver( String xpathExpression ) {
		return (FirefoxDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(xpathExpression)));
	}
	
	public ChromeDriver FrameAvailabilityAndSwitchByXpathForChromeDriver( String xpathExpression ) {
		return (ChromeDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(xpathExpression)));
	}
	
	public SafariDriver FrameAvailabilityAndSwitchByXpathForSafariDriver( String xpathExpression ) {
		return (SafariDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(xpathExpression)));
	}
	
	public InternetExplorerDriver FrameAvailabilityAndSwitchByXpathForInternetExplorerDriver( String xpathExpression ) {
		return (InternetExplorerDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(xpathExpression)));
	}
	
	public org.openqa.selenium.WebDriver FrameAvailabilityAndSwitchByXpathForWebDriver( String xpathExpression ) {
		return this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(xpathExpression)));
	}
	
	public FirefoxDriver FrameAvailabilityAndSwitchByTagNameForFirefoxDriver( String name ) {
		return (FirefoxDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName(name)));
	}
	
	public ChromeDriver FrameAvailabilityAndSwitchByTagNameForChromeDriver( String name ) {
		return (ChromeDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName(name)));
	}
	
	public SafariDriver FrameAvailabilityAndSwitchByTagNameForSafariDriver( String name ) {
		return (SafariDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName(name)));
	}
	
	public InternetExplorerDriver FrameAvailabilityAndSwitchByTagNameForInternetExplorerDriver( String name ) {
		return (InternetExplorerDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName(name)));
	}
	
	public org.openqa.selenium.WebDriver FrameAvailabilityAndSwitchByTagNameForWebDriver( String name ) {
		return this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName(name)));
	}
	
	public FirefoxDriver FrameAvailabilityAndSwitchByPartialLinkTextForFirefoxDriver( String linkText ) {
		return (FirefoxDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.partialLinkText(linkText)));
	}
	
	public ChromeDriver FrameAvailabilityAndSwitchByPartialLinkTextForChromeDriver( String linkText ) {
		return (ChromeDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.partialLinkText(linkText)));
	}
	
	public SafariDriver FrameAvailabilityAndSwitchByPartialLinkTextForSafariDriver( String linkText ) {
		return (SafariDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.partialLinkText(linkText)));
	}
	
	public InternetExplorerDriver FrameAvailabilityAndSwitchByPartialLinkTextForInternetExplorerDriver( String linkText ) {
		return (InternetExplorerDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.partialLinkText(linkText)));
	}
	
	public org.openqa.selenium.WebDriver FrameAvailabilityAndSwitchByPartialLinkTextForWebDriver( String linkText ) {
		return this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.partialLinkText(linkText)));
	}
	
	public FirefoxDriver FrameAvailabilityAndSwitchByNameForFirefoxDriver( String name ) {
		return (FirefoxDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name(name)));
	}
	
	public ChromeDriver FrameAvailabilityAndSwitchByNameForChromeDriver( String name ) {
		return (ChromeDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name(name)));
	}
	
	public SafariDriver FrameAvailabilityAndSwitchByNameForSafariDriver( String name ) {
		return (SafariDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name(name)));
	}
	
	public InternetExplorerDriver FrameAvailabilityAndSwitchByNameForInternetExplorerDriver( String name ) {
		return (InternetExplorerDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name(name)));
	}
	
	public org.openqa.selenium.WebDriver FrameAvailabilityAndSwitchByNameForWebDriver( String name ) {
		return this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name(name)));
	}
	
	public FirefoxDriver FrameAvailabilityAndSwitchByLinkTextForFirefoxDriver( String linkText ) {
		return (FirefoxDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.linkText(linkText)));
	}
	
	public ChromeDriver FrameAvailabilityAndSwitchByLinkTextForChromeDriver( String linkText ) {
		return (ChromeDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.linkText(linkText)));
	}
	
	public SafariDriver FrameAvailabilityAndSwitchByLinkTextForSafariDriver( String linkText ) {
		return (SafariDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.linkText(linkText)));
	}
	
	public InternetExplorerDriver FrameAvailabilityAndSwitchByLinkTextForInternetExplorerDriver( String linkText ) {
		return (InternetExplorerDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.linkText(linkText)));
	}
	
	public org.openqa.selenium.WebDriver FrameAvailabilityAndSwitchByLinkTextForWebDriver( String linkText ) {
		return this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.linkText(linkText)));
	}
	
	public FirefoxDriver FrameAvailabilityAndSwitchByIdForFirefoxDriver( String id ) {
		return (FirefoxDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(id)));
	}
	
	public ChromeDriver FrameAvailabilityAndSwitchByIdForChromeDriver( String id ) {
		return (ChromeDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(id)));
	}
	
	public SafariDriver FrameAvailabilityAndSwitchByIdForSafariDriver( String id ) {
		return (SafariDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(id)));
	}
	
	public InternetExplorerDriver FrameAvailabilityAndSwitchByIdForInternetExplorerDriver( String id ) {
		return (InternetExplorerDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(id)));
	}
	
	public org.openqa.selenium.WebDriver FrameAvailabilityAndSwitchByIdForWebDriver( String id ) {
		return this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(id)));
	}
	
	public FirefoxDriver FrameAvailabilityAndSwitchByCssSelectorForFirefoxDriver( String selector ) {
		return (FirefoxDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(selector)));
	}
	
	public ChromeDriver FrameAvailabilityAndSwitchByCssSelectorForChromeDriver( String selector ) {
		return (ChromeDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(selector)));
	}
	
	public SafariDriver FrameAvailabilityAndSwitchByCssSelectorForSafariDriver( String selector ) {
		return (SafariDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(selector)));
	}
	
	public InternetExplorerDriver FrameAvailabilityAndSwitchByCssSelectorForInternetExplorerDriver( String selector ) {
		return (InternetExplorerDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(selector)));
	}
	
	public org.openqa.selenium.WebDriver FrameAvailabilityAndSwitchByCssSelectorForWebDriver( String selector ) {
		return this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(selector)));
	}
	
	public FirefoxDriver FrameAvailabilityAndSwitchByClassNameForFirefoxDriver( String className ) {
		return (FirefoxDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(className)));
	}
	
	public ChromeDriver FrameAvailabilityAndSwitchByclassNameForChromeDriver( String className ) {
		return (ChromeDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(className)));
	}
	
	public SafariDriver FrameAvailabilityAndSwitchByclassNameForSafariDriver( String className ) {
		return (SafariDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(className)));
	}
	
	public InternetExplorerDriver FrameAvailabilityAndSwitchByclassNameForInternetExplorerDriver( String className ) {
		return (InternetExplorerDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(className)));
	}
	
	public org.openqa.selenium.WebDriver FrameAvailabilityAndSwitchByclassNameForWebDriver( String className ) {
		return this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(className)));
	}
	
	public FirefoxDriver FrameAvailabilityAndSwitchByFrameLocatorForFirefoxDriver( String frameLocator ) {
		return (FirefoxDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	public ChromeDriver FrameAvailabilityAndSwitchByFrameLocatorForChromeDriver( String frameLocator ) {
		return (ChromeDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	public SafariDriver FrameAvailabilityAndSwitchByFrameLocatorForSafariDriver( String frameLocator ) {
		return (SafariDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	public InternetExplorerDriver FrameAvailabilityAndSwitchByFrameLocatorForInternetExplorerDriver( String frameLocator ) {
		return (InternetExplorerDriver) this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	public org.openqa.selenium.WebDriver FrameAvailabilityAndSwitchByFrameLocatorForWebDriver( String frameLocator ) {
		return this.explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(frameLocator)));
	}
	
	public boolean InvisibilityOfElementByXpath( String xpathExpression ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathExpression)));
	}
	
	public boolean InvisibilityOfElementByTagName( String name ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName(name)));
	}
	
	public boolean InvisibilityOfElementByPartialLinkText( String linkText ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.partialLinkText(linkText)));
	}
	
	public boolean InvisibilityOfElementByName( String name ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(name)));
	}
	
	public boolean InvisibilityOfElementByLinkText( String linkText ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText(linkText)));
	}
	
	public boolean InvisibilityOfElementById( String id ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
	}
	
	public boolean InvisibilityOfElementByCssSelector( String selector ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(selector)));
	}
	
	public boolean InvisibilityOfElementByClassName( String className ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(className)));
	}
	
	public boolean InvisibilityOfElementByXpathAndText( String xpathExpression, String text ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(xpathExpression), text));
	}
	
	public boolean InvisibilityOfElementByTagNameAndText( String name, String text ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementWithText(By.tagName(name), text));
	}
	
	public boolean InvisibilityOfElementByPartialLinkTextAndText( String linkText, String text ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementWithText(By.partialLinkText(linkText), text));
	}
	
	public boolean InvisibilityOfElementByNameAndText( String name, String text ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementWithText(By.name(name), text));
	}
	
	public boolean InvisibilityOfElementByLinkTextAndText( String linkText, String text ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementWithText(By.linkText(linkText), text));
	}
	
	public boolean InvisibilityOfElementByIdAndText( String id, String text ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementWithText(By.id(id),text));
	}
	
	public boolean InvisibilityOfElementByCssSelectorAndText( String selector, String text ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementWithText(By.cssSelector(selector),text));
	}
	
	public boolean InvisibilityOfElementByClassNameAndText( String className, String text ) {
		return this.explicitWait.until(ExpectedConditions.invisibilityOfElementWithText(By.className(className), text));
	}
	
	public List<WebElement> PresenceOfAllElementsByXpath( String xpathExpression) {
		return this.explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpathExpression)));
	}
	
	public List<WebElement> PresenceOfAllElementsByTagName( String name) {
		return this.explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName(name)));
	}
	
	public List<WebElement> PresenceOfAllElementsByPartialLinkText( String linkText) {
		return this.explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.partialLinkText(linkText)));
	}
	
	public List<WebElement> PresenceOfAllElementsByName( String name) {
		return this.explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name(name)));
	}
	
	public List<WebElement> PresenceOfAllElementsByLinkText( String linkText) {
		return this.explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText(linkText)));
	}
	
	public List<WebElement> PresenceOfAllElementsById( String id) {
		return this.explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(id)));
	}
	
	public List<WebElement> PresenceOfAllElementsByCssSelector( String selector) {
		return this.explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(selector)));
	}
	
	public List<WebElement> PresenceOfAllElementsByClassName( String className) {
		return this.explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(className)));
	}
	
	public WebElement PresenceOfElementByXpath( String xpathExpression) {
		return this.explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathExpression)));
	}
	
	public WebElement PresenceOfElementByTagName( String name) {
		return this.explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(name)));
	}
	
	public WebElement PresenceOfElementByPartialLinkText( String linkText) {
		return this.explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(linkText)));
	}
	
	public WebElement PresenceOfElementByName( String name) {
		return this.explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.name(name)));
	}
	
	public WebElement PresenceOfElementByLinkText( String linkText) {
		return this.explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText)));
	}
	
	public WebElement PresenceOfElementById( String id) {
		return this.explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
	}
	
	public WebElement PresenceOfElementByCssSelector( String selector) {
		return this.explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(selector)));
	}
	
	public WebElement PresenceOfElementByClassName( String className) {
		return this.explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.className(className)));
	}
	
	public boolean TextToBePresentInElementByXpathAndText( String xpathExpression, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpathExpression), text));
	}
	
	public boolean TextToBePresentInElementByTagNameAndText( String name, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName(name), text));
	}
	
	public boolean TextToBePresentInElementByPartialLinkTextAndText( String linkText, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementLocated(By.partialLinkText(linkText), text));
	}
	
	public boolean TextToBePresentInElementByNameAndText( String name, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementLocated(By.name(name), text));
	}
	
	public boolean TextToBePresentInElementByLinkTextAndText( String linkText, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementLocated(By.linkText(linkText), text));
	}
	
	public boolean TextToBePresentInElementByIdAndText( String id, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementLocated(By.id(id),text));
	}
	
	public boolean TextToBePresentInElementByCssSelectorAndText( String selector, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(selector),text));
	}
	
	public boolean TextToBePresentInElementByClassNameAndText( String className, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementLocated(By.className(className), text));
	}
	
	public boolean TextToBePresentInElementValueByXpath( String xpathExpression, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(xpathExpression), text));
	}
	
	public boolean TextToBePresentInElementValueByTagName( String name, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementValue(By.tagName(name), text));
	}
	
	public boolean TextToBePresentInElementValueByPartialLinkText( String linkText, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementValue(By.partialLinkText(linkText), text));
	}
	
	public boolean TextToBePresentInElementValueByName( String name, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementValue(By.name(name), text));
	}
	
	public boolean TextToBePresentInElementValueByLinkText( String linkText, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementValue(By.linkText(linkText), text));
	}
	
	public boolean TextToBePresentInElementValueById( String id, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementValue(By.id(id),text));
	}
	
	public boolean TextToBePresentInElementValueByCssSelector( String selector, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementValue(By.cssSelector(selector),text));
	}
	
	public boolean TextToBePresentInElementValueByClassName( String className, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementValue(By.className(className), text));
	}
	
	public boolean TextToBePresentInElementValueByWebElement( WebElement element, String text ) {
		return this.explicitWait.until(ExpectedConditions.textToBePresentInElementValue(element, text));
	}
	
	public boolean TitleContains( String title ) {
		return this.explicitWait.until(ExpectedConditions.titleContains(title));
	}
	
	public boolean TitleIs( String title ) {
		return this.explicitWait.until(ExpectedConditions.titleIs(title));
	}
	
	public boolean UrlContains( String fraction ) {
		return this.explicitWait.until(ExpectedConditions.urlContains(fraction));
	}
	
	public boolean UrlMatches( String regex ) {
		return this.explicitWait.until(ExpectedConditions.urlMatches(regex));
	}
	
	public boolean UrlToBe( String url ) {
		return this.explicitWait.until(ExpectedConditions.urlToBe(url));
	}
	
	public WebElement VisibilityOfElementByXpath( String xpathExpression) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));
	}
	
	public WebElement VisibilityOfElementByTagName( String name) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(name)));
	}
	
	public WebElement VisibilityOfElementByPartialLinkText( String linkText) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(linkText)));
	}
	
	public WebElement VisibilityOfElementByName( String name) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
	}
	
	public WebElement VisibilityOfElementByLinkText( String linkText) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText)));
	}
	
	public WebElement VisibilityOfElementById( String id) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	}
	
	public WebElement VisibilityOfElementByCssSelector( String selector) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));
	}
	
	public WebElement VisibilityOfElementByClassName( String className) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
	}
	
	public List<WebElement> VisibilityOfAllElementsByXpath( String xpathExpression) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathExpression)));
	}
	
	public List<WebElement> VisibilityOfAllElementsByTagName( String name) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName(name)));
	}
	
	public List<WebElement> VisibilityOfAllElementsByPartialLinkText( String linkText) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText(linkText)));
	}
	
	public List<WebElement> VisibilityOfAllElementsByName( String name) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(name)));
	}
	
	public List<WebElement> VisibilityOfAllElementsByLinkText( String linkText) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText(linkText)));
	}
	
	public List<WebElement> VisibilityOfAllElementsById( String id) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(id)));
	}
	
	public List<WebElement> VisibilityOfAllElementsByCssSelector( String selector) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(selector)));
	}
	
	public List<WebElement> VisibilityOfAllElementsByClassName( String className) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className(className)));
	}
	
	public WebElement VisibilityOfElement( WebElement element) {
		return this.explicitWait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public List<WebElement> VisibilityOfAllElements( List<WebElement> element) {
		return this.explicitWait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	

}
