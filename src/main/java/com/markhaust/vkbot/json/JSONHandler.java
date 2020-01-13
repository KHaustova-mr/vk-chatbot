package com.markhaust.vkbot.json;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONHandler {
    private JSONObject json;

    public JSONHandler(JSONObject json) {
        this.json = json;
    }

    public JSONHandler(String JSONString) throws JSONException {
        json = new JSONObject(JSONString);
    }

    public JSONObject getJson() {
        return json;
    }

    public String getType() throws JSONException{
        return json.getString("type");
    }

    public JSONObject getVkObject(){
        return json.getJSONObject("object");
    }

    @Override
    public String toString(){
        return json.toString();
    }
}
