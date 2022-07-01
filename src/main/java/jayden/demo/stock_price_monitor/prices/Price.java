package jayden.demo.stock_price_monitor.prices;

import java.util.Date;

public class Price {

    private int id;
    private int tickerId;
    private double amount;
    private Date timestamp;

    public Price(int tickerId, double amount) {
        this.id = -1;
        this.tickerId = tickerId;
        this.amount = amount;
        this.timestamp = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTickerId() {
        return tickerId;
    }

    public void setTickerId(int tickerId) {
        this.tickerId = tickerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
