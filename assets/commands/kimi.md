# TAGLINE

moonshot AI's command-line agent for AI-driven coding and terminal operations

# TLDR

**Start an interactive session** in the current project

```kimi```

Run a **single prompt** non-interactively and print the result

```kimi -p "[prompt]"```

**Continue** the most recent session in this directory

```kimi -c```

**Resume** a specific session, or pick one from a list

```kimi -S [session_id]```

Start with a **specific model**

```kimi -m [model]```

Start in **Plan mode** for read-only exploration

```kimi --plan```

**Log in** without opening the interactive UI

```kimi login```

**Start as ACP server** for IDE integration

```kimi acp```

# SYNOPSIS

**kimi** [_options_]

**kimi** _command_ [_options_]

# PARAMETERS

**-p**, **--prompt** _PROMPT_
> Run a single prompt non-interactively and write the answer to stdout.

**--output-format** _text_|_stream-json_
> Output format for non-interactive runs.

**-c**, **--continue**
> Resume the most recent session in the current directory.

**-S**, **--session** [_ID_]
> Resume a previous session; without an ID a session picker opens.

**-m**, **--model** _MODEL_
> Model alias to use for this launch.

**-y**, **--yolo**
> "Ask When Needed" mode: routine edits and commands run without approval.

**--auto**
> "Never Ask" mode: never interrupts for approval.

**--plan**
> Start in Plan mode (read-only exploration).

**--agent** _NAME_, **--agent-file** _PATH_
> Use a named agent, or load a custom agent from a Markdown file, as the main agent.

**--skills-dir** _DIR_
> Load skills from an extra directory (repeatable).

**--add-dir** _DIR_
> Add an extra workspace directory (repeatable).

**-V**, **--version**
> Print the version.

**-h**, **--help**
> Show help.

# COMMANDS

**login**
> Log in via OAuth without opening the TUI

**acp**
> Start as Agent Client Protocol server for IDE integration (Zed, JetBrains)

**web**
> Run a local server with a web UI

**doctor**
> Validate configuration files

**export** [_session_id_]
> Package a session into a ZIP file

**provider** _add_|_remove_|_list_|_catalog_
> Manage model providers

**migrate**
> Import config, MCP servers and sessions from the legacy Python Kimi CLI

**upgrade**
> Check for and install updates

# KEYBOARD SHORTCUTS

**!**
> Enter shell mode (on an empty input line) to run shell commands directly

**Shift+Tab**
> Toggle Plan mode

**Ctrl+G**
> Edit the input in an external editor

**Esc**
> Interrupt the current turn

# DESCRIPTION

**Kimi Code CLI** is Moonshot AI's command-line agent for AI-driven coding and terminal operations. It can read and edit code, run shell commands, search files, fetch web pages, and plan its next steps based on feedback. It works with Moonshot AI's Kimi models out of the box and can be configured for other compatible providers.

Interactive sessions offer slash commands such as **/login**, **/model**, **/plan**, **/sessions** and **/mcp-config**. MCP servers are configured in **~/.kimi-code/mcp.json** (user level) or **.kimi-code/mcp.json** (project level), or conversationally with **/mcp-config**.

# CAVEATS

Requires a Kimi Code account or a Moonshot AI Open Platform API key (run **/login** on first launch). The **kimi mcp** subcommands and **Ctrl+X** shell toggle of the legacy Python Kimi CLI do not exist in Kimi Code CLI; use **/mcp-config** and **!** instead.

# HISTORY

Moonshot AI first released **Kimi CLI** in 2025 as an open-source Python tool (Apache 2.0) built around the Kimi K2 models. In **2026** it was archived and replaced by **Kimi Code CLI**, a TypeScript rewrite distributed as a single binary under the MIT license, which keeps the **kimi** command name and can migrate legacy data from **~/.kimi/** with **kimi migrate**.

# SEE ALSO

[claude](/man/claude)(1), [gemini](/man/gemini)(1), [codex](/man/codex)(1), [qwen-code](/man/qwen-code)(1), [opencode](/man/opencode)(1)

# RESOURCES

```[Source code](https://github.com/MoonshotAI/kimi-code)```

```[Documentation](https://moonshotai.github.io/kimi-code/en/)```

<!-- verified: 2026-09-29 -->
