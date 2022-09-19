/**************************************************************
 Purpose/Description: Leader of element in an array of integers is found using stacks at time complexity O(n)
 Author’s Panther ID:  6334830
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 **************************************************************/

import java.util.Arrays;
import java.util.Stack;

public class Assignment1_Q4 {

    public static int leader(int[] A) {
        int count = 0; // special counter
        int currentLeader = -1;
        int leaderCount = 0;
        Stack<Integer> leaderStack = new Stack<>();

        for (int a : A) { // Puts all items in stack
            leaderStack.push(a);
        }


        while(!leaderStack.isEmpty()) { // As long as stack is not empty keep looping
            // This iteration of the stack checks if the current num is equal to the leaderNum if it is the count
            // will be + 1 if it is not the count will be - 1 when the count equals 0 set the current index value to that
            // num. By doing this if there is a num that appears more than half of the time the count for that num will always be > 0

            if (count == 0) {
                currentLeader = leaderStack.peek();
                leaderStack.pop();
                count = 1;
            } else if (currentLeader != leaderStack.peek()){
                currentLeader = leaderStack.peek();
                leaderStack.pop();
                count--;
            } else if (currentLeader == leaderStack.peek()) {
                leaderStack.pop();
                count++;
            }
        }

        for (int i = 0; i < A.length; i++) { // counting the current leader is the majority leader
            if (currentLeader == A[i]) {
                leaderCount++;
            }
        }

        if (leaderCount > A.length/2) { // Validating if there is a leader
            return currentLeader;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        int[] A = {23, 24, 67, 23, 67, 23, 45};

        System.out.println(leader(A));
    }

}
