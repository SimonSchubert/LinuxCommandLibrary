# TAGLINE

run a WirePlumber Lua script outside of the daemon

# TLDR

**Run a Lua** script

```wpexec [path/to/script.lua]```

**Run a script with arguments**

```wpexec [path/to/script.lua] [arg1] [arg2]```

**Show help**

```wpexec --help```

# SYNOPSIS

**wpexec** [_OPTIONS_] _SCRIPT_ [_ARGUMENTS_]

# PARAMETERS

_SCRIPT_
> Path to the Lua script to execute against the running WirePlumber daemon.

_ARGUMENTS_
> Positional arguments passed to the script and accessible via the **arg** Lua table.

**-h**, **--help**
> Display help information and exit.

# DESCRIPTION

**wpexec** loads and runs a single WirePlumber Lua script in an isolated context. Unlike scripts that live in the **/usr/share/wireplumber/scripts/** tree and are managed by the daemon, **wpexec** spins up its own connection to the running WirePlumber session, executes the script, and exits when the script finishes.

The full WirePlumber Lua API is available, including the **wp.Core**, **wp.ObjectManager**, **wp.Node**, and **wp.Link** classes, so the tool is well suited to ad-hoc PipeWire queries, one-off graph manipulations, and testing snippets that may later be promoted into a managed script.

# CAVEATS

Requires both **WirePlumber** and **PipeWire** to be running. Scripts must be written against the version of the WirePlumber Lua API installed on the system; API breaks are documented in the WirePlumber release notes. Errors raised inside a script propagate to the exit status of **wpexec** but generally do not affect the long-running WirePlumber daemon.

# HISTORY

**wpexec** ships with **WirePlumber**, the session and policy manager for PipeWire developed under the FreeDesktop.org umbrella. It exists alongside the **wpctl** control utility to give power users and packagers a way to drive PipeWire from Lua without modifying the daemon's own configuration.

# SEE ALSO

[wpctl](/man/wpctl)(1), [wireplumber](/man/wireplumber)(1), [pw-cli](/man/pw-cli)(1), [pw-dump](/man/pw-dump)(1)
