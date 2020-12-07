package com.marisolgarcia2611.project21;

import android.content.Context;



public class VolleyS {
    private static VolleyS mVolleyS = null;
    private RequestQueue requestQueue;

    private VolleyS(Context context){
        requestQueue = Volley.newRequestQueue(context);
    }

    public static VolleyS getInstance(Context context){
        if(mVolleyS == null)
            mVolleyS = new VolleyS(context);
        return mVolleyS;
    }

    public RequestQueue getRequestQueue(){
        return requestQueue;
    }
}
