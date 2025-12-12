package com.example.first_mcp_server;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @McpTool(name = "add",  description = "Performs adding operations.")
    public int add(@McpToolParam int a, @McpToolParam int b) {
        return a + b;
    }

    @McpTool(name = "subtract",  description = "Performs subtracting operations.")
    public int subtract(@McpToolParam int a, @McpToolParam int b) {
        return a - b;
    }

    @McpTool(name = "multiply",  description = "Performs multiplying operations.")
    public int multiply(@McpToolParam int a, @McpToolParam int b) {
        return a * b;
    }
    
    @McpTool(name = "divide",  description = "Performs dividing operations.")
    public int divide(@McpToolParam int a, @McpToolParam int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
