package com.gotsulyak.mobiledb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MobileDeviceServiceImpl implements MobileDeviceService {
    private final MobileDeviceRepository mobileDeviceRepository;

    @Override
    public List<MobileDevice> findAll() {
        return mobileDeviceRepository.findAll();
    }
}

