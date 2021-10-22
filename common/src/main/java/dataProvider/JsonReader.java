package dataProvider;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Iterator;

/**
 * @autor: Boris.Perez
 **/
public class JsonReader {
    /**
     * convertir string to json
     *
     * @param json
     * @return
     * @throws JSONException
     */
    public static JSONObject convertJSON(String json) throws JSONException {
        return new JSONObject(json);
    }


    public static String getValueFromJSON(String json, String propertyName) throws JSONException {
        String value = JsonReader.convertJSON(json).get(propertyName).toString();
        return value;
    }


    public static boolean areEqualJSON(String expectedResult, String actualResult) throws JSONException {
        boolean isEqual = true;

        JSONObject jsonExpectedResult = JsonReader.convertJSON(expectedResult);
        JSONObject jsonActualResult = JsonReader.convertJSON(actualResult);

        Iterator<?> keys = jsonExpectedResult.keys();

        while (keys.hasNext()) {
            String key = (String) keys.next();
            String actualValue = String.valueOf(jsonActualResult.get(key));
            String expectedValue = String.valueOf(jsonExpectedResult.get(key));

            if (expectedValue.equals("EXCLUDE")) {
                System.out.println("INFO > EXCLUDE, the attribute [" + key + "] no fue comparado");
            } else {
                if (!expectedValue.equals(actualValue)) {
                    System.out.println("INFO > COMPARING, the attribute [" + key + "]  actual value [" + actualValue + "] vs expected [" + expectedValue + "]");
                    isEqual = false;
                }
            }
        }
        return isEqual;
    }

    public static String ToJsonString(Object obj) throws IOException {
        String jsonString = "";
        ObjectMapper objMpr = new ObjectMapper();
        jsonString = objMpr.writeValueAsString(obj);
        return jsonString;
    }
}
