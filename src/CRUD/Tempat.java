/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

/**
 *
 * @author dr. Yoe
 */
public class Tempat extends Peta {
    
    String Kode_tempat,Nama_tempat,Longitude,Latitude,Kode_jenis,Gambar,Kode_agama;
    
    public Tempat (){}
    
    public Tempat (String Kode_tempat, String Nama_tempat, String Longitude, String Latitude, String Kode_jenis, String Gambar, String Kode_agama){
        this.Kode_tempat = Kode_tempat;
        this.Nama_tempat = Nama_tempat;
        this.Longitude = Longitude;
        this.Latitude = Latitude;
        this.Kode_jenis = Kode_jenis;
        this.Gambar = Gambar;
        this.Kode_agama = Kode_agama;
    }
    
    public void inputKode_tempat(String Kode_tempat){
        this.Kode_tempat = Kode_tempat;
    }
    
    public String ambilKode_tempat(){
        return this.Kode_tempat;
    }
    
    public void inputNama_tempat(String Nama_tempat){
        this.Nama_tempat = Nama_tempat;
    }
    
    public String ambilNama_tempat(){
        return this.Nama_tempat;
    }
    
    public void inputLongitude(String Longitude){
        this.Longitude = Longitude;
    }
    
    public String ambilLongitude(){
        return this.Longitude;
    }
    
    public void inputLatitude(String Latitude){
        this.Latitude = Latitude;
    }
    
    public String ambilLatitude(){
        return this.Latitude;
    }
    
    public void inputKode_jenis(String Kode_jenis){
        this.Kode_jenis = Kode_jenis;
    }
    
    public String ambilKode_jenis(){
        return this.Kode_jenis;
    }
    
    public void inputGambar(String Gambar){
        this.Gambar = Gambar;
    }
    
    public String ambilGambar(){
        return this.Gambar;
    }
    
    public void inputKode_agama(String Kode_agama){
        this.Kode_agama = Kode_agama;
    }
    
    public String ambilKode_agama(){
        return this.Kode_agama;
    }
}
