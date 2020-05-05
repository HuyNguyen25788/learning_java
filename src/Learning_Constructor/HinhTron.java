package Learning_Constructor;

import java.util.Scanner;

public class HinhTron {
	final float PI =3.14f;
	float r;
	float cv;
	float dt;
	
	public HinhTron(){
		nhapBanKinh();
		
	}
	
	public HinhTron(float r){
		this.r=r;
		
	}
	
	public void nhapBanKinh(){
		System.out.print("Nhap ban kinh");
		Scanner scancer = new Scanner(System.in);
		r= scancer.nextFloat();
	}
	public void tinhChuVi() {
        cv = 2 * PI * r;
    }
 
    public void tinhDienTich() {
        dt = PI * r * r;
    }
 
    public void inChuVi() {
        System.out.println("Chu vi Hình tròn: " + cv);
    }
 
    public void inDienTich() {
        System.out.println("Diện tích Hình tròn: " + dt);
    }
    public static void main(String[] args) {
		HinhTron hinhtron1 = new HinhTron();
		HinhTron hinhtron2 = new HinhTron(10);
		System.out.println("Hinh 1");
		hinhtron1.tinhChuVi();
		hinhtron1.tinhDienTich();
		hinhtron1.inChuVi();
		hinhtron1.inDienTich();
		System.out.println("Hinh 2");
		hinhtron2.tinhChuVi();
		hinhtron2.tinhDienTich();
		hinhtron2.inChuVi();
		hinhtron2.inDienTich();
		
	}

    
}
