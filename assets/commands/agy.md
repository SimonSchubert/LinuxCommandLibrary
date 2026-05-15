# TAGLINE

Google Antigravity IDE launcher and command-line client

# TLDR

**Launch Antigravity** in the current directory

```agy .```

**Open a specific project folder** in Antigravity

```agy [path/to/project]```

**Open a specific file** for editing

```agy [path/to/file]```

**Open a file at a specific line**

```agy --goto [path/to/file]:[line]```

**Start a new window** rather than reusing an existing one

```agy --new-window [path/to/project]```

**Show installed version**

```agy --version```

# SYNOPSIS

**agy** [_options_] [_path_ ...]

# PARAMETERS

**-n**, **--new-window**
> Open a new window instead of reusing an existing one.

**-r**, **--reuse-window**
> Reuse the most recently active window.

**-g**, **--goto** _file:line[:column]_
> Open the file at the given line (and optional column).

**-d**, **--diff** _file1 file2_
> Open a diff editor comparing two files.

**-a**, **--add** _folder_
> Add the folder to the most recently active window.

**-w**, **--wait**
> Wait for the files to be closed before returning.

**--user-data-dir** _DIR_
> Use a custom directory for user data.

**--extensions-dir** _DIR_
> Use a custom location for installed extensions.

**--list-extensions**
> List installed extensions and exit.

**--install-extension** _EXT_
> Install or update the given extension.

**--uninstall-extension** _EXT_
> Uninstall the given extension.

**-v**, **--version**
> Print version information and exit.

**-h**, **--help**
> Print help and exit.

# DESCRIPTION

**agy** is the command-line launcher for **Google Antigravity**, an AI-first development environment built on the Visual Studio Code foundation. It opens files, folders, and workspaces in the Antigravity editor and provides access to its agentic coding features, including the **Gemini**-powered agent panel and the Manager surface for coordinating multiple AI agents.

The launcher follows the conventions of VS Code style CLIs: paths passed as positional arguments are opened as either files or folders, and flags control window behavior, extensions, and user-data directories. On macOS it is typically installed via the "Install 'agy' command in PATH" action from inside Antigravity; on Linux distributions the binary may also be exposed as **antigravity**, in which case a symlink such as **/usr/local/bin/agy → /usr/bin/antigravity** is commonly used to satisfy tools that detect Antigravity by the **agy** name.

In addition to opening the GUI, **agy** is the integration point for the Gemini CLI and other tools that delegate edits or sessions to Antigravity. It does not run a headless agent itself; for that, Antigravity exposes separate companion binaries.

# CAVEATS

On some Linux installations the binary is named **antigravity**; create a symlink to **agy** if other tooling (for example the Gemini CLI) expects that name. The CLI is in active development and flag behavior closely mirrors VS Code, so subtle differences may appear between releases.

# HISTORY

Antigravity was introduced by **Google** in **November 2025** as an "agent-first" IDE fork of Visual Studio Code, with the **agy** launcher shipped alongside the desktop application for Linux, macOS, and Windows. The tool is closely tied to the Gemini model family and to Google's broader investment in agentic developer tools.

# SEE ALSO

[code](/man/code)(1), [gemini](/man/gemini)(1), [claude](/man/claude)(1)
