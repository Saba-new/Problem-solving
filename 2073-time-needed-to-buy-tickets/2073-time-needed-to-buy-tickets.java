class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList();
        int n=tickets.length;
        int time=0;

        for(int i=0;i<n;i++){
            q.offer(i);     
        }
        while(tickets[k]>0){
            int person=q.poll();
            
            tickets[person]--;
           time++;
            if(tickets[person]>0){
                 q.offer(person);
               
            }
             
        }
        return time;
        
    }
}