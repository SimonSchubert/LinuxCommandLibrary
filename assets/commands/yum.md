# TAGLINE

Red Hat package manager

# TLDR

This command is an alias for **dnf** on modern distros.

For older distros (e.g., CentOS 7), yum is a distinct program from dnf. Some subcommands and options may differ.

**View** documentation for the original command

```tldr dnf```

# SYNOPSIS

**yum** [_options_] [_command_] [_package_...]

# DESCRIPTION

**yum** (Yellowdog Updater Modified) is the traditional package manager for Red Hat-based Linux distributions. On modern systems (RHEL 8+, Fedora 22+), **yum** is a symlink to **dnf**, which provides the same functionality with improved performance.

On older systems like CentOS 7, yum is the native package manager handling package installation, updates, and removal from configured repositories.

# CAVEATS

On modern systems, yum is an alias for dnf. Behavior may differ slightly between legacy yum and dnf. Use **dnf** directly on newer systems.

# SEE ALSO

[dnf](/man/dnf)(8), [rpm](/man/rpm)(8)
