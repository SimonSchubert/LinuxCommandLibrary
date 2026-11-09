# TAGLINE

TUI for Ollama and other LLM providers

# TLDR

**Launch the Ollama TUI**

```parllama```

Connect to a **remote Ollama** instance

```parllama --ollama-url [http://host:11434]```

Open a **specific tab** on startup

```parllama --starting-tab [chat]```

Use **light mode**

```parllama --theme-mode light```

Run **without saving** settings or chats for this session

```parllama --no-save --no-chat-save```

# SYNOPSIS

**parllama** [_options_]

# PARAMETERS

**-d**, **--data-dir** _DIR_
> Data directory. Default: ~/.local/share/parllama.

**-u**, **--ollama-url** _URL_
> URL of the Ollama instance. Default: http://localhost:11434.

**-t**, **--theme-name** _NAME_
> Theme name. Default: par.

**-m**, **--theme-mode** _MODE_
> Theme mode: dark (default) or light.

**-s**, **--starting-tab** _TAB_
> Starting tab: local (default), site, chat, prompts, tools, create, execution, options, memory or logs.

**--use-last-tab-on-startup** _0|1_
> Use the last tab on startup. Default: 1.

**--load-local-models-on-startup** _0|1_
> Load local models on startup. Default: 1.

**-p**, **--ps-poll** _SECONDS_
> Interval to poll the Ollama ps command, 0 to disable. Default: 3.

**-a**, **--auto-name-session** _0|1_
> Auto-name sessions using the LLM. Default: 0.

**--restore-defaults**
> Restore default settings and theme.

**--purge-cache**
> Purge cached data.

**--purge-chats**
> Purge all chat history.

**--purge-prompts**
> Purge all custom prompts.

**--no-save**
> Do not save settings for this session.

**--no-chat-save**
> Do not save chats for this session.

**-v**, **--version**
> Show version information.

# DESCRIPTION

**parllama** is a terminal user interface for managing and chatting with Ollama-based LLMs and other providers including OpenAI, Anthropic, Groq, Google, xAI, OpenRouter, Deepseek and LiteLLM. It supports multi-tab conversations with session persistence, vision model support for image-based chats, document attachments, a persistent memory system across conversations, and secure template execution with configurable command allowlists.

# CAVEATS

Requires a running Ollama server for local model support. Other providers require API keys. Unless **--no-save** is given, most flags such as **-u**, **-t**, **-m** and **-s** are sticky and apply to later runs.

# HISTORY

**parllama** was created by **Paul Robello** (paulrobello) and is written in **Python**.

# INSTALL

```aur: yay -S parllama```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[ollama](/man/ollama)(1), [oterm](/man/oterm)(1), [oatmeal](/man/oatmeal)(1)

# RESOURCES

```[Source code](https://github.com/paulrobello/parllama)```

<!-- verified: 2026-11-09 -->
