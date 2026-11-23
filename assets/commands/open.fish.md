# TAGLINE

Fish shell function that opens files with the default application

# TLDR

**Open a file with its default application**

```open [file]```

**Open a URL in the default browser**

```open [https://example.com]```

**Open a directory in the file manager**

```open [directory]```

**Open the current directory**

```open .```

**Open multiple files**

```open [file1] [file2] [file3]```

# SYNOPSIS

**open** [**-h**] _file_...

# PARAMETERS

_FILE_
> One or more files, directories, or URLs to open.

**-h**, **--help**
> Display help for the function.

# DESCRIPTION

**open** is a function shipped with the Fish shell that opens files, directories, and URLs with the user's default application. It is defined in **share/functions/open.fish** and autoloaded on first use.

The function is only defined when no **open** command already exists on **$PATH**. On Cygwin it calls **cygstart** for each argument; elsewhere it calls **xdg-open** for each argument. If neither is available it prints an error suggesting to install **xdg-utils**.

On macOS the native **open(1)** binary is found first, so the Fish function is never defined there and the system command runs instead.

# CAVEATS

Only exists inside Fish; it is not an executable on **$PATH** and is not available to **sh**, **bash** or **zsh** scripts. On Linux it depends on **xdg-open**, so a minimal server without xdg-utils will only print an error. On systems where another **open** command is installed (for example Debian's **open** alternative pointing to **openvt**), that command takes precedence and behaves differently.

# HISTORY

The **open** function has shipped with Fish for many years as a portable equivalent of macOS's **open(1)**. It is updated along with Fish itself.

# SEE ALSO

[open](/man/open)(1), [xdg-open](/man/xdg-open)(1), [fish](/man/fish)(1)

# RESOURCES

```[Source code](https://github.com/fish-shell/fish-shell)```

```[Homepage](https://fishshell.com)```

```[Documentation](https://fishshell.com/docs/current/cmds/open.html)```

<!-- verified: 2026-11-23 -->
