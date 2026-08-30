# TAGLINE

application sandboxing with Linux namespaces

# TLDR

Run a program inside a sandbox using its **default security profile**

```firejail [program]```

Give the sandbox a **name** you can refer to later

```firejail --name=[web] [firefox]```

Show a **process tree** of everything currently sandboxed

```firejail --tree```

Watch sandbox resource usage, **top-style**

```firejail --top```

**Attach a shell** to a running sandbox

```firejail --join=[web]```

Deny the sandbox **any network access**

```firejail --net=none [program]```

Give the program a **throwaway home directory**

```firejail --private [program]```

Expose only **specific paths** from the real home directory

```firejail --whitelist=[~/Documents] [program]```

Mount a path **read-only** inside the sandbox

```firejail --read-only=[~/.ssh] [program]```

Block **sound and 3D acceleration**

```firejail --nosound --no3d [program]```

**Terminate** a sandbox by name or PID

```firejail --shutdown=[web]```

Register firejail profiles for **desktop launchers**

```sudo firecfg```

# SYNOPSIS

**firejail** [_options_] [_program_] [_arguments_]

# DESCRIPTION

**firejail** securely sandboxes processes using Linux namespaces, seccomp-bpf, and capabilities. It isolates applications from the rest of the system for security.

Provides per-application profiles for common programs like Firefox and VLC.

# PARAMETERS

**--list**
> List running sandboxes

**--netstats**
> Show network activity

**--shutdown** _pid_
> Stop sandbox by PID

**--net** _interface_
> Use network namespace

**--ip** _address_
> Assign IP address

**--seccomp**
> Enable seccomp filtering

**--private**
> Use private home directory

**--private-tmp**
> Use private /tmp

**--private-dev**
> Use private /dev

# CONFIGURATION

**/etc/firejail/[application].profile**
> Application-specific sandboxing profiles defining restrictions and permissions.

**~/.config/firejail/[application].profile**
> User-level custom profiles that override system defaults.

# CAVEATS

Some applications may not work correctly in sandbox. Profiles in /etc/firejail/. Use firecfg to integrate with desktop.

# INSTALL

```apt: sudo apt install firejail```

```dnf: sudo dnf install firejail```

```pacman: sudo pacman -S firejail```

```zypper: sudo zypper install firejail```

```nix: nix profile install nixpkgs#firejail```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[bubblewrap](/man/bubblewrap)(1), [systemd-nspawn](/man/systemd-nspawn)(1)

# RESOURCES

```[Source code](https://github.com/netblue30/firejail)```

<!-- verified: 2026-07-15 -->
