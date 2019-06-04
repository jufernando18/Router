package co.com.ies.domain.service;

import co.com.ies.domain.enumeration.Message;
import co.com.ies.service.error.BadRequestException;
import co.com.ies.service.error.BadResponseException;
import co.com.ies.service.error.OperatorModuleDataException;

import org.slf4j.Logger;

public abstract class GeneralMethod {
  
  protected void ifNullLaunchDataException(Object obj, Message msgException)
      throws OperatorModuleDataException {
    if (obj == null) {
      getLogger().error(msgException.getMessage());
      throw new OperatorModuleDataException(msgException.getMessage());
    }
  }

  protected abstract Logger getLogger();

  protected void ifNullOrBlankLaunchDataException(Object obj, Message msgException)
      throws OperatorModuleDataException {
    if (obj == null || obj.toString().isBlank()) {
      getLogger().error(msgException.getMessage());
      throw new OperatorModuleDataException(msgException.getMessage());
    }
  }

  protected void ifNullLaunchResponseException(Object obj, Message msgException)
      throws BadResponseException {
    if (obj == null) {
      getLogger().error(msgException.getMessage());
      throw new BadResponseException(msgException.getMessage());
    }
  }

  protected void ifNullOrBlankLaunchResponseException(Object obj, Message msgException)
      throws BadResponseException {
    if (obj == null || obj.toString().isBlank()) {
      getLogger().error(msgException.getMessage());
      throw new BadResponseException(msgException.getMessage());
    }
  }

  ///////////////////////LAUNCH GAME//////////////////////////
  protected void ifNullLaunchRequestException(Object obj, Message msgException)
      throws BadRequestException {
    if (obj == null) {
      throw new BadRequestException(msgException.getMessage());
    }
  }

  protected void ifNullOrBlankLaunchRequestException(Object obj, Message msgException)
      throws BadRequestException {
    if (obj == null || obj.toString().isBlank()) {
      throw new BadRequestException(msgException.getMessage());
    }
  }

  protected void ifNullLaunchResponseDataException(Object obj, Message msgException)
      throws OperatorModuleDataException {
    if (obj == null) {
      throw new OperatorModuleDataException(msgException.getMessage());
    }
  }

  protected void ifNullOrBlankLaunchResponseDataException(Object obj, Message msgException)
      throws OperatorModuleDataException {
    if (obj == null || obj.toString().isBlank()) {
      throw new OperatorModuleDataException(msgException.getMessage());
    }
  }
  
  protected boolean isNull(Object obj) {
    return obj == null;
  }
  
}