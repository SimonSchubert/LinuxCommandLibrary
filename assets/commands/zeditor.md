# TAGLINE

Launch Zed code editor from terminal

# TLDR

**Open file**

```zeditor [file]```

**Open at line and column**

```zeditor [file]:[line]:[column]```

**Open multiple files**

```zeditor [file1] [file2]```

**New workspace**

```zeditor --new [file]```

**Add a folder to the open workspace**

```zeditor --add [folder]```

**Use as a blocking editor** for git commit messages

```git config --global core.editor "zeditor --wait"```

**Diff two files**

```zeditor --diff [old_file] [new_file]```

**Read from stdin**

```ps axf | zeditor -```

# SYNOPSIS

**zeditor** [_options_] [_paths_[:_line_[:_column_]]]

# PARAMETERS

**-n**, **--new**
> Create a new workspace.

**-a**, **--add**
> Add files to the currently open workspace.

**-e**, **--existing**
> Open in an existing Zed window.

**-w**, **--wait**
> Wait for all given paths to be opened and closed before exiting. For a directory, waits until the window is closed.

**--diff** _old_ _new_
> Open a diff of two files or directories. Can be repeated.

**--foreground**
> Run Zed in the foreground, useful for debugging.

**--user-data-dir** _dir_
> Set a custom directory for all user data.

**--dev-container**
> Open the project in a dev container.

**--completions** _shell_
> Generate shell completions.

**--zed** _path_
> Custom path to Zed.app or the zed binary.

**--uninstall**
> Uninstall Zed from the system.

**-v**, **--version**
> Print the version and the app path.

**--help**
> Show help.

# DESCRIPTION

**zeditor** is the command-line launcher for Zed, a modern code editor written in Rust. It opens files and directories in the Zed graphical editor from the terminal.

Files can be opened at a specific position using the **path:line:column** syntax. The **--new** flag creates a new workspace, and **--wait** blocks the terminal until the file is closed, useful for git commit messages and other tools that invoke an editor.

Zed itself is a high-performance editor featuring real-time collaborative editing, integrated AI code assistance, and a minimal interface designed for speed.

# CAVEATS

Upstream names this binary **zed**. Third-party packages commonly rename it to **zeditor** or **zedit** to avoid conflicts with other packages, so the name depends on how Zed was installed.

# HISTORY

**zeditor** is the command-line launcher for **Zed**, a modern code editor built in Rust.

# SEE ALSO

[code](/man/code)(1), [nvim](/man/nvim)(1), [helix](/man/helix)(1)

# RESOURCES

```[Source code](https://github.com/zed-industries/zed)```

```[Homepage](https://zed.dev)```

```[Documentation](https://zed.dev/docs)```

<!-- verified: 2026-11-09 -->
