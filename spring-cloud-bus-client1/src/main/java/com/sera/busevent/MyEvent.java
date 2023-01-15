package com.sera.busevent;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.bus.event.PathDestinationFactory;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MyEvent extends RemoteApplicationEvent {
    private String message;

    public MyEvent(Object source, String originService, String destination, String message) {
        super(source, originService, new PathDestinationFactory().getDestination(destination));
        this.message = message;
    }

}
