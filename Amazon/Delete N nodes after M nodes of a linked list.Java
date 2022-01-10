class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        Node temp = head;
            int mul = 1, count =1;
            int x = N;
            
            while(temp != null && temp.next != null){
                if(count == M*mul){
                    Node prev = temp;
                    while(x > 0 && temp.next != null){
                        temp = temp.next;
                        x--;
                    }
                    prev.next = temp.next;
                    mul++;
                    x = N;
                }
                count++;
                temp = temp.next;
            }
    }
}
