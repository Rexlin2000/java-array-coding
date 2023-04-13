import java.util.Scanner;
public class binarysearchess{
    public static void main(String[] args) {
        int[] arr={15,23,45,53,60,65,76,96,98};
        int min=0;
        int search;
        System.out.print("you search the number: ");
        Scanner in=new Scanner(System.in);
        search=in.nextInt();
        
        int max=arr.length-1;
        while(min<=max){
            int mid=(min+max)/2;//(8)4
            if(search==arr[mid]){//search(96)==60 so false
                System.out.println("your search is: "+mid);
                break;
            }
            else if(search>=arr[mid]){//so true
                  min=mid+1;  

            }
            else if (search<=arr[mid]) {//
                max=mid-1;
            }
            else{
                System.out.println("Your searching number is notfound in array");
            }
        }           


    }
}
