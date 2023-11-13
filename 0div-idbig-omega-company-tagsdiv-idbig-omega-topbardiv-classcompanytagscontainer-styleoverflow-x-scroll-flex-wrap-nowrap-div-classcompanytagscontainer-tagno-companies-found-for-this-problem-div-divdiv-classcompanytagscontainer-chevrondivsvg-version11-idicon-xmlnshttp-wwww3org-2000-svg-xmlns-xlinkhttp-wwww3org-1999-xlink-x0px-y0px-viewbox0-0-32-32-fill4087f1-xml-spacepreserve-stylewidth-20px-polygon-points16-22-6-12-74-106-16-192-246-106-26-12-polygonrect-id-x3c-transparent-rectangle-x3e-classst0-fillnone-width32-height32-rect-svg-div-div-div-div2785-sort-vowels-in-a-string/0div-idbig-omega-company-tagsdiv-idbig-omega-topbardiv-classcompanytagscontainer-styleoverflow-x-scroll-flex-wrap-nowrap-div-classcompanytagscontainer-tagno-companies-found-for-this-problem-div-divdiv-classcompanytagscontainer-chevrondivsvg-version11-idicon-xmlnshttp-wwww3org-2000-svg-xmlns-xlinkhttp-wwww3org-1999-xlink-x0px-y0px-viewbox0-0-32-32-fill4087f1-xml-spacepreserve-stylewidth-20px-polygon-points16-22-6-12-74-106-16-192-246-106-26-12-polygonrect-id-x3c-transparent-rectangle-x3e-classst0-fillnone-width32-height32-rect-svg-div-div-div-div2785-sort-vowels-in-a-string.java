

public class Solution {
    public String sortVowelsPQ(String s) {
        PriorityQueue<Character> pq = new PriorityQueue<>( Comparator.comparingInt(ch -> (int)ch ) );
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(isVowel(ch))
                pq.offer(ch);
        }

        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                sb.append(pq.poll());
            }else{
                sb.append(ch);
            }

        }

        return sb.toString();
    }

    boolean isVowel( Character c ){
        return c == 'a' || c == 'e' || c == 'o'|| c == 'u'|| c == 'i'
                || c == 'A' || c == 'E' || c == 'O'|| c == 'U'|| c == 'I';
    }

    public String sortVowels(String s) {
        int[] hash = new int[257];

        for(char ch : s.toCharArray()){
            if(isVowel(ch))
                hash[ch]++;
        }

        int j = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                while(hash[j] == 0) j++;
                sb.append((char)j);
                hash[j]--;
            }else{
                sb.append(ch);
            }

        }

        return sb.toString();
    }

}