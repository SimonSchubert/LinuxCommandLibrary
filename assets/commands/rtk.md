# TAGLINE

Proxy that compresses CLI output to cut LLM token use

# TLDR

**Install hooks** for Claude Code / Copilot (global)

```rtk init -g```

**Install hooks** for Gemini CLI

```rtk init -g --gemini```

**Run a compact git status**

```rtk git status```

**Token-optimized directory listing**

```rtk ls .```

**Smart-read a source file**

```rtk read [file.rs]```

**Show token savings stats**

```rtk gain```

# SYNOPSIS

**rtk** [*command*|*wrapper*] [*args*...]

# DESCRIPTION

**rtk** (Rust Token Killer) is a high-performance CLI proxy that filters and compresses command output before it enters an LLM agent's context. A single Rust binary supports 100+ common developer commands (git, ls, cat/read, grep/rg, test runners, docker, linters, …) with strategies such as smart filtering, grouping, truncation, and deduplication.

**rtk init** installs hooks or plugins for agents (Claude Code, Gemini CLI, Codex, Cursor, Windsurf, and others) so that Bash tool calls are rewritten to **rtk …** automatically. You can also invoke wrappers directly (**rtk git status**, **rtk read**, **rtk grep**, **rtk find**, **rtk ls**, …).

# PARAMETERS

**init** [**-g**] [**--gemini**|**--codex**|**--agent** *name*]

> Install agent integration (global with **-g**).

**gain**

> Show estimated token savings statistics.

**git** *git-args...*

> Compressed git operations (**status**, **diff**, **log**, …).

**ls** / **read** / **grep** / **find** / **smart**

> Filesystem helpers with token-oriented formatting (**read -l aggressive** for signatures-only).

Additional wrappers cover language toolchains and cloud CLIs—run **rtk --help** for the current list.

# CAVEATS

Name collision: crates.io may ship an unrelated **rtk** package; if **rtk gain** fails, reinstall from the GitHub install script or **cargo install --git**. Hooks only rewrite shell/Bash tool paths—some IDE-native tools bypass them. Over-aggressive filtering can hide details the model needs; use direct commands when debugging.

# INSTALL

```brew: brew install rtk```

```nix: nix profile install nixpkgs#rtk```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git](/man/git)(1), [rg](/man/rg)(1), [gemini](/man/gemini)(1)

# RESOURCES

```[Source code](https://github.com/rtk-ai/rtk)```

```[Homepage](https://www.rtk-ai.app)```

<!-- verified: 2026-07-19 -->
