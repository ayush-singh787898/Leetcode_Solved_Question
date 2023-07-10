class SmallestInfiniteSet {
    SortedSet<Integer>s=new TreeSet<>();
        
    public SmallestInfiniteSet() {
        for(int i=1;i<10001;i++){
            s.add(i);
        }
        
    }
    public int popSmallest() {
        int rn=s.first();
        s.remove(rn);
        return rn;
        
    }

    public void addBack(int num) {
        s.add(num);
    }
}

