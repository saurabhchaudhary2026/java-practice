// import java.util.*;
public class TrappingRainwater {
    public static int Volume_Of_Rainwater(int [] Barheight){
        int n= Barheight.length;
        //calculate left max boundary - array
        int leftMax[] =new int[n];
        leftMax[0]=Barheight[0];
        for(int i =1;i<n;i++){
            leftMax[i]=Math.max(Barheight[i],leftMax[i-1]);
        }
        //calculate right max boundary -array
        int rightMax[] =new int[n];
        rightMax[n-1]=Barheight[n-1];
        for(int i =n-2;i>=0;i--){
            rightMax[i]=Math.max(Barheight[i],rightMax[i+1]);
        }
        int trappedWater =0;
        //loop
        for(int i =0;i<n;i++){
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //trapped water = waterLevel-height[i]
            trappedWater +=waterLevel - Barheight[i];
        }        
 return trappedWater;
    }  
    public static void main(String args[]){
        int height[] ={4,2,0,6,3,2,5};
        System.out.println(Volume_Of_Rainwater(height));
    }
}
