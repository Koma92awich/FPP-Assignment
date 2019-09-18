package Lists;

public class MyPersonList {
	
	private final int INITIAL_LENGTH = 8;
	private Person[] strArray; 
	private int size;
	
	public MyPersonList() {
		strArray = new Person[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Person p){
		if(size == strArray.length) resize();
		strArray[size++] = p;
	}
	
	public Person get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(Person p){
		for(Person test : strArray){
			if(test.equals(p)) return true;
		}
		return false;
	}
	
	public void insert(Person s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		Person[] temp = new Person[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
		
	}
	
	public boolean remove(Person p){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(p)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		Person[] temp = new Person[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}
	
	
	private void resize(){
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		Person[] temp = new Person[newlen];
		System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}


}
