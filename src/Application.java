import java.math.BigDecimal;
import java.util.Scanner;

class Application
{
    public static void main(String[] args) {
        System.out.println("How many dollars do you want to convert?");
        Scanner input = new Scanner(System.in);

        //  Read user input
        BigDecimal dollarInput = BigDecimal.valueOf(Double.parseDouble(input.nextLine()));

        System.out.println("By Division");
        CoinCounter coinCounter = new CoinCounter();
        CoinCalculator coinCalculator = new CoinCalculator(dollarInput, coinCounter);
        coinCalculator.calculateByDivision();
        coinCalculator.print();

        System.out.println("By Increase");
        CoinCounter coinCounterTwo = new CoinCounter();
        CoinCalculator coinCalculatorByIncrease = new CoinCalculator(dollarInput, coinCounterTwo);
        coinCalculatorByIncrease.calculateByIncrease();
        coinCalculatorByIncrease.print();
    }
}

