# TAGLINE

shell builtin to replace process with command

# TLDR

**Execute** a specific command, **replacing** the current shell

```exec [command -with -flags]```

Execute with **empty environment**

```exec -c [command -with -flags]```

Execute as **login shell**

```exec -l [command -with -flags]```

Execute with a **different name** as argv[0]

```exec -a [name] [command -with -flags]```

**Redirect** all shell **stdout** to a file

```exec >[path/to/logfile]```

**Redirect** both **stdout and stderr** to a file

```exec >[path/to/logfile] 2>&1```

Open a file on **file descriptor** 3 for reading

```exec 3<[path/to/file]```

**Close** file descriptor 3

```exec 3>&-```

# SYNOPSIS

**exec** [_-cl_] [_-a name_] [_command_] [_arguments_] [_redirection ..._]

# PARAMETERS

**-c**
> Execute the command with a mostly empty environment, clearing inherited environment variables.

**-l**
> Place a dash at the beginning of argv[0], causing the command to behave as a login shell.

**-a** _name_
> Pass _name_ as argv[0] to the executed command instead of the actual command name.

# DESCRIPTION

**exec** replaces the current shell process with the specified command without creating a child process. When exec completes, the shell session ends because the shell process no longer exists.

If no command is specified but redirections are provided, the redirections take effect in the current shell. This allows redirecting stdin, stdout, or stderr for all subsequent commands, and opening or closing arbitrary file descriptors.

If the command cannot be executed, a non-interactive shell exits unless the **execfail** shell option is set. An interactive shell does not exit if exec fails.

# CAVEATS

Shell built-in command. The shell terminates after exec completes, so any commands after exec in a script will not run. File descriptor redirections without a command persist in the current shell. Behavior may vary slightly between bash, zsh, and other POSIX shells.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [env](/man/env)(1), [zsh](/man/zsh)(1)
