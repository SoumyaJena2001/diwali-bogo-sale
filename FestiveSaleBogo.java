import java.util.*;

public class FestiveSaleProcessor {

    public static void processDiwaliDiscount(List<Integer> productRates) {
        
        Collections.sort(productRates, Collections.reverseOrder());

        List<Integer> toBePaid = new ArrayList<>();
        List<Integer> freebies = new ArrayList<>();

        for (int idx = 0; idx < productRates.size(); idx++) {
            toBePaid.add(productRates.get(idx));

            if (idx + 1 < productRates.size()) {
                freebies.add(productRates.get(idx + 1));
                idx++;
            }
        }

        System.out.println("Items to Purchase: " + toBePaid);
        System.out.println("Free Bonus Items: " + freebies);
    }

    public static void main(String[] args) {
        List<Integer> sampleList1 = Arrays.asList(10, 20, 30, 40, 50, 60);
        System.out.println("Case 1:");
        processDiwaliDiscount(new ArrayList<>(sampleList1));

        System.out.println("\nCase 2:");
        List<Integer> sampleList2 = Arrays.asList(10, 20, 30, 40, 50, 50, 60);
        processDiwaliDiscount(new ArrayList<>(sampleList2));
    }
}
