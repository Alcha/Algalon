package org.alcha.algalona.network;

import org.alcha.algalona.models.wow.Locale;
import org.alcha.algalona.models.wow.Region;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * <p>Created by Alcha on 8/1/2017.</p>
 */
public class AlgalonClient {
    private static final String LOG_TAG = "AlgalonClient";
    private static String mApiKey;
    private static Locale mLocale = Locale.en_US;
    private static Region mRegion = Region.US;
    private static String mBaseUrl = "https://" + mRegion + ".api.battle.net";

    private AlgalonClient(String apiKey, Locale locale, Region region) {
        mApiKey = apiKey;
        mLocale = locale;
        mRegion = region;
    }

    public static AlgalonClient newInstance(String apiKey, Locale locale, Region region) {
        return new AlgalonClient(apiKey, locale, region);
    }

    public static AlgalonClient newUSInstance(String apiKey) {
        return new AlgalonClient(apiKey, Locale.en_US, Region.US);
    }

    public void executeRequest(GameRequest request, Callback callback) {
        get(getAbsoluteUrl(request.getRelativeUrl()), callback);
    }

    public void executeRequests(GameRequest[] requests, Callback callback) {
        for (GameRequest request : requests) {
            get(getAbsoluteUrl(request.getRelativeUrl()), callback);
        }
    }

    public static void get(String strUrl, Callback callback) {
        URL url = null;
        try {
            url = new URL(strUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        new ApiCall(callback).execute(url);
    }

    private String getAbsoluteUrl(String relativeUrl) {
        if (relativeUrl.contains("?"))
            return mBaseUrl + relativeUrl + "&locale=" + mLocale + "&apikey=" + mApiKey;
        else
            return mBaseUrl + relativeUrl + "?locale=" + mLocale + "&apikey=" + mApiKey;
    }

    public static Region getClientRegion() {
        return mRegion;
    }
}
