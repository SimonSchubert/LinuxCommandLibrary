# TAGLINE

Remote browser console for tmux sessions

# TLDR

**Start** the dashboard daemon (default port 3000)

```run-kit daemon start```

**Open** the dashboard in a browser

```open http://localhost:3000```

**Spawn** an agent workspace in a git worktree (must be inside tmux)

```run-kit riff```

**Spawn** three parallel workspaces

```run-kit riff -N 3```

**Check** dependencies when something fails

```run-kit doctor```

**Send** a Web Push notification to subscribed devices

```run-kit notify "deploy finished" --title "CI"```

# SYNOPSIS

**run-kit** \<command\> [_options_]

# DESCRIPTION

**run-kit** (short alias **rk**) is a remote, phone-first console for **tmux**. It exposes every session and pane as a live terminal in a browser sidebar—no database; state is derived from tmux and the filesystem. The same dashboard works on a phone over Tailscale HTTPS.

Two halves compose independently:

* **run-kit riff** — creates a git worktree (via sibling tool **wt**), opens a tmux window, and launches panes (default: a coding agent; any **--cmd** is allowed).
* **run-kit serve** / **run-kit daemon** — HTTP dashboard (default **127.0.0.1:3000**) that watches tmux. The daemon runs in a dedicated tmux server (**rk-daemon**) so restarts do not kill user sessions.

Optional **run-kit agent-setup** installs harness hooks so panes report agent busy/waiting/idle. Boards pin multiple panes side-by-side; **run-kit notify** fans Web Push to subscribed browsers. Shell completion: **eval "$(run-kit shell-init zsh)"**.

Install via the shll toolkit installer or Homebrew (**sahil87/tap/run-kit**). **rk** is a full interchangeable alias of **run-kit**.

# PARAMETERS

**riff** [_preset_] [**--skill** _slash_] [**--cmd** _command_] [**-N** _count_] [**--layout** _layout_] [**--** _wt-flags_]
> Spawn worktree + tmux window + pane(s). Must run inside an existing tmux session. **--skill** and **--cmd** are repeatable (pane array). **-N** spawns parallel workspaces.

**serve**
> Start the HTTP server in the foreground. **RK_HOST** (default **127.0.0.1**), **RK_PORT** (default **3000**).

**daemon start|stop|restart|status**
> Manage the background dashboard daemon.

**doctor**
> Check runtime dependencies (tmux, **wt**, launcher, port).

**agent-setup** [**--uninstall**]
> Install or remove agent-harness hooks for pane state reporting.

**notify** _message_ [**--title** _title_]
> Send a Web Push notification (fail-silent if the server is down).

**status**
> Summarize tmux sessions.

**url**
> Print the configured server URL.

**update**
> Upgrade via Homebrew and restart the daemon.

**shell-init** \<shell\>
> Emit eval-safe completion for zsh, bash, fish, or powershell.

**help**
> Help for any subcommand.

# CAVEATS

**riff** requires **$TMUX**, **wt** on **PATH**, and a configured agent/launcher. Agent status dots need a one-time **agent-setup** and new agent sessions after install. Web Push needs a secure context (HTTPS or localhost). Binding **RK_HOST=0.0.0.0** exposes the terminal dashboard on the network—restrict access (VPN/Tailscale, firewall).

# INSTALL

```brew: brew install run-kit```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tmux](/man/tmux)(1), [git](/man/git)(1), [git-worktree](/man/git-worktree)(1), [tailscale](/man/tailscale)(1)

# RESOURCES

```[Source code](https://github.com/sahil87/run-kit)```

```[Homepage](https://shll.ai/run-kit)```

```[Documentation](https://shll.ai/tools/run-kit/commands/)```

<!-- verified: 2026-07-22 -->
