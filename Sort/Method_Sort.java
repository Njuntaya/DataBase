package Sort;

class Method_Sort {
    
    void bubble_sort(int Arr[]){
        
       int n = Arr.length;
       
       for (int i = 0 ; i <= n - 2 ; i ++) {
           for(int j = 0 ; j <= n - 2 ; j++){
               if(Arr[j + 1]  < Arr[j]) {
                   int temp = Arr[j];
                       Arr[j] = Arr[j + 1];
                       Arr[j + 1] = temp;
               }  
           }
       }
      
    }
    
    void insert_sort(int Arr[]) {
        int n = Arr.length;
        for (int i = 1 ; i <= n - 1  ; i ++) {
            int v = Arr[i];
            int j = i - 1;
                while(j >= 0 && Arr[j] > v){
                    Arr[j + 1] = Arr[j];
                    j--;
                }
            Arr[j+1] = v;
        }
    }
    
    void selection_sort(int Arr[]) {
        int n = Arr.length;
        
        for(int i = 0 ; i <= n - 2 ; i++) {
            int min = i ;
                for(int j = i + 1 ; j <= n - 1 ; j++) {
                    if(Arr[j] < Arr[min]){
                    min = j;
                    }
                }
                int temp = Arr[i]; 
                    Arr[i] = Arr[min];
                    Arr[min] = temp;
        }
    }
    
    void quick_sort(int Arr[] , int l , int r) {
        
        if (l < r) {
            int s = parttion(Arr , l , r);
            quick_sort(Arr , l , s - 1);
            quick_sort(Arr , s + 1 , r);
        }
    }
    
    int parttion(int Arr[] ,int l , int r ){
        int p = Arr[l] ;
        int i = l ;
        int j = r + 1;
        
        do {
            
            do{
                i++;
            }while(i < r && Arr[i] < p);
            
            do {
                j--;
            }while(Arr[j] > p);
            
            int temp = Arr[i] ;
                Arr[i] = Arr[j];
                Arr[j] = temp;
            
        }while(i < j);
        
        int temp = Arr[i] ;
        Arr[i] = Arr[j];
        Arr[j] = temp;
        
        int temp_2 = Arr[l];
            Arr[l] = Arr[j];
            Arr[j] = temp_2;
        
        return j; 
    }
} 