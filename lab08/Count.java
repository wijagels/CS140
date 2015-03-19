package lab08;

public class Count {
    private int count;

    /**
     * Initialize the count field to the passed in count
     */
    public Count(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    /**
     * Increment the count field by 1
    */
    public void add() {
        this.count++;
    }
}