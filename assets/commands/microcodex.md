# TAGLINE

Ultra-lightweight C++ coding agent for the terminal

# TLDR

**Install** the latest binary and sign in

```curl -fsSL https://github.com/paoloanzn/microcodex/releases/latest/download/install.sh | sh```

```microcodex login```

**Start an interactive session** in the current directory

```microcodex```

**Run a one-shot prompt** without opening the full UI loop first

```microcodex "[Find the failing test, fix it, and run the relevant test suite]"```

**Sign in on a headless or remote machine** with device authorization

```microcodex login --device-auth```

# SYNOPSIS

**microcodex** [_prompt_]

**microcodex** **login** [**--device-auth**]

# PARAMETERS

**login**
> Authenticate with a ChatGPT plan via OAuth. Opens a browser URL by default.

**--device-auth**
> Use device-code authentication for headless or remote machines: print a one-time code and verification URL instead of opening a browser.

_prompt_
> Optional one-shot task. When given, MicroCodex runs that request; without it, the interactive terminal UI starts.

# DESCRIPTION

**microcodex** is an ultra-lightweight coding agent written in **C++23** that runs locally in your terminal. It reimplements the core of OpenAI/Codex-style agent workflows in a small native binary: one-shot prompts, an interactive TUI, local coding tools (read/write/edit files, run shell commands, glob search), durable conversations, and automatic context compaction.

Authentication uses a ChatGPT plan through **microcodex login**. Credentials are stored under **$CODEX_HOME**, or **~/.codex** when **CODEX_HOME** is unset — the same home directory layout as OpenAI Codex. MicroCodex also discovers Codex filesystem skills from **$CODEX_HOME/skills** (or **~/.codex/skills**): each skill is a directory with a **SKILL.md** file whose YAML frontmatter includes **name** and **description**. Skill metadata is injected into agent instructions at session start; full skill content is loaded only when the task matches.

Linux runtime needs **libcurl** and **OpenSSL**. Releases ship prebuilt binaries for Linux and macOS (x86_64 and arm64); the install script picks the matching build. Building from source requires a C++23 toolchain, **make**, and the matching development libraries.

# CAVEATS

MicroCodex is **not a sandbox**. Before launching the user's shell it applies a simple **lexical denylist** that blocks forced file removal (**rm -f** / **rm -rf**), **git reset --hard**, forced **git clean**, **git checkout --**, disk-formatting tools, and shutdown commands. That guard is not a shell parser and is not a complete security boundary: unrecognized destructive commands and all file operations run with the same permissions as the MicroCodex process.

MCP support is not implemented yet. Text cannot currently be copied from the terminal while using the interactive UI. Requires a ChatGPT plan (or compatible OAuth path) via **microcodex login**.

# HISTORY

**MicroCodex** was published as an open-source, Apache-2.0-licensed C++ reimplementation of OpenAI Codex-style terminal coding agents, aiming for a sub-megabyte-class native binary with local tools and durable sessions rather than a large runtime stack.

# SEE ALSO

[codex](/man/codex)(1), [claude](/man/claude)(1), [cline](/man/cline)(1), [aider](/man/aider)(1), [opencode](/man/opencode)(1)

# RESOURCES

```[Source code](https://github.com/paoloanzn/microcodex)```

<!-- verified: 2026-08-03 -->
