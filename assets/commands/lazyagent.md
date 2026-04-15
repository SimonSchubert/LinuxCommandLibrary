# TAGLINE

Monitor all your coding agent sessions from one terminal

# TLDR

**Launch** the terminal UI monitoring all agents

```lazyagent```

**Monitor only** Claude Code sessions

```lazyagent --agent claude```

**Monitor only** Cursor sessions

```lazyagent --agent cursor```

**Start** the HTTP API server

```lazyagent --api```

**Start the API** on a custom address

```lazyagent --api --host [":8080"]```

**Launch** as a macOS menu bar app

```lazyagent --gui```

**Run all three** interfaces simultaneously

```lazyagent --tui --gui --api```

# SYNOPSIS

**lazyagent** [_options_]

# PARAMETERS

**--agent** _name_
> Filter to a specific agent: claude, cursor, opencode, pi, codex, amp, or all (default: all)

**--tui**
> Launch the terminal UI (default when no interface is specified)

**--gui**
> Launch as a macOS menu bar app

**--api**
> Start the HTTP API server with Server-Sent Events for real-time updates

**--host** _address_
> Custom API listen address (default: :3333)

**--help**
> Display help information

# DESCRIPTION

**lazyagent** is a terminal UI, macOS menu bar app, and HTTP API for monitoring all running coding agent instances on your machine. It supports **Claude Code**, **Cursor**, **OpenCode**, **pi**, **Codex CLI**, and **Amp**.

Unlike other tools, lazyagent does not replace or modify your workflow — it is purely observational. Launch agents wherever you want (terminal, IDE, desktop app) and lazyagent watches session data to determine what each session is doing. No modifications to any agent are needed.

The HTTP API provides a read-only REST interface with Server-Sent Events for real-time push updates, allowing custom dashboards, mobile apps, or integration with existing tools.

# CAVEATS

The macOS menu bar app (**--gui**) is available on macOS only; the TUI works cross-platform. lazyagent is read-only and cannot control or modify agent behavior. Building from source requires **Go 1.25+** and **Node.js 18+** for the frontend components.

# HISTORY

lazyagent was created by **Illegal Studio** and written primarily in **Go** with a **Svelte** frontend for the menu bar app. It was first released in **2025** to address the growing need for developers running multiple AI coding agents simultaneously to have a unified monitoring view.

# SEE ALSO

[tmux](/man/tmux)(1), [htop](/man/htop)(1), [lazygit](/man/lazygit)(1)
