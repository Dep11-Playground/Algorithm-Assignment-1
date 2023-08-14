class Algo8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        System.out.print("numA ∩ numB: ");
        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]) {
                    System.out.print(numA[i] + " ");
                    break;
                }
            }
        }
        System.out.println();

        System.out.print("numA ∪ numB: ");
        for (int i = 0; i < numA.length; i++) {
            System.out.print(numA[i] + " ");
        }
        for (int j = 0; j < numB.length; j++) {
            boolean found = false;
            for (int i = 0; i < numA.length; i++) {
                if (numA[i] == numB[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(numB[j] + " ");
            }
        }
        System.out.println();

        System.out.print("numA \\ numB: ");
        for (int i = 0; i < numA.length; i++) {
            boolean found = false;
            for (int j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(numA[i] + " ");
            }
        }
        System.out.println();

        System.out.print("numB \\ numA: ");
        for (int j = 0; j < numB.length; j++) {
            boolean found = false;
            for (int i = 0; i < numA.length; i++) {
                if (numA[i] == numB[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(numB[j] + " ");
            }
        }
        System.out.println();

        System.out.print("numA △ numB: ");
        for (int i = 0; i < numA.length; i++) {
            boolean found = false;
            for (int j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(numA[i] + " ");
            }
        }
        for (int j = 0; j < numB.length; j++) {
            boolean found = false;
            for (int i = 0; i < numA.length; i++) {
                if (numA[i] == numB[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(numB[j] + " ");
            }
        }
        System.out.println();
    }
}
