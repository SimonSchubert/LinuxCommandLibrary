# TLDR

**Use file descriptors for git**

```git clone "fd::[fd-in],[fd-out]"```

**Use with pre-opened connections**

```git fetch "fd::17,18"```

# SYNOPSIS

**git-remote-fd** _url_

# PARAMETERS

_URL_
> fd:: URL with file descriptors.

_FD-IN_
> Input file descriptor.

_FD-OUT_
> Output file descriptor.

**--help**
> Display help information.

# DESCRIPTION

**git-remote-fd** is a remote helper that uses file descriptors for communication. The fd:: URL scheme allows git to communicate over pre-established connections.

This enables integration with connection brokers, process supervisors, or other systems that manage connections externally. It's used for advanced integration scenarios.

git-remote-fd enables git over pre-opened file descriptors.

# CAVEATS

Advanced use case. File descriptors must be pre-opened. Used through fd:: URLs.

# HISTORY

git-remote-fd is a **Git** remote helper for scenarios requiring pre-established communication channels.

# SEE ALSO

[git-remote](/man/git-remote)(1), [git-remote-ext](/man/git-remote-ext)(1)
