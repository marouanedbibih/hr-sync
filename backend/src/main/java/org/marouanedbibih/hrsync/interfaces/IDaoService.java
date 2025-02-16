package org.marouanedbibih.hrsync.interfaces;

import java.util.List;

import org.marouanedbibih.hrsync.exception.AlreadyExistException;
import org.marouanedbibih.hrsync.exception.MyNotDeleteException;
import org.marouanedbibih.hrsync.exception.MyNotFoundException;
import org.marouanedbibih.hrsync.exception.MyNotSave;

public interface IDaoService<E, DTO, CREQ, UREQ, ID> {
    DTO create(CREQ req) throws MyNotSave, AlreadyExistException;

    DTO update(UREQ req,ID id) throws MyNotSave, AlreadyExistException;

    List<DTO> getAll();

    DTO get(ID id) throws MyNotFoundException;

    void delete(ID id) throws MyNotFoundException, MyNotDeleteException;
}
