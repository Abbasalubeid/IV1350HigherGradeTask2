package se.kth.iv1350.additionalHigherGradeTask2;

import se.kth.iv1350.additionalHigherGradeTask2.composition.DateAdaptionByComposition;
import se.kth.iv1350.additionalHigherGradeTask2.inheritance.DateAdaptionByInheritance;

public class Main {

	public static void main(String[] args) {
		DateAdaptionByInheritance dateByInheritance = new DateAdaptionByInheritance();
		DateAdaptionByComposition dateByComposition = new DateAdaptionByComposition();


		System.out.println("The current date is " + dateByInheritance + "\n");
		System.out.println("(By inheritance) The current date and time is compared to day " + 18 + " of this month "
				+ "and the time " + 16 + ":" + 10 + ":" + 37);
		System.out.println(dateByInheritance.dayAndTimeDifference(18, 16, 10, 37));
		
	
		System.out.println("(By composition) The current date and time is compared to day " + 18 + " of this month "
				+ "and the time " + 16 + ":" + 10 + ":" + 37);
		System.out.print(dateByComposition.dayAndTimeDifference(18, 16, 10, 37));

	}

}
