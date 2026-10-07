# TAGLINE

Open-source personal AI agent with a Sentinel gatekeeper

# TLDR

Write a **starter config** (`config/config.toml`)

```nanomuse config init```

Start an **interactive chat** with the agent

```nanomuse chat```

Resume the **most recent** chat session

```nanomuse chat --resume```

Run **one task** and exit

```nanomuse run "[summarise the files in the workspace]"```

Approve every action **without asking** (unattended)

```nanomuse run --auto "[advance the active goals]"```

Start the **always-on web app** (default `127.0.0.1:8787`)

```nanomuse serve```

Bind so a **phone on the LAN** can reach it

```nanomuse serve --host 0.0.0.0```

Check **config, data dir, model, and connectors**

```nanomuse doctor```

Store a **secret** the model never sees (`{{vault:NAME}}` in config)

```nanomuse vault set [EMAIL_PASSWORD]```

Sign in with a **ChatGPT plan** instead of an API key

```nanomuse chatgpt login```

Print the **version**

```nanomuse --version```

# SYNOPSIS

**nanomuse** [**-V**|**--version**] [_command_] [_options_]

# PARAMETERS

**-V**, **--version**
> Print `nanomuse` and the package version and exit. Same as **nanomuse version**

**-c**, **--config** _path_
> Path to `config.toml`. Without this, the file is searched as `$NANOMUSE_CONFIG`, then `./config/config.toml`, then `~/.nanomuse/config.toml`

**--auto**
> Set the Sentinel to auto mode for this process: approve every action except explicit deny rules. Used by **chat**, **run**, **serve**, **daemon**, and **goals run**. **daemon** always runs in auto mode

**--show-thinking**
> Print the model's reasoning during **chat**, **run**, and **goals run**

**chat**
> Interactive chat. Type a request at the `You ›` prompt. Slash commands: `/help`, `/reset`, `/memory`, `/goals`, `/audit` [_n_], `/tools`, `/tainted`, `/permissions`, `/revoke` _key_, `/forget-approvals`, `/exit`. **--resume** continues the newest session under `<data_dir>/sessions`

**run** _task_
> Run one task and exit

**serve**
> Always-on agent with the mobile-first web app (chat, goals, ideas, memory, approvals). Default bind **127.0.0.1:8787**. **--host** / **--port** (**-p**) override. An access token is printed with a QR code unless **--no-qr**. **--no-auth** turns the token off (local development only)

**daemon**
> Advance every active goal on a loop (Sentinel auto mode). **--interval** is seconds between passes (default 3600). **--once** runs one pass and exits

**doctor**
> Check the install: config, writable data dir, workspace, model, connectors. Paste the output into a bug report. **--no-model** skips the live model call

**audit**
> Show recent Sentinel audit entries. **-n** is how many (default 20). **--json** prints raw JSON lines

**mcp**
> Serve this computer's screen, hands, and configured connectors over MCP on stdio (for the desktop harness). Nothing but the protocol is written to stdout

**config init**
> Copy the bundled example to `config/config.toml` (override with **--path**). **--force** overwrites an existing file

**config show**
> Print the effective configuration as JSON with API keys masked

**config path**
> Print which config file would be used, or say none was found

**vault set** _name_
> Store a secret (prompted, or **--value**). Reference it as `{{vault:NAME}}` in config. **vault list** prints names only. **vault delete** _name_ removes one

**chatgpt login**
> Open a browser and sign in with a ChatGPT plan (PKCE). **status**, **usage**, **logout**, and **proxy** inspect or drop the session or run a loopback OpenAI-compatible server over it. **--json** writes one JSON object per line on stdout

**goals**
> Long-term goals: **list**, **show** _id_, **add** _title_ (**--step**, **--category**, **--due**, **--check-in**), **run** _id_ (let the agent advance it), **status** _id_ `active|paused|done|cancelled`, **delete** _id_

**reminders** / **triggers**
> One-shot reminders and event-driven work (mail, calendar, webhooks): **list**, **add**, **cancel**

**memory**
> Long-term memory: **list**, **add**, **recall**, **forget**, **tidy**, **changes**, **restore** _id_, **clear** (**-y** skips the confirm)

**calendar**
> ICS feeds: **agenda**, **free**, **feeds**, **add** _name_ _url_ (the URL is stored in the vault), **remove** _name_

**contacts**
> Address book: **search**, **list**, **add**, **sources**, **add-source**, **remove-source**

**skills**
> Agent Skills (`SKILL.md` folders): **list**, **show**, **add** (file, folder, or https URL), **new**, **remove**, **enable**, **disable**. User skills live under `<data_dir>/skills`

**channels**
> Chat apps (Feishu, DingTalk, WeCom, Telegram): **status**, **pending**, **approve** _code_, **deny** _code_, **login**, **test**. When **nanomuse serve** is running, these go through its API so the change takes effect at once

**phone traces** / **phone trace** _id_
> GUI-operator traces from phone tasks. **--out** writes a self-contained HTML page of screens and taps

# DESCRIPTION

**nanomuse** is the Python runtime CLI for **nanoMuse**, an open-source personal agent in the style of Meta's Muse. It does work (shell, files, browser, MCP servers, skills, mail, calendar, and optionally the screen of a phone or this computer) instead of only answering questions. A separate **Sentinel** decides what may run and what may leave the machine. Secrets live in a credential vault and are never shown to the model. Every action is written to an audit log.

The console script is `nanomuse` (`nanomuse.cli:app`, Typer). `python -m nanomuse` is the same entry. Python **3.11** or newer is required. The published package version is **0.1.40**. The project is not on PyPI: install from a clone with **uv** (`uv pip install -e ".[dev]"`), then **nanomuse config init**. Optional extras include **browser** (Playwright), **hands** (this computer's screen), and **channels** (Feishu / DingTalk / WeCom SDKs).

**nanomuse serve** starts a FastAPI/Uvicorn app on **127.0.0.1:8787** by default. The phone, desktop, and web clients are separate builds in the same repository (Android APK, iOS TestFlight, Linux AppImage/.deb, Docker relay). Companion binaries **nanomuse-device**, **nanomuse-browser**, and **nanomuse-open** are a CLI bridge the agent uses inside its sandbox; off the phone they exit 2.

On Linux, **[sandbox] mode = "auto"** (the default) runs **shell** and **python_execute** inside **bubblewrap** when it is installed: only the workspace is writable, the home directory is absent, and the network is off unless the command needs it.

# CONFIGURATION

**config.toml search order**
> `--config` / `-c`, then `$NANOMUSE_CONFIG`, then `./config/config.toml`, then `~/.nanomuse/config.toml`. String values may use `${VAR}` or `${VAR:-default}`. Settings changed from the app are layered from `<data_dir>/app-settings.json`

**~/.nanomuse/**
> Default data directory (override with **NANOMUSE_DATA_DIR** or `data_dir` in the config): memory, goals, vault, audit log, sessions, skills, and the generated server token

**~/.nanomuse/config.toml**
> Usual per-user config. **nanomuse config init** writes `config/config.toml` in the current tree instead. Sections include `[llm]`, `[agent]`, `[sentinel]`, `[memory]`, `[connectors.*]`, `[skills]`, `[sandbox]`, `[browser]`, `[gui]`, `[server]`, and `[cloud]`

**[llm]**
> Any OpenAI-compatible endpoint. Defaults are DeepSeek (`deepseek-flash` at `https://api.deepseek.com`, key from **DEEPSEEK_API_KEY**). `provider = "chatgpt"` uses **nanomuse chatgpt login** and needs no key. Catalogue ids such as `bailian` fill in the endpoint

**[sentinel]**
> `ask` (default): sensitive actions need approval. `strict`: moderate and sensitive need approval. `auto`: approve everything except deny rules. `always_ask_tools` defaults to `send_email` and `shell`. Taint tracking blocks egress to non-allowlisted hosts after private data has been read

**{{vault:NAME}}**
> Placeholder in config for a secret stored with **nanomuse vault set**. The model never sees the value

**NANOMUSE_LLM_API_KEY** / **DEEPSEEK_API_KEY** / **OPENAI_API_KEY**
> API keys. **NANOMUSE_LLM_PROVIDER**, **NANOMUSE_LLM_MODEL**, and **NANOMUSE_LLM_BASE_URL** override `[llm]`. **NANOMUSE_WORKSPACE**, **NANOMUSE_SENTINEL_MODE**, **NANOMUSE_SERVER_HOST**, **NANOMUSE_SERVER_PORT**, **NANOMUSE_SERVER_TOKEN**, and **NANOMUSE_CLOUD_BASE_URL** override the matching settings. **NANOMUSE_CONFIG** selects the config file

# CAVEATS

Needs a model: an API key, a ChatGPT sign-in, or a local OpenAI-compatible server. Without one, commands that talk to the model warn and most work fails.

**--auto** and **daemon** approve every Sentinel action except explicit deny rules. **--no-auth** on **serve** is for local development; do not use it on a shared network. The default **serve** bind is loopback only.

The Linux AppImage/.deb is the **desktop GUI**, not this CLI. This command is the Python runtime (`nanomuse` on PATH after an editable install).

The package is not published on PyPI or typical distro indexes. Playwright browsing needs `pip install 'nanomuse[browser]'` and `playwright install chromium`. Screen control needs the **hands** extra. Chat-app channels need their extras and, for Feishu, a QR login.

Sensitive prompts and file contents go to the configured model provider. Conversation text may pass through a nanoMuse relay when cloud sync is on; files and screenshots stay on the device.

# HISTORY

**nanoMuse** is a community project under **GPL-3.0-or-later**. The Python line was MIT in early tags (`pre-openminis`); the phone app is based on **OpenMinis** 1.13 (GPL-3.0). Version **0.1.40** ("Clear") was released in **October 2026**. It is not affiliated with Meta; Muse is their trademark.

# SEE ALSO

[claude](/man/claude)(1), [aider](/man/aider)(1), [opencode](/man/opencode)(1), [codex](/man/codex)(1), [llm](/man/llm)(1), [ollama](/man/ollama)(1), [chatgpt](/man/chatgpt)(1), [python](/man/python)(1), [uv](/man/uv)(1), [bubblewrap](/man/bubblewrap)(1), [playwright](/man/playwright)(1), [uvicorn](/man/uvicorn)(1)

# RESOURCES

```[Source code](https://github.com/nano-muse/nanoMuse)```

```[Homepage](https://nanomuse.cn)```

```[Documentation](https://nanomuse.cn/docs)```

<!-- verified: 2026-10-07 -->
