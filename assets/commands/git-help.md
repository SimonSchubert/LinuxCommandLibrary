# TAGLINE

Display documentation for Git commands

# TLDR

**Get help for command**

```git help [commit]```

**Open in web browser**

```git help --web [rebase]```

**Show all commands**

```git help --all```

**Show guides**

```git help --guides```

**Info format**

```git help -i [log]```

# SYNOPSIS

**git help** [_options_] [_command_|_guide_]

# PARAMETERS

_COMMAND_
> Git command to get help for.

_GUIDE_
> Git guide name.

**--all**, **-a**
> List all commands.

**--guides**, **-g**
> List available guides.

**--web**, **-w**
> Open in browser.

**--man**, **-m**
> Use man format (default).

**--info**, **-i**
> Use info format.

**--help**
> Display help information.

# DESCRIPTION

**git help** displays documentation for Git commands and conceptual guides. It opens manual pages by default, with options for web browser or info format display.

The command provides access to both command documentation and conceptual guides covering topics like workflows, attributes, and revision specifications. Git includes extensive built-in documentation accessible through this interface.

# CAVEATS

Man pages may need separate installation. Web format requires browser. Some guides may be missing.

# HISTORY

git help is a core **Git** command providing documentation access, replacing direct man page invocation for git commands.

# SEE ALSO

[git](/man/git)(1), [man](/man/man)(1)
