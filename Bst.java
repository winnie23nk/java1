import java.util.*;
class Bst{
    //Bst 's left subtree values are always less than the root value
    //Bst 's right subtree values are always greater than the root value
    // the subtrees are again Bst
    //Build a BST
    //Inorder traversal of Bst gives a sorted order
    //searching for an element gives a complexity of O(h) instead of O(n)
    //deletion of node
    // For deleting a Node
   //1)If we delete a node whose chidren are null, just delete that node, replace that node by null and attach to parent 
   //2)If we delete a node with one child, delete that node and attach its children to its parent
   //3)If we delete a node with two children, replace that node by its inorder successor and then that inorder successor node
   // can be deleted by any of the above 2 steps as it can have either one or two children.
    //printing the nodes in the tree between the range X and Y including(X,Y)
    //print all the paths from root to leaf
    
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
        }
    }
   public static Node buildBst(Node root,int val){
    if(root==null){
        root= new Node(val);
        return root;
    }
    if(val<root.val){
        root.left=buildBst(root.left,val);
    }
    else{
        root.right=buildBst(root.right,val);
    }
    return root;
   }

   public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.val);
    inorder(root.right);
   }
   public static boolean search(Node root,int k){
    if(root==null){
        return false;
    }
    if(root.val==k){
        return true;
    }
    if(k>root.val){
        return search(root.right,k);
    }
    else{
        return search(root.left,k);
    }
    
   }

   public static Node delete(Node root,int k){
    if(root.val>k){
        root.left=delete(root.left,k);
    }
    else if(root.val<k){
        root.right=delete(root.right,k);
    }
    else{
        //root.val==k

        //case 1)
        if(root.left==null&&root.right==null){
            return null;
        }
        //case 2)
        if(root.left==null){
            return root.right;
        }
        if(root.right==null){
            return root.left;
        }
        else{
           Node is=inorderSuccesor(root.right);
            root.val=is.val;
            root.right=delete(root.right,is.val);
        }
    }
    return root;
   }
   public static Node inorderSuccesor(Node root){
    while(root.left!=null){
        root=root.left;
    }
    return root;
   }

   public static void printInRange(Node root,int x,int y){
    if(root==null){
        return;
    }
    if(x<=root.val&&root.val<=y){
        
        printInRange(root.left,x,y);
        
         System.out.print(root.val);
        
        printInRange(root.right,x,y);
        
    }
    if(root.val<x){
        printInRange(root.right,x,y);
    }
    if(root.val>y){
        printInRange(root.left,x,y);
    }

   }
   public static void rootoleaf(Node root,ArrayList<Integer>arr){
    
    if(root==null){
        return;
    }
     arr.add(root.val);
    if(root.left==null&&root.right==null){
        System.out.println(arr);
    }
    else{
         rootoleaf(root.left,arr);
         rootoleaf(root.right,arr);
    }
    arr.remove(arr.size()-1);
    
    
    
    
   }
    public static void main(String args[]){
        int arr[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<arr.length;i++){
             root= buildBst(root,arr[i]);
        }
        System.out.println(root.val);
        inorder(root);
        // System.out.println();
        // System.out.println(search(root,5));
        System.out.println();
        // delete(root,5);
        // inorder(root);
        //printInRange(root, 2, 4);
        System.out.println();
        ArrayList<Integer>array=new ArrayList<>();
        rootoleaf(root,array);
    }
}