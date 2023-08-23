class pair{
    char ch;
    int f;
    pair(char ch,int f){
        this.ch=ch;
        this.f=f;
    }
}
class Solution {
 
    
 

    
    public String reorganizeString(String s) {
    
       int map[]=new int[26];

    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map[ch-'a']++;
    }
    PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->(b.f-a.f)); // add based on high freq

    for(int i=0;i<26;i++){
        if (map[i]>0 ){
            // add elements in the pq in key and value pair
            pq.add(new pair((char)('a'+i), map[i]));
        }
    }
    StringBuilder ans=new StringBuilder();
    pair block=pq.poll();
    ans.append(block.ch);
    block.f--;
    while(pq.size()>0){
        pair temp=pq.poll();
        ans.append(temp.ch);
        temp.f--;
        if(block.f>0){
            pq.add(block);
        }
        block=temp;

    }
    if(block.f>0){
        return "";
    }
    return ans.toString();
    }
    
}