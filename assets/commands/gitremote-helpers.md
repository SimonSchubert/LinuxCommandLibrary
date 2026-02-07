# TAGLINE

Documentation for Git remote helper transport interface

# TLDR

**Documentation reference**

```man gitremote-helpers```

# SYNOPSIS

**gitremote-helpers**

# DESCRIPTION

**gitremote-helpers** is documentation for the remote helper interface in Git. Remote helpers are programs that Git invokes to handle transport to remote repositories using non-native protocols.

Helpers enable Git to communicate with systems beyond built-in protocols (SSH, HTTPS, git://). Examples include `git-remote-hg` for Mercurial and `git-remote-bzr` for Bazaar. This page documents the protocol for implementing custom transport backends.

# CAVEATS

Documentation, not a command. Helpers are invoked automatically. Used for implementing custom protocols.

# HISTORY

The remote helper interface was added to **Git** to enable extensible transport mechanisms, allowing Git to bridge to other version control systems.

# SEE ALSO

[git-remote](/man/git-remote)(1), [git-remote-ext](/man/git-remote-ext)(1)
