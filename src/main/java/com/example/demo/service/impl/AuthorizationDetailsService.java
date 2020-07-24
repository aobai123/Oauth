package com.example.demo.service.impl;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;

public class AuthorizationDetailsService implements ClientDetailsService {


    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {

        return null;

    }


}
