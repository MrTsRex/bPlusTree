/**
 * A class to implement key/node pair
 */
public class myDict {
    Double key;
    genericNode Node;
    myDict(Double k, genericNode n){
        this.key = k;
        this.Node = n;
    }
    public Double getKey(){
        return this.key;
    }
    public  genericNode getNode(){
        return this.Node;
    }
}
