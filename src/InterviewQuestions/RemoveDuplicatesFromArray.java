package InterviewQuestions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesFromArray {

    /*
    7..Given an unsorted array nums, remove the duplicates

 Example:

  nums = [3,1,2,1,2,3]

//  output = [3,1,2]

//  output = [1,2,3]
     */

    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 1, 2, 3};

        ArrayList<Integer> noDup = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            if (!noDup.contains(nums[i])) {
                noDup.add(nums[i]);
            }
        }
        Collections.sort(noDup);
        System.out.println(noDup);

    }
}
/*
        List<Integer> unique = noDup.stream().distinct().collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());
        System.out.println(unique);

 */