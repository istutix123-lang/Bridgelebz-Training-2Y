class LC1876 {
    public static void main(String[] args){
       String s = "xyzzaz";
        int count = 0;
        for(int i=0;i<=s.length()-3;i++){
            char j = s.charAt(i);
            char h = s.charAt(i+1);
            char t = s.charAt(i+2);

            if(j!=h && h!=t && j!=t){
                count++;
            }
        }
        System.out.println(count);
    }
}
