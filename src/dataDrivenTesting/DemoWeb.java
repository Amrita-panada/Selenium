package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hpsf.Property;

public class DemoWeb {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		 Properties p = new Properties();
		 p.load(fis);
		 String url=p.getProperty("url");
		 String un=p.getProperty("username");
		 String pwd=p.getProperty("password");
		 System.out.println(url);
		 System.out.println(un);
		 System.out.println(pwd);
		 
		
		
		
		
	}

}
