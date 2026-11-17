# TAGLINE

Control plane for a local team of coding agents

# TLDR

Show where this install stands

```timon```

Finish setup from the terminal

```timon init```

**Check** the service, backends, and paths

```timon doctor```

List agent CLIs Timon **found**

```timon backends```

Install the **background service**

```timon service install```

See what that install would change

```timon service install --dry-run```

**Start** a mission

```timon spawn [agent] [what to do]```

Send a follow-up **without stopping** the current turn

```timon send [mission_id] [more input]```

**Redirect** the turn that is running

```timon steer [mission_id] [new direction]```

Wait until the turn **ends**

```timon wait [mission_id]```

**Stop** a mission

```timon kill [mission_id]```

# SYNOPSIS

**timon** [_COMMAND_] [_ARGS_]

# DESCRIPTION

**timon** is the command-line client for Timon, a local workstation that runs coding agents as missions. The Linux build is x86-64 and needs glibc 2.28 or newer. The vendor installer is `https://timon-ai.com/install.sh`. It checks the published size and checksum before it installs. The desktop app is Electron. This page is the CLI.

You need one already-signed-in agent CLI: `claude`, `codex`, `copilot`, `grok`, `opencode`, `pi`, or `hermes-acp`.

Getting started and the service:

- `timon` with no arguments prints the next useful command
- `init` finishes setup: service, first account, and AI tools. `--email`, `--name`, `--password-stdin`, and `--yes` are the non-interactive flags
- `doctor` checks the service, backends, and paths
- `backends` lists agent CLIs and models that are actually available
- `service install|uninstall|stop|start|status|repair|session-mode` manages the background service
- `update check|status|apply`, and `update approve VERSION`, move the daemon onto a published package
- `app status|restart` talks to the desktop app
- `module list|enable|disable` toggles modules
- `logs`, `backup`, `export`, and `import` cover operations and moving data

Missions and agents:

- `list` lists agents
- `spawn AGENT INPUT...` starts a mission and prints a mission id. `--extra-skills`, `--extra-mcp`, `--allow`, and `--title` apply to that spawn only
- `send`, `steer`, `wait`, `status`, and `kill` take a mission id
- `stop agent NAME` or `stop project SLUG` stops a whole scope
- `trace` reads a trace or mission. `trace backfill` replays cold events
- `agent create|update|rename|set-main|set-scope|export|import` manage agents. `agent trash list|restore|purge` handles deleted agents
- `agent doc list|get|put|rm` reads and writes identity files under `~/.timon/agents/`

Other groups, each with its own help text: `skill`, `mcp`, `task`, `project`, `worktree`, `series`, `workflow`, `routine`, `trigger`, `plugin`, `secret`, `auth`, `memory`, and `browser`. `timon COMMAND --help` prints that group's flags. Do not guess flags that are not in that help.

License is AGPL-3.0-only.

# CAVEATS

`spawn` and `task create` can start an agent that runs tools, including a shell, in a working directory you set. `service install` registers a background process. On a server, run `service install --dry-run` first.

`mission permission-mode set` cannot raise a mission above your own level. Modes include `plan`, `default`, `acceptEdits`, and `auto`.

# CONFIGURATION

Per-user state is under `~/.timon/`, including `agents/`, `skills/`, and `mcp/`. Agent identity documents are Markdown files in the agent directory, such as `SOUL.md`.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1), [git](/man/git)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/ai-timon/timon)```

```[Homepage](https://timon-ai.com)```

```[Documentation](https://docs.timon-ai.com)```

<!-- verified: 2026-11-17 -->
