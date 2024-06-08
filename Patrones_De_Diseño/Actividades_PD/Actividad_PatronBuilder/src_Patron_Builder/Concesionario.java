class Concesionario {
    public Automovil construirAutomovil(AutomovilBuilder builder) {
        builder.buildMotor("Motor V6");
        builder.buildAsientos(5);
        builder.buildColor("Azul Metálico");
        builder.buildSistemaEntretenimiento(true);
        builder.buildPaqueteSeguridad("Avanzado");
        return builder.obtenerAutomovil();
    }
}
