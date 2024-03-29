/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tehtava8;

/**
 *
 * @author Oskahon
 */
public class Node {
    private String data;
    private BinaryTree left;
    private BinaryTree right;
    private String direction;
    private int height;

    public Node(String value) {
        data = new String(value);
        left = right = null;
    }
    public  Node (String value, BinaryTree left, BinaryTree right) {
        data = new String(value);
        this.left = left;
        this.right = right;
    }
    
    public String getData() {
        return data;
    }
    public void setData(String data) {
    	this.data=data;
    }
    public BinaryTree left() {
        return left;
    }
    public BinaryTree right() {
        return right;
    }
    public void setLeft(BinaryTree tree) {
        left = tree;
    }
    public void setRight(BinaryTree tree) {
        right = tree;
    }
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}
