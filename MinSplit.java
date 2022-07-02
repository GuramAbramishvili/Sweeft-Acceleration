public class MinSplit {

    public static void main(String[] args) {
        System.out.println( minSplit(55));
    }

    public static int minSplit(int amount){
        int[] coins = {50, 20, 10, 5, 1};
        int count = 0;
        for (int coin : coins) {
            count += amount / coin;
            amount = Math.floorMod(amount, coin);
            if (amount == 0) {
                return count;
            }
        }

        return count;
    }
}
