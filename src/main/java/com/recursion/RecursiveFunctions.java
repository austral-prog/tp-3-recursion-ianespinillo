package com.recursion;

import java.util.List;

public class RecursiveFunctions {

    public static int recursiveIndexOf(List<String> list, String target) {
        return recursiveIndexOfByIndex(list, target, 0);
    }

    public static int recursiveIndexOfByIndex(List<String> list, String target, int index) {
        if (target.equals(list.get(index))) {
            return index;
        }
        if (list.size() - 1 == index) {
            return -1;
        }
        return recursiveIndexOfByIndex(list, target, ++index);
    }

    public static int recursiveIndexOfEmpty(List<String> list) {
        return recursiveIndexOfEmpty(list, 0);
    }

    public static int recursiveIndexOfEmpty(List<String> list, int idx) {
        if (list.get(idx).isEmpty()) {
            return idx;
        }
        if (idx == list.size() - 1) {
            return -1;
        }
        return recursiveIndexOfEmpty(list, ++idx);
    }

    public static int recursivePut(String target, List<String> list) {
        return recursivePut(target, list, 0);
    }

    public static int recursivePut(String target, List<String> list, int idx) {
        if (list.get(idx).isEmpty()) {
            list.set(idx, target);
            return idx;
        }
        if (list.size()-1== idx){
            return -1;
        }
        return recursivePut(target, list, ++idx);

    }

    public static int recursiveRemove(List<String> list, String target) {
        return recursiveRemove(list, target, 0, 0);
    }

    public static int recursiveRemove(List<String> list, String target, int idx, int deleted) {
        if (list.get(idx).equals(target)) {
            deleted += 1;
        }
        if (list.size() - 1 == idx) {
            return deleted;
        }
        return recursiveRemove(list, target, ++idx, deleted);
    }

    public static int recursiveSum(List<Integer> list) {
        int total = 0;
        if (list.isEmpty()) {
            return total;
        }
        total += list.getFirst();
        return total + recursiveSum(list.subList(1, list.size()));
    }

    public static int recursiveFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    public static int recursivePow(int base, int exponent) {
        if(exponent==0){
            return 1;
        }
        return base * recursivePow(base, exponent-1);
    }

    public static int recursiveFibonacci(int n) {
        if(n<=1){
            return n;
        }
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }

    public static boolean recursivePalindrome(String word) {
        return recursivePalindrome(word, 0, word.length()-1);
    }
    public static boolean recursivePalindrome(String word, int i, int j) {
        if(word.charAt(i) != word.charAt(j)){
            return false;
        }
        if(i==j){
            return true;
        }
        return recursivePalindrome(word, ++i, --j);
    }


}
