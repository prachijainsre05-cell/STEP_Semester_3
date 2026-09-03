class InventoryBalancer {

    void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0, totalB = 0;
        int max = sectionA[0];
        String section = "A";
        int index = 0;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];

            if (sectionA[i] > max) {
                max = sectionA[i];
                section = "A";
                index = i;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];

            if (sectionB[i] > max) {
                max = sectionB[i];
                section = "B";
                index = i;
            }
        }

        if (totalA == totalB)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

        System.out.println("Highest Quantity: " + max +
                " (Section " + section + ", Item " + (index + 1) + ")");
    }

    public static void main(String[] args) {
        int[] A = {20, 15, 30};
        int[] B = {25, 10, 30};

        InventoryBalancer obj = new InventoryBalancer();
        obj.analyzeInventory(A, B);
    }
}