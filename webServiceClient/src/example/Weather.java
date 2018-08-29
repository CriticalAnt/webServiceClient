package example;

import com.test.client.weather.WeatherWebServiceLocator;
import com.test.client.weather.WeatherWebServiceSoap_PortType;

public class Weather {
    public static void main(String[] args) throws Exception {

        WeatherWebServiceLocator locator = new WeatherWebServiceLocator();
        WeatherWebServiceSoap_PortType service = locator.getWeatherWebServiceSoap();

        String[] res = service.getWeatherbyCityName("绍兴");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}