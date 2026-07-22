# TAGLINE

Filter CLI output to reduce noise and LLM token usage

# TLDR

**Run a command** through lowfat's default filter pipeline

```lowfat git status```

**Show** active filters and compression level for a command

```lowfat info git```

**Display** lifetime token savings

```lowfat stats```

**Set** the global compression level

```lowfat level ultra```

**Prefix** a one-off command at a specific level

```LOWFAT_LEVEL=lite lowfat git log```

**Install** the OpenCode plugin

```lowfat opencode install```

# SYNOPSIS

**lowfat** [_options_] _command_ [_args_...]

**lowfat** **info** [_command_] [_options_]

**lowfat** **stats** [_options_]

**lowfat** **history**

**lowfat** **level** _lite_|_balanced_|_ultra_

**lowfat** **hook**

**lowfat** **shell-init** _zsh_|_bash_

**lowfat** **plugin** **new** _name_

**lowfat** **plugin** **doctor**

**lowfat** **filter** [_options_]

# PARAMETERS

**--config**
> Print the full resolved configuration.

**--explain**
> Show which filters ran and why (used with **filter**).

**--audit**
> Include recent plugin execution details in **stats**.

**--sub** _name_
> Select a plugin sub-pipeline (used with **filter**).

**--level** _level_
> Override compression level for a single invocation (**lite**, **balanced**, **ultra**).

# DESCRIPTION

**lowfat** is a lightweight Rust CLI that sits in front of shell commands and strips redundant output before it reaches a human or an AI coding agent. It targets the common case where tools such as **git**, **docker**, and **ls** emit verbose text that wastes context window space without adding decision value.

The tool ships as a single binary with built-in processors and a plugin system. Plugins are **.lf** filter scripts stored under **~/.lowfat/plugins/**; **lowfat plugin new** scaffolds a new one and **lowfat plugin doctor** validates installed plugins.

Integration modes include direct prefixing (**lowfat docker ps**), shell hook injection via **eval "$(lowfat shell-init zsh)"** (auto-activates when **CLAUDECODE=1**, **CODEX_ENV**, or **LOWFAT_ENABLE=1** is set), Claude Code **PreToolUse** hooks (**lowfat hook**), and an OpenCode plugin (**lowfat opencode install**). **lowfat history** ranks commands by potential savings so you can tune filters for your workflow.

Compression levels (**lite**, **balanced**, **ultra**) control how aggressively output is trimmed. Configuration lives in **~/.lowfat** and can be overridden per invocation with **LOWFAT_LEVEL** or **--level**.

# CONFIGURATION

**~/.lowfat/**
> User configuration directory for pipeline definitions and plugins.

**LOWFAT_LEVEL**
> Environment variable to force a compression level for one command.

**LOWFAT_ENABLE=1**
> Force shell integration on even outside agent environments.

# CAVEATS

**lowfat** reduces tokens by removing detail; verify critical output with **lowfat info** or by running the underlying command without the prefix when debugging. Shell integration rewrites commands transparently, which can surprise users who forget it is active. Python-based plugins may require **uv** for dependency resolution (**lowfat plugin doctor** checks this).

# INSTALL

```aur: yay -S lowfat```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git](/man/git)(1), [docker](/man/docker)(1), [awk](/man/awk)(1)