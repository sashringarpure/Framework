package com.fanatics.seed;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ApachePOITest extends TestCase{
	
	 public ApachePOITest( String testName ) {
	        super( testName );
	 }
	 
	public static Test suite() {
        return new TestSuite( ApachePOITest.class );
    }
	
	@org.junit.Test
	public static void testreadXLSXFile() {
		// TODO Auto-generated method stub
		List<String> expData = new ArrayList<String>();
		expData.add("EMP ID,EMP NAME,DESIGNATION");
		expData.add("tp01,Gopal,Technical Manager");
		expData.add("tp02,Manisha,Proof Reader");
		expData.add("tp03,Masthan,Technical Writer");
		expData.add("tp04,Satish,Technical Writer");
		expData.add("tp05,Krishna,Technical Writer");
		ApachePOI poi = new ApachePOI();
		List<String> file = poi.readXLSXFile("/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/utils/src/main/resources/input/apache-poi-readfile-example.xlsx", 0);
		assertEquals(expData,file);
	}

}
