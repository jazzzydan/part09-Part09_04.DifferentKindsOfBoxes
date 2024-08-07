import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private final int capacity;
    private final ArrayList<Item> items;
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if ((item.getWeight() + weightOfItems()) <= this.capacity) {
            this.items.add(item);
        }
    }

    private int weightOfItems() {
        int boxWeight = 0;
        for (Item itemInBox : this.items) {
            boxWeight += itemInBox.getWeight();
        }
        return boxWeight;
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
