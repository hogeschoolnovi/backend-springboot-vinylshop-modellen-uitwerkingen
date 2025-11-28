package nl.novi.vinylshop.mappers;

import nl.novi.vinylshop.entities.BaseEntity;


import java.util.List;
import java.util.function.Supplier;

public interface DTOMapper<RESPONSE, REQUEST , T extends BaseEntity> {
    RESPONSE mapToDto(T model);

    List<RESPONSE> mapToDto(List<T> models);

    T mapToEntity(REQUEST genreModel);
}
