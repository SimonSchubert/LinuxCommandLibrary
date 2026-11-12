# TAGLINE

Attention queue for Claude Code sessions in tmux

# TLDR

**Open** the queue TUI (inside tmux)

```aq```

**List** sessions that can receive a tell

```aq tell```

Ask another session to do work (you approve it in aq)

```aq tell [project-name] "[message]"```

# SYNOPSIS

**aq**

**aq tell** [_name_ [_message_...]]

**aq hook** _event_ [_--deadline-secs_ _n_]

# PARAMETERS

_(no command)_
> Start the terminal UI. Watches Claude Code sessions in tmux and shows work that needs you, one card at a time.

**tell** [_name_ [_message_...]]
> With no arguments, list sessions. With a name (the project as the tab shows it) and a message, queue a card for you to send, edit, or drop.

**hook** _event_ [_--deadline-secs_ _n_]
> Claude Code hook entry. Reads the hook payload on stdin and prints a decision JSON. A parse error on this command exits 0 so a broken hook never blocks Claude.

# DESCRIPTION

**aq** is a Linux terminal UI that sits beside Claude Code sessions in tmux. Claude Code hooks push diffs, edit approvals, permission prompts, questions, and option menus into one queue. A new card never takes the screen from the card you are on.

Each project has a mode, cycled with **M**:

**review** (default)
> When a session finishes, its diff is a card. Comment on a line or range, **s** sends the comments, **a** approves, **d** marks a file done.

**step**
> Every edit waits. **y** allows it, **n** refuses with a reason.

**quiz**
> After a turn, aq asks you to explain parts of the diff. A judge marks the answer.

**vibe**
> Nothing is checked.

When nothing is waiting, tabs show live sessions. **Enter** messages the selected session, **W** asks where it is up to, **N** starts a new Claude session (Tab for a worktree, Ctrl-O for another folder), **O** opens a workspace of git repos. **F2** repeats the first-run tour, **F1** lists keys.

If aq is not running, the hooks do nothing and Claude continues.

# CONFIGURATION

**~/.config/aq/config.toml**
> Theme, each checkout's mode, whether the file list is hidden, and whether the tour has been seen. **t** cycles themes.

**~/.local/state/aq/state.json**
> Review rounds, unsent comments, and quiz progress across restarts.

Hooks from `contrib/settings-hooks.json` must be merged into `~/.claude/settings.json` under PreToolUse, PostToolUse, and PermissionRequest. Restart existing Claude sessions after adding them.

# CAVEATS

Linux and tmux only. Needs `aq` on PATH and Claude Code hooks installed. First start runs a tour on made-up cards. Sessions started outside a workspace need an `aq tell` hint in CLAUDE.md if they should message other repos.

# SEE ALSO

[tmux](/man/tmux)(1)

# RESOURCES

```[Source code](https://github.com/nodo-labs-uk/attention-queue)```

<!-- verified: 2026-11-12 -->
