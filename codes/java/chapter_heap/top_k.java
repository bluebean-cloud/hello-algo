/**
 * File: top_k.java
 * Created Time: 2023-06-12
 * Author: krahets (krahets@163.com)
 */

package chapter_heap;

import utils.*;
import java.util.*;

public class top_k {
    /* ���ڶѲ������������� k ��Ԫ�� */
    static Queue<Integer> topKHeap(int[] nums, int k) {
        // ��ʼ��С����
        Queue<Integer> heap = new PriorityQueue<Integer>();
        // �������ǰ k ��Ԫ�����
        for (int i = 0; i < k; i++) {
            heap.offer(nums[i]);
        }
        // �ӵ� k+1 ��Ԫ�ؿ�ʼ�����ֶѵĳ���Ϊ k
        for (int i = k; i < nums.length; i++) {
            // ����ǰԪ�ش��ڶѶ�Ԫ�أ��򽫶Ѷ�Ԫ�س��ѡ���ǰԪ�����
            if (nums[i] > heap.peek()) {
                heap.poll();
                heap.offer(nums[i]);
            }
        }
        return heap;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 6, 3, 2 };
        int k = 3;

        Queue<Integer> res = topKHeap(nums, k);
        System.out.println("���� " + k + " ��Ԫ��Ϊ");
        PrintUtil.printHeap(res);
    }
}
