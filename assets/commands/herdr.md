# TAGLINE

Terminal multiplexer built for AI coding agents

# TLDR

**Start** herdr in the current project

```herdr```

**Detach** from a session (default prefix style)

```[ctrl+b] q```

**Reattach** later

```herdr```

**Install** via script

```curl -fsSL https://herdr.dev/install.sh | sh```

# SYNOPSIS

**herdr** [*options*] [*command*]

# DESCRIPTION

**herdr** is an agent-oriented terminal multiplexer: a single Rust binary that runs inside your existing terminal, shows live panes for coding agents (Claude Code, Codex, and others), and keeps sessions running after detach—including over SSH. It supports keyboard and mouse, tmux-style prefix keys, splits, plugins, and a socket API so agents can spawn panes and wait on each other.

Docs: https://herdr.dev/docs/

# PARAMETERS

**herdr**

> Attach to the session for the current workspace or create one.

Additional subcommands and flags (remote attach, plugin management, etc.) are version-specific—run **herdr --help** and see the online quick start.

Common UX: prefix **ctrl+b** then **q** to detach; run **herdr** again to reattach.

# CAVEATS

Agent integrations depend on which tools you install. Socket API and plugins expand the attack surface—treat untrusted plugins carefully. Not a drop-in replacement for every **tmux** workflow; learn herdr's own keybindings.

# SEE ALSO

[tmux](/man/tmux)(1), [zellij](/man/zellij)(1), [gemini](/man/gemini)(1)

# RESOURCES

```[Source code](https://github.com/ogulcancelik/herdr)```

```[Homepage](https://herdr.dev)```

```[Documentation](https://herdr.dev/docs/)```

<!-- verified: 2026-07-19 -->
