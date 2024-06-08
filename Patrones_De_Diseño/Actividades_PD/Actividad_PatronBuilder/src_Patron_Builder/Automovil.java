class Automovil {
    private String motor;
    private int asientos;
    private String color;
    private boolean sistemaEntretenimiento;
    private String paqueteSeguridad;

    // Setters
    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSistemaEntretenimiento(boolean sistemaEntretenimiento) {
        this.sistemaEntretenimiento = sistemaEntretenimiento;
    }

    public void setPaqueteSeguridad(String paqueteSeguridad) {
        this.paqueteSeguridad = paqueteSeguridad;
    }

    // Getters
    public String getMotor() {
        return motor;
    }

    public int getAsientos() {
        return asientos;
    }

    public String getColor() {
        return color;
    }

    public boolean isSistemaEntretenimiento() {
        return sistemaEntretenimiento;
    }

    public String getPaqueteSeguridad() {
        return paqueteSeguridad;
    }

    @Override
    public String toString() {
        return "Automovil{" +
               "motor='" + motor + '\'' +
               ", asientos=" + asientos +
               ", color='" + color + '\'' +
               ", sistemaEntretenimiento=" + sistemaEntretenimiento +
               ", paqueteSeguridad='" + paqueteSeguridad + '\'' +
               '}';
    }
}


