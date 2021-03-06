/**
 * @author sshringarpure
 * 
 */
package com.cbsp.seed;

import java.net.URL;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
public class CDriver {

	private ChromeDriver cDriver;
	private Wait<ChromeDriver> wait;
	
	public CDriver() {
		this.cDriver = null;
		this.wait = null;
	}
	
	public void setChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		this.cDriver = new ChromeDriver();
	}
	
	/**
	 * 
	 * @param driver
	 * @param timeOut
	 * @param pollInterval
	 * @param timeUnit
	 */
	public void setWait(ChromeDriver driver, int timeOut, int pollInterval, TimeUnit timeUnit) {
		this.wait = new FluentWait<ChromeDriver>(driver).withTimeout(timeOut, timeUnit).pollingEvery(pollInterval, timeUnit).ignoring(NoSuchElementException.class);
	}
	
	public Wait<ChromeDriver> getWait() {
		return this.wait;
	}
	
	public ChromeDriver getChromeDriver() {
		return this.cDriver;
	}

	/**
	 * @throws InterruptedException
	 */	
	public void driverWait() throws InterruptedException {
		this.cDriver.wait();
	}
	
	/**
	 * @param timeout
	 * @throws InterruptedException
	 */
	public void driverWait(int timeout) throws InterruptedException {
		this.cDriver.wait(timeout);
	}
	
	/**
	 * 
	 * @return returns a driver in string format.
	 */
	public String driverToString() {
		return this.cDriver.toString();
	}
	
	/**
	 * @param windowName
	 */
	public void switchToWindow(String windowName) {
		this.cDriver.switchTo().window(windowName);
	}
	
	public void switchToParentFrame() {
		this.cDriver.switchTo().parentFrame();
	}
	
	/**
	 * 
	 * @param frameName
	 */
	public void switchToFrame(String frameName) {
		this.cDriver.switchTo().frame(frameName);
	}
	
	/**
	 * 
	 * @param frameId
	 */
	public void switchToFrame(int frameId) {
		this.cDriver.switchTo().frame(frameId);
	}
	
	public void switchToDefaultContent() {
		this.cDriver.switchTo().defaultContent();
	}
	
	public void switchToActiveElement() {
		this.cDriver.switchTo().activeElement();
	}
	
	public void quit() {
		this.cDriver.quit();
	}
	
	public void close() {
		this.cDriver.close();
	}
	
	/**
	 * 
	 * @param url
	 */
	public void navigateTo(URL url) {
		this.cDriver.navigate().to(url);
	}
	
	/**
	 * 
	 * @param url
	 */
	public void navigateTo(String url) {
		this.cDriver.navigate().to(url);
	}
	
	public void refresh() {
		this.cDriver.navigate().refresh();
	}
	
	public void navigateForward() {
		this.cDriver.navigate().forward();
	}
	
	public void navigateBack() {
		this.cDriver.navigate().back();
	}
	
	public void setWindowPosition() {
		this.cDriver.manage().window().setPosition(new Point(0,0));
	}
	
	/**
	 * 
	 * @param d
	 */
	public void setWindowSize(Dimension d) {
		this.cDriver.manage().window().setSize(d);
	}
	
	public void maximizeBrowser() {
		this.cDriver.manage().window().setPosition(new Point(0,0));
		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		Dimension d = new Dimension((int) screenSize.getWidth(),(int) screenSize.getHeight());
		this.cDriver.manage().window().setSize(d);
	}
	
	public void maximizeWindow() {
		this.cDriver.manage().window().maximize();
	}
	
	/**
	 * 
	 * @return returns the size of the window.
	 */
	public Dimension getWindowSize() {
		return this.cDriver.manage().window().getSize();
	}
	
	/**
	 * 
	 * @return returns the position of the window.
	 */
	public Point getWindowPosition() {
		return this.cDriver.manage().window().getPosition();
	}
	
	/**
	 * 
	 * @param seconds : time to wait in.
	 * @param secs : TimeUnit.
	 */
	public void setImplicitWait(int seconds, TimeUnit secs) {
		this.cDriver.manage().timeouts().implicitlyWait(seconds, secs);
	}
	
	/**
	 * 
	 * @param seconds : time to wait in.
	 * @param secs : TimeUnit.
	 */
	public void setPageLoadTimeout(int seconds, TimeUnit secs) {
		this.cDriver.manage().timeouts().pageLoadTimeout(seconds, secs);
	}
	
	/**
	 * 
	 * @param seconds : time to wait in.
	 * @param secs : TimeUnit.
	 */
	public void setScriptTimeout(int seconds, TimeUnit secs) {
		this.cDriver.manage().timeouts().setScriptTimeout(seconds, secs);
	}
	
	/**
	 * 
	 * @return A set consisting of cookies.
	 */
	public Set<Cookie> getCookies() {
		return this.cDriver.manage().getCookies();
	}
	
	/**
	 * 
	 * @param cookieName
	 * @return a cookie object.
	 */
	public Cookie getCookieNamed(String cookieName) {
		return this.cDriver.manage().getCookieNamed(cookieName);
	}
	
	/**
	 * 
	 * @param cookieName
	 */
	public void deleteCookieNamed(String cookieName) {
		this.cDriver.manage().deleteCookieNamed(cookieName);
	}
	
	/**
	 * 
	 * @param cookie
	 */
	public void deleteCookie(Cookie cookie) {
		this.cDriver.manage().deleteCookie(cookie);
	}
	
	public void deleteAllCookies() {
		this.cDriver.manage().deleteAllCookies();
	}
	
	/**
	 * 
	 * @param cookie
	 */
	public void AddCookies(Cookie cookie) {
		this.cDriver.manage().addCookie(cookie);
	}
	
	/**
	 * 
	 * @return all window handles.
	 */
	public Set<String> getAllWindowHandles() {
		return this.cDriver.getWindowHandles();
	}
	
	
	public String getWindowHandle() {
		return this.cDriver.getWindowHandle();
	}
	
	/**
	 * 
	 * @return page title
	 */
	public String getTitle() {
		return this.cDriver.getTitle();
	}
	
	/**
	 * 
	 * @return session Id
	 */
	public SessionId getSessionId() {
		return this.cDriver.getSessionId();
	}
	
	/**
	 * 
	 * @return page source
	 */
	public String getPageSource() {
		return this.cDriver.getPageSource();
	}
	
	/**
	 * 
	 * @return Mouse object.
	 */
	public Mouse getMouse() {
		return this.cDriver.getMouse();
	}
	
	/**
	 * 
	 * @return keyboard object
	 */
	public Keyboard getKeyboard() {
		return this.cDriver.getKeyboard();
	}
	
	/**
	 * 
	 * @return current URL
	 */
	public String getCurrentUrl() {
		return this.cDriver.getCurrentUrl();
	}
	
	/**
	 * 
	 * @return driver capabilities.
	 */
	public Capabilities getCapabilities() {
		return this.cDriver.getCapabilities();
	}
	
	/**
	 * 
	 * @param url
	 */
	public  void get(String url) {
		this.cDriver.get(url);
	}
	
	/**
	 * 
	 * @param xpath 
	 * @return a list of elements
	 */
	public List<WebElement> getElementsByXpath(String xpath) {
		return this.cDriver.findElementsByXPath(xpath);
	}
	
	/**
	 * 
	 * @param xpath
	 * @return a list of objects representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndXpath(final String xpath) {
		return this.wait.until(new Function<ChromeDriver, List<WebElement>>() {
			public List<WebElement> apply(ChromeDriver driver) {
				return driver.findElementsByXPath(xpath);
			}
		});
	}
	
	
	/**
	 * 
	 * @param tagName
	 * @return a list of elements
	 */
	public List<WebElement> getElementsByTagName(String tagName) {
		return this.cDriver.findElementsByTagName(tagName);
	}
	
	/**
	 * 
	 * @param tagName
	 * @return a list of objects representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndTagName(final String tagName) {
		return this.wait.until(new Function<ChromeDriver, List<WebElement>>() {
			public List<WebElement> apply(ChromeDriver driver) {
				return driver.findElementsByTagName(tagName);
			}
		});
	}
	
	/**
	 * 
	 * @param partialLinkText
	 * @return a list of elements
	 */
	public List<WebElement> getElementsByPartialLinkText(String partialLinkText) {
		return this.cDriver.findElementsByPartialLinkText(partialLinkText);
	}
	
	/**
	 * 
	 * @param partialLinkText
	 * @return a list of objects representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndPartialLinkText(final String partialLinkText) {
		return this.wait.until(new Function<ChromeDriver, List<WebElement>>() {
			public List<WebElement> apply(ChromeDriver driver) {
				return driver.findElementsByPartialLinkText(partialLinkText);
			}
		});
	}
	
	/**
	 * 
	 * @param name
	 * @return a list of elements
	 */
	public List<WebElement> getElementsByName(String name) {
		return this.cDriver.findElementsByName(name);
	}
	
	/**
	 * 
	 * @param name
	 * @return a list of objects representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndName(final String name) {
		return this.wait.until(new Function<ChromeDriver, List<WebElement>>() {
			public List<WebElement> apply(ChromeDriver driver) {
				return driver.findElementsByName(name);
			}
		});
	}
	
	/**
	 * 
	 * @param linkText
	 * @return a list of elements
	 */
	public List<WebElement> getElementsByLinkText(String linkText) {
		return this.cDriver.findElementsByName(linkText);
	}
	
	/**
	 * 
	 * @param linkText
	 * @return a list of objects representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndLinkText(final String linkText) {
		return this.wait.until(new Function<ChromeDriver, List<WebElement>>() {
			public List<WebElement> apply(ChromeDriver driver) {
				return driver.findElementsByLinkText(linkText);
			}
		});
	}
	
	/**
	 * 
	 * @param id
	 * @return a list of elements
	 */
	public List<WebElement> getElementsById(String id) {
		return this.cDriver.findElementsById(id);
	}
	
	/**
	 * 
	 * @param id
	 * @return a list of objects representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndId(final String id) {
		return this.wait.until(new Function<ChromeDriver, List<WebElement>>() {
			public List<WebElement> apply(ChromeDriver driver) {
				return driver.findElementsById(id);
			}
		});
	}
	
	/**
	 * 
	 * @param cssSelector
	 * @return a list of elements
	 */
	public List<WebElement> getElementsByCssSelector(String cssSelector) {
		return this.cDriver.findElementsByCssSelector(cssSelector);
	}
	
	/**
	 * 
	 * @param cssSelector
	 * @return a list representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndCssSelector(final String cssSelector) {
		return this.wait.until(new Function<ChromeDriver, List<WebElement>>() {
			public List<WebElement> apply(ChromeDriver driver) {
				return driver.findElementsByClassName(cssSelector);
			}
		});
	}
	
	/**
	 * 
	 * @param className
	 * @return a list of elements
	 */
	public List<WebElement> getElementsByClassName(String className) {
		return this.cDriver.findElementsByClassName(className);
	}
	
	/**
	 * 
	 * @param className
	 * @return a list representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndClassName(final String className) {
		return this.wait.until(new Function<ChromeDriver, List<WebElement>>() {
			public List<WebElement> apply(ChromeDriver driver) {
				return driver.findElementsByClassName(className);
			}
		});
	}
	
	/**
	 * 
	 * @param xpath
	 * @return a Web Element
	 */
	public WebElement getElementByXPath(String xpath) {
		return this.cDriver.findElementByXPath(xpath);
	}
	
	/**
	 * 
	 * @param xpath
	 * @return an object representing a web element.
	 */
	public WebElement findElementByFluentWaitAndXPath(final String xpath) {
		return this.wait.until(new Function<ChromeDriver, WebElement>() {
			public WebElement apply(ChromeDriver driver) {
				return driver.findElementByXPath(xpath);
			}
		});
	}
	
	/**
	 * 
	 * @param tagName
	 * @return a Web Element
	 */
	public WebElement getElementByTagName(String tagName) {
		return this.cDriver.findElementByTagName(tagName);
	}
	
	/**
	 * 
	 * @param tagName
	 * @return an object representing a web-element.
	 */
	public WebElement findElementByFluentWaitAndtagName(final String tagName) {
		return this.wait.until(new Function<ChromeDriver, WebElement>() {
			public WebElement apply(ChromeDriver driver) {
				return driver.findElementByTagName(tagName);
			}
		});
	}
	
	/**
	 * 
	 * @param partialLinkText
	 * @return a Web Element
	 */
	public WebElement getElementByPartialLinkText(String partialLinkText) {
		return this.cDriver.findElementByPartialLinkText(partialLinkText);
	}
	
	/**
	 * 
	 * @param partialLinkText
	 * @return an object representing a web element.
	 */
	public WebElement findElementByFluentWaitAndPartialLinkText(final String partialLinkText) {
		return this.wait.until(new Function<ChromeDriver, WebElement>() {
			public WebElement apply(ChromeDriver driver) {
				return driver.findElementByPartialLinkText(partialLinkText);
			}
		});
	}
	
	/**
	 * 
	 * @param name
	 * @return a Web Element
	 */
	public WebElement getElementByName(String name) {
		return this.cDriver.findElementByName(name);
	}
	
	/**
	 * 
	 * @param name
	 * @return an object representing a web element.
	 */
	public WebElement findElementByFluentWaitAndName(final String name) {
		return this.wait.until(new Function<ChromeDriver, WebElement>() {
			public WebElement apply(ChromeDriver driver) {
				return driver.findElementByName(name);
			}
		});
	}
	
	/**
	 * 
	 * @param linkText
	 * @return a Web Element
	 */
	public WebElement getElementByLinkText(String linkText) {
		return this.cDriver.findElementByLinkText(linkText);
	}
	
	/**
	 * 
	 * @param linkText
	 * @return an object representing an web element.
	 */
	public WebElement findElementByFluentWaitAndLinkText(final String linkText) {
		return this.wait.until(new Function<ChromeDriver, WebElement>() {
			public WebElement apply(ChromeDriver driver) {
				return driver.findElementByLinkText(linkText);
			}
		});
	}
	
	/**
	 * 
	 * @param id
	 * @return a Web Element
	 */
	public WebElement getElementById(String id) {
		return this.cDriver.findElementById(id);
	}
	
	/**
	 * 
	 * @param id
	 * @return an object representing an web element.
	 */
	public WebElement findElementByFluentWaitAndId(final String id) {
		return this.wait.until(new Function<ChromeDriver, WebElement>() {
			public WebElement apply(ChromeDriver driver) {
				return driver.findElementById(id);
			}
		});
	}
	
	/**
	 * 
	 * @param cssSelector
	 * @return a Web Element
	 */
	public WebElement getElementByCssSelector(String cssSelector) {
		return this.cDriver.findElementByCssSelector(cssSelector);
	}
	
	/**
	 * 
	 * @param cssSelector
	 * @return an object representing an web element.
	 */
	public WebElement findElementByFluentWaitAndCssSelector(final String cssSelector) {
		return this.wait.until(new Function<ChromeDriver, WebElement>() {
			public WebElement apply(ChromeDriver driver) {
				return driver.findElementByCssSelector(cssSelector);
			}
		});
	}
	
	/**
	 * 
	 * @param className
	 * @return a Web Element
	 */
	public WebElement getElementByClassName(String className) {
		return this.cDriver.findElementByClassName(className);
	}
	
	/**
	 * 
	 * @param className
	 * @return an object representing an web element.
	 */
	public WebElement findElementByFluentWaitAndClassName(final String className) {
		return this.wait.until(new Function<ChromeDriver, WebElement>() {
			public WebElement apply(ChromeDriver driver) {
				return driver.findElementByClassName(className);
			}
		});
	}
	
	/**
	 * 
	 * @param className
	 * @return WebElement
	 */
	public WebElement findElementByClassName(final String className) {
		return this.cDriver.findElementByClassName(className);
	}
	
	/**
	 * 
	 * @param cssSelector
	 * @return WebElement
	 */
	public WebElement findElementByCssSelector(final String cssSelector) {
		return this.cDriver.findElementByCssSelector(cssSelector);
	}
	
	/**
	 * 
	 * @param id
	 * @return WebElement
	 */
	public WebElement findElementById(final String id) {
		return this.cDriver.findElementById(id);
	}
	
	/**
	 * 
	 * @param linkText
	 * @return WebElement
	 */
	public WebElement findElementByLinkText(final String linkText) {
		return this.cDriver.findElementByLinkText(linkText);
	}
	
	/**
	 * 
	 * @param name
	 * @return WebElement
	 */
	public WebElement findElementByName(final String name) {
		return this.cDriver.findElementByName(name);
	}
	
	/**
	 * 
	 * @param partialLinkText
	 * @return WebElement
	 */
	public WebElement findElementByPartialLinkText(final String partialLinkText) {
		return this.cDriver.findElementByPartialLinkText(partialLinkText);
	}
	
	/**
	 * 
	 * @param tagName
	 * @return WebElement
	 */
	public WebElement findElementByTagName(final String tagName) {
		return this.cDriver.findElementByTagName(tagName);
	}
	
	/**
	 * 
	 * @param xpath
	 * @return WebElement
	 */
	public WebElement findElementByXpath(final String xpath) {
		return this.cDriver.findElementByXPath(xpath);
	}
	
	/**
	 * 
	 * @param script 
	 */
	public void executeScript(String script) {
		this.cDriver.executeScript(script);
	}
	
	/**
	 * 
	 * @param script
	 */
	public void executeAsyncScript(String script) {
		this.cDriver.executeAsyncScript(script);
	}
	
	/**
	 * 
	 * @param xpath
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByXpath(String xpath) {
		return this.cDriver.findElementsByXPath(xpath).size();
	}
	
	/**
	 * 
	 * @param tagName
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByTagName(String tagName) {
		return this.cDriver.findElementsByTagName(tagName).size();
	}
	
	/**
	 * 
	 * @param linkText
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByPartialLinkText(String linkText) {
		return this.cDriver.findElementsByPartialLinkText(linkText).size();
	}
	
	/**
	 * 
	 * @param name
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByName(String name) {
		return this.cDriver.findElementsByName(name).size();
	}
	
	/**
	 * 
	 * @param linkText
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByLinkText(String linkText) {
		return this.cDriver.findElementsByLinkText(linkText).size();
	}
	
	/**
	 * 
	 * @param id
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsById(String id) {
		return this.cDriver.findElementsById(id).size();
	}
	
	/**
	 * 
	 * @param cssSelector
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByCssSelector(String cssSelector) {
		return this.cDriver.findElementsByCssSelector(cssSelector).size();
	}
	
	/**
	 * 
	 * @param className
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByClassName(String className) {
		return this.cDriver.findElementsByClassName(className).size();
	}
}
