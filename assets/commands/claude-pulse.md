# TAGLINE

Local dashboard for monitoring Claude Code sessions

# TLDR

**Run the dashboard** without installing (downloads and executes via npx)

```npx pulse-for-claude-code```

**Wire notification and approval hooks** into Claude's settings

```claude-pulse install-hooks```

**Start** the service detached in the background

```claude-pulse start```

**Check** whether the service is running

```claude-pulse status```

**Stop** the background service

```claude-pulse stop```

**Recover** a lost session as a readable transcript

```claude-pulse recover```

**Run** the dashboard on a custom port

```claude-pulse start --port [4317]```

# SYNOPSIS

**claude-pulse** _command_ [_options_]

**npx pulse-for-claude-code** [_command_] [_options_]

# DESCRIPTION

**claude-pulse** is a local, dependency-free dashboard for **Claude Code**. It displays live token usage and context fill, recovers lost sessions, provides full-text search across past sessions, and lets you approve tool calls remotely (for example from a phone) through notification and approval hooks.

Everything runs on the local machine: by default the dashboard serves on **127.0.0.1:4317** and opens in the browser. It is distributed on npm as **pulse-for-claude-code** and exposes the **claude-pulse** command once installed; it can also be run ad hoc with **npx** or directly from a clone via **node bin/cli.js**.

# PARAMETERS

**install-hooks**
> Wire notification and approval hooks into Claude's settings.

**start**
> Run Pulse detached in the background.

**stop**
> Stop the background service.

**status**
> Report whether the service is running.

**restart**
> Stop and restart the service.

**recover**
> Recover a lost session as a readable transcript.

**export-all**
> Export all sessions to a compressed markdown file.

**install-service**
> (macOS) Start Pulse at login with automatic restart.

**uninstall-service**
> Remove the system service.

**--port** _PORT_
> Serve the dashboard on _PORT_ instead of the default 4317.

**--no-open**
> Do not open the dashboard in a browser on startup.

# CAVEATS

Requires Node.js 18 or newer. The dashboard binds to localhost only; remote tool-call approval works by reaching that local service, so exposing it beyond the machine is the user's responsibility. Hooks modify Claude's settings file, so review the changes made by **install-hooks**.

# HISTORY

claude-pulse is a community tool published on npm as **pulse-for-claude-code**, created to give Claude Code users visibility into token usage, context, and session history without external dependencies. It is distributed under the MIT license.

# SEE ALSO

[claude](/man/claude)(1), [npx](/man/npx)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/nikitadoudikov/claude-pulse)```

<!-- verified: 2026-06-22 -->
