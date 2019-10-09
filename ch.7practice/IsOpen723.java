package lockerProblem;

public class IsOpen723 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] isOpen = new boolean[101];
		// set all the lockers close
		for (boolean i: isOpen) {
			i = false;
		}
		
		for(int i = 1; i < isOpen.length; i++) {
			for(int j = i; j < isOpen.length; j+=i) {
				if(isOpen[j])
					isOpen[j] = false;
				else
					isOpen[j] = true;
			}
		}
		for ( int i = 1; i < isOpen.length; i++) {
			if (isOpen[i])
				System.out.println("The NO." + i + " locker is open");
		}
		
	}

}
