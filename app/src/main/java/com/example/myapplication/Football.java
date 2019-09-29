package com.example.myapplication;

public class Football  {
    private int anh1;
    private String ten;
    private String namsinh;
    private int anh2;

    public Football(int anh1, String ten, String namsinh, int anh2) {
        this.anh1 = anh1;
        this.ten = ten;
        this.namsinh = namsinh;
        this.anh2 = anh2;
    }

    public int getAnh1() {
        return anh1;
    }

    public void setAnh1(int anh1) {
        this.anh1 = anh1;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public int getAnh2() {
        return anh2;
    }

    public void setAnh2(int anh2) {
        this.anh2 = anh2;
    }
}
