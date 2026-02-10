# TAGLINE

idempotent command-line tool for managing /etc/hosts

# TLDR

**Add a host entry**

```sudo hostess add [local.example.com] [127.0.0.1]```

**Remove a host entry**

```sudo hostess rm [local.example.com]```

**List all entries**

```hostess ls```

**Enable a disabled entry**

```sudo hostess on [local.example.com]```

**Disable an entry**

```sudo hostess off [local.example.com]```

**Check if entry exists**

```hostess has [local.example.com]```

# SYNOPSIS

**hostess** _command_ [_arguments_]

# SUBCOMMANDS

**add** _hostname_ _ip_
> Add or update host entry.

**rm** _hostname_
> Remove host entry.

**ls**
> List all entries.

**on** _hostname_
> Enable a disabled entry.

**off** _hostname_
> Disable an entry.

**has** _hostname_
> Check if entry exists.

**fix**
> Reformat hosts file.

# DESCRIPTION

**hostess** is an idempotent command-line tool for managing /etc/hosts. It simplifies adding, removing, and toggling host entries for development and testing. Entries can be disabled without removal. Requires root/sudo on Unix or elevated prompt on Windows.

# CAVEATS

Modifying /etc/hosts requires elevated privileges. Set HOSTESS_PATH to override default hosts file location. Set HOSTESS_FMT to 'windows' or 'unix' to override format detection.

# SEE ALSO

[hosts](/man/hosts)(5)

