package kr.brains.interf;

public interface Messenger {
	// interface 이기에 abstract void 생략 가능
	void sendMsg(String phoneNumber, String msg);
	void receivMsg();
}
