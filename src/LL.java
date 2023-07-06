public class LL {
    Node head;
    static class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next=null;
        }

    }
    //add operation first and last;
    public void addFirst(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    //add last;
    public void addlast(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        Node currnode = head;
        while(currnode.next!=null){
            currnode = currnode.next;
        }
        currnode.next=newnode;
    }
    public void  printlist(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currnode = head;
        while(currnode !=null){
            System.out.print(currnode.data + "->");
            currnode = currnode.next;
        }
     System.out.print("NULL");
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("This list is empty");
            return;
        }
        head = head.next;
    }
    public void deletelast(){
        if(head==null){
            System.out.println("This list is empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node secondlast= head;
        Node lastnode = head.next;
        while(lastnode.next != null){
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }

        secondlast.next=null;
    }

    public static void main(String args[]){
        LL list  = new LL();
        list.addFirst("a");
        list.addFirst("hello");
        list.printlist();
        System.out.println( );
        list.addlast("los");
        list.printlist();
        list.addFirst("world" );
        System.out.println( );

        list.printlist();
        list.deletefirst();
        System.out.println();
        list.printlist();
        list.deletelast();
        System.out.println();
        list.printlist();



    }
}
