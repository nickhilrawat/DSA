package coin_change;

public class CoinChangeRecursion{
    static void main() {
        int amount = 5;
        int coins[] = {1,2,5};
        // as starting with the first coin making index as 0
        System.out.println(solve(amount, coins, 0));
    }

    private static int solve(int amount, int[] coins, int i) {
        if(amount == 0){
            return 1;
        }
        if(i >= coins.length){
            return 0;
        }
        if(amount < 0){
            return 0;
        }
        // index keeping unchanged as unlimited suppply of coins and it can be re-used in the
        // next iteration
        int includeCoin = solve(amount - coins[i], coins, i);
        // index increased as the coin is to be excluded
        int excludeCoin = solve(amount, coins, i+1);
        return includeCoin + excludeCoin;
    }
}