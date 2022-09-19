/**************************************************************
 Purpose/Description: Inputing a sorted array within the binarySearch() it looks for the designated target using binary
 search and counts how many of the target there are.
 Author’s Panther ID:  6334830
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 **************************************************************/

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment1_Q2 {

    public static void binarySearch(int[] searchArray, int target) {
        int low = 0;
        int high = searchArray.length - 1;

        int firstOccurrence = -1, lastOccurrence = -1;

        int count = 0;
        // First occurrence binary search
        while (low <= high) {
            int mid = (low + high)/2;

            if (searchArray[mid] == target) {
                firstOccurrence = mid;
                high = mid - 1;
            } else if (searchArray[mid] > target) {
                high = mid - 1;
            } else if (searchArray[mid] < target) {
                low = mid + 1;
            }
        }

        low = 0;
        high = searchArray.length - 1;

        // Last occurrence binary search
        while (low <= high) {
            int mid = (low + high)/2;

            if (searchArray[mid] == target) {
                lastOccurrence = mid;
                low = mid + 1;
            } else if (searchArray[mid] > target) {
                high = mid - 1;
            } else if (searchArray[mid] < target) {
                low = mid + 1;
            }
        }

        if (firstOccurrence != -1 && lastOccurrence != -1) { // As long as there is a duplicate
            count = lastOccurrence - firstOccurrence + 1; // counts how many of target there are
            System.out.println("Total Duplicates: " + count);
        }
        System.out.println("No duplicates found");
    }

    public static void main(String[] args) {
        int[] a = {-1,2,3,5,6,6,6,9,10,11,12,13,14,15,16,17};

        int target = 0;

        binarySearch(a, target);
    }
}
