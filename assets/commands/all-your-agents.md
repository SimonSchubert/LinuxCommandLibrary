# TAGLINE

Live terminal monitor for coding-agent sessions on this machine

# TLDR

Open a **full-screen live view** of every coding agent

```all-your-agents```

Run once without installing globally (**npx**)

```npx @markwylde/all-your-agents```

Print a **table of live sessions** and exit

```all-your-agents --once```

Print live sessions as **JSON** and exit

```all-your-agents --json```

Include **every session**, not only live ones, as JSON

```all-your-agents --json --history```

Keep **closed sessions** visible while the TUI is open

```all-your-agents --all```

Show **help** and key bindings

```all-your-agents --help```

Print the **version**

```all-your-agents --version```

# SYNOPSIS

**all-your-agents** [**--once**] [**--json**] [**--all**] [**--history**] [**--help**] [**--version**]

# DESCRIPTION

**all-your-agents** is a terminal UI and CLI that lists every coding-agent session on the machine, like **top** for agents. Live sessions that are waiting on the user are shown first. The display updates when an agent changes, a key is pressed, or the terminal resizes—it does not poll on a timer.

Built-in providers watch Claude Code, Grok Build, Codex CLI, and oh-my-pi (**omp**) by reading the files and processes each harness already writes. Press **H** for history (finished sessions included) and **t** to follow a session transcript. **--once** and **--json** print a snapshot and exit; when stdout is not a terminal, the command behaves as if **--once** was given. **NO_COLOR** is honoured.

The same package also exports a Node.js API (**AllYourAgents**) for event-driven hosts. The CLI binary name is **all-your-agents** (`npx @markwylde/all-your-agents`).

# PARAMETERS

**--once**
> Print a table of live sessions and exit. Implied when stdout is not a terminal.

**--json**
> Print live sessions as JSON and exit. Combine with **--history** for every session (live ones first).

**--all**
> Also show sessions that close while the TUI is open.

**--history**
> Include every session the providers know, not only live ones.

**-h**, **--help**
> Show usage and key bindings.

**-v**, **--version**
> Print the package version.

# KEYBOARD CONTROLS

**↑ ↓** / **k j**, **Home End**, **PgUp PgDn**: Move the selection
**Enter**: Details for the selected session (title, folder, waiting-for, current tool, last error, subagents)
**/**: Filter by title, folder, harness, model, or pid (**Esc** clears)
**s** **>** / **<**: Next / previous sort column
**r**: Reverse sort order
**c**: Show or hide closed sessions
**H**: Show or hide history
**t**: Transcript of the selected session (**t** or **Esc** closes)
**?** / **h**: Help
**q** / **Ctrl+C**: Quit and restore the terminal

# CAVEATS

Requires **Node.js 20** or newer on macOS or Linux. Coverage is harness-specific: some print-mode runs appear only in history, Codex does not report **waiting** for approval prompts, and Grok headless (**grok -p**) is live only when **GROK_TRACK_HEADLESS** is set. The tool observes sessions; it does not launch or stop agents. Without the optional **koffi** native module, process-exit watching is limited and providers re-validate on the next file change.

# HISTORY

**all-your-agents** is published as the npm package **@markwylde/all-your-agents** (AGPL-3.0-or-later). It is an event-driven, harness-neutral watcher rather than a polling dashboard.

# SEE ALSO

[htop](/man/htop)(1), [top](/man/top)(1), [claude](/man/claude)(1), [grok](/man/grok)(1), [codex](/man/codex)(1), [omp](/man/omp)(1)

# RESOURCES

```[Source code](https://github.com/markwylde/all-your-agents)```

<!-- verified: 2026-09-23 -->
