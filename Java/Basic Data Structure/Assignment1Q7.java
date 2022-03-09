import java.util.Scanner;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==toCheckValue)
                return true;
        }

        return false;
    }
}

public class Assignment1Q7 {
    public static void main(String[] args) {
    	
        int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int num = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value to be search ");
        num = sc.nextInt();

        SearchArray ob = new SearchArray();

        if (ob.searchArray(arr, num))
            System.out.println(num + " is present in the array");
        else 
            System.out.println(num + " is not present in the array");
        
    }
}