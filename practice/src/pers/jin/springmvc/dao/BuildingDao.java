package pers.jin.springmvc.dao;

import pers.jin.springmvc.beans.Building;

import java.util.Collection;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/3 20:56
 */
public interface BuildingDao {
    Collection<Building> getBuildings();
    Collection<Building> getBuilding();
}
