import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaccion {
  public static void insertarPedido(){
      Connection con =ConnectionDB.getConnection();
      try {
          con.setAutoCommit(false);
          PreparedStatement ps= con.prepareStatement("Insert into orders " +
                  "values(?,?,?,?,?,?,?);");
          ps.setInt(1,10426);
          ps.setString(2,"2005-05-30");
          ps.setString(3,"2005-06-11");
          ps.setString(4,"2005-06-15");
          ps.setString(5,"Shipped");
          ps.setString(6,"NULL");
          ps.setInt(7,144);

          PreparedStatement insertarDetails= con.prepareStatement("Insert into orderdetails " +
                  "values(?,?,?,?,?) , (?,?,?,?,?);");
          insertarDetails.setInt(1,10426);
          insertarDetails.setString(2,"S10_4698");
          insertarDetails.setInt(3,40);
          insertarDetails.setDouble(4,172.36);
          insertarDetails.setInt(5,4);

          insertarDetails.setInt(6,10426);
          insertarDetails.setString(7,"S18_1662");
          insertarDetails.setInt(8,32);
          insertarDetails.setDouble(9,134.04);
          insertarDetails.setInt(10,4);


          System.out.println(ps.executeUpdate());
          System.out.println(insertarDetails.executeUpdate());

          con.commit();



      } catch (SQLException e) {
          try {
              con.rollback();
          } catch (SQLException ex) {
              throw new RuntimeException(ex);
          }
          throw new RuntimeException(e);
      }

  }

}
