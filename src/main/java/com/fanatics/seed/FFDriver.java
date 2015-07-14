/**
 * @author sshringarpure
 * 
 */
package com.fanatics.seed;

import java.net.URL;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

/**
 * 
 * @author sshringarpure
 * @version 1.0
 *
 */
public class FFDriver {

	private FirefoxDriver ff;
	private Wait<FirefoxDriver> wait;
	
	public FFDriver() {
		this.ff = null;
		this.wait = null;
	}
	
	public void setFirefoxDriver() {
		this.ff = new FirefoxDriver();
	}
	
	/**
	 * 
	 * @param driver
	 * @param timeOut
	 * @param pollInterval
	 * @param timeUnit
	 */
	public void setWait(FirefoxDriver driver, int timeOut, int pollInterval, TimeUnit timeUnit) {
		this.wait = new FluentWait<FirefoxDriver>(driver).withTimeout(timeOut, timeUnit).pollingEvery(pollInterval, timeUnit).ignoring(NoSuchElementException.class);
	}
	
	public Wait<FirefoxDriver> getWait() {
		return this.wait;
	}
	
	public FirefoxDriver getFirefoxDriver() {
		return this.ff;
	}

	/**
	 * @throws InterruptedException
	 */	
	public void driverWait() throws InterruptedException {
		this.ff.wait();
	}
	
	/**
	 * @param timeout
	 * @throws InterruptedException
	 */
	public void driverWait(int timeout) throws InterruptedException {
		this.ff.wait(timeout);
	}
	
	/**
	 * 
	 * @return returns a driver in string format.
	 */
	public String driverToString() {
		return this.ff.toString();
	}
	
	/**
	 * @param windowName
	 */
	public void switchToWindow(String windowName) {
		this.ff.switchTo().window(windowName);
	}
	
	public void switchToParentFrame() {
		this.ff.switchTo().parentFrame();
	}
	
	/**
	 * 
	 * @param frameName
	 */
	public void switchToFrame(String frameName) {
		this.ff.switchTo().frame(frameName);
	}
	
	/**
	 * 
	 * @param frameId
	 */
	public void switchToFrame(int frameId) {
		this.ff.switchTo().frame(frameId);
	}
	
	public void switchToDefaultContent() {
		this.ff.switchTo().defaultContent();
	}
	
	public void switchToActiveElement() {
		this.ff.switchTo().activeElement();
	}
	
	public void quit() {
		this.ff.quit();
	}
	
	public void close() {
		this.ff.close();
	}
	
	/**
	 * 
	 * @param url
	 */
	public void navigateTo(URL url) {
		this.ff.navigate().to(url);
	}
	
	/**
	 * 
	 * @param url
	 */
	public void navigateTo(String url) {
		this.ff.navigate().to(url);
	}
	
	public void refresh() {
		this.ff.navigate().refresh();
	}
	
	public void navigateForward() {
		this.ff.navigate().forward();
	}
	
	public void navigateBack() {
		this.ff.navigate().back();
	}
	
	public void setWindowPosition() {
		this.ff.manage().window().setPosition(new Point(0,0));
	}
	
	/**
	 * 
	 * @param d
	 */
	public void setWindowSize(Dimension d) {
		this.ff.manage().window().setSize(d);
	}
	
	public void maximizeBrowser() {
		this.ff.manage().window().setPosition(new Point(0,0));
		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		Dimension d = new Dimension((int) screenSize.getWidth(),(int) screenSize.getHeight());
		this.ff.manage().window().setSize(d);
	}
	
	public void maximizeWindow() {
		this.ff.manage().window().maximize();
	}
	
	/**
	 * 
	 * @return returns the size of the window.
	 */
	public Dimension getWindowSize() {
		return this.ff.manage().window().getSize();
	}
	
	/**
	 * 
	 * @return returns the position of the window.
	 */
	public Point getWindowPosition() {
		return this.ff.manage().window().getPosition();
	}
	
	/**
	 * 
	 * @param seconds : time to wait in.
	 * @param secs : TimeUnit.
	 */
	public void setImplicitWait(int seconds, TimeUnit secs) {
		this.ff.manage().timeouts().implicitlyWait(seconds, secs);
	}
	
	/**
	 * 
	 * @param seconds : time to wait in.
	 * @param secs : TimeUnit.
	 */
	public void setPageLoadTimeout(int seconds, TimeUnit secs) {
		this.ff.manage().timeouts().pageLoadTimeout(seconds, secs);
	}
	
	/**
	 * 
	 * @param seconds : time to wait in.
	 * @param secs : TimeUnit.
	 */
	public void setScriptTimeout(int seconds, TimeUnit secs) {
		this.ff.manage().timeouts().setScriptTimeout(seconds, secs);
	}
	
	/**
	 * 
	 * @return A set consisting of cookies.
	 */
	public Set<Cookie> getCookies() {
		return this.ff.manage().getCookies();
	}
	
	/**
	 * 
	 * @param cookieName
	 * @return a cookie object.
	 */
	public Cookie getCookieNamed(String cookieName) {
		return this.ff.manage().getCookieNamed(cookieName);
	}
	
	/**
	 * 
	 * @param cookieName
	 */
	public void deleteCookieNamed(String cookieName) {
		this.ff.manage().deleteCookieNamed(cookieName);
	}
	
	/**
	 * 
	 * @param cookie
	 */
	public void deleteCookie(Cookie cookie) {
		this.ff.manage().deleteCookie(cookie);
	}
	
	public void deleteAllCookies() {
		this.ff.manage().deleteAllCookies();
	}
	
	/**
	 * 
	 * @param cookie
	 */
	public void AddCookies(Cookie cookie) {
		this.ff.manage().addCookie(cookie);
	}
	
	/**
	 * 
	 * @return all window handles.
	 */
	public Set<String> getAllWindowHandles() {
		return this.ff.getWindowHandles();
	}
	
	
	public String getWindowHandle() {
		return this.ff.getWindowHandle();
	}
	
	/**
	 * 
	 * @return page title
	 */
	public String getTitle() {
		return this.ff.getTitle();
	}
	
	/**
	 * 
	 * @return session Id
	 */
	public SessionId getSessionId() {
		return this.ff.getSessionId();
	}
	
	/**
	 * 
	 * @return page source
	 */
	public String getPageSource() {
		return this.ff.getPageSource();
	}
	
	/**
	 * 
	 * @return Mouse object.
	 */
	public Mouse getMouse() {
		return this.ff.getMouse();
	}
	
	/**
	 * 
	 * @return keyboard object
	 */
	public Keyboard getKeyboard() {
		return this.ff.getKeyboard();
	}
	
	/**
	 * 
	 * @return current URL
	 */
	public String getCurrentUrl() {
		return this.ff.getCurrentUrl();
	}
	
	/**
	 * 
	 * @return driver capabilities.
	 */
	public Capabilities getCapabilities() {
		return this.ff.getCapabilities();
	}
	
	/**
	 * 
	 * @param url
	 */
	public  void get(String url) {
		this.ff.get(url);
	}
	
	/**
	 * 
	 * @param xpath 
	 * @return a list of elements
	 */
	public List<WebElement> getElementsByXpath(String xpath) {
		return this.ff.findElementsByXPath(xpath);
	}
	
	/**
	 * 
	 * @param xpath
	 * @return a list of objects representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndXpath(final String xpath) {
		return this.wait.until(new Function<FirefoxDriver, List<WebElement>>() {
			public List<WebElement> apply(FirefoxDriver driver) {
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
		return this.ff.findElementsByTagName(tagName);
	}
	
	/**
	 * 
	 * @param tagName
	 * @return a list of objects representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndTagName(final String tagName) {
		return this.wait.until(new Function<FirefoxDriver, List<WebElement>>() {
			public List<WebElement> apply(FirefoxDriver driver) {
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
		return this.ff.findElementsByPartialLinkText(partialLinkText);
	}
	
	/**
	 * 
	 * @param partialLinkText
	 * @return a list of objects representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndPartialLinkText(final String partialLinkText) {
		return this.wait.until(new Function<FirefoxDriver, List<WebElement>>() {
			public List<WebElement> apply(FirefoxDriver driver) {
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
		return this.ff.findElementsByName(name);
	}
	
	/**
	 * 
	 * @param name
	 * @return a list of objects representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndName(final String name) {
		return this.wait.until(new Function<FirefoxDriver, List<WebElement>>() {
			public List<WebElement> apply(FirefoxDriver driver) {
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
		return this.ff.findElementsByName(linkText);
	}
	
	/**
	 * 
	 * @param linkText
	 * @return a list of objects representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndLinkText(final String linkText) {
		return this.wait.until(new Function<FirefoxDriver, List<WebElement>>() {
			public List<WebElement> apply(FirefoxDriver driver) {
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
		return this.ff.findElementsById(id);
	}
	
	/**
	 * 
	 * @param id
	 * @return a list of objects representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndId(final String id) {
		return this.wait.until(new Function<FirefoxDriver, List<WebElement>>() {
			public List<WebElement> apply(FirefoxDriver driver) {
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
		return this.ff.findElementsByCssSelector(cssSelector);
	}
	
	/**
	 * 
	 * @param cssSelector
	 * @return a list representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndCssSelector(final String cssSelector) {
		return this.wait.until(new Function<FirefoxDriver, List<WebElement>>() {
			public List<WebElement> apply(FirefoxDriver driver) {
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
		return this.ff.findElementsByClassName(className);
	}
	
	/**
	 * 
	 * @param className
	 * @return a list representing web elements.
	 */
	public List<WebElement> findElementsByFluentWaitAndClassName(final String className) {
		return this.wait.until(new Function<FirefoxDriver, List<WebElement>>() {
			public List<WebElement> apply(FirefoxDriver driver) {
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
		return this.ff.findElementByXPath(xpath);
	}
	
	/**
	 * 
	 * @param xpath
	 * @return an object representing a web element.
	 */
	public WebElement findElementByFluentWaitAndXPath(final String xpath) {
		return this.wait.until(new Function<FirefoxDriver, WebElement>() {
			public WebElement apply(FirefoxDriver driver) {
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
		return this.ff.findElementByTagName(tagName);
	}
	
	/**
	 * 
	 * @param tagName
	 * @return an object representing a web-element.
	 */
	public WebElement findElementByFluentWaitAndtagName(final String tagName) {
		return this.wait.until(new Function<FirefoxDriver, WebElement>() {
			public WebElement apply(FirefoxDriver driver) {
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
		return this.ff.findElementByPartialLinkText(partialLinkText);
	}
	
	/**
	 * 
	 * @param partialLinkText
	 * @return an object representing a web element.
	 */
	public WebElement findElementByFluentWaitAndPartialLinkText(final String partialLinkText) {
		return this.wait.until(new Function<FirefoxDriver, WebElement>() {
			public WebElement apply(FirefoxDriver driver) {
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
		return this.ff.findElementByName(name);
	}
	
	/**
	 * 
	 * @param name
	 * @return an object representing a web element.
	 */
	public WebElement findElementByFluentWaitAndName(final String name) {
		return this.wait.until(new Function<FirefoxDriver, WebElement>() {
			public WebElement apply(FirefoxDriver driver) {
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
		return this.ff.findElementByLinkText(linkText);
	}
	
	/**
	 * 
	 * @param linkText
	 * @return an object representing an web element.
	 */
	public WebElement findElementByFluentWaitAndLinkText(final String linkText) {
		return this.wait.until(new Function<FirefoxDriver, WebElement>() {
			public WebElement apply(FirefoxDriver driver) {
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
		return this.ff.findElementById(id);
	}
	
	/**
	 * 
	 * @param id
	 * @return an object representing an web element.
	 */
	public WebElement findElementByFluentWaitAndId(final String id) {
		return this.wait.until(new Function<FirefoxDriver, WebElement>() {
			public WebElement apply(FirefoxDriver driver) {
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
		return this.ff.findElementByCssSelector(cssSelector);
	}
	
	/**
	 * 
	 * @param cssSelector
	 * @return an object representing an web element.
	 */
	public WebElement findElementByFluentWaitAndCssSelector(final String cssSelector) {
		return this.wait.until(new Function<FirefoxDriver, WebElement>() {
			public WebElement apply(FirefoxDriver driver) {
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
		return this.ff.findElementByClassName(className);
	}
	
	/**
	 * 
	 * @param className
	 * @return an object representing an web element.
	 */
	public WebElement findElementByFluentWaitAndClassName(final String className) {
		return this.wait.until(new Function<FirefoxDriver, WebElement>() {
			public WebElement apply(FirefoxDriver driver) {
				return driver.findElementByClassName(className);
			}
		});
	}
	
	/**
	 * 
	 * @param script 
	 */
	public void executeScript(String script) {
		this.ff.executeScript(script);
	}
	
	/**
	 * 
	 * @param script
	 */
	public void executeAsyncScript(String script) {
		this.ff.executeAsyncScript(script);
	}
	
	/**
	 * 
	 * @param xpath
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByXpath(String xpath) {
		return this.ff.findElementsByXPath(xpath).size();
	}
	
	/**
	 * 
	 * @param tagName
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByTagName(String tagName) {
		return this.ff.findElementsByTagName(tagName).size();
	}
	
	/**
	 * 
	 * @param linkText
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByPartialLinkText(String linkText) {
		return this.ff.findElementsByPartialLinkText(linkText).size();
	}
	
	/**
	 * 
	 * @param name
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByName(String name) {
		return this.ff.findElementsByName(name).size();
	}
	
	/**
	 * 
	 * @param linkText
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByLinkText(String linkText) {
		return this.ff.findElementsByLinkText(linkText).size();
	}
	
	/**
	 * 
	 * @param id
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsById(String id) {
		return this.ff.findElementsById(id).size();
	}
	
	/**
	 * 
	 * @param cssSelector
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByCssSelector(String cssSelector) {
		return this.ff.findElementsByCssSelector(cssSelector).size();
	}
	
	/**
	 * 
	 * @param className
	 * @return an integer indicating the number of elements in the list.
	 */
	public int getNumberOfElementsByClassName(String className) {
		return this.ff.findElementsByClassName(className).size();
	}
}
