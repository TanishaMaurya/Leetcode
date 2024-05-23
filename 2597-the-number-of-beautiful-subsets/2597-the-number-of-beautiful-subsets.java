class Solution {
    
    int count = 0;
    List<List<Integer>> list;
    public int beautifulSubsets(int[] nums, int k) 
    {
        Arrays.sort(nums);
        list = new ArrayList<>();
        backTrack(new ArrayList<>(), 0, nums, k);
        return count - 1;

    }
    private void backTrack(List<Integer> element ,int i, int[] nums, int k)
    {
        count++;
        for(int j=i; j<nums.length; j++)
        {
            
            if( !element.contains(nums[j] - k ) )
            {
                element.add(nums[j]);
                backTrack(element, j+1, nums, k);
                element.remove(element.size() -1);
            }
        }
    }
    }
