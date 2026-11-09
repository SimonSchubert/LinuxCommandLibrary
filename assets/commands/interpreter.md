# TAGLINE

Terminal coding agent for open and low-cost language models

# TLDR

**Start an interactive session**

```interpreter```

**Start a session with an initial prompt**

```interpreter "[fix the failing test]"```

**Use a specific model**

```interpreter --model [model]```

**Use a local model via Ollama or LM Studio**

```interpreter --oss --local-provider [ollama]```

**Resume the most recent session**

```interpreter resume --last```

**Run one task non-interactively**

```interpreter exec "[find one bug in src/parser.rs]"```

**Read the task from stdin**

```cat [task.md] | interpreter exec -```

**Run read-only, with no write access**

```interpreter --sandbox read-only```

# SYNOPSIS

**interpreter** [_options_] [_prompt_]

**interpreter** _command_ [_options_]

# PARAMETERS

_PROMPT_
> Optional initial prompt.

**-m**, **--model** _MODEL_
> Override the configured model.

**-i**, **--image** _PATH_
> Attach image files to the initial prompt (comma-separated).

**--oss**
> Use the configured local open source provider.

**--local-provider** _PROVIDER_
> Use ollama or lmstudio with **--oss**.

**-p**, **--profile** _NAME_
> Load a config profile.

**-s**, **--sandbox** _MODE_
> Select read-only, workspace-write or danger-full-access.

**-a**, **--ask-for-approval** _POLICY_
> Select untrusted, on-request or never.

**-C**, **--cd** _PATH_
> Start in another working directory.

**--add-dir** _PATH_
> Add a writable workspace root.

**--search**
> Request live web search.

**--enable** _FEATURE_
> Enable a feature for this run.

**--disable** _FEATURE_
> Disable a feature for this run.

**-c**, **--config** _KEY=VALUE_
> Override a config value for this run.

**--no-alt-screen**
> Disable alternate-screen TUI mode.

**--yolo**
> Bypass approvals and sandboxing. Dangerous.

**resume**
> Resume an interactive session.

**fork**
> Fork an interactive session.

**exec**
> Run non-interactively. Accepts **--json**, **--output-schema** _FILE_ and **-o**, **--output-last-message** _FILE_.

**mcp**
> Manage MCP server config.

**mcp-server**
> Expose Open Interpreter as an MCP server over stdio.

**update**
> Run the configured installer for the latest release.

# DESCRIPTION

**Open Interpreter** is a coding agent that lives in the terminal. It reads and edits files and runs commands, and is designed to get good results from low-cost and open models. It is a fork of OpenAI's Codex and keeps a Codex-style surface: sessions, MCP, AGENTS.md, skills, hooks, permissions and subagents.

The command is also installed as **i**. Configuration lives in **~/.openinterpreter/config.toml** or **.openinterpreter/config.toml** in a project. Use **/model** in the composer to switch models during a session.

# CAVEATS

Older tutorials describe the legacy Python version, whose flags such as **-y**, **--local**, **--os** and **--fast** and whose **%** session commands do not apply to the current CLI. **pip install open-interpreter** installs that legacy version. A zero exit status from **interpreter exec** means the turn completed, not that the requested change happened, so check the outputs in automation.

# HISTORY

Open Interpreter was created by **Killian Lucas** in **2023** as a Python tool that let language models run code locally. The last Python releases were in the **0.4** series from late **2024**. It was later rewritten as a Rust coding agent forked from Codex, and the Python version continues as a community fork at **endolith/open-interpreter**.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [aider](/man/aider)(1)

# RESOURCES

```[Homepage](https://www.openinterpreter.com/)```

```[Source code](https://github.com/OpenInterpreter/open-interpreter)```

```[Documentation](https://www.openinterpreter.com/docs/terminal)```

<!-- verified: 2026-11-09 -->
