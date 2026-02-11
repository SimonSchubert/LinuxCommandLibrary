# TAGLINE

JetBrains JavaScript IDE launcher

# TLDR

**Open project**

```webstorm [path/to/project]```

**Open file at line**

```webstorm --line [42] [file.js]```

**Compare files**

```webstorm diff [file1.js] [file2.js]```

**Open in new window**

```webstorm --new-window [path/to/project]```

**Wait until closed**

```webstorm --wait [file.js]```

# SYNOPSIS

**webstorm** [_--line n_] [_--new-window_] [_options_] [_path_]

# PARAMETERS

**--line** _N_
> Open at line.

**--column** _N_
> Open at column.

**--new-window**
> Force new window.

**--wait**
> Wait until closed.

**diff**
> Compare files.

# DESCRIPTION

**webstorm** is the command-line launcher for JetBrains WebStorm, a professional IDE for JavaScript and web development. It opens projects, files, and directories directly from the terminal, with options to specify the line and column position for precise cursor placement.

The launcher supports opening files in an existing WebStorm instance or forcing a new window, and includes a diff mode for side-by-side file comparison. The --wait flag blocks the terminal until the file is closed, making it suitable for use as a Git editor or merge tool.

The command is typically installed via WebStorm's "Create Command-line Launcher" option in the Tools menu, which places it in the system PATH.

# CAVEATS

WebStorm installation required. Commercial software. Launcher location varies.

# HISTORY

**WebStorm** is developed by **JetBrains** as a professional IDE for JavaScript and web development.

# SEE ALSO

[phpstorm](/man/phpstorm)(1), [idea](/man/idea)(1), [code](/man/code)(1)
