package com.sera;

import com.sera.busevent.MyEvent;
import lombok.AllArgsConstructor;
import org.springframework.cloud.bus.BusProperties;
import org.springframework.cloud.bus.event.Destination;
import org.springframework.cloud.bus.event.PathDestinationFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RemoteEventPublisher {

//    private final String destination = "client2";
//    private final BusProperties busProperties;
//    private final MessageSource messageSource;
//
//    private final ApplicationEventPublisher eventPublisher;
//
//    public void publishMyEvent() {
//        Boolean email = true;
//        String userId = "srlee@maxst.com";
//        MyEvent myEvent = new MyEvent(this, busProperties.getId(), destination, userId, email);
//        eventPublisher.publishEvent(myEvent);
//    }
}
