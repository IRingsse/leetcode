public class Question001 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(5));
        ListNode l2 = new ListNode(6,new ListNode(5,new ListNode(6,new ListNode(9))));
        ListNode l3 = new ListNode();
        ListNode l4 =new ListNode();
        l4 = l3;
        boolean signal = false;
        int l1num = 0, l2num = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                l1num = l1.val;
            } else {
                l1num = 0;
            }
            if (l2 != null) {
                l2num = l2.val;
            } else {
                l2num = 0;
            }
            if (signal){
                l3.val = (l1num + l2num + 1)%10;}
            else{
                l3.val= (l1num+l2num)%10;
            }
            if(signal&&l1num + l2num + 1>=10){
                signal=true;
            }else if(!signal&&l1num + l2num >=10){
                signal=true;
            }else{
                signal=false;
            }
            ListNode tem = new ListNode();
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            if(l1 != null || l2 != null){
                l3.next=tem;
                l3 = tem;}


        }
        if(signal){
            ListNode tem = new ListNode(1);
            l3.next=tem;
        }
        System.out.println(l4.toString());

    }

}