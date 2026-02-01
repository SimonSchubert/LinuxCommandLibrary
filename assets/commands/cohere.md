# TLDR

**Start interactive chat** session

```cohere```

**Switch to Command A** model

```cohere``` then ```:m a```

**Perform a web search** query

```:w [search query]```

**Upload a file** for analysis

```:u [path/to/file.pdf]```

**Display current model** information

```:i```

**Toggle debug mode** to see API calls

```:d```

# SYNOPSIS

**cohere**

# INTERACTIVE COMMANDS

**:w** _query_
> Execute a single-turn web search with citations.

**:u** _file_
> Upload PDF or TXT files for analysis (max 20MB).

**:m** _model_
> Switch between AI models. Aliases: r+ (Command R+), a (Command A).

**:i**
> Display current model information.

**:h**
> Show all available commands.

**:c**
> Clear terminal without losing conversation history.

**:d**
> Toggle debug mode to view API requests and responses.

**:q**
> Exit the application.

# DESCRIPTION

**cohere** is a command-line interface for chatting with Cohere's AI models directly from the terminal. It provides an interactive chat experience with multi-turn conversation support, maintaining context across exchanges.

The CLI supports Cohere's Command models including **Command R+** and **Command A** (their most performant model with 111B parameters and 256K context length). Users can switch models mid-conversation using the **:m** command with aliases like **r+**, **a**, or full model names.

Key features include web search integration via the Cohere connector, returning results with proper citations. File upload support allows analysis of PDF and TXT documents up to 20MB, with local preprocessing for PDFs using pdftotext.

Configuration is stored in **~/.config/cohere-cli/config.env** and conversation history persists in **~/.config/cohere-cli/chat-memory.json**. Optional context injection can include real-time information like location and local time.

# CAVEATS

Requires **curl**, **jq**, and **gum** to be installed. PDF processing requires **pdftotext** from the poppler-utils package. Needs a valid Cohere API key configured during first run. The CLI is a community-built tool, not officially maintained by Cohere.

# HISTORY

The cohere-cli tool was created as a community project to provide terminal access to Cohere's AI models. Cohere, founded in **2019** by former Google researchers, specializes in enterprise AI and natural language processing. Their Command model series has evolved from Command R and R+ to Command A, released in **March 2025** with enhanced reasoning capabilities.

# SEE ALSO

[anthropic](/man/anthropic)(1), [ollama](/man/ollama)(1), [llm](/man/llm)(1)
