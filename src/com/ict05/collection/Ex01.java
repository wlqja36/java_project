package com.ict05.collection;

public class Ex01 {
	// 제네릭과 컬렉션 (자료구조)
	// 제네릭 : 컬렉션이 어떤 객체들로 이루어졌는 지를 표시하는 객체 타입을 말한다.
	// 컬렉션 : 객체들은 모아서 관리하는 인터페이스를 구현한 것
	// API    : <T> => 객체 타입(Type), <E> => 요소(Elements)(컬렉션 안에 존재하는 객체 하나를 뜻함)
	//			Map 형식에서는 <K, V> => 키(Key), 값(Value)
	//			Key 와 Value가 1:1 대응, Key를 호출하면 Value가 나온다.
	// 형식   : 컬렉션<제네릭>
	// 최상위 컬렉션은 Collection<E>, Map<K,V>
	
	// Collection의 주요 메소드
	// add(E e) : boolean => 해당 컬렉션에 객체추가, 성공하면 true, 실패하면 false
	// addAll(Collection <? extends E> c) : boolean 
	//  => 특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가
	//
	// clear() : void => 모든 요소 삭제
	// contains(Object o) : boolea =>해당 컬렉션에 인자로 들어온 객체가 존재하면 true, 아니면 false
	// containsAll(Collection<?> c) : boolean => 이 컬렉션에 지저오딘 컬렉셔느이 모든 요소가 포함된 경우 true
	// equals(Object o) : boolean => 지정된 객체와의 컬렉션이 같은지 비교 
	// isEmpty() : boolean => 해당 컬렉션이 비어있으면 true
	// iterator() : Iterator<E> => 컬렉션안에 요소들을 순서대로 접근하기 위한 Iterator 객체를 반환
	//  => 컬렉션안에 존재하는 요소들을 하나씩 꺼내서 작업할 때 사용
	// remove(Object o) : boolean => 인자로 들어온 객체를 삭제할 때 사용, 성공하면 true
	// size() : int => 컬렉션 안에 존재하는 요소들의 수
	// toArray() : object[] => 컬렉션을 배열로 만든다.
	// 
	
	
	
	
}
