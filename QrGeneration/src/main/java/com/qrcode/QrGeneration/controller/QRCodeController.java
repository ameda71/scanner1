package com.qrcode.QrGeneration.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qrcode.QrGeneration.service.QRCodeService;

@RestController
@RequestMapping("/api/qrcode")
public class QRCodeController {
    private final QRCodeService qrCodeService;

    public QRCodeController(QRCodeService qrCodeService) {
        this.qrCodeService = qrCodeService;
    }

    @GetMapping("/generate")
    public String generateQRCode(@RequestParam String data) {
        return qrCodeService.generateQRCode(data);
    }
}
