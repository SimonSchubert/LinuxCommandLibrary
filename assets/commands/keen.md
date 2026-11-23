# TAGLINE

Minimal terminal AI coding agent with pluggable LLM providers

# TLDR

**Start the agent** in the current directory

```keen```

**Run without a global install** via npx

```npx keen-code```

**Run a single headless turn** and print the result

```keen run "[Summarize the changes in the working tree]"```

**Pipe input** into a headless prompt

```cat [error.log] | keen run "[Explain this error]"```

**Get JSON output** with response, session ID and token usage

```keen run --format json "[prompt]"```

**Override provider and model** for one run

```keen run --provider [anthropic] --model [model_id] "[prompt]"```

**Loop-friendly run**: exit 0 only if the response contains a marker

```keen run --completion-signal "[DONE]" "[Fix the failing tests, end with DONE]"```

**Use custom model and MCP config files**

```keen --model-config [model-config.json] --mcp-config [mcp-config.json]```

**Check the installed version**

```keen --version```

# SYNOPSIS

**keen** [**--model-config** _file_] [**--mcp-config** _file_]

**keen run** [_options_] _prompt_

# PARAMETERS

**--model-config** _file_
> Load model and provider settings from _file_ instead of **~/.keen/configs.json**. Replaces the former **--config** flag.

**--mcp-config** _file_
> Load MCP servers from _file_ instead of **~/.keen/mcp/configs.json**, without merging.

**--version**
> Print the version and exit.

**run** _prompt_
> Execute one non-interactive turn and exit. Piped stdin is appended to the prompt; progress streams to stderr.

**--format** _text_|_json_
> Output format for **run** (default **text**).

**--session** _id_
> Resume an existing session in **run**.

**--provider** _id_, **--model** _id_
> Override the configured provider or model for this **run**.

**--completion-signal** _str_
> Exit 0 only if the response contains _str_, otherwise exit 2.

# SLASH COMMANDS

**/model**
> Switch provider or model, configure API keys, or sign in via OAuth.

**/thinking** _effort_
> Set the thinking effort level for the current model.

**/mode** [_plan_|_build_|_yolo_]
> Show or switch mode: read-only planning, normal building, or approval-less yolo. **Shift+Tab** cycles modes.

**/compact** [_prompt_]
> Summarize the conversation into a smaller context, optionally guided by _prompt_.

**/sessions**, **/resume**
> Pick a saved session for the current directory.

**/skills**, **/mcp**, **/subagents**, **/memory**
> Manage skills, MCP servers, subagent profiles and persistent memory.

**/adversary** [_prompt_]
> Have a separately configured model critique the main agent's work.

**/btw** _question_
> Ask a side question without adding it to the conversation.

**/clear**, **/new**
> Start a fresh session.

**/exit**
> Quit.

# DESCRIPTION

**keen** (distributed as **keen-code**) is a terminal-based coding agent written in Go, in the spirit of Claude Code or Codex CLI but deliberately lean. Its built-in tool set is small: **read_file**, **write_file**, **edit_file**, **glob**, **grep**, **bash**, **web_fetch**, **ask_user**, **todo_write**, **delegate_task** and **call_mcp_tool**. File edits use hash-anchored line references, so edits against stale content are rejected.

Invoking **keen** with no arguments opens an interactive TUI anchored at the current directory; **@** mentions reference files and **!** runs shell commands. **keen run** executes the same agent loop headlessly for scripts and autonomous loops.

The agent is provider-agnostic: Anthropic, OpenAI, Codex (ChatGPT OAuth), Google Gemini, DeepSeek, Kimi, GLM, MiniMax, OpenCode Go, Yolo-Auto and Amazon Bedrock, switchable at runtime with **/model**. It also supports MCP servers, skills (discovered from **.agents/skills**, **.keen/skills** and **.claude/skills**), subagents that run up to 10 delegated tasks in parallel, persistent memory, and automatic context compaction. By default only compact summaries of earlier tool results are kept between turns; **/tool-history full** retains full outputs.

# CONFIGURATION

**~/.keen/configs.json**
> Provider, model and global settings.

**~/.keen/mcp/configs.json**
> MCP server definitions.

**~/.keen/auth.json**
> OAuth credentials, for example for Codex.

**~/.keen/sessions/**
> Saved sessions, namespaced by working directory.

**.keen/permissions.json**
> Project-level tool permissions set with **/allow-permission**.

**~/.keen/memory/global/MEMORY.md**, **.keen/memory/MEMORY.md**
> Global and project memory loaded into every session.

# INSTALLATION

**Via npm** (installs the **keen** binary on **PATH**):

```npm install -g keen-code```

**Via the install script** (installs to **/usr/local/bin** or **$HOME/.local/bin**; rerun to update):

```curl -fsSL https://raw.githubusercontent.com/mochow13/keen-code/main/scripts/install.sh | bash```

# CAVEATS

The agent is intentionally opinionated and omits features its author considers unnecessary. Each provider needs its own credentials, and costs accrue against whichever model is selected. **yolo** mode skips every permission prompt, including for dangerous shell commands. A custom **--model-config** or **--mcp-config** file that is missing or invalid makes startup fail rather than fall back to the defaults.

# HISTORY

**keen-code** was started in February 2026 by **mochow13** and is published under the **MIT** license. Its code is written entirely by AI agents under human review, with prompts and design outputs archived in the **.ai-interactions/** directory. It began with a six-tool design and has since grown MCP, skills, subagents and a headless **run** mode, with frequent releases (0.72 by November 2026).

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1), [crush](/man/crush)(1), [aider](/man/aider)(1)

# RESOURCES

```[Source code](https://github.com/mochow13/keen-code)```

```[Homepage](https://mochow13.github.io/keen-code/)```

<!-- verified: 2026-11-23 -->
