# TAGLINE

Google Antigravity CLI: AI coding agent in the terminal

# TLDR

**Start an interactive session** in the current directory

```agy```

**Start a session with an initial prompt**

```agy -i "[explain this codebase]"```

**Run a single prompt non-interactively** and print the result

```agy -p "[summarize the changes in this branch]"```

**Output headless results as JSON**

```agy -p "[prompt]" --output-format json```

**Continue the most recent conversation**

```agy -c```

**Pick a model** for the session (list names with agy models)

```agy --model "[model name]"```

**Start in plan mode** with an extra workspace directory

```agy --mode plan --add-dir [path/to/other/repo]```

**Run sandboxed**

```agy --sandbox```

# SYNOPSIS

**agy** [_options_]

**agy** **models** | **agents**

# PARAMETERS

**-i**, **--prompt-interactive** _PROMPT_
> Run an initial prompt, then keep the interactive session open.

**-p**, **--print**, **--prompt** _PROMPT_
> Run one prompt non-interactively (headless) and print the response.

**-c**, **--continue**
> Continue the most recent conversation.

**--conversation** _ID_
> Resume a conversation by ID.

**--model** _MODEL_
> Model for the session; **agy models** lists valid names.

**--effort** _LEVEL_
> Reasoning effort, from low up to max depending on the model.

**--agent** _NAME_
> Agent for the session; **agy agents** lists valid names.

**--mode** _MODE_
> Execution mode: accept-edits, auto, or plan. **auto** requires the terminal sandbox.

**--add-dir** _DIR_
> Add a directory to the workspace. Repeatable.

**--output-format** _FORMAT_
> Print-mode output: text (default), json, or stream-json.

**--input-format** _FORMAT_
> Print-mode input: text (default) or stream-json.

**--json-schema** _SCHEMA_
> Schema string or file enforcing structured output in print mode.

**--print-timeout** _DURATION_
> Time limit for print mode (0 waits for the turn to complete).

**--sandbox**
> Run in the terminal sandbox with OS-level containment.

**--dangerously-skip-permissions**
> Approve all tool permission requests without prompting.

**--remote-agent**, **--project** _ID_, **--new-project**
> Run conversations on Remote Agents in a given or new project.

**--log-file** _PATH_
> Override the log file path.

**--version**
> Print version information and exit.

**--help**
> Print help and exit.

# DESCRIPTION

**agy** is the **Antigravity CLI**, a terminal user interface for Google's **Antigravity** agentic coding platform and the successor to the Gemini CLI. It reads and edits code, runs shell commands, produces reviewable artifacts such as plans and walkthroughs, and supports skills, hooks, subagents and plugins, powered by **Gemini** models.

Inside a session, slash commands such as **/plan**, **/model**, **/permissions**, **/resume**, **/compact**, **/diff**, **/usage** and **/exit** control the agent, **!** toggles shell mode, and **Shift+Tab** cycles execution modes (auto, plan, default, accept-edits). Tool permission modes range from request-review (default) to proceed-in-sandbox, always-proceed and strict.

# CONFIGURATION

**~/.gemini/antigravity-cli/settings.json**
> User settings such as color scheme, model, status line and trusted workspaces; also editable with **/config** or **/settings**.

**GEMINI_API_KEY**
> API key for direct Gemini API access when the model provider is set to gemini.

# CAVEATS

Requires signing in with a Google account on first run. The installer places the binary in **~/.local/bin/agy**, which must be on PATH. **--dangerously-skip-permissions** and **--mode auto** let the agent act without review; use them only in trusted or sandboxed environments. Gemini CLI configuration can be migrated with **agy plugin import gemini**.

# HISTORY

Google released the **Antigravity** IDE, an agent-first fork of Visual Studio Code, in **November 2025**; early on, **agy** was also used as the shell launcher for that editor. At **Google I/O in May 2026** Google announced Antigravity 2.0 together with the standalone **Antigravity CLI** (**agy**), retiring the Gemini CLI for individual users in its favor.

# SEE ALSO

[gemini](/man/gemini)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [copilot](/man/copilot)(1), [code](/man/code)(1)

# RESOURCES

```[Homepage](https://antigravity.google)```

```[Documentation](https://antigravity.google/docs/cli/reference/)```

<!-- verified: 2026-11-23 -->
