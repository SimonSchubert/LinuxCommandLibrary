# TAGLINE

Display how a command name is interpreted

# TLDR

**Show the type** of a command

```type [command]```

**Show all locations** of a command (aliases, functions, builtins, files)

```type -a [command]```

**Show only the type** (alias, keyword, function, builtin, or file)

```type -t [command]```

**Show the path** to an executable (like which)

```type -P [command]```

**Check if command is** a builtin, alias, or function

```type -t [cd]```

**Show path only** if it's a file on disk

```type -p [command]```

**Suppress function lookup**

```type -f [command]```

# SYNOPSIS

**type** [**-afptP**] _name_...

# PARAMETERS

**-a**
> Display all locations containing an executable; includes aliases, builtins, and functions

**-f**
> Suppress shell function lookup

**-p**
> Return disk file path only if type would return "file"; empty otherwise

**-P**
> Force PATH search even for aliases, builtins, or functions

**-t**
> Output single word: alias, keyword, function, builtin, file, or empty

# DESCRIPTION

**type** is a shell builtin that displays how a command name would be interpreted. It identifies whether a name is an alias, shell keyword, function, builtin command, or external executable file.

Without options, type prints a descriptive message showing the command type and location. With **-t**, it outputs just the type category as a single word, useful for scripting.

The **-a** option shows all interpretations of a name, revealing if multiple commands exist with the same name (e.g., an alias shadowing an executable). The **-P** option forces a PATH search, useful for finding the executable even when an alias or function exists.

type is more informative than **which** because it understands shell internals like aliases, functions, and builtins, not just files in PATH.

# EXIT STATUS

**0**
> All names were found

**1**
> One or more names were not found

# EXAMPLES

**Identify command types**
```
$ type ls
ls is aliased to `ls --color=auto'

$ type cd
cd is a shell builtin

$ type -t for
keyword
```

# CAVEATS

type is a shell builtin, so its behavior may vary slightly between shells (bash, zsh, etc.). For POSIX compatibility, use **command -v** instead. The **-a** option includes aliases which only exist in interactive shells.

# HISTORY

The **type** command has been a shell builtin since the Bourne shell in early Unix. It was designed to help users understand command resolution, especially important as shells gained features like aliases and functions that could shadow executables. The command is specified in POSIX.

# SEE ALSO

[which](/man/which)(1), [command](/man/command)(1), [whereis](/man/whereis)(1), [bash](/man/bash)(1)
