import java.util.ArrayList;

public class Lab10pt2 {
	ArrayList<Integer> queueArrayList = new ArrayList<Integer>();

	public void enqueue(int num) {
        queueArrayList.add(num);
    }

	public Integer dequeue() {
		int noOfElements = queueArrayList.size();
        if (noOfElements > 0) {
        	int res = queueArrayList.get(0);
            queueArrayList.remove(0);
            return res;
         } 
        else {
        	return -1;
        }
	}

	public boolean hasItems() {
		int noOfElements = queueArrayList.size();
        if (noOfElements > 0) {
        	return true;
        } 
        else {
        	return false;
        }
	}
}
