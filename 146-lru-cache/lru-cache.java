
class LRUCache {
    List<int[]> lst;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        lst = new ArrayList<>();
    }

    public int get(int key) {
        for (int i = 0; i < lst.size(); i++) {
            if (key == lst.get(i)[0]) {
                int[] entry = lst.remove(i);
                lst.add(entry);
                return entry[1];
            }
        }
        return -1;

    }

    public void put(int key, int value) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i)[0] == key) {
                lst.remove(i);
                break;
            }
        }
        if (capacity == lst.size()) {
            lst.remove(0);
        }
        lst.add(new int[] { key, value });

    }
}
