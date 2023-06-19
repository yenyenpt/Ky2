package main;

import main.HanhChinh;


public class TruongPhong extends HanhChinh{
    private double trachNhiem;
    public TruongPhong() {
        
    
       
    }

    @Override
    public void nhap() {
        super.nhap(); 
        System.out.println("Nhập trách nhiệm cho Nhân viên: "); trachNhiem = scanner.nextDouble();
    }

    @Override
    public double getLuong() {
        return super.getLuong() + trachNhiem;
    }
    }
            
        
    



