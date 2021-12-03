package com.project.budgetmensile.exceptions;

import com.project.budgetmensile.controller.TransazioneController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(
        annotations = RestController.class,
        basePackages = "com.project.budgetmensile.controller",
        assignableTypes = {TransazioneController.class}
)
public class TransazioneControllerAdvice {

    private static final Logger logger = LoggerFactory.getLogger(TransazioneControllerAdvice.class);

    @ExceptionHandler(value = {EmptyResultDataAccessException.class})
    public ResponseEntity<Object> handleEmptyResultDataAccessException(EmptyResultDataAccessException ex) {
        logger.error("I dati di interazione non sono presenti", ex.getMessage());
        return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NO_CONTENT);
    }


}
