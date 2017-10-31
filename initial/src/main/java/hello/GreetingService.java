package hello;

import org.springframework.stereotype.Service;

@Service
public interface GreetingService
{
    public String getGreeting(String name);
}

