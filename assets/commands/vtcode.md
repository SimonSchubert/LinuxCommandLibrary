# TAGLINE

Semantic AI coding agent with multi-provider LLM support

# TLDR

**Launch** the interactive coding agent in the current directory

```vtcode```

**Ask** the agent a one-off question and exit

```vtcode ask "[explain the project structure]"```

**Execute** a shell command through the agent's safe runner

```vtcode exec "[cargo test]"```

**Use** a specific model provider and model

```vtcode --provider [anthropic] --model [claude-sonnet-4-5]```

**Run** against an alternate workspace directory

```vtcode --workspace [path/to/repo]```

**Open** the configuration file for editing

```vtcode config edit```

**Print** the resolved configuration

```vtcode config show```

**Authenticate** with a provider via OAuth

```vtcode /login```

# SYNOPSIS

**vtcode** [_global-flags_] [_subcommand_] [_args_]

# PARAMETERS

**ask** _prompt_
> Send a single prompt to the configured model and print the response.

**exec** _command_
> Run _command_ through the agent's policy-aware shell runner with **tree-sitter-bash** validation.

**config** [**show**|**edit**|**path**]
> Inspect or edit the **vtcode.toml** configuration.

**--provider** _name_
> Override the default LLM provider (e.g. **openai**, **anthropic**, **deepseek**, **gemini**, **ollama**, **lmstudio**).

**--model** _id_
> Override the default model id for the selected provider.

**--workspace** _path_
> Set the working directory the agent operates in (defaults to **$PWD**).

**--config** _file_
> Use _file_ instead of the default **vtcode.toml**.

**--no-tools**
> Disable tool execution; the agent only emits text.

**--yes**
> Auto-approve tool calls instead of prompting per action.

**-v**, **--verbose**
> Increase log verbosity.

**--version**
> Print the version and exit.

**-h**, **--help**
> Show usage information.

# SLASH COMMANDS

**/login**
> Run an OAuth flow to authenticate with the active provider.

**/agent**
> Inspect delegated subagents in the current session.

**/agents active**
> List currently running subagents.

**/subprocesses**
> Open the local agents drawer (also bound to **Alt+S**).

# DESCRIPTION

**vtcode** is an open-source semantic coding agent written in **Rust**. It connects to one or more LLM providers and exposes a tool-using assistant that can read, edit, and execute code inside a workspace. A Tree-sitter-based parser gives the agent structural understanding of source files in many languages, enabling targeted edits rather than blind text rewrites.

Tool execution is gated by a configurable policy: each tool can be set to **allow**, **deny**, or **prompt**, and shell commands are statically validated with **tree-sitter-bash** before being run. Sandboxing keeps file operations within the configured workspace boundary.

Multi-provider support — **OpenAI**, **Anthropic**, **DeepSeek**, **Gemini**, **Z.AI**, **Moonshot**, **OpenRouter**, **MiniMax**, **Ollama**, **LM Studio** — is wired through a single configuration file with automatic failover, prompt caching, and context-window-aware truncation.

# CONFIGURATION

User configuration lives in **vtcode.toml** (project-level) or **~/.config/vtcode/vtcode.toml** (global). Common keys:

> **[providers.<name>]** — API base URL and credential source for each provider.
> **[oauth]** — OAuth client settings; tokens are stored in the OS keychain.
> **[tools]** — per-tool allow/deny/prompt policies.
> **[workspace]** — root path and ignore globs.
> **[security]** — shell sandbox, command allow/deny lists, max output size.
> **[context]** — context window budget and truncation strategy.
> **[hooks]** — shell commands to run on lifecycle events (session start, tool call, etc.).

Secrets are typically read from environment variables (e.g. **OPENAI_API_KEY**, **ANTHROPIC_API_KEY**, **GEMINI_API_KEY**) or from the OS-native credential store.

# KEYBOARD SHORTCUTS

```
Ctrl+B   Toggle background subagent
Alt+S    Open Local Agents drawer
Ctrl+C   Cancel current request
```

# CAVEATS

vtcode is **pre-1.0** — flags, configuration keys, and slash commands change between releases. LLM providers may charge per token; review **[security]** policies before enabling auto-approve (**--yes**) on a real codebase. Some features (Zed editor integration, A2A protocol, sandbox isolation) require additional setup beyond the default install.

# HISTORY

**vtcode** is developed by **Vinh Nguyen** (**vinhnx**) and published at **github.com/vinhnx/vtcode**. It is distributed via **Cargo** (**cargo install vtcode**), **Homebrew** (**brew install vtcode**), and an install script. Releases are published under an open-source license on GitHub.

# SEE ALSO

[claude](/man/claude)(1), [aider](/man/aider)(1), [gh](/man/gh)(1), [cargo](/man/cargo)(1)
