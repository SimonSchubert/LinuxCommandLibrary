# TAGLINE

AI-powered terminal coding agent by xAI

# TLDR

**Start an interactive session** in the current directory

```grok```

**Start in a specific directory**

```grok -d [path/to/project]```

**Run a one-off command** and exit (headless mode)

```grok -p "[prompt]"```

**Specify a different model**

```grok -m [grok-4-latest]```

**Run with custom API key**

```grok -k [your_api_key]```

**Add an MCP server**

```grok mcp add [server-name] --transport stdio --command bun --args [server.js]```

# SYNOPSIS

**grok** [_options_] [_prompt_]

**grok** **mcp** **add** _server-name_ [_--transport type_] [_--command cmd_] [_--args args_]

# PARAMETERS

**-V**, **--version**
> Display version information.

**-d**, **--directory** _path_
> Set working directory for the session.

**-k**, **--api-key** _key_
> Provide xAI Grok API credentials.

**-u**, **--base-url** _url_
> Custom API endpoint (default: https://api.x.ai/v1).

**-m**, **--model** _model_
> Specify AI model (grok-4-latest, grok-3-latest, grok-3-fast, grok-3-mini-fast, grok-code-fast-1).

**-p**, **--prompt** _text_
> Execute single prompt in headless mode and exit.

**--max-tool-rounds** _n_
> Limit the number of tool execution rounds.

**-h**, **--help**
> Display help documentation.

# DESCRIPTION

**Grok CLI** is an open-source AI agent that brings xAI's Grok directly into the terminal. It provides a conversational interface for coding assistance, file operations, and shell command execution through natural language.

The tool operates in two modes: interactive mode for extended sessions with ongoing dialogue, and headless mode (**-p**) for scripted automation and one-off commands. Grok can navigate codebases, view and edit files, run bash commands, and intelligently select appropriate tools for requested tasks.

# CONFIGURATION

**~/.grok/user-settings.json**
> User-level settings including API key, model preferences, and default behaviors.

**.grok/settings.json**
> Project-level settings for tool permissions and configuration.

**.grok/GROK.md**
> Project-level custom instructions loaded automatically.

# CAVEATS

Requires an **xAI API key** which must be obtained from the xAI API Console. The CLI uses the xAI API endpoint by default and requires Node.js version 18 or higher. API usage is subject to xAI's rate limits and billing. The Morph Fast Apply feature for high-speed code editing requires additional configuration.

# HISTORY

Grok CLI emerged as an open-source project in **2024** following xAI's public release of their Grok API. Built by the Superagent AI community, it provides terminal access to xAI's Grok models. The tool gained significant traction in **2025** as a challenger to proprietary coding assistants, with xAI announcing their official **Grok Build** coding agent in **January 2026** to provide first-party CLI support.

# SEE ALSO

[claude](/man/claude)(1), [copilot](/man/copilot)(1), [gh](/man/gh)(1)
