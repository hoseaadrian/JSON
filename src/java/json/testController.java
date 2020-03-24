package json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("tes")
public class testController {

    
    
    @GET
    @Path("/data")
    @Produces(MediaType.APPLICATION_JSON)

    public ArrayList<testModel> getData(testModel data) throws ClassNotFoundException, SQLException {
        ArrayList<testModel> tmn = new ArrayList<>();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebanking", "root", "");
        PreparedStatement st = con.prepareStatement("SELECT * FROM history");
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            testModel tm = new testModel();
            tm.setID_transaksi(rs.getString("ID_transaksi"));
            tm.setRekening_pengirim(rs.getString("rekening_pengirim"));
            tm.setRekening_penerima(rs.getString("rekening_penerima"));
            tm.setNominal(rs.getInt("nominal"));
            tm.setTanggal(rs.getTimestamp("tanggal"));
            tmn.add(tm);
        }
        return tmn;
    }    
    @POST
    @Path("/create_login")
    @Produces(MediaType.APPLICATION_JSON)

    public ArrayList<model_login> getData(model_login data) throws ClassNotFoundException, SQLException {
        ArrayList<model_login> tmn = new ArrayList<>();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebanking", "root", "");
        PreparedStatement st = con.prepareStatement("INSERT INTO `login`(`ID_log`,`username`, `pass` VALUES"+data.getID_log()+"."+data.getUsername()+","+data.getPass());
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            model_login tm = new model_login();
            tm.setID_log(rs.getInt("ID_log"));
            tm.setUsername(rs.getString("username"));
            tm.setPass(rs.getString("pass"));
            tmn.add(tm);
        }
        return tmn;
    }    
    
    @GET
    @Path("/cek_user")
    @Produces(MediaType.APPLICATION_JSON)

    public ArrayList<model_login> getData1(model_login data) throws ClassNotFoundException, SQLException {
        ArrayList<model_login> tmn = new ArrayList<>();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebanking", "root", "");
        PreparedStatement st = con.prepareStatement("SELECT * FROM login");
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            model_login tm = new model_login();
            tm.setID_log(rs.getInt("ID_log"));
            tm.setUsername(rs.getString("username"));
            tm.setPass(rs.getString("pass"));
            tmn.add(tm);
        }
        return tmn;
    }    
    @GET
    @Path("/cek_data_user")
    @Produces(MediaType.APPLICATION_JSON)

    public ArrayList<model_dataclient> getData(model_dataclient data) throws ClassNotFoundException, SQLException {
        ArrayList<model_dataclient> tmn = new ArrayList<>();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebanking", "root", "");
        PreparedStatement st = con.prepareStatement("SELECT * FROM info");
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            model_dataclient tm = new model_dataclient();
            tm.setId_client(rs.getInt("ID_info"));
            tm.setNama(rs.getString("nama_depan"));
            tm.setNama_belakang(rs.getString("nama_belakang"));
            tm.setNo_rekening(rs.getString("rekening"));
            tm.setSaldo(rs.getInt("saldo"));
            tm.setTelpon(rs.getString("telefon"));
            tm.setAlamat(rs.getString("alamat"));
            tmn.add(tm);
        }
        return tmn;
    }    
    
    @POST
    @Path("/create_data_user")
    @Produces(MediaType.APPLICATION_JSON)

    public ArrayList<model_dataclient> getData1(model_dataclient data) throws ClassNotFoundException, SQLException {
        ArrayList<model_dataclient> tmn = new ArrayList<>();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebanking", "root", "");
        PreparedStatement st = con.prepareStatement("INSERT INTO `data_user`(`id_user`, `no_rekening`, `nama`, `alamat`, `saldo`) VALUES"+data.getId_client()+
                                                                          ","+data.getNo_rekening()+","+data.getNama()+","+data.getAlamat()+","+data.getSaldo());
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            model_dataclient tm = new model_dataclient();
            tm.setId_client(rs.getInt("ID_info"));
            tm.setNama(rs.getString("nama_depan"));
            tm.setNama_belakang(rs.getString("nama_belakang"));
            tm.setNo_rekening(rs.getString("rekening"));
            tm.setSaldo(rs.getInt("saldo"));
            tm.setTelpon(rs.getString("telefon"));
            tm.setAlamat(rs.getString("alamat"));
            tmn.add(tm);
        }
        return tmn;
    }    
}

