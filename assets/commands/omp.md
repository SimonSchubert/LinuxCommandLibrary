# TAGLINE

AI coding agent for the terminal (Oh My Pi)

# TLDR

**Start** the agent

```omp```

**Install** (Linux/macOS script)

```curl -fsSL https://omp.sh/install | sh```

**Generate shell completions** (zsh)

```eval "$(omp completions zsh)"```

**Generate shell completions** (bash)

```eval "$(omp completions bash)"```

# SYNOPSIS

**omp** [*options*] [*prompt*|*subcommand*]

# DESCRIPTION

**omp** is the CLI for **oh-my-pi**, an open AI coding agent focused on terminal workflows: hash-anchored edits, tool harness, LSP, browser tools, subagents, and multi-provider model support. Install via **omp.sh**, Homebrew (**can1357/tap/omp**), or **bun install -g @oh-my-pi/pi-coding-agent**.

**omp completions** emits completion scripts for bash, zsh, and fish from live command metadata so completions stay aligned with flags and models.

# PARAMETERS

**omp**

> Start interactive agent session (default).

**completions** *shell*

> Print completion script for **bash**, **zsh**, or **fish**.

Other subcommands and flags (**--model**, session resume, planning modes, etc.) evolve quickly—use **omp --help** for the installed version.

# CAVEATS

Requires API keys or local model endpoints depending on configuration. Agent tools can modify files and run shell commands—use in trusted directories. Unrelated tools also use the letters "omp" (e.g. some prompt themes); ensure the binary on PATH is oh-my-pi's **omp**.

# SEE ALSO

[gemini](/man/gemini)(1), [claude](/man/claude)(1), [aider](/man/aider)(1)

# RESOURCES

```[Source code](https://github.com/can1357/oh-my-pi)```

```[Homepage](https://omp.sh)```

<!-- verified: 2026-07-19 -->
