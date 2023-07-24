package hanjan.yeji.boot.woorisul.service;

import hanjan.yeji.boot.woorisul.model.Brewery;

import java.util.List;

public interface BreweryService {

    boolean saveBrewery(Brewery b);

    List<Brewery> readBrewery(Integer cpg);

    Brewery readOneBrewery(String bno);

    int countBrewery();
}
