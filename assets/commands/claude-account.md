# TAGLINE

Switch isolated Claude Code accounts on Linux

# TLDR

**Install** a release binary and wire the PATH shim

```./claude-account install```

**Add** a named account profile (opens official Claude login)

```claude account add [name]```

**Switch** the active profile

```claude account use [name]```

**List** profiles and show the current one

```claude account list```

```claude account current```

**Remove** a profile (optionally purge local data)

```claude account remove [name]```

Run Claude normally after switching — the shim sets an isolated config dir

```claude```

# SYNOPSIS

**claude-account** **install**

**claude** **account** _subcommand_ [_options_]

# DESCRIPTION

**claude-account** is a Linux-only profile switcher for Claude Code. After **install**, it places a **claude** shim earlier on **PATH** that sets an isolated **CLAUDE_CONFIG_DIR** per named account and forwards all other arguments to the real Claude Code executable.

Claude Code itself still performs login, logout, credentials, and token refresh. **claude-account** never reads or copies credential contents. It is an independent community project and is not made, endorsed, or supported by Anthropic.

Default storage uses XDG paths under **~/.config/claude-account/** and **~/.local/share/claude-account/**. **CLAUDE_ACCOUNT_HOME** can relocate all application data. For profile isolation, the wrapper clears **ANTHROPIC_API_KEY**, **ANTHROPIC_AUTH_TOKEN**, and **CLAUDE_CODE_OAUTH_TOKEN** from the child environment unless **CLAUDE_ACCOUNT_PRESERVE_AUTH_ENV=1** is set.

# COMMANDS

**install**

> Install the shim directory and print the **export PATH=...** line to add to the shell profile.

**account add** _name_ [**--email** _addr_] [**--sso**] [**--console**]

> Register a profile and run Claude Code's official login for it. The first profile becomes active.

**account use** _name_

> Make _name_ the active profile for newly launched Claude processes.

**account list**

> List registered profiles.

**account current**

> Print only the active profile name (script-friendly).

**account remove** _name_ [**--purge**] [**--yes**] [**--force**]

> Log out and unregister a profile. **--purge** deletes settings, sessions, plugins, and history. Removing the active profile requires **--force**.

# CAVEATS

Linux only. Requires an existing Claude Code installation. Switching does not affect already-running Claude sessions. The install binary is **claude-account**; day-to-day profile commands are invoked as **claude account ...** through the shim.

# SEE ALSO

[claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/hamzarehmandeveloper/claude-account)```

<!-- verified: 2026-07-30 -->
