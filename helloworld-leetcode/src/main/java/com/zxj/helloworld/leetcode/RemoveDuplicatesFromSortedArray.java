package com.zxj.helloworld.leetcode;

import java.util.*;

/**
 * leetcode 第217题
 * url：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * 删除排序数组中的重复项:
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] intSortedArray = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length = removeDuplicates(intSortedArray);

        int[] intUnsortedArray = {8, 8, 0, 5, 5, 5, 0, 3, 1, 1, 2, 2, 3, 0, 4};
        int length2 = removeDuplicatesFromUnsortedArray(intUnsortedArray);
    }

    /**
     *
     * @param intArray
     * @return
     */
    private static int removeDuplicatesFromUnsortedArray(int[] intArray) {

        //region    数组可以不排序，但是时间和空间复杂度太高了
        Map<Integer, Integer> uniqueMap = new HashMap<>();
        for (int num : intArray) {
            uniqueMap.put(num, 1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : uniqueMap.entrySet()) {
            list.add(entry.getKey());
        }
        int[] newArray = new int[list.size()];
        int index = 0;
        for (Integer item : list) {
            newArray[index] = item;
            System.out.println(newArray[index]);
            index++;
        }
        //endregion

        return newArray.length;
    }

    /**
     * 双指针法
     * <p>
     * 数组完成排序后，我们可以放置两个指针 i 和 j，其中 i 是慢指针，而 j 是快指针。只要 nums[i] = nums[j]，我们就增加 j 以跳过重复项。
     * 当我们遇到 nums[j] != nums[i]时，跳过重复项的运行已经结束，因此我们必须把它（nums[j]）的值复制到 nums[i + 1]。然后递增 i，接着我们将再次重复相同的过程，直到 j 到达数组的末尾为止。
     * <p>
     * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/solution/shan-chu-pai-xu-shu-zu-zhong-de-zhong-fu-xiang-by-/
     *
     * @param intArray
     * @return
     */
    private static int removeDuplicates(int[] intArray) {
        if (intArray.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < intArray.length; j++) {
            if (intArray[i] == intArray[j]) {
                continue;
            } else {
                i++;
                intArray[i] = intArray[j];
            }
        }
        for (int num = 0; num <= i; num++) {
            System.out.println(intArray[num]);
        }

        return i + 1;
    }
}
