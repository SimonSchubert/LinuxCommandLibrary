# TLDR

**List** all aliases

```alias```

**Create** a simple alias

```alias [ll]='ls -la'```

Create alias with **arguments**

```alias [grep]='grep --color=auto'```

**Remove** an alias

```unalias [ll]```

Create **persistent** alias (add to ~/.bashrc or ~/.zshrc)

```echo "alias ll='ls -la'" >> ~/.bashrc```

# SYNOPSIS

**alias** [_name_[=_value_]...]

# DESCRIPTION

**alias** is a shell builtin that creates shorthand names for commands or command sequences. When you type an alias name, the shell substitutes the associated value before execution.

Aliases are useful for creating shortcuts for frequently used commands with specific options, reducing typing and preventing repetitive mistakes.

# PARAMETERS

Without arguments, **alias** displays all defined aliases. With **name**, it shows that alias's definition. With **name=value**, it creates or updates an alias.

# CAVEATS

Aliases are not expanded in shell scripts by default. They don't accept arguments in the middle of the expansion (use functions for that). Aliases are shell-specific and must be defined in the shell's configuration file for persistence.

# PERSISTENT ALIASES

To make aliases permanent, add them to your shell configuration:
- Bash: ~/.bashrc or ~/.bash_aliases
- Zsh: ~/.zshrc or ~/.zsh_aliases
- Fish: use **alias --save** or edit ~/.config/fish/config.fish

# HISTORY

The **alias** command has been a feature of Unix shells since the C shell (csh) in the late **1970s**. It was adopted by Bash, Zsh, and most other modern shells with similar syntax.

# SEE ALSO

[unalias](/man/unalias)(1), [type](/man/type)(1), [function](/man/function)(1)
