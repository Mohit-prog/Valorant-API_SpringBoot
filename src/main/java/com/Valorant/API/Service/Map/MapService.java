package com.Valorant.API.Service.Map;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Valorant.API.Data.JPARepository.MapRepository;
import com.Valorant.API.Data.Map.Map;

@Service
public class MapService {

    @Autowired
    MapRepository mapRepository;

    public Map getMapDetail(int id) {
        return mapRepository.findById(id).get();
    }

    public ArrayList<Map> getAllMaps() {
        return (ArrayList<Map>) mapRepository.findAll();
    }

}
