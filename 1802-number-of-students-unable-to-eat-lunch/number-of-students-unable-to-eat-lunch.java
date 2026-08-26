class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
     int[] count =new int[2];
     for(int s:students){
        count[s]++;
     }
     for(int sa: sandwiches){
        if(count[sa]==0){
            break;
        }
        count[sa]--;
     }
     return count[0]+count[1];
     
 }
}