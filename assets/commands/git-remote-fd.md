# TAGLINE

File descriptor transport helper for Git

# TLDR

**Clone using file descriptors** for input and output

```git clone "fd::[fd-in],[fd-out]"```

**Fetch using pre-opened** file descriptor connections

```git fetch "fd::17,18"```

**Use a single file descriptor** for both input and output

```git fetch "fd::17"```

# SYNOPSIS

**git-remote-fd** _url_

# PARAMETERS

_URL_
> fd:: URL in the format fd::in[,out].

**in**
> File descriptor number for reading from the remote. If out is omitted, this descriptor is used for both directions.

**out**
> File descriptor number for writing to the remote.

# DESCRIPTION

**git-remote-fd** is a Git remote helper program that uses pre-opened file descriptors for communication instead of establishing its own connections. When a URL in the form `fd::in[,out]` is used, Git invokes this helper to transfer data over the specified file descriptors.

If only one file descriptor is provided, it is used for both reading and writing. If two are given separated by a comma, the first is used for reading from the remote and the second for writing.

This enables integration with connection brokers, process supervisors, or custom transport layers that manage connections externally. The file descriptors must be opened before invoking Git.

# CAVEATS

This is an advanced, low-level feature. File descriptors must be pre-opened by the calling process. Not suitable for everyday Git workflows; primarily useful for embedding Git in applications that manage their own connections.

# SEE ALSO

[git-remote](/man/git-remote)(1), [git-remote-ext](/man/git-remote-ext)(1)
