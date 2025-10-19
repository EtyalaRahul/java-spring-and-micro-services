package com.telusko.springJdbcDemo.repo;

import com.telusko.springJdbcDemo.model.Alien;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class AlienRepo {

    @Autowired
    private JdbcTemplate template; 

    // Save a new Alien record
    public void save(Alien alien) {
        String sql = "INSERT INTO alien(id, name, tech) VALUES (?, ?, ?)";
        int rows = template.update(sql, alien.getId(), alien.getName(), alien.getTech());
        System.out.println("Rows affected: " + rows);
    }

    // Fetch all Alien records
    public List<Alien> findAll() {
        String sql = "SELECT * FROM alien";

        RowMapper<Alien> mapper = (rs, rowNum) -> {
            Alien alien = new Alien();
            alien.setId(rs.getInt("id"));
            alien.setName(rs.getString("name"));
            alien.setTech(rs.getString("tech"));
            return alien;
        };

        List<Alien> data=template.query(sql, mapper);
        return data;
    }
}
