# TAGLINE

Hibernate and restore Claude Code sessions across reboots

# TLDR

**Snapshot all** running Claude Code sessions before shutdown

```claude-hibernate hibernate --all```

**Snapshot** sessions in the current repo's worktrees only

```claude-hibernate hibernate```

**Preview** what would be snapshotted (no write)

```claude-hibernate hibernate --dry-run```

**List** sessions in the saved snapshot

```claude-hibernate list```

**Wake** all snapshotted sessions after reboot

```claude-hibernate wake```

**Preview** wake commands without launching terminals

```claude-hibernate wake --dry-run```

**Verify** environment and detection end-to-end

```claude-hibernate doctor```

**Install** Claude Code hooks for exact session IDs

```claude-hibernate hooks install```

**Enable** automatic snapshots every 10 minutes

```claude-hibernate auto enable```

# SYNOPSIS

**claude-hibernate** _command_ [_options_]

# PARAMETERS

**hibernate**
> Capture running Claude Code sessions to the snapshot file. Scope: **--repo** (default, current repo worktrees), **--here** (**$PWD** only), **--all** (whole machine). **--dry-run** previews without writing. **--quiet** reduces output.

**wake**
> Reopen and resume every session from the snapshot. **--dry-run** prints resume commands only. **--fork** resumes with **--fork-session** (fresh IDs). **--live** sources currently running sessions instead of the snapshot. **--launcher** _name_ forces a terminal backend (**tmux**, **iterm2**, **terminal**, **kitty**, **wezterm**, **alacritty**, **gnome-terminal**, **konsole**, **print**).

**list**
> Show the snapshot. **--live** lists currently running sessions instead.

**doctor**
> Run environment checks (**ok** / **warn** / **FAIL**).

**hooks** **install** | **uninstall** | **status**
> Manage Claude Code **SessionStart** hooks for exact session-id tracking.

**auto** **enable** | **disable** | **status**
> Manage periodic auto-snapshot (launchd on macOS, systemd user timer or crontab on Linux). **enable --interval** _N_ sets minutes between snapshots (default **10**).

# DESCRIPTION

**claude-hibernate** is OS hibernation for Anthropic **Claude Code** sessions. Claude Code does not persist which sessions are running; a reboot kills every process and leaves you reconstructing what was open. This tool snapshots the live set to disk before power-off and restores it after boot—each session in its original directory, on its original session id, with captured launch flags such as **--model** and **--dangerously-skip-permissions**, in your preferred terminal.

Session discovery uses multiple heuristics (process name, binary path, project correlation, command-line args) because Claude Code process names vary by install type and platform. Optional **hooks install** makes Claude Code report exact session IDs at startup. Without hooks, ids may come from **--resume** in process args (macOS) or a newest-transcript heuristic.

**wake** auto-detects the terminal (or uses **CLAUDE_HIBERNATE_LAUNCHER** / **--launcher**). Inside tmux, tmux always wins; otherwise backends include iTerm2 pane grids, Terminal.app, kitty/wezterm/alacritty, GNOME Terminal/Konsole, and **print** (commands only). If a session is still running, **wake** skips it to avoid two processes on one id (**--fork** overrides).

State lives under **${XDG_STATE_HOME:-~/.local/state}/claude-hibernate/** (**snapshot.json**, **history/** generations, **live/** hook records). Requires **bash** 3.2+, **python3**, and standard Unix tools. Install via Homebrew tap, the project's **install.sh**, or by copying **scripts/claude-hibernate.sh** to **PATH**.

# CONFIGURATION

**CLAUDE_HIBERNATE_STATE_DIR**
> Override the state directory (default **~/.local/state/claude-hibernate**).

**CLAUDE_HIBERNATE_FILE**
> Override the snapshot file path.

**CLAUDE_CONFIG_DIR**
> Claude Code config directory used for project/transcript correlation.

**CLAUDE_HIBERNATE_HISTORY_KEEP**
> Number of timestamped snapshot generations to retain in **history/** (default **10**).

**CLAUDE_HIBERNATE_LAUNCHER**
> Default terminal backend for **wake** (same names as **--launcher**).

# CAVEATS

Claude Code transcript and process internals are unsupported surfaces and can break across updates—run **doctor** after upgrades. On Linux, Claude rewrites process args, so launch flags are restored reliably only for hook-tracked sessions. **hibernate** does not stop sessions; it only snapshots them. Codex and other agents are out of scope. First **wake** on macOS may prompt for Automation access to iTerm2 or Terminal.app.

# HISTORY

Written by **Steve Vitali** as a self-contained bash tool (with python3 for JSON) focused on Claude Code session resume across reboots. MIT licensed. Extracted from a broader agent-skills collection into its own repository.

# SEE ALSO

[claude](/man/claude)(1), [claude-thermos](/man/claude-thermos)(1), [tmux](/man/tmux)(1)

# RESOURCES

```[Source code](https://github.com/SteveVitali/claude-hibernate)```

```[Documentation](https://github.com/SteveVitali/claude-hibernate#readme)```

<!-- verified: 2026-07-24 -->
