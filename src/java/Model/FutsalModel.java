/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TutorialPedia
 */
public class FutsalModel {
   String id_booking,nama_tim,no_lapangan,hari,jam;
   String id_akun,nama,no_telpon,email,password,role;
   String jenis_lapangan,tarif,luas;
   Koneksi db = null;
   
       
    public FutsalModel() {
        db = new Koneksi();
    }

    public String getId_book() {
        return id_booking;
    }

    public void setId_book(String id_booking) {
        this.id_booking = id_booking;
    }

    public String getNamaTim() {
        return nama_tim;
    }

    public void setNamaTim(String nama_tim) {
        this.nama_tim = nama_tim;
    }

    public String getNoLap() {
        return no_lapangan;
    }

    public void setNoLap(String no_lapangan) {
        this.no_lapangan = no_lapangan;
    }
    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }
    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
      public String getIdAkun() {
        return id_akun;
    }
 
    public void setIdAkun(String id_akun) {
        this.id_akun = id_akun;
    }
 
     public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
    
     public String getNoTelp() {
        return no_telpon;
    }
 
    public void setNoTelp(String no_telpon) {
        this.no_telpon = no_telpon;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
    
       public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
        public String getRole() {
        return role;
    }
 
    public void setRole(String role) {
        this.role = role;
    }
    
         public String getJenisLap() {
        return jenis_lapangan;
    }
 
    public void setJenisLap(String jenis_lapangan) {
        this.jenis_lapangan = jenis_lapangan;
    }
        public String getTarif() {
        return tarif;
    }
 
    public void setTarif(String tarif) {
        this.tarif = tarif;
    }
    public String getLuas() {
        return luas;
    }
 
    public void setLuas(String luas) {
        this.luas = luas;
    }
    
    public List LoginUser(String email, String password) {
        List data = new ArrayList();
        ResultSet rs = null;
        try {
            String sql = "select * from akun where email='" + email + "' and password='" + password + "'";
            rs = db.ambilData(sql);
            
            while (rs.next()) {
                FutsalModel am = new FutsalModel();
                am.setIdAkun(rs.getString("id_akun"));
                am.setNama(rs.getString("nama"));
                am.setNoTelp(rs.getString("no_telpon"));                
                am.setEmail(rs.getString("email"));                
                am.setPassword(rs.getString("password"));
                am.setRole(rs.getString("role"));
                data.add(am);
            }
            db.diskonek(rs);
        } catch (Exception a) {
            System.out.println("Terjadi kesalahaan cari login admin, pada :\n" + a);
        }
        return data;
    }
    
    public void simpan(){
        String sql="INSERT INTO booking values('"+id_akun+"','"+nama_tim+"','"+no_lapangan+"','"+hari+"','"+jam+"')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE booking SET id_akun='"+id_akun+"',nama_tim='"+nama_tim+"',no_lapangan='"+no_lapangan+"',hari='"+hari+"',jam='"+jam+"' WHERE id_booking='"+id_booking+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM booking WHERE id_booking='"+id_booking+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public void simpan_akun(){
        String sql="INSERT INTO akun values('"+nama+"','"+no_telpon+"','"+email+"','"+password+"','"+role+"')";
        db.simpanData(sql);
    }
    public void update_akun(){
        String sql="UPDATE akun SET nama='"+nama+"',no_telpon='"+no_telpon+"',email='"+email+"',password='"+password+"',role='"+role+"' WHERE id_akun='"+id_akun+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus_akun(){
        String sql="DELETE FROM akun WHERE id_akun='"+id_akun+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public void simpan_lap(){
        String sql="INSERT INTO field values('"+jenis_lapangan+"','"+tarif+"','"+luas+"')";
        db.simpanData(sql);
    }
    public void update_lap(){
        String sql="UPDATE field SET jenis_lapangan='"+jenis_lapangan+"',tarif='"+tarif+"',luas='"+luas+"' WHERE no_lapangan='"+no_lapangan+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus_lap(){
        String sql="DELETE FROM field WHERE no_lapangan='"+no_lapangan+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<FutsalModel> data = new ArrayList<FutsalModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from booking order by id_booking asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                FutsalModel um = new FutsalModel();
                um.setIdAkun(rs.getString("id_akun"));
                um.setId_book(rs.getString("id_booking"));
                um.setNamaTim(rs.getString("nama_tim"));
                um.setNoLap(rs.getString("no_lapangan"));
                um.setHari(rs.getString("hari"));
                um.setJam(rs.getString("jam"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
    public List cariId_book() {
        List<FutsalModel> data = new ArrayList<FutsalModel>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM booking WHERE id_booking='"+id_booking+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                FutsalModel m = new FutsalModel();
                m.setIdAkun(rs.getString("id_akun"));
                m.setId_book(rs.getString("id_booking"));
                m.setNamaTim(rs.getString("nama_tim"));
                m.setNoLap(rs.getString("no_lapangan"));
                m.setHari(rs.getString("hari"));
                m.setJam(rs.getString("jam"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari Id_book" + ex);
        }
        return data;
    }
    
    

      public List tampil_history() {
        List<FutsalModel> data = new ArrayList<FutsalModel>();
        ResultSet rs = null;
            try {
            String sql = "SELECT * FROM booking order by id_booking where ";
            rs = db.ambilData(sql);
            while (rs.next()) {
                FutsalModel m = new FutsalModel();
                m.setIdAkun(rs.getString("id_akun"));
                m.setId_book(rs.getString("id_booking"));
                m.setNamaTim(rs.getString("nama_tim"));
                m.setNoLap(rs.getString("no_lapangan"));
                m.setHari(rs.getString("hari"));
                m.setJam(rs.getString("jam"));
                data.add(m);
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data booking" + ex);
        }
        return data;
    }
    public List tampilLap() {
        List<FutsalModel> data = new ArrayList<FutsalModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from field";
            rs = db.ambilData(sql);
            while (rs.next()) {
                FutsalModel um = new FutsalModel();
                um.setNoLap(rs.getString("no_lapangan"));
                um.setJenisLap(rs.getString("jenis_lapangan"));
                um.setTarif(rs.getString("tarif"));
                um.setLuas(rs.getString("luas"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Field" + ex);
        }
        return data;
    }
      public List tampil_lap() {
        List<FutsalModel> data = new ArrayList<FutsalModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from field where no_lapangan='1'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                FutsalModel um = new FutsalModel();
                um.setNoLap(rs.getString("no_lapangan"));
                um.setJenisLap(rs.getString("jenis_lapangan"));
                um.setTarif(rs.getString("tarif"));
                um.setLuas(rs.getString("luas"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Field" + ex);
        }
        return data;
    }
    public List tampil_lap2() {
        List<FutsalModel> data = new ArrayList<FutsalModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from field where no_lapangan='2'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                FutsalModel um = new FutsalModel();
                um.setNoLap(rs.getString("no_lapangan"));
                um.setJenisLap(rs.getString("jenis_lapangan"));
                um.setTarif(rs.getString("tarif"));
                um.setLuas(rs.getString("luas"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Field" + ex);
        }
        return data;
    }
      public List cariNoLap() {
        List<FutsalModel> data = new ArrayList<FutsalModel>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM field WHERE no_lapangan='"+no_lapangan+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                FutsalModel m = new FutsalModel();
                m.setNoLap(rs.getString("no_lapangan"));
                m.setJenisLap(rs.getString("jenis_lapangan"));
                m.setTarif(rs.getString("tarif"));
                m.setLuas(rs.getString("luas"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari No_lapangan" + ex);
        }
        return data;
    }
    public List tampilkun() {
        List<FutsalModel> data = new ArrayList<FutsalModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from akun order by nama asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                FutsalModel um = new FutsalModel();
                um.setIdAkun(rs.getString("id_akun"));
                um.setNama(rs.getString("nama"));
                um.setNoTelp(rs.getString("no_telpon"));
                um.setEmail(rs.getString("email"));
                um.setPassword(rs.getString("password"));
                um.setRole(rs.getString("role"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
    public List cariIdAkun() {
        List<FutsalModel> data = new ArrayList<FutsalModel>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM akun WHERE id_akun='"+id_akun+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                FutsalModel m = new FutsalModel();
                m.setIdAkun(rs.getString("id_akun"));
                m.setNama(rs.getString("nama"));
                m.setNoTelp(rs.getString("no_telpon"));
                m.setEmail(rs.getString("email"));
                m.setPassword(rs.getString("password"));
                m.setRole(rs.getString("role"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari IdAkun" + ex);
        }
        return data;
    }
}

