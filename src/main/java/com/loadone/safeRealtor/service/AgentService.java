package com.loadone.safeRealtor.service;

import com.loadone.safeRealtor.model.entity.Agent;
import com.loadone.safeRealtor.repository.AgentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgentService {

    private final AgentRepository agentRepository;

    public Agent registerAgent(Agent agent) {
        return agentRepository.save(agent);
    }

    public Agent updateAgent(Agent agent) {
        Agent existingAgent = agentRepository.findById(agent.getId()).orElseThrow();
        existingAgent.setName(agent.getName());
        existingAgent.setLicenseNumber(agent.getLicenseNumber());
        existingAgent.setPhoneNumber(agent.getPhoneNumber());
        existingAgent.setEmail(agent.getEmail());
        return agentRepository.save(existingAgent);
    }
}
