package se.kth.iv1350.additionalHigherGradeTask2;

public class InvalidNumberException extends Exception {

	public InvalidNumberException(int theInvalidNUmber) {
		super("The number " + theInvalidNUmber + " is not valid for this situation");
	}
}
