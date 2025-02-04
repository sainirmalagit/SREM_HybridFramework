package Utilities;

import java.io.IOException;

public class DataProvider {
	
/* 1. Need to create one class for Data Provider.
 * 2. Create a method for 2 dimentional array  
 * 3. Need to Data Provider Annoatation before the method and need to specify the data provider name. this name is different from one data provoder to another data proder.
 * 4. Need to specify the excel path and we need to store that in one string variable.
 * 5. Need to create an object for Excel utility file because we need excel file read code.
 * 6. In excel utility object we need to specify the "path"-- This will come under excel utility constuctor.
 * 7. Need to get the Row count using xlutil object and that one need to be store in different variable like int Totalrowcount.
 * 8. Need to get the cell count using xlutil object and that one need to be store in different variable like int Totalcellcount.
 * 9. Need to store 2 dimentional array to get and store the row and cell get using getdata function.
 * 10. Need to create loop to get row and cell counts.Need to store the row count using i variable and store it to the "int"
 * 11. Need to create loop to get row and cell counts.Need to store the cell count using j variable and store it to the "int"
 * 12. Need to store the logindata of row and cell counts in two dimentional array by using getcell data function.
 * 13 finally we need to return the two dimentional array in the return statement.
 */
	@org.testng.annotations.DataProvider(name="LoginData")
	public String [][] getdata() throws IOException
	{
		String path=".\\testData\\Validating_LoginData.xlsx";
		
		ExcelUtility xlutil=new ExcelUtility(path);
		
		int totalrowcount=xlutil.getRowCount("Sheet1");
		int totalcellcount=xlutil.getCellCount("Sheet1", 1);
		
		String logindata[][]=new String[totalrowcount][totalcellcount];
		
		for(int i=1; i<=totalrowcount; i++)
		{
			for(int j=0; j<totalcellcount; j++)
			{
				logindata[i-1][j]=xlutil.getCellData("Sheet1", i, j); // Here 2 array counts will starts from 0 thats why we are taking row count as i-1.
			}
			
		}
		
		
		return logindata;
		
	}

}
