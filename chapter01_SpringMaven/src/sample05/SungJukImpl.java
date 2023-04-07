package sample05;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component("sungJuklmp")
public class SungJukImpl implements SungJuk {
	Scanner scan = new Scanner(System.in);
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	public SungJukImpl() {
		System.out.print("이름 입력 : ");
		this.name = scan.next();
		System.out.print("국어 입력 : ");
		kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		math = scan.nextInt();
	}
	
	@Override
	public void calc() {
		tot = (kor+eng+math);
		avg = (double)tot/3;
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.3f", avg));

	}

}
