/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NAzT;

import java.util.ArrayList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author NAzT
 */
public class JGeoCoder {

    ArrayList output = null;

    public ArrayList getOutput() {
        return output;
    }

    JGeoCoder(String location) {
        
        GMapsGeoCoder geocoder = new GMapsGeoCoder();

        geocoder.setQuery(location);

        JSONObject json = JSONObject.fromObject(geocoder.getJsonObj());
        JSONArray jsonArray = JSONArray.fromObject(json);

        output = geocoder.getLatLon(jsonArray);

    }

    public static void main(String args[]) {
        JGeoCoder myobj = new JGeoCoder("Thammasat Rangsit");
        System.out.println(myobj.getOutput().get(0));
        JGeoCoder myobj2 = new JGeoCoder("ธรรมศาสตร์ รังสิต");
        System.out.println(myobj2.getOutput().get(0));
    }
}
