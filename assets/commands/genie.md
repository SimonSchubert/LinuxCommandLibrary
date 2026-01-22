# TLDR

**Initialize** the bottle (run once at start)

```genie -i```

Run a **login shell** inside the bottle

```genie -s```

Run a **specified command** inside the bottle

```genie -c [command]```

# SYNOPSIS

**genie** [_options_]

# PARAMETERS

**-i**, **--initialize**
> Initialize the bottle namespace for systemd

**-s**, **--shell**
> Start a login shell inside the bottle

**-c**, **--command** _COMMAND_
> Run a command inside the bottle and exit

**-u**, **--user** _USER_
> Run as specified user (default: current user)

**-v**, **--verbose**
> Enable verbose output

# DESCRIPTION

**genie** creates a "bottle" - a PID namespace with systemd running as PID 1 - inside Windows Subsystem for Linux (WSL). This enables running systemd-dependent services that would otherwise not work in WSL's default environment.

WSL normally uses a Microsoft init system, which prevents systemd services from running. genie works around this by creating a namespace where systemd can run normally, then providing access to that environment.

Initialize the bottle once per WSL session with **-i**, then use **-s** to enter or **-c** to run commands within the systemd environment.

# CAVEATS

Requires WSL 2. Some systemd services may still not work perfectly due to WSL limitations. The bottle must be initialized before use and persists until WSL is shut down. Network configuration may behave differently inside the bottle.

# HISTORY

genie was created by Arkane Systems to address the lack of systemd support in WSL. As systemd became the standard init system for most Linux distributions, many services and tools expected it to be present, creating compatibility issues in WSL's unique environment.

# SEE ALSO

[systemd](/man/systemd)(1), [wsl](/man/wsl)(1)
