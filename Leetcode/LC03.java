class LC03 {
    public static void main(String[] args){
    String  s = "abcabcbb";
        int [] arr = new int[128];
        int maxLength=0, left=0;
        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            left = Math.max(left, arr[ch]);
            arr[ch] = right + 1;
            maxLength = Math.max(maxLength,right - left + 1);
        }
        System.out.println(maxLength);;
    }
}
