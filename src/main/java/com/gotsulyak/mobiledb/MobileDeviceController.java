package com.gotsulyak.mobiledb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MobileDeviceController {
    private final MobileDeviceService mobileDeviceService;

    @GetMapping(path = "/mobile_device")
    public @ResponseBody List<MobileDevice> getAllMobileDevices() {
        return mobileDeviceService.findAll();
    }
}
