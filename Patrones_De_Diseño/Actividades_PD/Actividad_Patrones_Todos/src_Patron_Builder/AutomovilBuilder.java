interface AutomovilBuilder {
    void buildMotor(String tipoMotor);
    void buildAsientos(int numeroAsientos);
    void buildColor(String color);
    void buildSistemaEntretenimiento(boolean tiene);
    void buildPaqueteSeguridad(String paquete);
    Automovil obtenerAutomovil();
}
