package mypackage;

public class MyClass {

	public static void main(String[] args) {
		int[] numbers= {randomNumber(),randomNumber(),randomNumber(),randomNumber()
				,randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber()};
		System.out.print("Here are the scores ");
		for (int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+ " ");
	      }
		int max=0;
		
		for (int i=0;i<numbers.length;i++) {
			if (numbers[i]>max) {
				max=numbers[i];
			}
		}
		System.out.println(" ");
		System.out.println("The highest score is: "+max+" . Give that man a cookie!");
	}
	
	public static int randomNumber() {
		return (int)((Math.random()*5000)+1);
	}

}
