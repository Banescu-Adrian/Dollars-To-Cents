import java.math.BigDecimal;

class CoinCalculator {
    public BigDecimal dollar;
    public CoinCounter coinCounter;

    CoinCalculator(BigDecimal dollar, CoinCounter coinCounter) {
        this.dollar = dollar;
        this.coinCounter = coinCounter;
    }

    public void calculateByIncrease() {
        for (Coin coin : Coin.values()) {
            while (this.dollar.subtract(coin.getCoinValue()).doubleValue() >= 0) {
                if (this.dollar.subtract(coin.getCoinValue()).doubleValue() >= 0) {
                    switch (coin) {
                        case QUARTER -> coinCounter.addQuarter(1);
                        case DIME -> coinCounter.addDime(1);
                        case NICKEL -> coinCounter.addNickel(1);
                        case PENNY -> coinCounter.addPenny(1);
                    }

                    this.dollar = this.dollar.subtract(coin.getCoinValue());
                } else {
                    break;
                }
            }
        }
    }

    public void calculateByDivision() {
        for (Coin coin : Coin.values()) {
            if (this.dollar.subtract(coin.getCoinValue()).doubleValue() >= 0) {
                int coins = this.dollar.divide(coin.getCoinValue()).intValue();
                this.dollar = this.dollar.subtract(coin.getCoinValue().multiply(BigDecimal.valueOf(coins)));

                switch (coin) {
                    case QUARTER -> coinCounter.addQuarter(coins);
                    case DIME -> coinCounter.addDime(coins);
                    case NICKEL -> coinCounter.addNickel(coins);
                    case PENNY -> coinCounter.addPenny(coins);
                }
            }
        }
    }

    public void print() {
        coinCounter.printCoins();
    }
}
