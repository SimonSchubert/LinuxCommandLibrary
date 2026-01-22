# TLDR

**Execute** a specific command

```exec [command -with -flags]```

Execute with **empty environment**

```exec -c [command -with -flags]```

Execute as **login shell**

```exec -l [command -with -flags]```

Execute with **different name**

```exec -a [name] [command -with -flags]```

# SYNOPSIS

**exec** [_options_] [_command_] [_arguments_]

# DESCRIPTION

**exec** replaces the current shell process with the specified command without creating a child process. When exec completes, the shell session ends because the shell process no longer exists.

Built-in shell command commonly used in shell scripts and wrapper scripts.

# PARAMETERS

**-c**
> Execute with mostly empty environment

**-l**
> Pass command as login shell

**-a** _name_
> Pass name as argv[0] to command

# CAVEATS

Shell built-in command. The shell terminates after exec completes. File descriptors can be redirected before exec. Used in init scripts and process management.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1)
