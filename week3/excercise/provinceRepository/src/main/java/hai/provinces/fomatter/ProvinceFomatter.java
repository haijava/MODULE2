package hai.provinces.fomatter;

import hai.provinces.model.Province;
import hai.provinces.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;


@Component
public class ProvinceFomatter implements Formatter<Province> {
    private ProvinceService provinceService;

    @Autowired
    public ProvinceFomatter(ProvinceService provinceService){
        this.provinceService=provinceService;
    }

    @Override
    public Province parse(String text, Locale locale) throws ParseException {
        return provinceService.findById(Long.parseLong(text));
    }

    @Override
    public String print(Province object, Locale locale) {
        return "[" + object.getId()+ "," +object.getName()+ "]";
    }
}
