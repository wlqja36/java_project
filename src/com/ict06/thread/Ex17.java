package com.ict06.thread;

import java.util.ArrayList;
import java.util.List;

public class Ex17 {
	// 컬렉션
	private List<String> carList = null;
	//생성자
	public Ex17() {
		carList = new ArrayList<String>();

	}
	
	//자동차 생산
	public String getCar() {
		String carName = null;
		switch ((int) (Math.random() * 3)) {
		case 0:
			carName = "SM5";
			break;
		case 1:
			carName = "매그너스";
			break;
		case 2:
			carName = "카렌스";
			break;

		}
		return carName;
	}

	public synchronized String pop() {
		String carName = null;
		if (carList.size() == 0) {
			try {
				System.out.println("차가 없어요 생산 할때 까지 기다리세요");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 재고가 있을 때는 carList 에서 가장 나중에들어간 차를 판매(삭제)
		carName = (String) carList.remove(carList.size() - 1);
		System.out.println("손님이 차를 사갔습니다.. 손님이 구한 차 이름은 =>\" " + carName + "\"");
		return carName;
	}
	// 자동차를 carList에 넣기
	// 창고 자동차 5대가 되면 소비자들에게 판매를 시작
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("차가 만들어 졌습니다. 차 이름은 \" " + car + "\"");
		if (carList.size() == 5) {
			// 재고가 0일때 대기시킨 스레드를 준비상태로 변경시킴.
			this.notify();
		}
	}
}
