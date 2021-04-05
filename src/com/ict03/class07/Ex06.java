package com.ict03.class07;

interface Remocon {
	void on();

	void off();
}

class Machine {
	Remocon tv = new Remocon() {

		@Override
		public void on() {

			System.out.println("TV를 켭니다");
		}

		@Override
		public void off() {
			System.out.println("TV를 끕니다");

		}
	};
	Remocon radio = new Remocon() {

		@Override
		public void on() {

			System.out.println("Radio를 켭니다");
		}

		@Override
		public void off() {
			System.out.println("Radio를 끕니다");

		}
	};
}



public class Ex06 {
	public static void main(String[] args) {
		Machine machine = new Machine();
		machine.tv.on();
		machine.tv.off();
		machine.radio.on();
		machine.radio.off();
								
	}
}
