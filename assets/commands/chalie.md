# TAGLINE

Local personal AI companion with persistent memory

# TLDR

**Install** with the official installer

```curl -fsSL https://chalie.ai/install | bash```

**Start** on the default port (31025)

```chalie```

**Start** on a custom port

```chalie --port=[9000]```

**Stop** the daemon

```chalie stop```

**Restart** the daemon

```chalie restart```

**Update** to the latest release

```chalie update```

**Check** whether it is running

```chalie status```

**Follow** the log file

```chalie logs```

# SYNOPSIS

**chalie** [**--port=**_N_] [**--host=**_H_] [_command_]

# DESCRIPTION

**chalie** is an open-source personal AI that runs on your machine. It keeps working in the background with persistent memory (episodes, concepts, and abstractions with decay), goal tracking, and proactive research. Actions go through an Allow / Ask / Deny policy so it does not act without consent.

It is a single Python process (Flask + WebSocket) with SQLite storage (including vector and FTS search). Optional local voice uses ONNX STT/TTS. Features include vision (photos/screenshots), a driven browser, MCP clients and tools, email/calendar/contacts (IMAP, CalDAV, CardDAV), a natural-language scheduler, guarded shell and sandboxed code, and encrypted whole-instance backup. Models can be cloud providers (OpenAI, Anthropic, Gemini) or local via **ollama**. Default web UI: **http://localhost:31025**.

# PARAMETERS

**start**

> Start the daemon in the background (default if no command is given). Writes PID to **~/.chalie/chalie.pid** and logs to **~/.chalie/chalie.log**.

**stop**

> Stop a running instance and remove the PID file.

**restart**

> Stop, then start again with the same port/host options.

**update**

> Stop, re-run the installer for the latest release, then start again.

**status**

> Print whether Chalie is running and its PID.

**logs**

> Follow **~/.chalie/chalie.log** when stdout is a terminal; otherwise print the last 50 lines.

**version**, **-V**, **--version**

> Print the installed version.

**--port=**_N_, **--port** _N_

> Listen port (default: **31025**).

**--host=**_H_, **--host** _H_

> Bind address (default: **0.0.0.0**). Use **127.0.0.1** to keep the UI local-only.

# CONFIGURATION

**~/.chalie/**

> Install home: virtualenv (**venv/**), app source (**app/**), PID and log files.

**~/.chalie/app/data/**

> Persistent instance data (SQLite and related state). Not overwritten by upgrades.

**CHALIE_HOME**

> Override the install home directory (default **$HOME/.chalie**).

**CHALIE_VENV**

> Path to the Python virtualenv used by **run.sh** (set by the installer CLI).

First boot opens an onboarding wizard to choose a model provider. Fully local setup: install **ollama** and pull a supported model, then point Chalie at it during setup.

# CAVEATS

Requires Python 3.11+. Beta software: sharp edges are expected. First start may download a large embedding model (~400 MB). Binding to **0.0.0.0** exposes the UI on the network — restrict with **--host=127.0.0.1** or a firewall if the machine is shared. Ensure **~/.local/bin** is on **PATH** so the **chalie** wrapper is found after install.

# HISTORY

**Chalie** is an open-source personal AI companion focused on long-running local agency and restrained action policies rather than single-session chat. It ships under the Apache 2.0 license.

# SEE ALSO

[ollama](/man/ollama)(1), [llm](/man/llm)(1), [aichat](/man/aichat)(1), [sgpt](/man/sgpt)(1)

# RESOURCES

```[Source code](https://github.com/chalie-ai/chalie)```

```[Homepage](https://chalie.ai)```

```[Documentation](https://chalie.ai/docs)```

<!-- verified: 2026-07-20 -->
