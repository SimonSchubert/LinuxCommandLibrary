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

**List and reopen** sessions for the current directory

```lazyagent sessions```

**Resume** the most recent session here

```lazyagent latest```

**Search** chat transcripts

```lazyagent search "[query]"```

**Show rate-limit** usage

```lazyagent limits```

**Delete** chat sessions older than some days

```lazyagent prune --days [30]```

# SYNOPSIS

**lazyagent** [_options_]

**lazyagent** _command_ [_options_]

# PARAMETERS

**--agent** _name_
> Filter to a specific agent: claude, pi, codex, amp, grok, kilo, kimi, cursor, opencode, or all (default: all)

**--tui**
> Launch the terminal UI (default when no interface is specified)

**--gui**
> Launch the macOS or Linux desktop app

**--api**
> Start the bearer-token protected HTTP API server with Server-Sent Events for real-time updates

**--host** _address_
> Custom API listen address (default: 127.0.0.1:7421)

**--demo**
> Use generated fake data instead of real sessions

**--version**
> Print the version and exit

**--help**
> Display help information

**sessions**, **history**
> List and reopen sessions for the current directory; **--yolo** reopens in YOLO mode

**latest**
> Resume the most recent session in the current directory

**search** _query_
> Search transcripts of file-based agents with highlighted snippets

**limits**
> Show 5-hour, weekly, and monthly usage summaries; **--json** prints JSON

**prune**
> Delete chat files older than **--days** or whose project folder no longer exists

**compact**
> Shrink session files by truncating bulky payloads

**passphrase**
> Set or rotate the HTTP API passphrase

# DESCRIPTION

**lazyagent** is a terminal UI, macOS and Linux desktop app, and HTTP API for monitoring all running coding agent instances on your machine. It supports **Claude Code**, **Cursor**, **Codex CLI**, **Grok CLI**, **Kilo**, **Kimi Code CLI**, **Amp**, **pi**, and **OpenCode**.

Unlike other tools, lazyagent does not replace your workflow: it observes it. Launch agents wherever you want (terminal, IDE, desktop app) and lazyagent watches session data to determine what each session is doing. No modifications to any agent are needed.

The HTTP API provides a REST interface with Server-Sent Events for real-time push updates, allowing custom dashboards, mobile apps, or integration with existing tools.

# CAVEATS

The desktop app (**--gui**) needs a desktop package on macOS or Linux; CLI-only builds print an error. The **--api** server asks for a passphrase on first interactive run and serves plain HTTP, so take care when exposing it beyond localhost. Monitoring is observational, but **prune** and **compact** modify session files on disk. Building from source requires **Go 1.25+**, plus **Node.js 18+** for the desktop frontend.

# HISTORY

lazyagent was created by **Illegal Studio** and written primarily in **Go** with a **Svelte** frontend for the menu bar app. It was first released in **2026** to address the growing need for developers running multiple AI coding agents simultaneously to have a unified monitoring view.

# SEE ALSO

[tmux](/man/tmux)(1), [htop](/man/htop)(1), [lazygit](/man/lazygit)(1)

# RESOURCES

```[Source code](https://github.com/illegalstudio/lazyagent)```

```[Homepage](https://lazyagent.dev)```

```[Documentation](https://lazyagent.dev/docs)```

<!-- verified: 2026-11-09 -->
