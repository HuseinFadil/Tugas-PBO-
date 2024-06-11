/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Menu;
import CRUD.Tempat;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author dr. Yoe
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tempat saya = new Tempat();
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan Kode Tempat :");
            String kodeTempat = input.nextLine();
            if (kodeTempat.isEmpty()) {
                System.out.println("Kode Tempat tidak boleh kosong");
            } else {
                saya.inputKode_tempat(kodeTempat);
            }
            System.out.print("Masukan Nama Tempat :");
            String namaTempat = input.nextLine();
            if (namaTempat.isEmpty()) {
                System.out.println("Nama Tempat tidak boleh kosong");
            } else {
                saya.inputNama_tempat(namaTempat);
            }
            System.out.print("Masukan Kode Jenis :");
            String kodeJenis = input.nextLine();
            if (kodeJenis.isEmpty()) {
                System.out.println("Kode Jenis tidak boleh kosong");
            } else {
                saya.inputKode_jenis(kodeJenis);
            }
            System.out.print("Masukan Gambar :");
            String gambar = input.nextLine();
            if (gambar.isEmpty()) {
                System.out.println("Gambar tidak boleh kosong");
            } else {
                saya.inputGambar(gambar);
            }
            System.out.print("Masukan Kode Agama :");
            String kodeAgama = input.nextLine();
            if (kodeAgama.isEmpty()) {
                System.out.println("Kode Agama tidak boleh kosong");
            } else {
                saya.inputKode_agama(kodeAgama);
            }
            // Koneksi ke database
            String url = "jdbc:mysql://localhost:3306/namadatabase"; // Ganti dengan URL database Anda
            String user = "root"; // Ganti dengan username database Anda
            String password = "password"; // Ganti dengan password database Anda
            Connection conn = null;
            PreparedStatement pstmt = null;
            try {
                // Membuat koneksi
                conn = DriverManager.getConnection(url, user, password);
                
                // Membuat SQL statement
                String sql = "INSERT INTO tempat (kode_tempat, nama_tempat, kode_jenis, gambar, kode_agama) VALUES (?, ?, ?, ?, ?)";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, kodeTempat);
                pstmt.setString(2, namaTempat);
                pstmt.setString(3, kodeJenis);
                pstmt.setString(4, gambar);
                pstmt.setString(5, kodeAgama);
                
                // Menjalankan SQL statement
                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Data berhasil disimpan ke database!");
                }
                
            } catch (SQLException e) {
            } finally {
                // Menutup koneksi
                try {
                    if (pstmt != null) pstmt.close();
                    if (conn != null) conn.close();
                } catch (SQLException e) {
                }
            }
            
        }
    }
}
