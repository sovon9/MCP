# MCP
implementation of Model Context Protocol using Spring AI

This implementation showcases how to build a mcp server in java
transportation type => <b><span style="color:green">streamable http</span></b>

## Dependencies
`spring-boot-starter-web`
`spring-ai-starter-mcp-server`

these dependencies can be added from spring initializer
add spring web and then mcp server

MCP server mainly needs tool that a LLM will use to get data
````
@McpTool(name = "sovon-github", description = "return sovon github link")
````
## @McpTool
used to declare a tool
### description
this is mainly what LLM will see and understand when and how to invoke the tool
the more precise and better you explain the better the LLM will work


## Execution with Claude Desktop
to use with claude desktop go to settings > develop > edit config
add mcpServers to <b>claude_desktop_config.json</b>

````
{
  "mcpServers": {
    "sovon-mcp": {
      "command": "npx",
      "args": [
        "mcp-remote",
		"http://127.0.0.1:8080/mcp"
      ]
    }
  }
}
````