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

**etckeeper** tracks system configuration files in /etc using Git (or other version control systems). It integrates with package managers to automatically commit changes before and after package operations.

Useful for tracking configuration changes and reverting problematic modifications.

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

# CAVEATS

Requires root privileges. Must run from /etc directory for init. Integrates with apt, yum, and pacman. Sensitive files may need gitignore entries.

# SEE ALSO

[git](/man/git)(1)
