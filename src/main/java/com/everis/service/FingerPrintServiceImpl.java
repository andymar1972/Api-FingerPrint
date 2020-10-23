package com.everis.service;

import com.everis.constant.Constant;
import com.everis.request.FingerPrintRequest;
import com.everis.response.FingerPrintResponse;
import org.springframework.stereotype.Service;

@Service
public class FingerPrintServiceImpl implements FingerPrintService {

  @Override
  public FingerPrintResponse validate(FingerPrintRequest fingerPrintRequest) {

    FingerPrintResponse fingerPrintResponse = new FingerPrintResponse();
    fingerPrintResponse.setEntityName(Constant.ENTITY_NAME);
    fingerPrintResponse.setSucces(Constant.SUCCES);

    return fingerPrintResponse;
  }

}
