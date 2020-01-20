package com.threenary.code;

import java.util.Arrays;

/**
 * In an old drawer of your desk, you have found some long-forgotten necklaces.
 * Each necklace comprises a number of beautiful, once shiny, beads.
 * Unfortunately, now they are not only dusty, but also tangled together.
 * You remember that the necklace with the most beads used to be your favorite.
 * Now, you are interested in finding the necklace with the largest number of beads, without having to untangle them all.
 * <p>
 * You have carefully photographed the necklaces and numbered all the beads with numbers in the range [0..N−1],
 * so that each number corresponds to exactly one bead.
 * Then, for each bead, you have found the number of the next bead following it.
 * <p>
 * This information is given as an array of integers, indexed by bead numbers, and the elements are the numbers of the following beads. Each bead number appears in the array exactly once.
 * <p>
 * Write a function that:
 * <b>Given</b> an array A consisting of N integers, as described above,
 * <p>
 * <b>Returns</b> returns the maximum number of beads in a single necklace. The function should return 0 if the array is empty.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 5
 * A[1] = 4
 * A[2] = 0
 * A[3] = 3
 * A[4] = 1
 * A[5] = 6
 * A[6] = 2
 * the function should return 4, because the longest necklace is the one containing four beads: numbers {0, 5, 6, 2}.
 */
public class CodilityTwo {

    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }

    public int solution(int[] A) {
        int result = 0;
        if (A.length > 0) {
            int[] beas = new int[A.length + 1];

            for (int i = 0; i < A.length; i++) {
                int counter = 1;
                int head = i;
                int tail = A[i];
                int current = 0;

                if (head != tail) {
                    if (!contains(beas, head) || head == 0) {
                        beas[current++] = head;
                        beas[current++] = tail;
                        while (head != tail) {
                            tail = A[tail];
                            beas[current++] = tail;
                            counter++;
                        }
                    }
                }
                if (counter > result) {
                    result = counter;
                }
            }
        }
        return result;
    }

}
