public class MinMaxChecker {
    private int arrSize = 50;
    private int arrToCheck[] = new int[arrSize];

    public void setArrToCheck(int arrToCheck[]){
        this.arrToCheck = arrToCheck;
    }

    public void clearArr(){
        this.arrToCheck = null;
    }

    public int MinCheck() {
        int min = arrToCheck[0];
        for(int i=1;i<arrToCheck.length;i++){
            if(arrToCheck[i] < min){
                min = arrToCheck[i];
            }
        }
        return min;
    }

    public int MaxCheck() {
        int max = arrToCheck[0];
        for(int i=1;i < arrToCheck.length;i++){
            if(arrToCheck[i] > max){
                max = arrToCheck[i];
            }
        }
        return max;
    }
}
