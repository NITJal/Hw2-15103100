package assign2;

import java.util.Scanner;
import javax.script.*;

interface booleanExpression

{

  public boolean EvaluateExpression(String s);



}
public class Calc implements booleanExpression {

	

	public static void main (String args[]){
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any string");
			String x=sc.nextLine();
			booleanExpression be=new Calc();
			boolean bf=be.EvaluateExpression(x);
			System.out.println(bf);
			sc.close();
	}
		
	}

	@Override
	public boolean EvaluateExpression(String s) {
		boolean b;
		try{
		String and="&&";
		String or="||";
		ScriptEngineManager x= new ScriptEngineManager();
		ScriptEngine y=x.getEngineByName("JavaScript");
		String statement = s;
		
		String Epoint=statement.replaceAll("or", or);
		String EEpoint=Epoint.replaceAll("and",and);
		
		b=(boolean)y.eval(EEpoint);
		} 
		catch (ScriptException e) {
			System.out.println("Statement is not correct");
			e.printStackTrace();
		
		}
		return false;
		
	}
}
