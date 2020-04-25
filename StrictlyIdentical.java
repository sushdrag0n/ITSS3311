import java.util.Scanner;
/*SAMPLE RUN:
Enter 5 elements of the list 1 : 1 2 3 4 5
Enter 5 elements of the list 2 : 1 2 3 4 5
Two lists are strictly identical
 */
public class StrictlyIdentical {
			
		//method checks if arrays are identical
		public static boolean equals(int arr1[], int arr2[]){
		for(int i=0;i<arr1.length;i++){
		if(arr1[i]!=arr2[i]){
		return false; //returns false when values are found as not identical
		}
		}
		return true; //returns true when values are identical
		}
		  
		public static void main(String[] args) {
			
		Scanner obj = new Scanner(System.in);
		//asks for user input of first list
		System.out.print("Enter 5 elements of the list 1 : ");
		int l1[] = new int[5];
		int l2[] = new int[5];
			for(int i=0;i<5;i++){
				l1[i] = obj.nextInt();
		}
		//asks for user input of the second list
		System.out.print("Enter 5 elements of the list 2 : ");
			for(int i=0;i<5;i++){
			l2[i] = obj.nextInt();
			}
		//uses equals method to determine if the lists are identical
		boolean ans = equals(l1,l2);
		if(ans){
		System.out.println("Two lists are strictly identical");//reads the following statement if identical
		}
			else{
				System.out.println("Two list are not strictly identical");//reads the following statement if not identical
				}
			}
		}
