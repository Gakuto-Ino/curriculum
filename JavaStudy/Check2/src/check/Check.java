package check;

import constants.Constants;

public class Check {
	
	private static String firstName = "飯野";
	private static String lastName = "樂人";
	
	private static void printName(String f,String l) {
		
		System.out.println(f + l);
		
	}

	public static void main(String[] args) {
		
		System.out.print("printNameメソッド →");
		printName(firstName,lastName);
		
		Pet x = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet y = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		x.introduce();
		y.introduce();

	}

	
}
