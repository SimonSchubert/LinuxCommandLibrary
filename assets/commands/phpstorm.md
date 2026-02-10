# TAGLINE

launches PhpStorm IDE

# TLDR

**Open project**

```phpstorm [path/to/project]```

**Open file at line**

```phpstorm --line [42] [file.php]```

**Compare files**

```phpstorm diff [file1.php] [file2.php]```

**Open in new window**

```phpstorm --new-window [path/to/project]```

**Wait for close**

```phpstorm --wait [file.php]```

**Inspect code**

```phpstorm inspect [project] [output] -v2```

# SYNOPSIS

**phpstorm** [_--line n_] [_--new-window_] [_options_] [_path_]

# PARAMETERS

**--line** _N_
> Open at line number.

**--column** _N_
> Open at column.

**--new-window**
> Force new window.

**--wait**
> Wait until closed.

**diff**
> Compare two files.

**inspect**
> Run code inspection.

**--help**
> Show help.

# DESCRIPTION

**phpstorm** launches PhpStorm IDE. It opens projects and files.

JetBrains PHP IDE. Professional development environment.

Command-line launcher enables integration. Open from terminal.

Diff mode compares files. Built-in comparison tool.

# CAVEATS

Requires PhpStorm installation. Commercial software. Launcher script location varies.

# HISTORY

**PhpStorm** is developed by **JetBrains**. It provides professional PHP development tools with intelligent coding assistance.

# SEE ALSO

[idea](/man/idea)(1), [webstorm](/man/webstorm)(1), [code](/man/code)(1)
