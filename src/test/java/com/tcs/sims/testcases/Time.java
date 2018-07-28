package com.tcs.sims.testcases;



import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Time {
	WebDriver driver;
	@Test
	public void abc()
	
	{
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.minusYears(3));
	//System.out.println(date.minusYears(3));
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getMonthValue());
		int b=date.getYear();
		int c=b-3;
		System.out.println(c);
		int e=date.getDayOfYear();
		System.out.println(e-1);
		int o=date.getDayOfMonth();
		int v=o-1;
		System.out.println(v);
		String bh=Integer.toString(v);
		System.out.println(bh);
		
		
		LocalDate y=date.minusYears(3);
		String s=y.toString();
		System.out.println("***************"+s);
		String f[]=s.split("-");
		String year=f[0];
		String month=f[1];
		String date1=f[2];
	
	

		System.out.println("Your Year is" +" "+year+" "+month+" "+date1);
		System.out.println("date"+  year+"-"+month+"-"+v);
		
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(1, "01");
		hm1.put(2, "02");
		hm1.put(3, "03");
		hm1.put(4, "04");
		hm1.put(5, "05");
		hm1.put(6, "06");
		hm1.put(7, "07");
		hm1.put(8, "08");
		hm1.put(9, "09");
		hm1.put(10, "10");
		hm1.put(12, "12");
		hm1.put(13, "13");
		hm1.put(14, "14");
		hm1.put(15, "15");
		hm1.put(16, "16");
		hm1.put(17, "17");
		hm1.put(18, "18");
		hm1.put(19, "19");
		hm1.put(20, "20");
		hm1.put(21, "21");
		hm1.put(22, "22");
		hm1.put(23, "23");
		hm1.put(24, "24");
		hm1.put(25, "25");
		hm1.put(26, "26");
		hm1.put(27, "27");
		hm1.put(28, "28");
		hm1.put(29, "29");
		hm1.put(30, "30");
		hm1.put(31, "31");
		
		
		for(int k=1;k<=31;k++)
		{
			if(k==v)
			{
			System.out.println("u la la "+  year+"-"+month+"-"+hm1.get(k));
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
		String format = formatter1.format(date);
		System.out.println("***** "+format);*/
		
		int d=date.getMonthValue();
		//System.out.println(date.getMonth());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
		String formattedString = date.format(formatter);
		System.out.println("Good luck"+formattedString);
		String monthArray[]=formattedString.split("/");
		System.out.println("Your respective month is:" +monthArray[1]);
		
		
		String m="August, 2015";
	String 	dateArray[]=m.split(", ");
	System.out.println(dateArray[0]);
	System.out.println(dateArray[1]);
	String n=dateArray[0];
	/*System.out.println(n);
	HashMap<Integer,String> hm1=new HashMap<Integer,String>();
	hm1.put(1, "January");
	hm1.put(2, "February");
	hm1.put(3, "March");
	hm1.put(4, "April");
	hm1.put(5, "May");
	hm1.put(6, "June");
	hm1.put(7, "July");
	hm1.put(8, "August");
	hm1.put(9, "September");
	hm1.put(10, "October");
	hm1.put(11, "November");
	hm1.put(12, "December");
	
	for(int i=1;i<=12;i++)
	{
		String j=hm1.get(i);
		if(j.equals(n))
		{
			System.out.println("Success!!!!");
			System.out.println(n);
		}
		else
		{
			//click on next month
			m="February, 2015";
		String	dateArray1[]=m.split(", ");
			n=dateArray1[0];
		}
	}
	*/
	String a="April, c";
	//table[@class='dp_header']//tbody//tr//td[@class='dp_previous']/following-sibling::td[contains(text(),'July, 2015')]/preceding-sibling::td[@class='dp_previous']
	
	for(int k=0;k<=12;k++)
	{
	if(n.equals("January")){
	
	for(int i=1;i<=12;i++)
	{
		if(monthArray[1].equals(n))
		{
			/*System.out.println("Success!!!!");
			System.out.println(n);*/
			//click on the respective date
		driver.findElement(By.xpath("//tr//td[text()='monthArray[0]']")).click();	
			
		}
		else
		{
			driver.findElement(By.xpath("")).click();
			String h=driver.findElement(By.xpath("")).getText();
			//click on next month icon and read the value
			h="February, 2015";
		String	dateArray1[]=h.split(", ");
			n=dateArray1[0];
		}
	}
	}
	else
	{
		driver.findElement(By.xpath("")).click();
		String u=driver.findElement(By.xpath("//table[@class='dp_header']//tbody//tr//td[@class='dp_previous']/following-sibling::td[contains(text(),a)]")).getText();
		u="April, 2015";
		String	dateArray1[]=u.split(", ");
		n=dateArray1[0];
	}
	}
	
	/*LocalDate localDate = LocalDate.parse(m);
	System.out.println(localDate);
	System.out.println(localDate.getMonthValue());*/
		
		/*String e=(Integer.parseInt(driver.findElement(By.xpath("")).getText()));
		
		for(int i=1;i<=12;i++)
		{
			if(i==d)
			{
			    
				
				break;
			}
			//clicking on next navigation icon present over date picker
			driver.findElement(By.xpath("//tr//td[@class='dp_next']")).click();
		}*/
	
HashMap<String, Integer> hm=new HashMap<String, Integer>();
hm.put("January", 1);
hm.put("February", 2);
hm.put("December", 12);
int k=hm.get("January");
System.out.println(k);

	
	}
	
}
