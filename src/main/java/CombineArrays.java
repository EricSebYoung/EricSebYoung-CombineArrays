public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        int newArrLength = arr1Length + arr2Length;

        int[] combinedArrays = new int[newArrLength];

        for (int i = 0; i < arr1Length; i++) {
            combinedArrays[i] = arr1[i];
        }

        for (int i = 0; i < arr2Length; i++) {
            combinedArrays[i+arr1Length] = arr2[i];
        }

        return combinedArrays;
    }
}
