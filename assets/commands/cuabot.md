# TAGLINE

Sandbox launcher for AI coding agents with computer-use (deprecated)

# TLDR

**Run the default agent** in a sandbox

```cuabot```

**Launch a specific agent** (claude, gemini, codex, aider, openclaw, vibe)

```cuabot [agent]```

**Run any command** inside the sandbox

```cuabot [command]```

**Start a named isolated** session

```cuabot -n [session_name] [agent]```

**Take a screenshot** of the sandbox

```cuabot --screenshot [path/to/output.png]```

**Click at** specific coordinates

```cuabot --click [x] [y]```

**Run a bash command** inside the sandbox

```cuabot --bash "[command]"```

**Start the** background daemon

```cuabot --serve [port]```

**Check daemon** status

```cuabot --status```

**Stop** the daemon

```cuabot --stop```

**Remove** the sandbox container, image, and **~/.cuabot** settings

```cuabot --reset all```

# SYNOPSIS

**cuabot** [_options_] [_agent_ | _command_]

# DESCRIPTION

**cuabot** is a Node.js launcher that runs any CLI coding agent (Claude Code, Codex, Aider, OpenClaw, etc.) or GUI application inside an isolated sandbox with computer-use capabilities. The sandbox is a Docker container (**cuabot-xpra**) whose windows are streamed to the host desktop through **Xpra**, with clipboard sharing and audio. Running **cuabot** without arguments starts the default agent, or the setup wizard on first run.

The sandbox exposes a computer-use API so agents can take screenshots, click, type, scroll, and run shell commands inside the container. Multiple isolated sessions can run concurrently using **-n**, each with its own container and port.

# COMMANDS

**cuabot** _agent_
> Launch the named agent (e.g. _claude_, _codex_, _aider_, _openclaw_, _gemini_, _vibe_) in a sandbox.

**cuabot** _command_
> Execute an arbitrary command inside the sandbox.

**--serve** [_port_]
> Start the **cuabotd** daemon on the optional port.

**--stop**
> Stop the running daemon.

**--status**
> Print daemon status.

**--reset** [_all_|_sandbox_|_settings_]
> Remove the **cuabot-xpra** container and **trycua/cuabot** image (_sandbox_), the **~/.cuabot** directory (_settings_), or both (_all_, the default).

# COMPUTER-USE OPTIONS

**--screenshot** [_path_]
> Capture a screenshot of the sandbox display.

**--click** _x_ _y_ [_button_]
> Click at the given coordinates with the optional button.

**--doubleclick** _x_ _y_
> Double-click at the given coordinates.

**--move** _x_ _y_
> Move the mouse to the coordinates.

**--mousedown** / **--mouseup** _x_ _y_ [_button_]
> Press or release a mouse button.

**--drag** _x1_ _y1_ _x2_ _y2_
> Drag from one coordinate to another.

**--scroll** _x_ _y_ _dx_ _dy_
> Scroll at the given position by the given delta.

**--type** _text_
> Type the given string.

**--key** _key_
> Press and release a single key.

**--keydown** _key_ / **--keyup** _key_
> Press or release a key without releasing/pressing it.

**--bash** _command_
> Run a bash command inside the sandbox.

# OPTIONS

**-n**, **--name** _name_
> Use a named isolated session (separate container and port).

**-h**, **--help**
> Show usage information.

# CAVEATS

**Deprecated**: upstream marks **cuabot** as deprecated and unsafe to run because of known security issues, and no fixes or new releases will follow. Upstream recommends stopping it, uninstalling it (**npm uninstall -g cuabot**), removing the **cuabot-xpra** container and **trycua/cuabot** image, and deleting **~/.cuabot**. Its replacements are Cua Driver over MCP, the **cua** CLI, or Cua Spaces.

Requires Node.js 18+, Docker, and an Xpra client on the host.

The sandbox is intended for AI agents that may execute arbitrary commands. While containerization isolates agents from the host, sharing the clipboard, microphone, or sensitive credentials into a sandbox can leak data. Treat the sandbox boundary as defense-in-depth, not a substitute for code review of agent actions.

# HISTORY

**cuabot** is developed by **trycua** as part of the **Cua** project, an open-source platform for **Computer-Use Agents**. The tool aims to provide a uniform sandbox layer that any coding agent can plug into, decoupling the agent from the host environment. It was later deprecated in favor of Cua Driver and the **cua** CLI.

# SEE ALSO

[claude](/man/claude)(1), [aider](/man/aider)(1), [docker](/man/docker)(1), [chromium](/man/chromium)(1)

# RESOURCES

```[Source code](https://github.com/trycua/cua/tree/main/libs/cuabot)```

```[Homepage](https://cua.ai)```

```[Documentation](https://cua.ai/docs)```

<!-- verified: 2026-11-23 -->
