class SedanBuilder implements AutomovilBuilder {
    private Automovil automovil;

    public SedanBuilder() {
        this.automovil = new Automovil();
    }

    @Override
    public void buildMotor() {
        automovil.setMotor("Motor de 4 cilindros");
    }

    @Override
    public void buildAsientos(int numeroAsientos) {
        automovil.setAsientos(numeroAsientos);
    }

    @Override
    public void buildColor(String color) {
        automovil.setColor(color);
    }

    @Override
    public Automovil obtenerAutomovil() {
        return automovil;
    }
}
