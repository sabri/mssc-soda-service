package com.sabrouch.msscsodaservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by sabrouch.
 * Date: 11/10/2020
 */

public class SodaPageList extends PageImpl<SodaDto> {
    public SodaPageList(List<SodaDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public SodaPageList(List<SodaDto> content) {
        super(content);
    }
}
