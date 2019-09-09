
package BinarySearch;

/**
 *
 * @author koma9
 */
public class Binary {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int values [] = {1,2,3,4,5,6,7,8,9};
       int found = binarySearch(values,4);
       
        System.out.println(found);
    }
    
   
    public static int binarySearch(int a[], int val){
        
     return   search(a,0,a.length,val);
    
    }
    
    private static int search(int []arr, int start, int end, int find){
        
        if(end >= start){

            int mid = start + (end - start)/2;
        
        if(arr[mid] == find){
            return mid;
        }
        else if (arr[mid] > find)
            return search(arr,start, mid-1,find);
        else 
            return search(arr,mid+1,end,find);
    
    
    }
        else
            return -1;
    }

}
