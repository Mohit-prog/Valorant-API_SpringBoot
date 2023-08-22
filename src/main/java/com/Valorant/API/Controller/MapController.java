package com.Valorant.API.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Valorant.API.Data.Map.Map;
import com.Valorant.API.Service.Map.MapService;

@RestController
@RequestMapping("/maps")
public class MapController {

  @Autowired
  MapService mapService;

  @GetMapping
  ArrayList<Map> getAllMaps() {

    return mapService.getAllMaps();

  }

  @GetMapping("/{id}")
  Map getMapDetail(@PathVariable("id") int id) {

    return mapService.getMapDetail(id);

  }

}
