# TAGLINE

provides a natural language interface for computers, allowing language models

# TLDR

**Start an interactive session**

```interpreter```

**Auto-run code without confirmation**

```interpreter -y```

**Use a specific model**

```interpreter --model [gpt-4o]```

**Use a local model**

```interpreter --local```

**Enable fast mode with GPT-3.5**

```interpreter --fast```

**Set context window and max tokens**

```interpreter --local --max_tokens [1000] --context_window [3000]```

**Load a saved profile**

```interpreter --profile [my_profile.yaml]```

**Pipe input from stdin**

```echo "[What OS am I using?]" | interpreter --stdin -y```

# SYNOPSIS

**interpreter** [_options_]

# PARAMETERS

**-y**, **--auto-run**
> Run code without manual confirmation at each step

**--model** _MODEL_
> Specify which model to use (e.g., gpt-4o, claude-3-sonnet)

**--local**
> Use Code Llama for local code interpretation

**--fast**
> Enable GPT-3.5 Turbo for quicker responses

**--verbose**
> Activate verbose mode for detailed output

**--os**
> Enable OS mode powered by Anthropic

**--max_tokens** _N_
> Maximum tokens for model output

**--context_window** _N_
> Context window size (must be larger than max_tokens)

**--profile** _FILE_
> Load configuration from a YAML profile

**--save-profile** _NAME_
> Save current configuration as a named profile

**--tools** _LIST_
> Enable specific tools (default: interpreter,editor)

**--stdin**
> Accept input from stdin for Unix-style piping

**--api_base** _URL_
> Custom API base URL for model provider

**--api_key** _KEY_
> API key for authentication

# IN-SESSION COMMANDS

**%reset**
> Reset the current session's conversation

**%undo**
> Remove the previous message and AI response

**%tokens** _[prompt]_
> Calculate tokens and estimate cost for next prompt

**%verbose true|false**
> Toggle verbose mode during chat

# DESCRIPTION

**Open Interpreter** provides a natural language interface for computers, allowing language models to execute code (Python, JavaScript, Shell, and more) locally on your machine. It functions like ChatGPT's Code Interpreter but runs in your terminal with full access to your local environment.

The tool equips function-calling language models with an exec() function that accepts a programming language and code to run. Since code executes in your local environment, it can interact with files, install packages, browse the web, and control system settings. By default, interpreter asks for confirmation before executing code.

Open Interpreter supports multiple model providers including OpenAI, Anthropic, and local models via Ollama, LM Studio, or jan.ai. Configuration can be saved to YAML profiles for easy switching between setups.

# CAVEATS

Generated code runs with full access to your local environment, which can lead to data loss or security risks. Always review code before confirming execution. The **-y** flag bypasses confirmation and should be used with caution. Local models may have reduced capabilities compared to cloud APIs.

# HISTORY

Open Interpreter was created by **Killian Lucas** and released on **September 5, 2023**. It became the #1 trending repository on GitHub within its first week, gaining over 20,000 stars. The project is based in Seattle, Washington, and has grown to over 50,000 GitHub stars as an open-source Agent-Computer-Interface project.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [aider](/man/aider)(1), [python](/man/python)(1)
