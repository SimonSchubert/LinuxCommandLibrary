# TAGLINE

AI agent framework with built-in tools

# TLDR

**Start an interactive chat session**

```bondai```

**Run BondAI in a Docker container** (recommended for code execution)

```docker run -it --rm -v ./agent-volume:/agent-volume -w /agent-volume -e OPENAI_API_KEY=[key] krohling/bondai:latest bondai```

**Set the required API key** before running

```export OPENAI_API_KEY=[sk-XXXXXXXXXX]```

# SYNOPSIS

**bondai** [_options_]

# DESCRIPTION

**BondAI** is an open-source framework for building AI agent systems. The CLI provides an interactive chat interface where users can communicate with an AI agent that has access to a powerful set of built-in tools for search, file operations, code execution, and external integrations.

The agent handles complex implementation details including memory and context management, error handling, and vector/semantic search. It can perform multi-step tasks autonomously, using tools as needed to accomplish goals.

Built-in tools include **DuckDuckGoSearchTool** and **GoogleSearchTool** for web search, **WebsiteQueryTool** for querying webpage content, **FileWriteTool** for file operations, **PythonREPLTool** for Python code execution, and **ShellTool** for shell access. Additional integrations support PostgreSQL databases, Gmail, Alpaca Markets for trading, and Bland AI for phone calls.

# TOOLS

**DuckDuckGoSearchTool**
> Web search without API key requirement.

**GoogleSearchTool**
> Web search (requires Google API key).

**WebsiteQueryTool**
> Query and extract content from webpages.

**FileWriteTool**
> Create and write files.

**PythonREPLTool**
> Execute Python code (Docker recommended).

**ShellTool**
> Execute shell commands (Docker recommended).

# CAVEATS

Requires an **OpenAI API key** set via the OPENAI_API_KEY environment variable. Tools that execute arbitrary code (**PythonREPLTool**) or access your shell (**ShellTool**) can potentially damage your system. Running BondAI in a **Docker container** is highly recommended when using these tools. Mount a volume to share files between your system and the agent's working directory.

# HISTORY

BondAI was created by **Kevin Rohling** and released as an open-source project on GitHub. It emerged during the AI agent development wave of **2023-2024**, designed to simplify the creation of autonomous AI systems by handling common implementation challenges like memory management and tool integration. The project supports multiple LLM providers including OpenAI and Azure OpenAI.

# SEE ALSO

[python](/man/python)(1), [docker](/man/docker)(1), [claude](/man/claude)(1)
