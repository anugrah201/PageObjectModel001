package data;

import utilities.ExcelRead;

public class DataFileOne 
{
	
	ExcelRead d = new ExcelRead("C:\\testing\\NikulTest.xlsx");
	public String wrongEmail = d.getCellData("Data1", "UserName", 3);
	public String wrongPassword = d.getCellData("Data1", "Password", 2);
	public String invalidEmail = d.getCellData("Data1", "UserName", 4);
	public String globalErr = d.getCellData("Data1", "Global Error", 2); //"Please check your card number / username or password and try again.";
	public String emptyEmailErr = d.getCellData("Data1", "Email Error", 4); //"Please enter your username or card number.";
	public String emptyPasswordErr = d.getCellData("Data1", "Password Error", 3); //"Please enter your password.";
	public String emailWithSpeCharErr = d.getCellData("Data1", "Email Error", 5); //"Please enter a username or card number without special characters.";


}
