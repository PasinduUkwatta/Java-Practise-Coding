public class MyLinkedList implements NodeList{
    private ListItem root=null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
       if(this.root==null){
           this.root=newItem;
           return true;
       }

       ListItem currentitem =this.root;
       while (currentitem!=null){
           int comparison =currentitem.compareTo(newItem);
           if(comparison<0){
               if(currentitem.next()!=null){
                   currentitem=currentitem.next();
               }else {
                   currentitem.setNext(newItem);
                   newItem.setPrevious(currentitem);
                   return true;
               }
           }else if(comparison>0){
               if(currentitem.previous()!=null){
                   currentitem.previous().setNext(newItem);
                   newItem.setPrevious(currentitem.previous());
                   newItem.setNext(currentitem);
                   currentitem.setPrevious(newItem);
               }
           }
           else {
               newItem.setNext(this.root);
               this.root.setPrevious(newItem);
               this.root=newItem;
           }
       }

       return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
