class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        
        String[] zigzag = new String[numRows];
        
        boolean down = true;
        int step = 0;
        for(char c : s.toCharArray()){
            zigzag[step] = zigzag[step] == null ? String.valueOf(c) : zigzag[step] + String.valueOf(c);
            
            if(down){
                step++;
            }else{
                step--;
            }
            
            if(step == 0){
                down = true;
            }else if(step == numRows - 1){
                down = false;
            }
        }
        
        StringBuffer sb = new StringBuffer();
        for(String z  : zigzag){
            if(z != null){
                sb.append(z);
            }
            
        }
        
        return sb.toString();
    }
}