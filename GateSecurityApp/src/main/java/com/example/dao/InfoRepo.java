package com.example.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.VisitInfo;


public interface InfoRepo extends JpaRepository <VisitInfo,Integer>{

}
