public class Magic {
	public static void main(String[] args) {
    //This is the original number.
    int myNumber = 15;
    //Follow the steps
    int stepOne = myNumber*myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo/myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive/6;
    //What do you get?
    System.out.println(stepSix);

	}
}
