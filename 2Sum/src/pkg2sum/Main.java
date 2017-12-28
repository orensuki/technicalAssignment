package pkg2sum;

/**
 *
 * @author OreN
 */
public class Main {

    public static int[] findTwoSum(int[] numbers, int target) {
    if (numbers == null) {
        return null;
    }

    Integer[] complements = new Integer[target];

    for (int i = 0; i < numbers.length; i++) {
        if (complements[numbers[i]] != null) {
            return new int[]{complements[numbers[i]], i};
        }

        complements[target - numbers[i]] = i;
    }

    return null;
}
 
   public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println("indices[0]=1" + "\nindices[1]=3" + "\nindices[2]=5" + "\nindices[3]=7" + "\nindices[4]=9");
        System.out.println("The answer is from indices:");
        System.out.println(indices[0] + " " + indices[1]);
    }
    
}
