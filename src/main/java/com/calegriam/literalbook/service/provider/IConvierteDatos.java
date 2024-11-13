package com.calegriam.literalbook.service.provider;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);
}
