# TAGLINE

Keep macOS awake only while AI coding agents are working

# TLDR

**Acquire** a sleep-blocking assertion when an agent session starts

```adrafinil acquire [session-key] --tool [claude-code] --reason "[long build]"```

**Release** the assertion when the agent goes idle

```adrafinil release [session-key]```

**Hold** the Mac awake for a time-boxed background task

```adrafinil hold --for [30m] --reason "[deploy]"```

**Show** current assertion status

```adrafinil status```

**Install** hook integrations for supported agents

```adrafinil install-hooks```

# SYNOPSIS

**adrafinil** _subcommand_ [_options_] [_arguments_]

# PARAMETERS

**acquire** _session-key_
> Register an active agent session and block sleep while it is held. Called from agent hooks on session start or prompt submit.

**release** _session-key_
> Drop a session assertion; sleep resumes when the last assertion is released.

**hold** **--for** _duration_
> Keep the Mac awake for a bounded time after the agent finishes (e.g. a long build or deploy).

**mcp**
> Serve the Model Context Protocol on stdio so MCP-capable agents can acquire and release holds.

**status**
> Print the daemon's assertion registry and whether sleep is currently blocked.

**install-hooks** / **uninstall-hooks**
> Add or remove Adrafinil hook entries in agent config files (Claude Code, Codex, Cursor, Gemini CLI, Aider, Hermes, OpenCode, Cline, Pi).

**daemon-status**
> Report whether the background daemon and privileged helper are running.

**version**
> Print the CLI version.

# DESCRIPTION

**adrafinil** is the command-line interface for **Adrafinil**, a macOS utility that prevents system sleep — including **clamshell (lid-closed) sleep** — only while one or more AI coding agent sessions hold an active assertion. Unlike always-on tools such as **caffeinate** or Amphetamine, adrafinil does nothing when no agent is working; closing the lid lets the Mac sleep normally.

Agent hook systems call **adrafinil acquire** when a turn starts and **adrafinil release** when the agent stops, so sleep is blocked only during actual work. A reference-counted daemon tracks overlapping sessions and asks a small privileged helper to toggle sleep blocking. The helper uses **IOPMAssertion** for idle sleep and **pmset disablesleep** for clamshell override.

The CLI ships inside the Adrafinil.app bundle and is symlinked onto **PATH** during installation. Round-trip **acquire**/**release** calls target under 50 ms so hooks do not stall agent workflows.

# CAVEATS

macOS only; tested on **macOS Tahoe 26.4** and later. Overriding clamshell sleep requires a privileged helper installed via **SMAppService** (admin rights on first launch). The helper resets **pmset disablesleep** on respawn to avoid leaking a permanent sleep block after a crash. A thermal cutout force-releases all assertions if skin/CPU temperature crosses a threshold while the lid is closed.

# HISTORY

**Adrafinil** was created by **@kageroumado** and released in **2026** as an agent-aware alternative to blanket wake utilities. The name references the wakefulness-promoting compound adrafinil, matching the tool's behavior of keeping the machine awake only when work is in progress.

# SEE ALSO

[caffeinate](/man/caffeinate)(1), [pmset](/man/pmset)(8)

# RESOURCES

```[Source code](https://github.com/kageroumado/adrafinil)```

```[Homepage](https://kagerou.glass/adrafinil/)```

<!-- verified: 2026-06-28 -->