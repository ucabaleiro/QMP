package qmp.servicioClima;

public class ServicioClimaLocator {
  static private ServicioClimaLocator INSTANCE = new ServicioClimaLocator(new AccuWeatherAServicioClimaAdapter());
  static ServicioClima servicioClima;
  private ServicioClimaLocator(ServicioClima servicioClima) {
    this.servicioClima = servicioClima;
  }

  public ServicioClima getServicioClima() {
    return this.servicioClima;
  }

  public static ServicioClimaLocator getInstance() {
    return INSTANCE;
  }

  public static void setServicioClima(ServicioClima servicio) {
    servicioClima = servicio;
  }

}
