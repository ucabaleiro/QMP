package qmp;

import java.util.List;
import java.util.Map;

public class AccuWeatherAServicioClimaAdapter implements ServicioClima{

  static private AccuWeatherAServicioClimaAdapter INSTANCE = new AccuWeatherAServicioClimaAdapter();
  AccuWeatherAPI api;


  private AccuWeatherAServicioClimaAdapter() {
    this.api = new AccuWeatherAPI();
  }

  static public AccuWeatherAServicioClimaAdapter getInstance() {
    return INSTANCE;
  }

  private List<Map<String, Object>> getCondicionesClimaticas() {
    return api.getWeather("Buenos Aires, Argentina");
  }

  @Override
  public Integer getTemperatura() {
    Map<String, Object> condiciones = getCondicionesClimaticas().get(0);
    Map<String, Object> temperatura = (Map<String, Object>) condiciones.get("Temperature");
    return (Integer) temperatura.get("Value");
  }
}
