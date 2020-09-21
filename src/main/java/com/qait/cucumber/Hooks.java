package com.qait.cucumber;

//import java.io.FileOutputStream;
//import java.util.stream.Stream;
//
//import org.json.JSONArray;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.Phrase;
//import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;
	@Before
	public void init()
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankitmalik\\TATOC\\chromedriver.exe");
	     driver = new ChromeDriver(); 
	}
	@After
	public void end() throws Exception
	{
		driver.quit();
//		Document document = new Document();
//		 PdfWriter.getInstance(document, new FileOutputStream("result.pdf"));
//		  
//		 document.open();
//		 
//		 String jsonString=Stepdef.readFile(System.getProperty("user.dir")+"\\target\\cucumber.json");
//		 JSONArray subRes=null;
//		 
//		 PdfPTable table = new PdfPTable(3);
//		 addTableHeader(table);
//		 System.out.println(jsonString);
//		 JSONArray jsonResult=(new JSONArray(jsonString)).getJSONObject(0).getJSONArray("elements");
//		 
//		 for(int i=0;i<jsonResult.length();i++)
//		 {
//			 subRes = jsonResult.getJSONObject(i).getJSONArray("steps");
//			 addRows(table,i+1+"",jsonResult.getJSONObject(i).getString("name"),subRes.getJSONObject(subRes.length() - 1).getJSONObject("result").getString("status")); 
//		 }
//		 document.add(table);
//		 document.close();
//	     System.out.println("Table created successfully.."); 
	}
//	 public static void addTableHeader(PdfPTable table) {
//		    Stream.of("TestNumber", "Scenario", "Status")
//		      .forEach(columnTitle -> {
//		        PdfPCell header = new PdfPCell();
//		        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
//		        header.setBorderWidth(2);
//		        header.setPhrase(new Phrase(columnTitle));
//		        table.addCell(header);
//		    });
//		}
//	 public static void addRows(PdfPTable table,String arg1,String arg2,String arg3) {
//		    table.addCell(arg1);
//		    table.addCell(arg2);
//		    table.addCell(arg3);
//		}
}
