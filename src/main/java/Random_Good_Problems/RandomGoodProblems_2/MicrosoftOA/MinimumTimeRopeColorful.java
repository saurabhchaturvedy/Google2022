package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

public class MinimumTimeRopeColorful {

    public static int minCost(String colors, int[] neededTime) {
        int time = 0;
        for(int i=0;i<colors.length()-1;i++){
            if(colors.charAt(i) == colors.charAt(i+1)){
                if(neededTime[i] < neededTime[i+1]){
                    time += neededTime[i];
                }else{
                    time += neededTime[i+1];
                    // move ith index value to (i+1)th index for comparison
                    // in next iteration
                    neededTime[i+1] = neededTime[i];
                }
            }
        }
        return time;
    }

    public static void main(String[] args) {

        String colors="abaac";
        int[]neededTime={1,2,3,4,5};

        System.out.println(minCost(colors,neededTime));
    }
}
