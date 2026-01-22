# TLDR

**Start an interactive session** in the current directory

```claude```

**Start with an initial prompt**

```claude "[prompt]"```

**Run a one-off command** and exit (non-interactive)

```claude -p "[prompt]"```

**Continue the most recent** conversation

```claude -c```

**Resume a specific session** by ID or name

```claude -r "[session_id]" "[prompt]"```

**Pipe input** to Claude

```cat [file.txt] | claude -p "[analyze this code]"```

**Output response as JSON**

```claude -p "[prompt]" --output-format json```

**Specify a different model**

```claude --model [opus]```

# SYNOPSIS

**claude** [_options_] [_prompt_]

**claude** **update**

**claude** **mcp** [_subcommand_]

# PARAMETERS

**-p**, **--print**
> Print mode: process prompt and exit without interactive session.

**-c**, **--continue**
> Continue the most recent conversation.

**-r** _ID_, **--resume** _ID_
> Resume a specific conversation by session ID or name.

**-v**, **--version**
> Display version information.

**--model** _MODEL_
> Specify the Claude model to use (aliases: sonnet, opus, haiku, or full model name).

**--max-turns** _N_
> Maximum number of agentic turns in non-interactive mode.

**--max-budget-usd** _AMOUNT_
> Maximum dollar amount for API calls (print mode only).

**--output-format** _FORMAT_
> Output format: text, json, or stream-json.

**--input-format** _FORMAT_
> Input format for print mode.

**--tools** _TOOLS_
> Restrict available built-in tools (e.g., "Bash,Edit,Read").

**--allowedTools** _TOOLS_
> Tools that execute without prompting.

**--disallowedTools** _TOOLS_
> Tools removed from context.

**--permission-mode** _MODE_
> Begin in specified permission mode (e.g., plan).

**--system-prompt** _PROMPT_
> Replace the entire default system prompt.

**--append-system-prompt** _PROMPT_
> Append additional instructions to the default prompt.

**--add-dir** _PATHS_
> Add additional working directories.

**--mcp-config** _FILE_
> Load MCP servers from JSON configuration file.

**--chrome**
> Enable Chrome browser integration.

**--ide**
> Auto-connect to IDE on startup.

**--remote**
> Create web session on claude.ai.

**--teleport**
> Resume web session in local terminal.

**--verbose**
> Enable verbose logging output.

**--debug** _FILTER_
> Enable debug mode with optional filtering.

**--dangerously-skip-permissions**
> Skip permission prompts (use with caution in trusted environments).

**--help**
> Display help information.

# SLASH COMMANDS

**/init**
> Initialize and generate a CLAUDE.md file for the project.

**/clear**
> Reset conversation context.

**/model**
> Switch between available models.

**/compact**
> Manually compress conversation history.

**/cost**
> Display session cost information.

**/help**
> Display available commands and options.

# DESCRIPTION

**Claude Code** is Anthropic's official command-line interface for interacting with Claude AI. It provides an agentic coding assistant that can read, write, and execute code directly in your development environment.

The tool operates in two main modes: interactive mode for extended sessions with ongoing dialogue, and print mode (-p) for scripted automation and one-off commands. Claude can navigate codebases, edit files, run shell commands, and perform complex multi-step development tasks.

Claude Code integrates with your terminal environment, understanding project context through file access and command execution. It maintains conversation history across sessions, allowing you to resume previous discussions. The tool supports piping input from other commands and outputting structured JSON for integration with other tools.

Special syntax includes **@** for file references and **!** for direct shell command execution. The CLI supports MCP (Model Context Protocol) servers for extending capabilities and can connect to IDEs and Chrome for enhanced integration.

# CAVEATS

Requires authentication via Anthropic API key or active Claude subscription. Commands executed by Claude run with your user permissions. The **--dangerously-skip-permissions** flag bypasses safety prompts and should only be used in controlled CI/CD environments. Session persistence and API costs apply based on usage.

# HISTORY

Claude Code was released by **Anthropic** in **February 2025** as part of their developer tools initiative. It represents a shift toward AI-assisted development workflows, building on Claude's code understanding capabilities to provide an agentic terminal experience. By **December 2025**, Anthropic launched an official plugin marketplace with curated extensions. The tool continues active development with regular updates adding features like async sub-agents, Chrome integration, and enhanced MCP support.

# SEE ALSO

[copilot](/man/copilot)(1), [grok](/man/grok)(1), [gh](/man/gh)(1), [git](/man/git)(1)
