# TLDR

**Start Nushell**

```nu```

**Execute command**

```nu -c "[command]"```

**Run script**

```nu [script.nu]```

**List files as table**

```ls | where size > 1mb```

**Parse JSON**

```open [file.json] | get [field]```

# SYNOPSIS

**nu** [_options_] [_script_]

# PARAMETERS

_SCRIPT_
> Nushell script to execute.

**-c** _COMMAND_
> Execute command string.

**--config** _FILE_
> Use configuration file.

**--login**
> Start as login shell.

**--help**
> Display help information.

**--version**
> Display version.

# DESCRIPTION

**nu** is Nushell, a modern shell with structured data. Treats output as tables.

The shell uses pipelines of structured data. Inspired by PowerShell and functional languages.

nu provides a new shell paradigm.

# CAVEATS

Different from POSIX shells. Learning curve for syntax. Growing ecosystem.

# HISTORY

Nushell was created to bring **structured data processing** to the command line with modern features.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1), [pwsh](/man/pwsh)(1)

