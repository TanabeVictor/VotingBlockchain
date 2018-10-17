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
    final String PubKey = "pub-c-3701cc0b-3e9b-4f08-aad4-fb2c0a7de660";
    final String SubKey = "sub-c-bdb4e6fa-a701-11e8-b082-12b6fee23487";
    final String UserId = "Teste";
    final String kChannel = "Channel-uidsl5eko";
    PubNub pubnub;

public Configurador(){

        PNConfiguration pnConfiguration = new PNConfiguration();
        pnConfiguration.setPublishKey(PubKey);
        pnConfiguration.setSubscribeKey(SubKey);
        pnConfiguration.setUuid(UserId);
        pubnub = new PubNub(pnConfiguration);
}
    
        public void publish(String voto) {
                try {
			 pubnub.publish().channel(kChannel).message(voto).async(new PNCallback<PNPublishResult>() {
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