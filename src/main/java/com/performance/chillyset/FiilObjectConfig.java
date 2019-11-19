package com.performance.chillyset;

import com.performance.chillyset.model.HugeObject;
import com.performance.chillyset.service.HugeObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class FiilObjectConfig {

    @Autowired
    HugeObjectService hugeObjectService;

    @Value("${active.huge.object}")
    boolean activation;

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        if (activation) {
            // Fill data base with a lot of objects.
            for (int i =0; i <= 10000; i++){
                HugeObject hugeObject = new HugeObject();
                hugeObject.setId(i);
                hugeObject.setName("huge_"+i);
                hugeObject.setComment(i+" Cognitis enim pilatorum caesorumque funeribus nemo deinde ad has stationes appulit navem");

                hugeObjectService.create(hugeObject);
            }
        }
    }
}
