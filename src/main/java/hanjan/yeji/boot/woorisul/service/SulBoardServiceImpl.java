package hanjan.yeji.boot.woorisul.service;

import hanjan.yeji.boot.woorisul.dao.SulBoardDAO;
import hanjan.yeji.boot.woorisul.model.SulBoard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("sbsrv")
@RequiredArgsConstructor

public class SulBoardServiceImpl implements SulBoardService {

    final SulBoardDAO sbdao;

    @Override
    public boolean saveSulBoard(SulBoard sb) {
        boolean isSaved= false;

        if(sbdao.insertSulBoard(sb) > 0) isSaved = true;

        return isSaved;
    }


}
