package AlgorithmDSA.GreedyAlgorithm;

public class UseMergeSortFractionalKanpsack {

    static class Item{
        int weight;
        int value;
        double ratio;

        public Item(int weight, int value){
            this.weight = weight;
            this.value = value;
            this.ratio = (double) value/weight;
        }
    }
    public static void mergeSort(Item[]items){
        int n= items.length;
        if (n>1){
            int mid= n/2;
            Item[]left = new Item[mid];
            Item[]right = new Item[n-mid];
            for (int i = 0; i <mid ; i++) {
                left[i] = items[i];
            }
            for (int i = mid; i < n; i++) {
                right[i-mid] = items[i];
            }
            mergeSort(left);
            mergeSort(right);
            merge(items,left,right);
        }
    }
    public static void merge(Item[]items, Item[]left, Item[]right){
        int i = 0, j = 0, k = 0;
        while (i<left.length && j< right.length){
            if (left[i].ratio> right[j].ratio){
                items[k++] = left[i++];
            }else {
                items[k++] = right[j++];
            }
        }
        while (i< left.length){
            items[k++] = left[i++];
        }
        while (j< right.length){
            items[k++] = right[j++];
        }
    }
    public static double getMaxValue(int[] weight, int[] value, int capacity){
        int remainingCapacity =capacity;
        double totalValue =0;
        // create the array
        int n = weight.length;
        Item[]items = new Item[n];
        for (int i = 0; i<n; i++){
            items[i] = new Item(weight[i],value[i]);// the object Item is created with arguments
            // weight and value in the constructor
        }

        //sort the array
        mergeSort(items);

        // get the totalValue
        for (Item item:items) {
            if (remainingCapacity<=0) break;

            int weightTaken = Math.min(item.weight, remainingCapacity);
            totalValue += (double) weightTaken/ item.weight* item.value;
            remainingCapacity = remainingCapacity-weightTaken;
        }
        return totalValue;
    }

    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;
        double maxValue = getMaxValue(weights,values, capacity);
        System.out.println(maxValue);
    }
}
