package pers.jin.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pers.jin.springmvc.beans.Building;

import java.util.Collection;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/3 20:59
 */
@Repository
public class BuildingDaoImpl implements BuildingDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Collection<Building> getBuildings() {
        return null;
    }

    @Override
    public Collection<Building> getBuilding() {
        return null;
    }
}
