package DP;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 */
public class HouseRObber {

    public int rob(int[] nums) {
        int cMax=0, pMax=0, ppMax=0;
        for(int i=0; i<nums.length; i++){
            cMax = Math.max(pMax, nums[i]+ppMax);
            ppMax=pMax;
            pMax=cMax;
        }
        return cMax;
    }}
