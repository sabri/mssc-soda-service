package com.sabrouch.msscsodaservice.web.controller;

import com.sabrouch.msscsodaservice.web.model.SodaDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by sabrouch.
 * Date: 11/10/2020
 */
@RestController
@RequestMapping("/api/v1/soda")
public class SodaController {

    @GetMapping("/{sodaId}")
    public ResponseEntity<SodaDto> getSoda(@PathVariable("sodaId")UUID sodaId){
        return new ResponseEntity<>(SodaDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity postHanfdle(@RequestBody SodaDto sodaDto){
        //impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{sodaId}")
    public ResponseEntity updateHandler(@PathVariable("sodaId") UUID sodaId, @RequestBody SodaDto sodaDto){
        return  new ResponseEntity(HttpStatus.NO_CONTENT);

    }
    @DeleteMapping("/{sodaId}")
    public ResponseEntity deleteHandler(@PathVariable("SodaId") UUID sodaId){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
