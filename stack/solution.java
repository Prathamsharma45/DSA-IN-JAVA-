public class solution {
   public static void main(String[] args) {
        int []num1={4,1,2};
        int[]num2={1,3,4,2};
        int[]newnums=new int[num1.length];
        for (int i= 0; i < num1.length; i++) {
            int count=0;
            for(int j=0;j<num2.length;j++){
                if(num1[i]==num2[j]){
                    for(int k=j+1;k<num2.length;k++){
                        if(num2[k]>num1[i]){
                            newnums[i]=num2[k];
                            count++;
                            break;
                        }
                    }
                }
            }
            if(count!=1){
                newnums[i]=-1;

            }

        }
        for(int i:newnums){
            System.out.println(i);
        }

    }
        
    }
   


