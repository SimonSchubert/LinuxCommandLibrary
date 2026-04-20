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

**open** [_file_...]

# PARAMETERS

_FILE_
> One or more files, directories, or URLs to open.

# DESCRIPTION

**open** is a built-in function shipped with the Fish shell that opens files, directories, and URLs with the user's default application, regardless of the host operating system. It is defined in **share/fish/functions/open.fish** in the Fish installation.

On macOS and Haiku the function delegates to the native **open** binary. On other Unix-like systems it dispatches to **xdg-open**, **gnome-open**, or **kde-open**, whichever is present. On systems lacking any of these helpers the function prints an error explaining that no opener is available.

Because it is implemented as a Fish function, it only exists inside interactive Fish sessions and is not available to scripts run with **sh**, **bash** or **zsh**.

# CAVEATS

Only defined inside the Fish shell; not an executable on **$PATH**. Behavior on Linux depends on the installed desktop helpers — on a minimal server without **xdg-open** the function will fail. On macOS, Fish prefers the system **open(1)** and bypasses any user-defined function named **open**.

# HISTORY

The **open** function has shipped with Fish since its early releases as a portable alternative to macOS's **open(1)** and Linux's **xdg-open**. It is updated along with Fish itself.

# SEE ALSO

[open](/man/open)(1), [xdg-open](/man/xdg-open)(1), [fish](/man/fish)(1)
