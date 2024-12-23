package com.formatter;

import com.model.Province;
import com.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Optional;

@Component
public class ProvinceFormatter implements Formatter<Province> {     // Province <--> String

    private final IProvinceService provinceService;

    @Autowired
    public ProvinceFormatter(IProvinceService provinceService) {
        this.provinceService = provinceService;
    }

    @Override
    public Province parse(String idText, Locale locale) {
//        Optional<Province> provinceOptional = provinceService.findById(Long.parseLong(idText));
//        return provinceOptional.orElse(null);
        return null;
    }

    @Override
    public String print(Province object, Locale locale) {
//        return "[" + object.getId() + ", " + object.getName() + "]";
        return null;
    }
}
