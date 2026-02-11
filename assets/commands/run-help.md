# TAGLINE

Display help pages for zsh builtins

# TLDR

**Display help for a command**

```run-help [command]```

**Display help for a built-in**

```run-help cd```

**Display help for an external command**

```run-help grep```

**Invoke help while typing** (default binding)

> Press **ESC h** or **Alt+h** at the command line

# SYNOPSIS

**run-help** [_command_]

# PARAMETERS

_COMMAND_
> The command, built-in, or function to get help for.

# DESCRIPTION

**run-help** is a Zsh function that provides context-sensitive help for commands. When invoked, it determines the type of command and displays the appropriate documentation, whether from man pages, built-in help, or function definitions.

By default in Zsh, **run-help** is bound to **ESC h** (or **Alt+h**), allowing quick access to help while typing a command. The function intelligently handles different command types: it shows man pages for external commands, Zsh documentation for built-ins, and function source for shell functions.

The standard Zsh distribution includes helper functions like **run-help-git**, **run-help-ip**, **run-help-openssl**, and **run-help-sudo** that provide subcommand-aware help for complex commands. These must be autoloaded to be available.

To enable enhanced run-help functionality in Zsh, add to your .zshrc:

```
autoload -Uz run-help
unalias run-help 2>/dev/null
alias help=run-help
```

# CAVEATS

In some Zsh configurations, run-help is aliased to man by default, losing its intelligent behavior. The **unalias run-help** command removes this alias to restore full functionality. Helper functions for specific commands (run-help-git, etc.) must be autoloaded separately. The function relies on man pages being installed for external command documentation.

# HISTORY

**run-help** has been part of Zsh since early versions, providing an integrated help system within the shell. The function evolved to support modular helpers for complex commands with subcommands. It reflects Zsh's philosophy of providing rich, context-aware user assistance directly from the command line.

# SEE ALSO

[man](/man/man)(1), [help](/man/help)(1), [info](/man/info)(1), [whatis](/man/whatis)(1), [apropos](/man/apropos)(1)
