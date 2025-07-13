//Building tree using preorder implementation
//preorder,postorder,inorder traversal
// Level order traversal(BFS)
// Count the Number of Nodes
//sum of nodes
//height of the tree
//diameter of the tree O(N^2)&O(N)
//sum of nodes at k th level
import java.util.Queue;
import java.util.LinkedList;
import java.util.*;
public class BinTree {
   static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
       this.data=data;
       this.left=null;
       this.right=null;
        }
    }

    public static class BinaryTree{
        static int idx=-1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode= new Node(nodes[idx]);
            newnode.left=buildTree(nodes);
            newnode.right=buildTree(nodes);
            return newnode;
        }

    }
    public static void preorder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
             System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static void postorder(Node root){
        if(root==null){
             System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    return;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }


            }
        }
        public static int countNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftnodes=countNodes(root.left);
            int rightnodes=countNodes(root.right);
            return leftnodes+rightnodes+1;
        }

        public static int sumNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftsum=sumNodes(root.left);
            int rightsum=sumNodes(root.right);
            return leftsum+rightsum+root.data;
        }

        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
        public static int diam(Node root){
            if(root==null){
                return 0;
            }
            int diam1=diam(root.left);
            int diam2=diam(root.right);
            int diam3=height(root.left)+height(root.right)+1;
            return Math.max(diam3,Math.max(diam1,diam2));
        }

        public static class TreeInfo{
            int diam;
            int height;
            TreeInfo(int diam, int height){
                this.height=height;
                this.diam=diam;

            }
        }
        public static TreeInfo diam2(Node root){
            if(root==null){
                return new TreeInfo(0, 0);
            }
            TreeInfo left=diam2(root.left);
            TreeInfo right=diam2(root.right);
            int myHeight=Math.max(left.height,right.height)+1;

            int diam1=left.diam;
            int diam2=right.diam;
            int diam3=left.height+right.height+1;
            int mydiam=Math.max(diam3,Math.max(diam1,diam2));
            return new TreeInfo(mydiam, myHeight);

            

        }
       
        public static int levelsum(Node root, int k){
           int count=0;
           int sum=0;
           Node rem=null;
            Queue<Node>q=new LinkedList<>();
            if(root==null){
                return 0;
            }
            q.add(root);
            q.add(null);
            
            while(!q.isEmpty()){
                Node r= q.remove();
                if(r==null){
                    count++;
                    if(count==k-1){
                     
                     do{
                         rem=q.peek();
                         if(rem==null)break;
                        sum=sum+q.remove().data;
                         
                     }
                     while(rem!=null);
                     break;

                    }
                    if(!q.isEmpty()){
                       q.add(null);
                    }

                }else{
                    if(r.left!=null){
                        q.add(r.left);
                    }
                      if(r.right!=null){
                        q.add(r.right);
                    }

            }
        }
        return sum;
    }

        
    
    public static void main(String args[]){
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.buildTree(nodes);
        // System.out.println(root.data);
        // preorder(root);
        // System.out.println();
        // inorder(root);
        // System.out.println();
        // postorder(root);   
        // System.out.println(); 
        // levelorder(root);    
    //    System.out.println(countNodes(root)); 
    //    System.out.println(sumNodes(root));
    //    System.out.println(height(root));
    //    System.out.println(diam(root));
    //    System.out.println(diam2(root).diam);
       System.out.println(levelsum(root, 3));
    }
}
