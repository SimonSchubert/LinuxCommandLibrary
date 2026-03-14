# TAGLINE

Sublime Text command-line launcher

# TLDR

**Open a file** in Sublime Text

```subl [path/to/file]```

**Open a file at a specific line** and column

```subl [path/to/file]:[line]:[column]```

**Open a directory** as a project

```subl [path/to/directory]```

**Open files in a new window**

```subl -n [file1] [file2]```

**Add folders to the current window** instead of opening a new one

```subl -a [path/to/directory]```

**Wait for files to close** before returning (useful for git)

```subl -w [path/to/file]```

**Open from stdin**

```echo "[text]" | subl -```

# SYNOPSIS

**subl** [_options_] [_files_] [_directories_]

# PARAMETERS

**-n**, **--new-window**
> Open a new window instead of reusing an existing instance.

**-a**, **--add**
> Add folders to the current window instead of opening a new window.

**-w**, **--wait**
> Wait for the files to be closed before returning. Useful for version control editors.

**-b**, **--background**
> Open files without activating the application window.

**--project** _project_
> Load a specific .sublime-project or .sublime-workspace file.

**--command** _command_
> Execute a Sublime Text internal command (e.g., **save_all**, **build**).

**--safe-mode**
> Launch in a sandboxed clean environment without plugins.

**--launch-or-new-window**
> Only open a new window if the application is already running.

**-v**, **--version**
> Print version information and exit.

**-h**, **--help**
> Display help message and exit.

# DESCRIPTION

**subl** is the command-line interface for Sublime Text, a popular cross-platform text editor. It allows opening files and directories from the terminal and integrating with Unix tools like git and subversion.

Files can include a **:line** or **:line:column** suffix to open at a specific location (1-based). The tool can read from stdin using **-**. When used with **-w**, it blocks until files are closed, making it suitable as an external editor for version control systems (e.g., `EDITOR='subl -w' git commit`).

# CAVEATS

The **subl** command requires Sublime Text to be installed. On manual installations, you may need to create a symlink: **ln -s /opt/sublime_text/sublime_text /usr/local/bin/subl**. Package manager installations typically create this symlink automatically in /usr/bin/.

# HISTORY

Sublime Text was created by **Jon Skinner** and first released in **January 2008**. The command-line helper **subl** has been part of Sublime Text since version 2, enabling terminal-based workflows. Sublime Text 3 was released in **2013**, and Sublime Text 4 followed in **2021** with GPU rendering and improved performance.

# SEE ALSO

[code](/man/code)(1), [vim](/man/vim)(1), [nano](/man/nano)(1), [emacs](/man/emacs)(1), [atom](/man/atom)(1)
