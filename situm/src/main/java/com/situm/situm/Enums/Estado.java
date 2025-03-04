package com.situm.situm.Enums;

/**
 * Enumerado que contiene los estados de las habitaciones, 
 * esto se hace para tener más control sobre los datos que se ingresan en la base datos 
 * debido a que estos datos son fijos. Con esto evitamos errores innecesarios a la hora de introducir datos en la base de datos
 */
public enum Estado {
    Disponible,
    Ocupado,
    Reservado,
    Mantenimiento
}
