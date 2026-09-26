class Methood_Sort{
   
    static void bubbleSort (int Arr[]) {
        
        int Array[] = Arr;
        
        
        for (int i = 0 ; i < Array.length -1 ; i ++) {
            for(int j = 0 ; j < Array.length - 1 - i ; j ++) {
                
                if(Array[j] > Array[j + 1]) {
                    int temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;
                }
            }            
        }
        
        for (int i = 0 ; i < Array.length ; i ++) {
            System.out.printf("%d",Array[i]);
        }
      }
    
    static void inSection (int Arr[]) {
        int Array[] = Arr;
        
     for (int i = 1 ; i < Array.length; i ++) {
         int v ;
         int j;
         v = Array[i];
         j = i - 1;
            while (j >= 0 && Array[j] > v) {
                Array[j + 1] = Array[j];
                j = j -1 ;
            }
            Array[j + 1] = v ;            
     
     }
     
     for (int i = 0 ; i < Array.length ; i ++) {
            System.out.printf("%d" ,Array[i]);
        }
    }
    
    static void Selection (int Arr[]) {
        
        for (int i = 0 ; i < Arr.length  ; i ++){
            
            int min = i;
            
            for(int j = i + 1 ;  j < Arr.length ; j ++){
                
                if(Arr[j] < Arr[min] ) {
                    min = j;
                }
            }           
            int temp = Arr[i];
            Arr[i] = Arr[min] ;
            Arr[min] = temp;
        }
        
         for (int i = 0 ; i < Arr.length ; i ++) {
            System.out.printf("%d" ,Arr[i]);
        }
    }
 }

    

