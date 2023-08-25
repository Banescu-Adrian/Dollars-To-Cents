class CoinCounter {
    public int quarter = 0;
    public int dime = 0;
    public int nickel = 0;
    public int penny = 0;

    public CoinCounter addQuarter(int quantity) {
        this.quarter += quantity;
        return this;
    }

    public CoinCounter addDime(int quantity) {
        this.dime += quantity;
        return this;
    }

    public CoinCounter addNickel(int quantity) {
        this.nickel += quantity;
        return this;
    }

    public CoinCounter addPenny(int quantity) {
        this.penny += quantity;
        return this;
    }

    public void printCoins() {
        System.out.println("Quarters: " + this.quarter);
        System.out.println("Dimes: " + this.dime);
        System.out.println("Nickel: " + this.nickel);
        System.out.println("Pennies: " + this.penny);
    }
}
