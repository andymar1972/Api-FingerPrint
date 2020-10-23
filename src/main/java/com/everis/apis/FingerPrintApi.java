package com.everis.apis;

import com.everis.request.FingerPrintRequest;
import com.everis.response.FingerPrintResponse;
import com.everis.service.FingerPrintService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FingerPrintApi {

  @Autowired
  FingerPrintService fingerService;
  
  @PostMapping("/core/fingerprints/validate")
  public FingerPrintResponse validate(@RequestBody @Valid FingerPrintRequest fingerPrintRequest) {
    return fingerService.validate(fingerPrintRequest);
  }

}