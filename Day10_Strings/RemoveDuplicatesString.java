class RemoveDuplicatesString {
    
    public static String removeDuplicates(String s) {
        boolean[] visited = new boolean[256];
        String result = "";
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(!visited[ch]) {
                visited[ch] = true;
                result += ch;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        String s = "programming";
        System.out.println(removeDuplicates(s));
    }
}