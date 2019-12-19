class removeDuplicatesArray{

    
  public static void main(String[] args){
    int arr[] = {1,2,2,3,4,3,5,4,5,6,4,8,1};
    int n = arr.length;
    
    n = removeDuplicates(arr, n);
    
    System.out.println("Arry length is: "+n);
  
    for(int i = 0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
  
  
  
  static int removeDuplicates(int arr[], int n){
    
   for(int i = 0; i<n; i++){
      for(int j = i; j<n; j++){
        if(arr[i] > arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    
    }
    
    if(n == 0 || n == 1){
      return n;
    }
        
    int j =0;
      for(int i = 0; i < n-1; i++){
        
        if(arr[i] != arr[i+1]){
          arr[j++] = arr[i];
        }
      }
      arr[j++] = arr[n-1];
    
    return j; 
  }

}