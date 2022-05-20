package qmp;

public class ServicioClimaLocator {
  static private ServicioClimaLocator INSTANCE = new ServicioClimaLocator(AccuWeatherAServicioClimaAdapter.getInstance());
  ServicioClima servicioClima;
  private ServicioClimaLocator(ServicioClima servicioClima) {
    this.servicioClima = servicioClima;
  }

  public ServicioClima getServicioClima() {
    return this.servicioClima;
  }

  public static ServicioClimaLocator getInstance() {
    return INSTANCE;
  }

  public static void setInstance(ServicioClimaLocator servicioClima) {
    INSTANCE = servicioClima;
  }

}
