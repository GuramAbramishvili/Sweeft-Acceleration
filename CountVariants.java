public class CountVariants {

    public static void main(String[] args) {
        System.out.println(countVariants(4));

    }
    public static Integer countVariants(int stearsCount){
        if(stearsCount <= 2)
            return stearsCount;
        else
            return countVariants(stearsCount-1) + countVariants(stearsCount-2);
    }
}
