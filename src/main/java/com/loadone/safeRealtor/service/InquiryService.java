package com.loadone.safeRealtor.service;

import com.loadone.safeRealtor.model.Inquiry;
import com.loadone.safeRealtor.repository.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquiryService {

    @Autowired
    private InquiryRepository inquiryRepository;

    public Inquiry addInquiry(Inquiry inquiry) {
        return inquiryRepository.save(inquiry);
    }

    public List<Inquiry> getInquiriesByUserId(Long userId) {
        return inquiryRepository.findByUserId(userId);
    }

    public List<Inquiry> getInquiriesByPropertyId(Long propertyId) {
        return inquiryRepository.findByPropertyId(propertyId);
    }
}
