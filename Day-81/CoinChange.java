
import java.util.Arrays;

public class CoinChange {

    static int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        // A value larger than any possible answer
        int impossible = amount + 1;

        Arrays.fill(dp, impossible);

        // Zero coins are needed to make amount zero
        dp[0] = 0;

        for (int current = 1; current <= amount; current++) {

            for (int coin : coins) {

                if (coin <= current) {

                    dp[current] = Math.min(
                        dp[current],
                        dp[current - coin] + 1
                    );
                }
            }
        }

        if (dp[amount] == impossible) {
            return -1;
        }

        return dp[amount];
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 11;

        int result = coinChange(coins, amount);

        System.out.println("Minimum coins: " + result);
    }
}
