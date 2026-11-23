# TAGLINE

CLI that explains your last terminal command output using an LLM

# TLDR

**Explain the output of the last command**

```wut```

**Ask a specific question** about the last command's output

```wut "[how do I add this to my PATH?]"```

**Use a local Ollama model** instead of a hosted API

```OLLAMA_MODEL=[llama3] wut```

# SYNOPSIS

**wut** [_query_]

# DESCRIPTION

**wut** is a terminal assistant that uses a large language model (LLM) to explain whatever was most recently printed to your terminal. It can decipher stack traces, error codes, unfamiliar log lines, and unexpected command output, returning a plain-language explanation and often a suggested next step.

The tool reads the visible scrollback of the current pane via the host terminal multiplexer, so it must be invoked from inside a **tmux** or **screen** session. It sends the captured text, plus an optional free-form question, to OpenAI, Anthropic, or a local Ollama model, selected by whichever environment variable is set.

# CONFIGURATION

**OPENAI_API_KEY**
> API key used when wut is configured to call OpenAI models.

**ANTHROPIC_API_KEY**
> API key used when wut is configured to call Anthropic models.

**OLLAMA_MODEL**
> Name of a model served by a local Ollama instance; no API key or network access to a third party is needed.

**OPENAI_MODEL**
> OpenAI model to use (default: **gpt-4o**).

**OPENAI_BASE_URL**
> Custom OpenAI-compatible API endpoint.

# CAVEATS

Must be run inside a **tmux** or **screen** session: wut needs the multiplexer to capture pane contents. Unless Ollama is used, each invocation sends terminal output to a third-party LLM, so avoid running it on output that contains secrets, tokens, or PII. The PyPI package is named **wut-cli**.

# HISTORY

**wut** was created by **Jonathan Shobrook** (shobrook) and is written in Python; the project was started in **December 2022**. It targets the same problem space as **thefuck** but explains errors instead of trying to auto-correct them.

# SEE ALSO

[tldr](/man/tldr)(1), [tmux](/man/tmux)(1), [screen](/man/screen)(1)

# RESOURCES

```[Source code](https://github.com/shobrook/wut)```

<!-- verified: 2026-11-23 -->
