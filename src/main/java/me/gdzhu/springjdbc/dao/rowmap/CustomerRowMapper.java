package me.gdzhu.springjdbc.dao.rowmap;

import me.gdzhu.springjdbc.model.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by gdzhu on 2017/8/20.
 */
public class CustomerRowMapper implements RowMapper {
    public Object mapRow(ResultSet rs, int i) throws SQLException {
        Customer customer = new Customer();
        customer.setCustId(rs.getInt("CUST_ID"));
        customer.setName(rs.getString("NAME"));
        customer.setAge(rs.getInt("AGE"));
        return customer;
    }
}
