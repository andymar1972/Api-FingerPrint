package com.everis.service;

import com.everis.request.FingerPrintRequest;
import com.everis.response.FingerPrintResponse;

public interface FingerPrintService {
  
  public FingerPrintResponse validate(FingerPrintRequest fingerPrintRequest);

}
