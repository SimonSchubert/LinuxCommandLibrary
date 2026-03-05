# TAGLINE

TUI SSH connection manager for quick access

# TLDR

**Launch the connection manager**

```ssh-list```

# SYNOPSIS

**ssh-list**

# DESCRIPTION

**ssh-list** is a TUI SSH connection manager that displays saved hosts in a menu, allowing quick connection via keyboard navigation. It supports adding, editing, copying, and sorting SSH entries, importing from ~/.ssh/config, executing commands on remote hosts, and filtering connections. It does not store passwords, relying on SSH keys.

# CONFIGURATION

**~/.ssh/ssh-list.json**
> Stores SSH connection entries and settings.

# HISTORY

**ssh-list** was created by **akinoiro** and is written in **Rust**.

# SEE ALSO

[sshs](/man/sshs)(1), [ssh](/man/ssh)(1), [sshclick](/man/sshclick)(1)
