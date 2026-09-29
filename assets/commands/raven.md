# TAGLINE

AI agent harness with a shell CLI, TUI, and local WebUI

# TLDR

**Install** the published release (Linux, macOS, WSL2)

```curl -fsSL https://raven.evermind.ai/install.sh | bash```

Run **guided setup** for a model provider

```raven onboard```

Open the **local WebUI** (background gateway on port 18792)

```raven web```

**Stop** the background WebUI gateway

```raven web --stop```

Start the **terminal UI**

```raven tui```

Send a **one-shot** agent turn and print the reply

```raven agent -m "[summarize this repository]"```

Show **config, workspace, and providers**

```raven status```

Check install health

```raven doctor```

See whether a **newer release** exists

```raven upgrade --check```

Print the **version**

```raven -v```

# SYNOPSIS

**raven** [**-v**]

**raven** **web** [**--port** _N_] [**--stop**] [**--foreground**]

**raven** **tui** [**-w** _dir_] [**--home** _dir_] [**--standalone**]

**raven** **onboard** [_options_]

**raven** **agent** **-m** _message_ [_options_]

**raven** **serve** [**--port** _N_] [**--open**]

**raven** **doctor** [**--probe**] [**--json**] [**--fix**]

**raven** **status**

**raven** **upgrade** [**--check**]

# PARAMETERS

**-v**, **--version**
> Print the Raven version and exit

**web**
> Open the local page and keep a gateway running after the terminal closes. Default port **18792**. **--stop** shuts the resident gateway down. **--foreground** holds the terminal and does not restart on failure. With no subcommand, bare **raven** does the same when a browser can be opened

**tui**
> Launch the native Ink/React terminal UI. **--workspace**/**-w** sets the working directory (default: current directory). **--home** sets the agent home. **--standalone** runs an embedded engine even if a gateway already hosts the page. **--color** is **auto**, **truecolor**, **256**, **16**, or **none**. On a headless machine, bare **raven** starts the TUI instead of the WebUI

**onboard**
> Interactive wizard for the first provider, sandbox, channels, memory, and related extras. **--provider**, **--api-key**, **--model**, and **--base-url** skip prompts. **--non-interactive** requires flags for any missing field. **--reset** re-runs the wizard over an existing config. **-y**/**--yes** skips confirmations

**agent** **-m** _message_
> One-shot turn; interactive chat lives in **raven tui**. **--message-file** reads the prompt from a file. **-c**/**--continue** continues the most recent CLI session. **-r**/**--resume** resumes by id or unique prefix. **-w**/**--workspace** and **--home** match **tui**. **--permission-mode** is **ask**, **smart**, or **full**

**serve**
> Run the headless gateway in the foreground (WebSocket RPC, plus the page when one is built). **--port** prefers 18792 and probes forward if taken. **--open** opens a browser

**doctor**
> Report install and config health. **--probe** sends a test LLM message. **--json** prints machine-readable output. **--fix** applies config repairs the report knows how to make

**status**
> Print the config path, workspace, default model, and which providers are configured

**upgrade**
> Install the newest release this install is entitled to (stable, or beta if this install joined that channel). **--check** reports without installing. Does not update an editable source checkout — use **git pull** and **./install.sh** there. Stop **raven web** first, then start it again after the upgrade

# DESCRIPTION

**raven** is EverMind's host-agent CLI. It orchestrates built-in agents (research, code, design, on-call) and third-party agents from one install. The console script is `raven` (`raven.cli.commands:run`); `python -m raven` is the same entry. Settings, memory, and runtime state live under **~/.raven** unless **RAVEN_HOME** points elsewhere. Config is **$RAVEN_HOME/config.json**.

The usual first-run path is the official installer (which places **raven** on **PATH** via **uv tool**), then **raven onboard**, then **raven web** or **raven tui**. Further command groups cover providers, plugins, skills, sessions, channels, cron, MCP, sandbox, and related operations (`raven --help` lists them).

Raven is pre-alpha: interfaces and configuration may change. It needs **Python 3.12** or newer. The TUI bundles a Node.js UI and expects **Node.js 22+**.

# CONFIGURATION

**~/.raven/**
> Default home (override with **RAVEN_HOME**): config, workspace, logs, memory, and runtime state

**~/.raven/config.json**
> Provider credentials, default model, language, and related settings written by **raven onboard** and the WebUI

# CAVEATS

This **raven** is EverMind's agent harness, not Sentry's deprecated Python client of the same name. Distro packages named **raven** are usually that older library. The official installer is a curl-to-shell script that installs via **uv**; **raven upgrade** only works on a uv-managed install. LLM calls need a configured provider key. **raven agent** without **-m** or **--message-file** is not the interactive chat — use **raven tui**. A gateway started with **raven serve** or **raven web --foreground** is not restarted by the in-page updater.

# HISTORY

Developed by EverMind AI. Apache License 2.0. The published Python package reports version **0.2.3** (2026).

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [aider](/man/aider)(1), [opencode](/man/opencode)(1), [llm](/man/llm)(1)

# RESOURCES

```[Source code](https://github.com/EverMind-AI/Raven)```

```[Homepage](https://raven.evermind.ai)```

```[Documentation](https://evermind-ai.github.io/Raven/)```

<!-- verified: 2026-09-29 -->
