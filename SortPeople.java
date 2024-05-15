class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> temp = new HashMap<>();

        for(int i=0; i<heights.length; i++){
            temp.put(heights[i], names[i]);
        }
        Arrays.sort(heights);

        int p = 0;
        int q = names.length-1;

        while(p < q){
            int a = heights[p];
            heights[p] = heights[q];
            heights[q] = a;
            p++;
            q--;
        }
        String[] out = new String[names.length];
        for(int i=0; i<names.length; i++){
            out[i] = temp.get(heights[i]);
        }
        return out;
    }
}
