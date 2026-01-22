# TLDR

**Find the path of a command**

```which [command]```

**Find paths of multiple commands**

```which [command1] [command2]```

**Show all matching executables** (not just first)

```which -a [command]```

# SYNOPSIS

**which** [**-a**] _command_...

# PARAMETERS

**-a**, **--all**
> Print all matching executables in PATH, not just first

# DESCRIPTION

**which** searches for executables in the directories listed in the PATH environment variable and prints the path of the first match found.

This is useful for determining which version of a command will be executed when multiple versions exist, or for confirming a command is installed and in your PATH.

With **-a**, all matches are shown, revealing if multiple versions exist in different PATH directories. The first listed is the one that would be executed.

# CAVEATS

Which only searches PATH; it doesn't show shell builtins, aliases, or functions. Use **type** in bash or **whence** in zsh for comprehensive command lookup.

Some systems have different which implementations with varying options. The **-a** flag is common but not universal.

If a command isn't found, which typically exits with status 1 and produces no output (or an error message depending on implementation).

# SEE ALSO

[type](/man/type)(1), [whereis](/man/whereis)(1), [command](/man/command)(1), [hash](/man/hash)(1)
