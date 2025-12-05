package com.example.first_mcp_server;

import java.util.logging.Logger;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Component;

@Component
public class HelloTool {

    private static final Logger logger = Logger.getLogger(HelloTool.class.getName());

    // tool
    @McpTool(name = "greet_tool", description = "A tool that greets the user by name")
    public String greet(@McpToolParam String name) {
        logger.info("Greet method called with name: " + name);
        return "Hello, " + name + "!";
    }

    // resources

    // prompts

}
