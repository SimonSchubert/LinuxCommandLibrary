# TAGLINE

Open-source AI coding agent for the terminal

# TLDR

**Start an interactive session** in the current project

```qwen```

**Run a single prompt** without the interactive UI

```qwen -p "[prompt]"```

**Start a session** with an initial prompt

```qwen -i "[prompt]"```

**Use a specific model**

```qwen -m [model] -p "[prompt]"```

**Continue the most recent session**

```qwen --continue```

**Resume a specific session**

```qwen --resume [session_id]```

**Get JSON output** for scripting

```qwen -p "[prompt]" -o json```

**Auto-approve file edits** only

```qwen -p "[prompt]" --approval-mode auto-edit```

# SYNOPSIS

**qwen** [_options_]

**qwen** **-p** _prompt_ [_options_]

# PARAMETERS

**-p**, **--prompt** _PROMPT_
> Run non-interactively with the given prompt.

**-i**, **--prompt-interactive** _PROMPT_
> Start an interactive session with the prompt as initial input.

**-m**, **--model** _MODEL_
> Model to use for this session.

**-o**, **--output-format** _FORMAT_
> Output format for non-interactive mode, such as json or stream-json.

**--continue**
> Continue the most recent session.

**--resume** _ID_
> Resume a specific session.

**--approval-mode** _MODE_
> Set the approval mode for tool calls.

**--yolo**
> Automatically approve all tool calls.

**-s**, **--sandbox**
> Enable sandbox mode.

**--include-directories** _DIRS_
> Add directories to the workspace.

**-d**, **--debug**
> Enable debug output.

**--version**
> Show the version.

**-h**, **--help**
> Show help.

# DESCRIPTION

**qwen** is the command of **Qwen Code**, an open-source AI coding agent that runs in the terminal. It reads and edits files in the project, runs commands, and supports subagents, skills, and MCP servers.

Run **qwen** in a project directory and use **/auth** inside the session to sign in or configure a provider. It works with Qwen models and with OpenAI, Anthropic, and Gemini compatible APIs, including local models. Project instructions can be placed in a **QWEN.md** file. **qwen serve** starts an experimental daemon and web UI.

# CAVEATS

Requires authentication with a provider and Node.js 22 or newer for the npm install. **--yolo** does not enable a sandbox by itself; combine it with **--sandbox** to isolate tool calls.

# HISTORY

Qwen Code was developed by the **Qwen** team at Alibaba and was originally based on **Google Gemini CLI** v0.8.2 before diverging from upstream.

# SEE ALSO

[gemini](/man/gemini)(1), [ollama](/man/ollama)(1), [llm](/man/llm)(1)

# RESOURCES

```[Source code](https://github.com/QwenLM/qwen-code)```

```[Documentation](https://qwenlm.github.io/qwen-code-docs/en/users/overview)```

<!-- verified: 2026-11-08 -->
