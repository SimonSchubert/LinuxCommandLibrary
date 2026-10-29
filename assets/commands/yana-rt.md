# TAGLINE

Native Yana AI runtime for authority, chat, and agent tooling

# TLDR

Install the **Rust binary** from crates.io

```cargo install yana-rt```

**Scan** a project for agent-setup risks (same engine as `yana-ai audit`)

```yana-rt scan .```

Write a **SARIF** report and fail on high findings

```yana-rt scan . --sarif [yana-ai.sarif] --fail-on high```

Start an **interactive chat** with a local model

```yana-rt chat --provider ollama```

Resume a **saved chat session**

```yana-rt chat --resume [session-id]```

Check **environment health** as JSON

```yana-rt doctor run . --json```

Create a **task** and mark it done with evidence

```yana-rt task create "[Fix auth bug]" --scope [src/auth/]```

Confirm repo-supplied **MCP config** (must be typed at a terminal)

```yana-rt trust allow mcp-servers```

Print the **runtime version**

```yana-rt --version```

# SYNOPSIS

**yana-rt** _command_ [_options_]

**yana-rt** **-h** | **--help**

**yana-rt** **-V** | **--version**

# DESCRIPTION

**yana-rt** is the Rust runtime for **Yana AI**. It owns the turn loop and the authority check used by the CLI, Yana Studio, and optional MCP, so those clients do not each reimplement permission logic. Install from crates.io with `cargo install yana-rt` (crate and binary name **yana-rt**, default features include **cli**). Version **1.5.1** as of the 2026-10-05 crates.io release; check `yana-rt --version` for the installed build.

The same source is also built as **yana-ai-rt**, which inserts the **chat** subcommand from `argv[0]`. A `pip install yana-ai` entry point named **yana-rt** is a Python shim: it searches **YANA_RT_BIN**, then PATH (skipping its own script), then a packaged native binary, then `target/release/yana-rt`. Point **YANA_RT_BIN** at a compiled ELF/Mach-O, never at `which yana-rt` after a pip install.

Providers in the runtime catalog include cloud (Anthropic, OpenAI, Gemini, Groq, DeepSeek, OpenRouter, xAI, Novita, NVIDIA, MiniMax, GLM, Hugging Face, 9Router, Kimi) and local (Ollama, LM Studio, llama.cpp, TurboFieldfare, AirLLM), plus a custom OpenAI-compatible endpoint. Failover, a SQLite session store, shadow-git checkpoints, file read/patch, gated command execution, optional MCP/LSP, and `web.search` over a checked HTTPS layer live here.

Several subcommands are **not** routed through **yana-ai** on purpose: **trust** (a person at a terminal must confirm repo-supplied config, like **direnv allow**), **compact** (hook fast path for Bash output), **capability** (one-shot tools for the desktop app), and **guard** (in-process PreToolUse checks). `yana-ai guard` is a different command (Python hook installer).

Optional Cargo features: **mcp**, **lsp**, **pty-bridge**, **discord**. They are off in the default build. Apache-2.0. No Python runtime required for this binary.

# COMMANDS

**scan** [_target_] [**--json**] [**--markdown** _file_] [**--sarif** _file_] [**--fail-on** _level_] [**--only** _category_] [**--ignore** _id_] [**--diff** _base_] [**--no-color**] [**--quiet**] [**--scanner-dir** _dir_] [**--include-skills**]
> Audit the AI-agent setup. Default _target_ is `.`. **yana-ai audit** calls this. **--include-skills** also scans `core/skills/**` (off by default; high false-positive rate)

**chat** [**--provider** _id_] [**--model** _name_] [**--system** _text_] [**--resume** _id_] [**--verbose**] [**--no-sandbox**]
> Interactive REPL. **read_file** and **run_command** are available; **run_command** always asks a human first. **--no-sandbox** skips `sandbox-exec.sh` but still requires approval. Default Ollama endpoint is `127.0.0.1:11434`

**doctor** **run** [_target_] [**--json**]
> Health checks (Python, git, ignore files, Claude/MCP config, keys, hooks). **doctor dispatch** compares clap commands with `bin/yana`

**task** **create**|**list**|**status**|**done**|**drop**|**depend**
> Task lifecycle. **create** takes a name and optional **--scope**. **done** requires **--evidence**. **depend** edges: `blocks` (default), `related`, `parent-child`, `discovered-from`

**eval** **run**|**judge**|**schema**
> Evidence checks. **judge** takes **--provider** / **--model** (default Ollama)

**trust** **status**|**show**|**allow**|**revoke** _kind_
> Confirm `.yana-ai/web-search.json`, `mcp-servers.json`, or `lsp-servers.json`. **allow** needs a TTY and a typed `yes`. Not exposed through **yana-ai**

**graph** **build**|**show**|**search**|**onboard**|**diff**
> Knowledge graph. **search** has **--expand** and **--limit** (default 15). **diff** default base is `origin/main`

**hunt** **run** [_target_] [_categories_] [**--json**] [**--fail-on** _level_]
> Categories: `secrets`, `code`, `deps`, `supply-chain`, `all` (default)

**map** **show** [_target_] [**--json**]
> What the agent can reach (Claude settings, MCP, workflows)

**score** **show** [_target_] [**--explain**] [**--json**]
> Numeric score and risk band (LOW / MEDIUM / HIGH / CRITICAL)

**init** **run** [_dir_] [**--yes**]
> Flag-driven project init. **init dry** prints what would be written. Prefer **yana-ai init** for the interactive wizard

**guard** ...
> In-process PreToolUse ports (destructive-command guard, token budget). Called as `exec yana-rt guard` from hook scripts

**compact** [**--detect**] [**--json**] [**--raw**] **--** _command_ ...
> Opt-in Bash-output compaction (`YANA_COMPACT=1`). **--detect** classifies without running. Hook path; no **yana-ai compact**

**capability** ...
> One-shot capability tools for non-Rust clients (desktop). Not routed through **yana-ai**

**filescan** **check** _file_
> VirusTotal hash lookup. Needs **VT_API_KEY**. Does not upload file contents

**memory**, **bus**, **cost**, **lease**, **authority**, **plugin**, **mission**, **route**, **spec**, **design**, **vault**, **os**, **workspace**, **evidence**, **observability**, **connector**, **research**, **config**, **fix**, **ci**, **provenance**, **watch**, **skill-quality**
> Further runtime surfaces; **yana-ai** forwards matching names. **mcp** and **remote discord** need optional features

# PARAMETERS

**-h**, **--help**
> Print clap help for the binary or a subcommand

**-V**, **--version**
> Print the crate version

**--json**
> Machine-readable output on scan, doctor, task, map, score, hunt, and others

**--provider** _id_
> Chat/eval provider from the runtime catalog (`src/model/catalog.rs`)

**--model** _name_
> Override the provider default. For Ollama, the runtime tries `/api/tags` before a static fallback

**--fail-on** _level_
> Exit non-zero on findings at this severity or above

**--no-sandbox**
> With **chat**, run approved **run_command** calls without `sandbox-exec.sh`

# CONFIGURATION

**.yana-ai/**
> Per-project runtime state: config, leases, cost policy, trusted integration files, session database

**.yana-aiignore**
> Finding IDs **scan** should suppress

Session data lives in a SQLite store with full-text search, per-profile directories, crash recovery, and optional shadow-git checkpoints. Corrupt databases are quarantined rather than reused.

# ENVIRONMENT

**YANA_RT_BIN**
> Used by the Python/npm shims to locate this binary. Must be a compiled executable

**YANA_RT_WRAPPER_ACTIVE**
> Set by the Python shim to stop recursive re-entry. Do not set by hand

**ANTHROPIC_API_KEY**, **OPENAI_API_KEY**, **MOONSHOT_API_KEY**
> Cloud chat providers

**YANA_COMPACT**, **YANA_COMPACT_BYPASS**
> Enable or force-bypass Bash-output compaction

**VT_API_KEY**
> **filescan check**

**DISCORD_BOT_TOKEN**
> Discord adapter (**--features discord**), allowlisted plain chat only

# CAVEATS

The pip entry point **yana-rt** is a wrapper, not this binary. A stale runtime on PATH rejects new subcommands; upgrade with `cargo install yana-rt --force`. **trust allow** is interactive on purpose so an agent driving **yana-ai** cannot confirm config. **chat** is a separate process and is invisible to Claude Code hooks; it builds its own approval gate. Destructive guards match command strings. Optional **mcp** is a prototype stdio server, not wired into clients by default. There is no Linux ARM Studio build; this CLI still builds with Cargo on supported Rust hosts.

# HISTORY

The runtime crate **yana-rt** is the native engine of Yana AI, started **17 May 2026** by **Vũ Văn Tâm**. It is versioned independently of the **yana-ai** Python package. crates.io **1.5.1** (2026-10-05) added provider failover, the SQLite session store, and capability tools.

# SEE ALSO

[yana-ai](/man/yana-ai)(1), [yana-ai-rt](/man/yana-ai-rt)(1), [trace-audit](/man/trace-audit)(1), [cargo](/man/cargo)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [aider](/man/aider)(1), [aichat](/man/aichat)(1), [ollama](/man/ollama)(1), [direnv](/man/direnv)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/yanacuti1121/Yana-AI)```

```[Homepage](https://yana.vutam.link)```

```[Documentation](https://github.com/yanacuti1121/Yana-AI/blob/main/COMMANDS.md)```

<!-- verified: 2026-10-21 -->
