# TLDR

**Add** a symbolic link

```sudo update-alternatives --install [path/to/symlink] [command_name] [path/to/binary] [priority]```

**Configure** a symbolic link interactively

```sudo update-alternatives --config [java]```

**Remove** a symbolic link

```sudo update-alternatives --remove [java] [/opt/java/jdk1.8.0_102/bin/java]```

**Display** information about a specified command

```update-alternatives --display [java]```

**Display** all commands and their current selection

```update-alternatives --get-selections```

# SYNOPSIS

**update-alternatives** [_option_] _command_

# PARAMETERS

**--install _link_ _name_ _path_ _priority_**
> Add an alternative for name with specified priority

**--config _name_**
> Interactively configure alternatives for name

**--remove _name_ _path_**
> Remove a specific alternative

**--display _name_**
> Display information about alternatives for name

**--get-selections**
> List all configured alternatives

**--set _name_ _path_**
> Set the alternative non-interactively

**--auto _name_**
> Switch to automatic mode (highest priority wins)

**--list _name_**
> List all alternatives for a name

# DESCRIPTION

**update-alternatives** maintains symbolic links that determine default commands when multiple versions of a program are installed. It manages a directory of links in **/etc/alternatives/** that point to actual program binaries.

Common uses include managing multiple Java versions, editors, or compilers. Higher priority numbers are preferred in automatic mode.

# CAVEATS

Requires root privileges to modify. Priority numbers determine automatic selection. Manual mode persists until explicitly changed. Debian/Ubuntu specific; Red Hat uses **alternatives** command.

# SEE ALSO

[alternatives](/man/alternatives)(8), [ln](/man/ln)(1)
