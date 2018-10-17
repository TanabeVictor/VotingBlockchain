/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import com.pubnub.api.*;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.models.consumer.PNPublishResult;
import com.pubnub.api.models.consumer.PNStatus;
import java.util.Arrays;

public class Configurador {
    final String PubKey = "pub-c-7947a40f-0e54-44a4-b7ec-d96d3524b9a2";
    final String SubKey = "sub-c-51fff0a6-d20f-11e8-a32a-d26163efeea1";
    final String UserId = "Teste";
    final String kChannel = "Default";
    PubNub pubnub;

public Configurador(){

        PNConfiguration pnConfiguration = new PNConfiguration();
        pnConfiguration.setPublishKey(PubKey);
        pnConfiguration.setSubscribeKey(SubKey);
        pnConfiguration.setUuid(UserId);
        pubnub= new PubNub(pnConfiguration);}
    
        public void publish() {
                try {
			 pubnub.publish().channel(kChannel).message("pres").async(new PNCallback<PNPublishResult>() {
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