package io.gomedia.PeekExercise;



public class ListWithPeek<Type> implements Iterable<Type>{ 
	private Type[] list;
    private int size;
    
    public ListWithPeek(Type[] newArray) {
        this.list = newArray;
        this.size = list.length;
    }
	

    public IteratorPeek<Type> iterator() {
		IteratorPeek<Type> itPeek = new IteratorPeek<Type>() {
			private int currentIndex = 0;
			
			public boolean hasNext() {
				return currentIndex < size && list[currentIndex] != null;

			}

			public Type next() {
				 return list[currentIndex++];
			}

			public Type peek() {
				 return list[currentIndex];
			}
			
		};
		return itPeek;
	}

}
