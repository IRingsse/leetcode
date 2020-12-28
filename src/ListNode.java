public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        try {
            ListNode tem = this.next;
            String re = String.valueOf(this.val);
            do {
                re = re + "->" + tem.val;
                tem = tem.next;
            } while (tem != null);
            return re;
        } catch (Exception e) {
            return "";
        }finally {

        }
        }
    }


