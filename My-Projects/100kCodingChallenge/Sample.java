import java.util.Scanner;

public class Sample{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int i,j,size,temp;

        System.out.println("Enter the size of the array:");
        size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements: ");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        for(i=0;i<size-1;i++){
            for(j=i+1;j<size;j++){
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nSorted array: ");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }

}