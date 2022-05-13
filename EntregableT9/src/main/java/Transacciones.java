import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    public static void main(String[] args) {
        Connection con =ConnectionDB.getConnection();
        try {
            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement("Insert into customers " +
                    "values(?,?,?,?,?,?,?,?,?,?,?,?,?);");

                    ps.setString(1,"300");
                    ps.setString(2,"Alfredo SL");
                    ps.setString(3,"Garcia");
                    ps.setString(4,"Alfredo");
                    ps.setString(5,"+3453423423");
                    ps.setString(6,"C/real n8");
                    ps.setString(7,"NULL");
                    ps.setString(8,"Castilleja de la cuesta");
                    ps.setString(9,"Sevilla");
                    ps.setString(10,"41905");
                    ps.setString(11,"Spain");
                    ps.setInt(12,1456);
                    ps.setString(13,"0");

            PreparedStatement insertPagos= con.prepareStatement("Insert into payments "+
                    "Values (?,?,?,?) , (?,?,?,?)");
                    ps.setString(1,"300");
                    ps.setString(2,"234JDjeif");
                    ps.setString(3,"2004-10-19");
                    ps.setString(4,"34345");

                    ps.setString(5,"300");
                    ps.setString(6,"32343JFWF");
                    ps.setString(7,"2004-10-19");
                    ps.setString(8,"84955453");



            PreparedStatement insertarOficina= con.prepareStatement("Insert into offices " +
                    "values (?,?,?,?,?,?,?,?)");
            ps.setString(1,"8");
            ps.setString(2, "Tokyo");
            ps.setString(3,"+34 789 34 23 32");
            ps.setString(4,"Por ahi");
            ps.setString(5,"NULL");
            ps.setString(6,"Chiyoda-Ku");
            ps.setString(7,"Japan");
            ps.setString(8,"102-8578");
            ps.setString(9,"Japan");



            System.out.println(ps.executeUpdate());
            System.out.println(insertPagos.executeUpdate());
            System.out.println(insertarOficina.executeUpdate());
            con.commit();


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }


        }
    }
}
