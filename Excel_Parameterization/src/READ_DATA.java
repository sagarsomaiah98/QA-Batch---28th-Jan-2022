

public class READ_DATA {

	public static void main(String[] args) {
		
		Xls_Reader xls= new Xls_Reader("S:\\JANBASK\\FEB_WORKSPACE\\Excel_Parameterization\\src\\TESTDATA\\TESTSUITE.xlsx");
		
		int rowCount=xls.getRowCount("GMAIL");
		
		System.out.println(rowCount);
		
	
	
	for(int i=0;i<=rowCount;i++) 
	{
		String value1=xls.getCellData("GMAIL", "TCID", i);
		String value2=xls.getCellData("GMAIL", "TESTCASE",i);
		String value3=xls.getCellData("GMAIL", "STATUS", i);

		System.out.println(value1+" - "+value2+" - "+value3);
			
		
	}
	
	xls.addColumn("GMAIL", "COMMENTS");

	}

}
