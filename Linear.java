package Linear;
import java.util.*;

public class Linear {
	public static void main(String[]args){
		
	int size,find;
	int []arr;
		Scanner input = new Scanner(System.in);
		Random rad = new Random();
		System.out.println("Number of Output: ");
		size= input.nextInt();
		
		arr= new int[size];
		
		for (int i=0; i<=size-1;i++){
			arr[i]=rad.nextInt(1000);
			System.out.println(arr[i]);
		}
		System.out.println("Searching: ");
		find=input.nextInt();
		for(int c=0;c<=size-1;c++){
			if(find==arr[c]){
				System.out.println("On Index: "+ c);
			break;
			}
			if (c==size-1){

				System.out.print("the Number you searched is not in the Given Random!!!");

			}

				}
	}
	}
