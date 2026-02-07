# TAGLINE

Manage background services for Homebrew packages

# TLDR

**List all services**

```brew services list```

**Start a service**

```brew services start [postgresql]```

**Stop a service**

```brew services stop [postgresql]```

**Restart a service**

```brew services restart [postgresql]```

**Run service in foreground**

```brew services run [postgresql]```

**Stop all services**

```brew services stop --all```

**Clean up unused services**

```brew services cleanup```

# SYNOPSIS

**brew services** [_subcommand_] [_formula_] [_options_]

# DESCRIPTION

**brew services** manages background services for installed Homebrew formulae. On macOS, it uses launchd with LaunchAgent plist files. On Linux, it uses systemd user units.

Services configured with this command start automatically on user login.

# SUBCOMMANDS

**list**
> List all managed services and their status

**start** _formula_
> Start service and configure for login startup

**stop** _formula_
> Stop service and disable login startup

**restart** _formula_
> Restart service

**run** _formula_
> Run service in foreground (no login startup)

**cleanup**
> Remove unused service files

**info** _formula_
> Show service information

# PARAMETERS

**--all**
> Apply to all services

**--json**
> Output in JSON format

**--file** _path_
> Use custom service file

# SERVICE FILES

**macOS**
> ~/Library/LaunchAgents/homebrew.mxcl.<formula>.plist

**Linux**
> ~/.config/systemd/user/homebrew-<formula>.service

# CAVEATS

On Linux, requires a running user systemd instance. Common use cases include databases (postgresql, mysql), caches (redis), and web servers. Use **run** for development to avoid startup configuration.

# HISTORY

Introduced in Homebrew 0.9.9 (February 2014) for macOS launchd support. Linux/systemd support was added via Linuxbrew and merged into core Homebrew by 2020.

# SEE ALSO

[brew](/man/brew)(1), [launchctl](/man/launchctl)(1), [systemctl](/man/systemctl)(1)
