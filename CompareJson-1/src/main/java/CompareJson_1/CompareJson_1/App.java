package CompareJson_1.CompareJson_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import ro.skyah.comparator.CompareMode;
import ro.skyah.comparator.JSONCompare;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //mySimpleEqualsTest();
        String a = "hi";
        String b = new String("hi");
        System.out.println(a == b);
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(a.matches(b));
       
    }
   
		/*@Test
        public static void mySimpleEqualsTest() {
       /* String expected = "{\"b\":\"val1\"}";
        String actual = "{\"a\":\"val2\",\"b\":\"val2\"}";
        
          String jason1 =  "{\"Employee\":{\"apiConnectionDefn\":\"null\",\"objectDefn\":\"null\",\"description\":\"Employee\",\"label\":\"Employee\",\"apiConnectionDefnId\":\"null\",\"type\":\"USER_DEFINED\",\"version\":\"1.0\",\"apiPath\":\"null\",\"name\":\"Employee\",\"tenantId\":\"pX2e1e12c31\",\"fields\":{\"name\":{\"localizedFlag\":\"false\",\"dataTypeDefn\":{\"name\":\"Text\",\"dataTypeDefnId\":\"TEXT\"},\"description\":\"name\",\"dataTypeDefnId\":\"TEXT\",\"nullableFlag\":\"false\",\"label\":\"name\",\"sequence\":\"2.0\",\"searchableFlag\":\"false\",\"deletedFlag\":\"false\",\"tenantId\":\"pX2e1e12c31\",\"name\":\"name\",\"primaryKeyFlag\":\"false\",\"uniqueKeyFlag\":\"false\"},\"divId\":{\"localizedFlag\":\"false\",\"dataTypeDefn\":{\"name\":\"Text\",\"dataTypeDefnId\":\"TEXT\"},\"description\":\"Employee ID\",\"dataTypeDefnId\":\"TEXT\",\"label\":\"employee Id\",\"nullableFlag\":\"false\",\"searchableFlag\":\"false\",\"sequence\":\"1.0\",\"deletedFlag\":\"false\",\"name\":\"employeeId\",\"tenantId\":\"pX2e1e12c31\",\"primaryKeyFlag\":\"true\",\"uniqueKeyFlag\":\"false\"}},\"baseMasterDataDefnId\":\"null\",\"activeFlag\":\"false\"},\"DepartmentDivisions\":{\"fields\":{\"activeFlag\":{\"localizedFlag\":\"false\",\"dataTypeDefn\":{\"name\":\"Text\",\"dataTypeDefnId\":\"TEXT\"},\"description\":\"Active Flag\",\"dataTypeDefnId\":\"TEXT\",\"label\":\"Active Flag\",\"nullableFlag\":\"false\",\"sequence\":\"3.0\",\"searchableFlag\":\"false\",\"deletedFlag\":\"false\",\"tenantId\":\"pX2e1e12c31\",\"name\":\"activeFlag\",\"primaryKeyFlag\":\"false\",\"uniqueKeyFlag\":\"false\"}}}}";
       String jason2 =  "{\"status\":\"SUCCESS\",\"content\":[{\"apiConnectionDefnId\":null,\"apiPath\":null,\"name\":\"DepartmentDivisions\",\"label\":\"DepartmentDivisions\",\"description\":\"departmentDivision\",\"version\":1,\"activeFlag\":false,\"type\":\"USER_DEFINED\",\"tenantId\":\"pX2e1e12c31\",\"apiHeaders\":{},\"apiConnectionDefn\":null,\"baseMasterDataDefnId\":null,\"objectDefn\":null,\"fields\":{\"deptDivId\":{\"name\":\"deptDivId\",\"label\":\"Association ID\",\"description\":\"deptDivId\",\"dataTypeDefnId\":\"TEXT\",\"dataTypeDefn\":{\"dataTypeDefnId\":\"TEXT\",\"name\":\"Text\",\"parameterDefns\":[]},\"dataTypeDefnParameters\":{},\"sequence\":1,\"searchableFlag\":false,\"deletedFlag\":false,\"primaryKeyFlag\":true,\"uniqueKeyFlag\":false,\"nullableFlag\":false,\"tenantId\":\"pX2e1e12c31\",\"localizedFlag\":false},\"deptId\":{\"name\":\"deptId\",\"label\":\"department Id\",\"description\":\"deptId\",\"dataTypeDefnId\":\"TEXT\",\"dataTypeDefn\":{\"dataTypeDefnId\":\"TEXT\",\"name\":\"Text\",\"parameterDefns\":[]},\"dataTypeDefnParameters\":{},\"sequence\":2,\"searchableFlag\":false,\"deletedFlag\":false,\"primaryKeyFlag\":false,\"uniqueKeyFlag\":false,\"nullableFlag\":false,\"tenantId\":\"pX2e1e12c31\",\"localizedFlag\":false},\"divId\":{\"name\":\"divId\",\"label\":\"division Id\",\"description\":\"divId\",\"dataTypeDefnId\":\"TEXT\",\"dataTypeDefn\":{\"dataTypeDefnId\":\"TEXT\",\"name\":\"Text\",\"parameterDefns\":[]},\"dataTypeDefnParameters\":{},\"sequence\":3,\"searchableFlag\":false,\"deletedFlag\":false,\"primaryKeyFlag\":false,\"uniqueKeyFlag\":false,\"nullableFlag\":false,\"tenantId\":\"pX2e1e12c31\",\"localizedFlag\":false},\"activeFlag\":{\"name\":\"activeFlag\",\"label\":\"Active Flag\",\"description\":\"Active Flag\",\"dataTypeDefnId\":\"TEXT\",\"dataTypeDefn\":{\"dataTypeDefnId\":\"TEXT\",\"name\":\"Text\",\"parameterDefns\":[]},\"dataTypeDefnParameters\":{},\"sequence\":3,\"searchableFlag\":false,\"deletedFlag\":false,\"primaryKeyFlag\":false,\"uniqueKeyFlag\":false,\"nullableFlag\":false,\"tenantId\":\"pX2e1e12c31\",\"localizedFlag\":false}}},{\"apiConnectionDefnId\":null,\"apiPath\":null,\"name\":\"Division\",\"label\":\"division\",\"description\":\"division\",\"version\":1,\"activeFlag\":false,\"type\":\"USER_DEFINED\",\"tenantId\":\"pX2e1e12c31\",\"apiHeaders\":{},\"apiConnectionDefn\":null,\"baseMasterDataDefnId\":null,\"objectDefn\":null,\"fields\":{\"divId\":{\"name\":\"divId\",\"label\":\"division Id\",\"description\":\"divId\",\"dataTypeDefnId\":\"TEXT\",\"dataTypeDefn\":{\"dataTypeDefnId\":\"TEXT\",\"name\":\"Text\",\"parameterDefns\":[]},\"dataTypeDefnParameters\":{},\"sequence\":1,\"searchableFlag\":false,\"deletedFlag\":false,\"primaryKeyFlag\":true,\"uniqueKeyFlag\":false,\"nullableFlag\":false,\"tenantId\":\"pX2e1e12c31\",\"localizedFlag\":false},\"name\":{\"name\":\"name\",\"label\":\"name\",\"description\":\"name\",\"dataTypeDefnId\":\"TEXT\",\"dataTypeDefn\":{\"dataTypeDefnId\":\"TEXT\",\"name\":\"Text\",\"parameterDefns\":[]},\"dataTypeDefnParameters\":{},\"sequence\":2,\"searchableFlag\":false,\"deletedFlag\":false,\"primaryKeyFlag\":false,\"uniqueKeyFlag\":false,\"nullableFlag\":false,\"tenantId\":\"pX2e1e12c31\",\"localizedFlag\":false},\"deptId\":{\"name\":\"deptId\",\"label\":\"Department ID \",\"description\":\"Department Id\",\"dataTypeDefnId\":\"TEXT\",\"dataTypeDefn\":{\"dataTypeDefnId\":\"TEXT\",\"name\":\"Text\",\"parameterDefns\":[]},\"dataTypeDefnParameters\":{},\"sequence\":3,\"searchableFlag\":false,\"deletedFlag\":false,\"primaryKeyFlag\":false,\"uniqueKeyFlag\":false,\"nullableFlag\":false,\"tenantId\":\"pX2e1e12c31\",\"localizedFlag\":false}}},{\"apiConnectionDefnId\":null,\"apiPath\":null,\"name\":\"Employee\",\"label\":\"Employee\",\"description\":\"Employee\",\"version\":1,\"activeFlag\":false,\"type\":\"USER_DEFINED\",\"tenantId\":\"pX2e1e12c31\",\"apiHeaders\":{},\"apiConnectionDefn\":null,\"baseMasterDataDefnId\":null,\"objectDefn\":null,\"fields\":{\"divId\":{\"name\":\"employeeId\",\"label\":\"employee Id\",\"description\":\"Employee ID\",\"dataTypeDefnId\":\"TEXT\",\"dataTypeDefn\":{\"dataTypeDefnId\":\"TEXT\",\"name\":\"Text\",\"parameterDefns\":[]},\"dataTypeDefnParameters\":{},\"sequence\":1,\"searchableFlag\":false,\"deletedFlag\":false,\"primaryKeyFlag\":true,\"uniqueKeyFlag\":false,\"nullableFlag\":false,\"tenantId\":\"pX2e1e12c31\",\"localizedFlag\":false},\"name\":{\"name\":\"name\",\"label\":\"name\",\"description\":\"name\",\"dataTypeDefnId\":\"TEXT\",\"dataTypeDefn\":{\"dataTypeDefnId\":\"TEXT\",\"name\":\"Text\",\"parameterDefns\":[]},\"dataTypeDefnParameters\":{},\"sequence\":2,\"searchableFlag\":false,\"deletedFlag\":false,\"primaryKeyFlag\":false,\"uniqueKeyFlag\":false,\"nullableFlag\":false,\"tenantId\":\"pX2e1e12c31\",\"localizedFlag\":false}}}],\"messages\":[]}";
    try {
       JSONCompare.assertEquals(jason1, jason2);
    }
    catch(AssertionError e) {
    	
    	System.out.println(e);
    }
   
    try {
    	 FileReader file = new FileReader("C:\\Users\\mitali.bhade\\eclipse-workspace\\arenaapi-master\\CompareJson\\Input.txt");
		FileReader file1 = new FileReader("C:\\Users\\mitali.bhade\\eclipse-workspace\\arenaapi-master\\CompareJson\\Output.txt");
		try {
			System.out.println(file.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
  
    
		
	

    
    
}

























/*
 * String expected = "{\"b\":\"val1\"}"; String actual =
 * "{\"a\":\"val2\",\"b\":\"val2\"}"; JSONCompare.assertNotEquals(expected,
 * actual, CompareMode.JSON_OBJECT_NON_EXTENSIBLE,
 * CompareMode.JSON_ARRAY_NON_EXTENSIBLE);
 */
