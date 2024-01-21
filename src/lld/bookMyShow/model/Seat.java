package lld.bookMyShow.model;

public class Seat {
    private int seatId;
    private boolean isOccupied;
    private int price;

    public Seat(int seatId, boolean isOccupied, int price) {
        this.seatId = seatId;
        this.isOccupied = isOccupied;
        this.price = price;
    }

    public Seat clone(int price) {
        return new Seat(this.seatId, this.isOccupied, price);
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
