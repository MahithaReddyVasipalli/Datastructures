Import java.util.Scanner;
Class MyNode{
    
    int data;
    MyNode prev;
    MyNode next;
}
Class MyLinkedList{
    Scanner s=new Scanner(System.in);
    MyNode head,last;
    MyLinkedList(){
               
        head=null;
        last=null;
    }
void create(int n){
    MyNode temp;
    for(int i=0;i<n;i++){
        temp =new MyNode();
        System.out.println("enter the data")
        temp.data=s.nextInt();
        temp.next=null;
        if(head==null){
                 
            head=last=temp;
            head.prev=null;
        }
        else{
            last.next=temp;
            temp.prev=last;
            last=temp;
        }   
    }
}
void insertB(){
    MyNode temp=new MyNode ();
    System.out.println("enter data");          
    temp.data=s.nextInt();
    temp.prev=null;
    temp.next=head;
    head.prev=temp;
    head=temp;
}
Class DoubleLinkedListDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MyLinkedList l=new MyLinkedList();
        System.out.println("enter the size of the list");
        int ch;
        l.create(sc.nextInt());
        While(true){
            System.out.println("enter your choice");
            Ch=sc.nextInt();
            Switch(ch){
                case 1:l.insertB();
                break;
                default:return
           }
        }
    }
}
