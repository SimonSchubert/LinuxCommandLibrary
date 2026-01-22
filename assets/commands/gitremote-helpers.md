# TLDR

**Documentation reference**

```man gitremote-helpers```

# SYNOPSIS

**gitremote-helpers**

# DESCRIPTION

**gitremote-helpers** is documentation for the remote helper interface. Remote helpers are programs that git invokes to handle transport to remote repositories using non-native protocols.

Helpers enable git to communicate with systems beyond built-in protocols (ssh, https, git). Examples include git-remote-hg for Mercurial and git-remote-bzr for Bazaar.

gitremote-helpers documents the protocol for custom transport implementations.

# CAVEATS

Documentation, not a command. Helpers are invoked automatically. Used for implementing custom protocols.

# HISTORY

The remote helper interface was added to **Git** to enable extensible transport mechanisms, allowing git to bridge to other version control systems.

# SEE ALSO

[git-remote](/man/git-remote)(1), [git-remote-ext](/man/git-remote-ext)(1)
