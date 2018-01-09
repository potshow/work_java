package com.koitt.java.ch07;


public class ArrayTest {

	private Integer[] array;	 // 데이터를 담는 자료구조. Integer래퍼 클래스를 이용. 참조형이므로 비어있는 값은 null
	private int length;			 // 배열의 크기
	private int size; 		 //	실제 데이터의 개수


	public ArrayTest (int size) {
		this.length = size;
		this.array = new Integer[this.length];
	}

	// 배열의 값을 집어넣는 메소드

	// 자료구조에 데이터를 추가 (index번호에다가 해당 데이터를 저장)
	public void add (int index, int value) {
		// 인덱스의 범위를 먼저 검사
		if (index >= 0 && index < this.length) {
			if (this.array[index] == null) {
				this.array[index] = value;
			}
			else if (this.array[index] != null) {

				int newSize = this.length + 1;
				if (this.array.length < newSize) {
					// 깊은 복사(Deep Copy)
					Integer[] tempArray = new Integer[this.length];
					System.arraycopy(this.array, 0, tempArray, 0, this.array.length);

					this.length *= 2;
					this.array = new Integer[this.length];
					System.arraycopy(tempArray, 0, this.array, 0, tempArray.length);
				}

				// 집어넣으려는 index번호 뒤쪽 데이터를 한칸씩 뒤로 밀어서 복사
				System.arraycopy(this.array, index, this.array, index+1, this.size - index);

				this.array[index] = value;	// 새로 추가하려는 값을 배열에 저장
			}
			this.size += 1; 	// 기존 데이터 개수 + 새로운 데이터 개수
		}
	}

	public void remove (int index) {
		if (index >= 0 && index < this.length) {

			if (this.array[index] != null ) {

				System.arraycopy(this.array, index+1, this.array, index, this.size-index);
			}

			this.array[size-1] = null;
		}
		this.size -= 1;
	}

	public void set (int index, int value) {

		this.array[index] = value;
	}

	public Integer get (int index) {
		return this.array[index];
	}

	public Integer[] getArray() {
		return array;
	}

	public int getSize() {
		return size;
	}


	public static void main(String[] args) {

		ArrayTest test = new ArrayTest(3);
		test.add(0, 2);
		for (int i=0; i < test.getSize(); i++) {
			System.out.print(test.get(i));
		}
		System.out.println();

		test.add(1, 3);
		for (int i=0; i < test.getSize(); i++) {
			System.out.print(test.get(i));
		}
		System.out.println();

		test.add(2, 4);
		for (int i=0; i < test.getSize(); i++) {
			System.out.print(test.get(i));
		}
		System.out.println();

		test.add(1, 1);
		for (int i=0; i < test.getSize(); i++) {
			System.out.print(test.get(i));
		}
		System.out.println();

		test.remove(3);
		for (int i=0; i < test.getSize(); i++) {
			System.out.print(test.get(i));
		}
		System.out.println();




	}
}