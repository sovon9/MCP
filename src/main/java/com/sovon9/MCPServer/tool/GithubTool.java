package com.sovon9.MCPServer.tool;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class GithubTool {

    //tools
    @Tool(name = "sovon-github", description = "return sovon github link")
    public String sovonGithubLink()
    {
        String link = """
                https://github.com/sovon9
                """;
        return link;
    }

}
