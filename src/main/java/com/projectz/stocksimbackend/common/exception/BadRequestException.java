package com.projectz.stocksimbackend.common.exception;

public class BadRequestException extends Exception {
  public BadRequestException(String message){
    super(message);
  }
}
