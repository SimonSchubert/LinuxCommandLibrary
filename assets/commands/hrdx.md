# TAGLINE

Terminal multiplexer for coding-agent workspaces, tabs, and panes

# TLDR

**Start** in the current directory (restores the last layout if one was saved)

```hrdx```

Open **several projects** as workspaces

```hrdx --cwd [~/Developer/api] --cwd [~/Developer/web]```

Default new panes to **Claude Code**

```hrdx --agent claude```

**Resume** each project's latest agent session

```hrdx --continue```

**Ignore** saved workspaces and start clean

```hrdx --fresh```

**Update** the installed binary, or only check for a release

```hrdx update```

```hrdx update --check```

Print **version**

```hrdx --version```

# SYNOPSIS

**hrdx** [**--cwd** _path_] ... [**--agent** _id_] [_options_]

**hrdx** **update** [**--check**]

**hrdx** **--version**

# PARAMETERS

**--cwd** _path_
> Open a project as a workspace. Repeatable. If omitted and no saved state exists, the current directory is used.

**--agent** _id_
> Default agent for new panes: **zot** (default), **pi**, **claude**, **codex**, or a custom harness **kind**.

**--provider** _id_ / **--model** _id_ / **--reasoning** _level_
> Passed through to every **zot** pane only.

**--continue**
> Resume each project's latest session (built-in agents; also passed to zot as **--continue**).

**--codex-bin** / **--claude-bin** / **--pi-bin** / **--zot-bin** _path_
> Use a specific agent binary instead of PATH.

**--shell** _path_
> Shell for shell panes (default **$SHELL**, or **/bin/sh** if unset).

**--state** _path_
> State file for workspace persistence. Empty disables persistence. Default **$XDG_CONFIG_HOME/hrdx/state.json** on Linux (**~/Library/Application Support/hrdx/state.json** on macOS).

**--fresh**
> Ignore saved workspaces and clean up now-unreferenced held sessions.

**--api** / **--api=false**
> Serve the JSON control API on **hrdx.sock** next to the state file (default on).

**--persist** / **--persist=false**
> Keep pane processes alive across TUI restarts via the session holder (default on).

**update**
> Replace the binary from the project's installer. **--check** only reports whether a newer release exists.

**-v**, **--version**, **version**
> Print **hrdx** version (and commit/date when injected at build time).

# KEYS

All keys go to the focused PTY except the **ctrl+b** prefix (tmux-style). After the prefix:

**c** / **C**
> Split right / below (picker: installed agents or shell).

**a** / **A**
> Split right / below with the default agent.

**s** / **S** (also **%** / **"** and **|** / **-**)
> Split a new shell pane.

**w** / **t** / **n** / **p**
> New workspace; new tab; next / previous tab.

**]** / **[**
> Next / previous workspace.

**tab** / **shift+tab**
> Next / previous pane (stays in prefix mode until **esc**).

**/** / **r** / **m** / **=**
> Fuzzy finder; rename pane; context menu; equalize splits.

**,** / **x** / **X** / **q**
> Settings; close pane; close workspace; quit.

**ctrl+b** (again)
> Send a literal ctrl+b to the pane.

# DESCRIPTION

**hrdx** is an experimental terminal multiplexer aimed at running coding agents side by side. The sidebar lists **workspaces** (project directories), **tabs** per workspace, and **panes**. Every pane is a real PTY with a full terminal emulator, so Codex CLI, Claude Code, pi, zot, or a plain shell run as they do standalone (streaming, slash commands, mouse, kitty keyboard protocol). **HRDX=1** is set in panes so tools can detect the multiplexer.

Unfocused agents show a braille spinner while busy and turn orange when a turn finishes; focusing the pane acknowledges it. Quitting the TUI does not kill sessions when **--persist** is on: a small background **holder** (the same binary) owns the PTYs and hrdx reattaches on the next launch, replaying scrollback. If a held session is gone, shells start fresh and agents resume from their own session stores.

A newline-delimited JSON API on **hrdx.sock** lets scripts inspect workspaces, spawn panes, type into agents, wait until idle, read the screen, and subscribe to events (**status**, **workspace.create**, **pane.send_text**, **pane.wait**, **pane.read**, **events.subscribe**, and others). Mouse support includes drag-to-resize, drag-to-reorder workspaces, selection copy, and right-click menus.

Install via `curl -fsSL https://www.hrdx.dev/install.sh | bash`. Requires Go 1.25+ to build from source. MIT.

# CONFIGURATION

Files live next to the state file (Linux: **$XDG_CONFIG_HOME/hrdx/**):

**state.json**
> Workspaces, tabs, splits, ratios, and holder session ids. Written automatically.

**keys.json**
> Map action names to a single key. **prefix** remaps **ctrl+b** itself. Actions include **quit**, **find**, **agent-cycle**, **settings**, **close-pane**, and the split/workspace/tab helpers.

**harness.json**
> Array of custom agent CLIs. Fields: **kind** (required, not a built-in), **binary**, **args**, **resume**, **resume_first**, **busy** (substring while working), **idle_title**, **attention_title**.

**themes/*.json**
> Color overrides (ANSI 256 or **#rrggbb**): **accent**, **alt**, **muted**, **faint**, **good**, **busy**, **bad**, **bar_bg**, **bar_fg**, **ink**. Picked in the settings window.

**sounds.json**
> Extra notification sounds (**name**, **file**) for finished agent turns.

**hrdx.sock** / **holder.sock**
> Control API and session-holder sockets (same directory).

# CAVEATS

Experimental. Built-in pickers expect at least one of **codex**, **claude**, **pi**, or **zot** on PATH (or a custom harness). The holder keeps the **local** client process (including **ssh** / **docker exec** / **kubectl exec**); it cannot keep a remote agent alive or reconnect when the other end dies. Workspace Git details are read from the local path, not a remote filesystem. **--holder** is an internal mode and is not a user command.

# HISTORY

Written by **Patric Eckhart** in Go (MIT). Homepage **https://www.hrdx.dev**.

# SEE ALSO

[tmux](/man/tmux)(1), [zellij](/man/zellij)(1), [screen](/man/screen)(1), [byobu](/man/byobu)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [pi](/man/pi)(1)

# RESOURCES

```[Source code](https://github.com/patriceckhart/hrdx)```

```[Homepage](https://www.hrdx.dev)```

<!-- verified: 2026-08-27 -->
