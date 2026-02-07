# TAGLINE

Expressive shell with modern programming features

# TLDR

**Start Elvish shell**

```elvish```

**Run Elvish script**

```elvish [script.elv]```

**Run command string**

```elvish -c "[echo hello]"```

**Start with specific** config

```elvish --rc [config.elv]```

# SYNOPSIS

**elvish** [_options_] [_script_] [_args_]

# PARAMETERS

_SCRIPT_
> Script file to execute.

**-c** _CODE_
> Execute command string.

**--rc** _FILE_
> Configuration file.

**--norc**
> Don't load rc file.

**--help**
> Display help information.

# DESCRIPTION

**Elvish** is an expressive programming language and a powerful shell for Unix-like systems. It combines shell features with a modern programming language including namespaces, lambdas, and structured data.

The shell offers pipelines that pass structured data (not just strings), built-in file manager (Ctrl-N), and comprehensive history with directory history (Ctrl-L). Its syntax is cleaner than traditional shells.

Elvish provides real-time syntax highlighting, intelligent completions, and a consistent programming model for both interactive use and scripting.

# CONFIGURATION

**~/.config/elvish/rc.elv** or **~/.elvish/rc.elv**
> Main configuration file loaded on shell startup.

**~/.config/elvish/lib/**
> Directory for Elvish modules and libraries.

# CAVEATS

Not POSIX-compatible. Scripts not portable to bash/zsh. Smaller community than mainstream shells. Some traditional shell patterns don't work.

# HISTORY

Elvish was created by **Qi Xiao** starting around **2014** as a shell designed from scratch with modern language features rather than POSIX compatibility as the primary goal.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1), [nushell](/man/nushell)(1)
