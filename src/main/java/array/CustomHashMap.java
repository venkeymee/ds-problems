package array;


public class CustomHashMap<K,V> {
    public Entry<K, V>  table[];
    private int capacity= 4;


    static class Entry<K,V> {
     private K key;
     private V value;
     Entry<K,V> next;
       Entry(K key,V value,Entry next){
          this.key=key;
          this.value=value;
          this.next=next;
        }
    }
    public CustomHashMap(){
        this.table=new Entry[capacity];
    }
     int hash(K hashcode){
        return Math.abs(hashcode.hashCode())%capacity;
     }



    public void put(K newKey, V data){
     if(newKey==null)
            return;    //does not allow to store null.

    //calculate hash of key.
    int hash=hash(newKey);
                //create new entry.
                Entry<K,V> newEntry = new Entry<K,V>(newKey, data, null);

    //if table location does not contain any entry, store entry there.
        if(table[hash] == null){
                table[hash] = newEntry;
                    }else{
                        Entry<K,V> previous = null;
                        Entry<K,V> current = table[hash];

                        while(current != null){
                            //we have reached last entry of bucket.
//                            if(current.key.equals(newKey)){
//                                if(previous==null){
//                                        //node has to be insert on first of bucket.
//                                        newEntry.next=current.next;
//                                        table[hash]=newEntry;
//                                        return;
//
//                            }else{
//                                newEntry.next=current.next;
//                                previous.next=newEntry;
//                                return;
//                                }
//                        }
                        previous=current;
                        current = current.next;
                        }
                previous.next = newEntry;
                }
}


    public V get(K key){
        int hash = hash(key);
        if(table[hash] == null){
            return null;
        }else{
            Entry<K,V> temp = table[hash];
            while(temp!= null){
                if(temp.key.equals(key))
                    return temp.value;
                temp = temp.next; //return value corresponding to key.
            }
            return null;   //returns null if key is not found.
        }
    }
    public void toDisplay(){

        for(int i=0;i<capacity;i++){
            if(table[i]!=null){
                Entry<K, V> entry=table[i];
                while(entry!=null){
                    System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
                    entry=entry.next;
                }
            }
        }

    }

    public static void main(String[] args) {
        CustomHashMap customHashMap=new CustomHashMap();
        customHashMap.put(21,"venkat");
        customHashMap.put(41,"test");
        customHashMap.toDisplay();
    }

}