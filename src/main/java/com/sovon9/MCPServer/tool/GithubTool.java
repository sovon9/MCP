package com.sovon9.MCPServer.tool;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;

@Component
public class GithubTool {

    //tools
    @McpTool(name = "sovon-github", description = "return sovon github link")
    public String sovonGithubLink()
    {
        String link = """
                https://github.com/sovon9
                """;
        return link;
    }

}
