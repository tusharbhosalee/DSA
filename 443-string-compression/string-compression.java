class Solution {
    public int compress(char[] chars) {
        int writeIndex = 0; 
        int readIndex = 0;  
        
        while (readIndex < chars.length) {
            char currentChar = chars[readIndex];
            int count = 0;
            
            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                readIndex++;
                count++;
            }
            
            chars[writeIndex++] = currentChar;
            
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (int i = 0; i < countStr.length(); i++) {
                    chars[writeIndex++] = countStr.charAt(i);
                }
            }
        }
        
        return writeIndex; 
    }
}