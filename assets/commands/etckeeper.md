# TAGLINE

version control for /etc directory

# TLDR

**Initialize** Git repo in /etc

```sudo etckeeper init```

**Commit** all changes in /etc

```sudo etckeeper commit [message]```

Run **arbitrary Git** commands

```sudo etckeeper vcs [status]```

**Check** for uncommitted changes

```sudo etckeeper unclean```

**Stop tracking** and destroy repo

```sudo etckeeper uninit```

# SYNOPSIS

**etckeeper** _command_ [_arguments_]

# DESCRIPTION

**etckeeper** tracks system configuration files in /etc using version control (Git, Mercurial, Bazaar, or Darcs). It integrates seamlessly with package managers like apt, yum, pacman, and dnf to automatically commit changes before and after package operations.

This provides an audit trail of all system configuration modifications, making it possible to review what changed when, understand why a system behaves differently after updates, and revert problematic changes. The tool preserves file permissions and metadata that Git normally doesn't track.

etckeeper is valuable for system administrators managing multiple servers, troubleshooting configuration issues, and maintaining compliance documentation.

# PARAMETERS

**init**
> Initialize repository in /etc

**commit** _message_
> Commit all changes

**vcs** _command_
> Run VCS command on repo

**unclean**
> Check for uncommitted changes

**uninit**
> Remove repository

**pre-install**
> Run before package install

**post-install**
> Run after package install

# CONFIGURATION

**/etc/etckeeper/etckeeper.conf**
> Main configuration file specifying VCS to use, package manager hooks to enable, and files to ignore.

# CAVEATS

Requires root privileges. Must run from /etc directory for init. Integrates with apt, yum, and pacman. Sensitive files may need gitignore entries.

# SEE ALSO

[git](/man/git)(1)
