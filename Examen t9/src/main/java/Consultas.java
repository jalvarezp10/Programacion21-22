import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas {


static  void CategoriaMasVendida(){
    Connection con=ConnectionDB.getConnection();
    try {
        PreparedStatement ps = con.prepareStatement("SELECT p.productLine " +
                "from products p " +
                "inner join orderdetails o " +
                "on o.productCode = p.productCode " +
                "ORDER by o.quantityOrdered Desc " +
                "limit 1 ");

        ResultSet rs= ps.executeQuery();
        rs.next();
        System.out.println(rs.getString(1));
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

}





