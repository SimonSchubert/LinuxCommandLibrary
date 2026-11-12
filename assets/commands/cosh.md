# TAGLINE

Terminal coding agent and multi-agent orchestrator

# TLDR

**Start** the TUI in the current directory

```cosh```

# SYNOPSIS

**cosh** [_--check-keyring_]

# PARAMETERS

_(no options)_
> Open the Ratatui interface in the current working directory. Providers, models, and modes are configured in the UI.

**--check-keyring**
> Print whether API keys are visible from the environment and from the OS credential store (service `cosh`), then run a write/read/delete round-trip. Does not start the TUI.

# DESCRIPTION

**cosh** (co-sh) is a general-purpose coding agent for the terminal, written in Rust. It can run as its own agent and as an orchestration layer around other harnesses (Gemini, Claude, Codex, Cline, and others) in split panes.

**Multi-agent mode** (`/agents` in the TUI) starts external agents beside the main session. Each keeps its own session, model, and optional git worktree. The main agent dispatches tasks and collects reports.

**Computer tools** read and operate graphical interfaces through an accessibility tree, and fall back to screenshots only when needed.

The workspace is split into crates: **cosh-tools** (development and computer tools), **cosh-tui** (widgets), **cosh-sdk** (agent SDK), **cosh-recall** (memory), and optional **cosh-onnx** behind the `onnx` feature.

Installers (`download.sh` / `download.ps1`) put **cosh** on PATH. Optional **COSH BIN DIR**, **COSH VERSION**, and **COSH VARIANT** (`slim` or `slim-embed`) control the install. Tested on Linux and Windows; macOS is untested in the project README.

# CAVEATS

Needs network access to the model providers you configure, unless you use a local setup. API keys can live in the environment or the OS keyring. Telemetry shutdown runs after the terminal is restored. Companion binaries **cosh-uninstall** and feature-gated **cosh-decisiond** exist in the crate; the advertised command is **cosh**.

# SEE ALSO

[cargo](/man/cargo)(1)

# RESOURCES

```[Homepage](https://www.co-sh.com)```

```[Source code](https://github.com/DiegoZaluski/co-sh)```

<!-- verified: 2026-11-12 -->
