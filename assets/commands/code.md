# TAGLINE

Visual Studio Code editor launcher

# TLDR

**Open VS Code** in the current directory

```code .```

**Open a specific file** in VS Code

```code [path/to/file]```

**Open a file at a specific line** and column

```code -g [file.txt]:[line]:[column]```

**Open a new window**

```code -n```

**Open a file in an existing window**

```code -r [path/to/file]```

**Compare two files** in diff mode

```code -d [file1] [file2]```

**Install an extension**

```code --install-extension [publisher.extension]```

**List installed extensions**

```code --list-extensions```

# SYNOPSIS

**code** [_options_] [_paths_...]

# PARAMETERS

**-n**, **--new-window**
> Open a new VS Code window.

**-r**, **--reuse-window**
> Open files in the last active window.

**-g**, **--goto**
> Open file at specific line and column (file:line:column).

**-d**, **--diff**
> Compare two files in diff mode.

**-w**, **--wait**
> Wait for files to be closed before returning.

**--locale** _LOCALE_
> Set the display language (e.g., en-US, zh-CN).

**--install-extension** _EXT_
> Install a VS Code extension by ID.

**--uninstall-extension** _EXT_
> Uninstall a VS Code extension.

**--list-extensions**
> List all installed extensions.

**--disable-extensions**
> Disable all installed extensions for this session.

**--user-data-dir** _DIR_
> Specify the directory for user data.

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**code** is the command-line interface for Visual Studio Code, Microsoft's popular source code editor. It allows launching the editor, opening files and folders, managing extensions, and integrating VS Code into command-line workflows.

The CLI supports opening files at specific positions, which is useful for jumping to error locations from build tools or linters. The diff mode provides visual comparison between files. The **--wait** flag enables using VS Code as a Git editor or for other tools that need to wait for file editing completion.

Extension management through the CLI enables scripting VS Code setup and synchronizing development environments. Combined with the Settings Sync feature, this allows reproducible editor configurations across machines.

# CAVEATS

The **code** command must be added to PATH, which can be done via the "Install 'code' command in PATH" option from VS Code's Command Palette. On some systems, the command may be **code-insiders** for the Insiders build. Remote development sessions use **code-server** for browser-based access.

# HISTORY

Visual Studio Code was released by **Microsoft** in **April 2015** as a free, open-source editor built on Electron. It rapidly grew to become one of the most popular development environments. The CLI has been part of VS Code since its early releases, enabling terminal-based workflows.

# SEE ALSO

[vim](/man/vim)(1), [nano](/man/nano)(1), [subl](/man/subl)(1), [atom](/man/atom)(1)
