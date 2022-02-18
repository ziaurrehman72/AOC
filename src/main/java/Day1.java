public class Day1 {
    public int returnIncreasedCount(String inputs[]){
        int res = 0;
        for(int i=0;i<inputs.length-1;i++){
            int first = Integer.parseInt(inputs[i].trim());
            int second = Integer.parseInt(inputs[i+1]);
            if(first < second){
                res++;
            }
        }
        return res;
    }
}
