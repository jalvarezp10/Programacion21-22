import javax.lang.model.type.IntersectionType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas {
    public static void empleadosOficinaMayor(){
        Connection con =ConnectionDB.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT officeCode ,count(*) as cantidad " +
                    "from employees e " +
                    "group by e.officeCode " +
                    "order by cantidad DESC " +
                    "limit 1");
            ResultSet rs= ps.executeQuery();
            rs.next();
            Integer total=rs.getInt(2);
             ps=con.prepareStatement("SELECT * FROM employees e " +
                     "WHERE e.officeCode =? ");
             
            ps.setInt(1,total);
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));
            System.out.println(rs.getString(6));
            System.out.println(rs.getString(7));
            System.out.println(rs.getString(8));



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static void productosNoVendidos(){
        Connection con =ConnectionDB.getConnection();

        try {
            PreparedStatement ps= con.prepareStatement("SELECT * " +
                    "from products p " +
                    "where p.productCode not in " +
                    "(SELECT productCode from orderdetails o)");
            ResultSet rs= ps.executeQuery();
            rs.next();
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));
            System.out.println(rs.getString(6));
            System.out.println(rs.getString(7));
            System.out.println(rs.getString(8));
            System.out.println(rs.getString(9));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
