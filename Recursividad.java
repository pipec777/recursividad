public class Recursividad{

     public int multi(int a, int b){
        if(b==1)
        return a;
        else{ 
       return a + multi(a,b-1);
   }
}
}