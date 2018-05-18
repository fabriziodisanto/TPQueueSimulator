public class Queue<T> implements IQueue<T> {
    private List<T> queue;
    private int size;

    public Queue(){
        queue = new List<>();
    }

    public Queue(List<T> queue) {
        this.queue = queue;
    }

    public void enqueue(T elem){
        queue = queue.add(elem);
        size++;
    }

    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        T elem = queue.elem;
        queue = queue.tail;
        size--;
        return elem;
    }

    public int size(){
        return size; //update its size with size++/--.
    }

    public boolean isEmpty(){
        return size() == 0; //first validation to enqueue, then ask for other queue's sizes.
    }

}
