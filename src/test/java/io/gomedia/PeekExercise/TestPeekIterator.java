package io.gomedia.PeekExercise;

import static org.junit.Assert.*;
import org.junit.Test;




public class TestPeekIterator {

	@Test
	public void TestWithNumbers(){
		Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};
		ListWithPeek<Integer> listWithPeek = new ListWithPeek<Integer>(numbers);
		IteratorPeek<Integer> alIter = listWithPeek.iterator();
		assertTrue(1==alIter.peek());
		assertTrue(1==alIter.next());
		assertTrue(2==alIter.peek());
		assertTrue(2==alIter.peek());
		assertTrue(2==alIter.peek());
		assertTrue(2==alIter.next());
		assertTrue(3==alIter.peek());
	}
	
	@Test
	public void TestWithLetters(){
		Character[] letters = new Character[]{'A', 'B', 'C'};
		ListWithPeek<Character> listWithPeek = new ListWithPeek<Character>(letters);
		IteratorPeek<Character> alIter = listWithPeek.iterator();
		assertTrue('A'==alIter.peek());
		assertTrue('A'==alIter.next());
		assertTrue('B'==alIter.peek());
		assertTrue('B'==alIter.peek());
		assertTrue('B'==alIter.next());
		assertTrue('C'==alIter.peek());
		
	}

	
}
