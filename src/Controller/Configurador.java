package Controller;

import com.pubnub.api.*;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.models.consumer.PNPublishResult;
import com.pubnub.api.models.consumer.PNStatus;
import java.util.Arrays;

public class Configurador {

    final String PubKey = "pub-c-31f3dfb1-6a10-41d4-9a28-79be076f44db";
    final String SubKey = "sub-c-37f4b6b8-d3ba-11e8-bbf2-f202706b73e5";
    final String UserId = "Urna";
    final String kChannel = "Votacao";
    PubNub pubnub;

    public Configurador() {

        PNConfiguration pnConfiguration = new PNConfiguration();
        pnConfiguration.setPublishKey(PubKey);
        pnConfiguration.setSubscribeKey(SubKey);
        pnConfiguration.setUuid(UserId);
        pubnub = new PubNub(pnConfiguration);
    }

    public void publish(String json) {
        try {
            pubnub.publish().channel(kChannel).message(json).async(new PNCallback<PNPublishResult>() {
                @Override
                public void onResponse(PNPublishResult result, PNStatus status) {
                    // handle publish response
                }
            });
            pubnub.subscribe()
                    .channels(Arrays.asList(kChannel)) // subscribe to channels
                    .withPresence() // also subscribe to related presence information
                    .execute();
        } catch (Exception e) {
            System.out.println("Error in configuration");
            e.printStackTrace();
        }
    }
}
