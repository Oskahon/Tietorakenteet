/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tehtava8;

/**
 *
 * @author Oskahon
 */
public class BinaryTree {

    private Node root;
    
    public BinaryTree(String rootValue) {
        root = new Node(rootValue);
    }
    public BinaryTree(){
        root = null;
    }
    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    } */

    public void insert(String aData){
    	if (root == null) {
    		root = new Node(aData);
    	} else {
    		int compare = root.getData().compareTo(aData);
    		if (compare > 0) {
    			if (root.left() == null) {
    				root.setLeft(new BinaryTree(aData));
    			} else {
    				root.left().insert(aData);
    			}
    		} else if (compare < 0) {
    			if (root.right() == null) {
    				root.setRight(new BinaryTree(aData));
    			} else {
    				root.right().insert(aData);
    			}
    		}
    	}
    }
    
    public BinaryTree find(String aData){
    	if (root != null) {
    		if (aData.equals(root.getData())) {
    			return this;
    		} else {
    			int compare = root.getData().compareTo(aData);
    			if (compare > 0 && root.left() != null) {
    				return root.left().find(aData);
    			} else if (compare < 0 && root.right()!=null) {
    				return root.right().find(aData);
    			}
    		}
    	}
    	return null;
    }
    

    public boolean removeNode(String aData) {
    	
    	if (root!=null) {
    		if (root.getData().equals(aData)){
//    			System.out.println("puun root täsmää");
    			if (root.left()==null && root.right()==null) {
//    				System.out.println("ei alipuita");
    				root=null;
    				return true;
    			} else if (root.left()!=null&&root.right()==null){
//    				System.out.println("vasen alipuu");
    				root = root.left().getRoot();
    				return true;
    			} else if (root.left()==null&&root.right()!=null) {
//    				System.out.println("oikea alipuu");
    				root = root.right().getRoot();
    				return true;
    			} else {
//    				System.out.println("molemmat alipuut");
    				String minNode = root.right().getMinNode();
    				System.out.println(minNode);
    				root.right().removeNode(minNode);
    				root.setData(minNode);
    				return true;
    			}
    		} else {
    			return remove(aData, root);
    		}
    	}
    	
    	
    	
    	return false;
    }
    
    public boolean remove(String aData, Node parent) {
    	
    	if (root!=null) {
    		int compare = root.getData().compareTo(aData);
//    		System.out.println(compare);
    		if (compare==0) {
    			
    			System.out.println("center");
    			// ei alipuita
    		if (root.left()==null&&root.right()==null) {
//    			System.out.println("ei alipuita");
    				if (parent.getDirection().equals("left")) {
    					parent.setLeft(null);
//    					System.out.println("left null");
    					return true;
    				} else {
    					parent.setRight(null);
//    					System.out.println("right null");
    					return true;
    				}
    			// vain vasen alipuu	
    			}else if (root.left()!=null&&root.right()==null) {
//    				System.out.println("vasen alipuu");
    				if (parent.getDirection().equals("left")) {
    					parent.setLeft(root.left());
//    					System.out.println("left korvattu");
    					return true;
    				} else {
    					parent.setRight(root.left());
//    					System.out.println("right korvattu");
    					return true;
    				}

    			// vain oikea alipuu	
    			} else if (root.left()==null&&root.right()!=null) {
//    				System.out.println("oikea alipuu");
    				if (parent.getDirection().equals("left")) {
    					parent.setLeft(root.right());
//    					System.out.println("left korvattu");
    				} else {
    					parent.setRight(root.right());
//    					System.out.println("right korvattu");
    				}
    			// molemmat alipuut	
    			} else {
//    				System.out.println("molemmat alipuut");
    				String minNode = root.right().getMinNode();
//    				System.out.println(minNode);
//    				System.out.println(remove(minNode, root));
    				remove(minNode, root);
    				root.setData(minNode);
    				return true;
    			}

    		} else if (compare > 0 && root.left()!=null) {
//    			System.out.println("left");
    			root.setDirection("left");
    			return root.left().remove(aData, root);
    		} else if (compare < 0 && root.right()!=null) {
//    			System.out.println("right");
    			root.setDirection("right");
    			return root.right().remove(aData, root);
    			
    		}
    		return false;
    	} 
    		return false;
    }
    
    public String getMinNode() {
    	if (root.left()==null) {
    		return root.getData();
    	} else {
    		return root.left().getMinNode();
    	}
    }
    
    public int maxHeight(BinaryTree tree) {
    	
    	if (tree==null) {
    		return 0;
    	} else {
    		int leftHeight = maxHeight(tree.getRoot().left());
    		int rightHeight = maxHeight(tree.getRoot().right());
    		
    		if (leftHeight > rightHeight) {
    			return (leftHeight+1);
    		} else {
    			return (rightHeight+1);
    		}
    	}
    }
    
    public void preOrder() {
        if (root != null) {
            System.out.println(root.getData()+',');
            if (root.left() != null) // pääseeekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }
    }
  
    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }
    
    public Node getRoot() {
    	return root;
    }
}
