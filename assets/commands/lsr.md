# TAGLINE

Colorized ls alternative with Git integration and Lua extensibility

# TLDR

**List files** in the current directory

```lsr```

**List files recursively** as a tree

```lsr -R```

**List files with Git status**

```lsr -g```

**List all files including hidden ones**

```lsr -a```

**List files in a specific directory**

```lsr [/path/to/directory]```

# SYNOPSIS

**lsr** [_options_] [_path_...]

# PARAMETERS

**-R**, **--recursive**
> Display files in a recursive tree structure.

**-g**, **--git**
> Show Git status indicators for staged and unstaged changes.

**-a**, **--all**
> Show hidden files.

# DESCRIPTION

**lsr** (also known as Laser) is a command-line alternative to **ls** that prioritizes readability and usability. It provides colorized file listings with improved visual organization, recursive tree display, Git status indicators, and file/symlink identification through visual flags.

Color schemes are customizable, and the tool is extensible through **Lua scripts** for displaying custom information beyond what standard ls offers.

# CAVEATS

Lua scripting extension requires Lua to be available on the system.

# HISTORY

**lsr** was created by **jmattaa** and is written in **C**. It supports macOS, Linux, BSD, and Windows.

# SEE ALSO

[ls](/man/ls)(1), [eza](/man/eza)(1), [tree](/man/tree)(1), [lsd](/man/lsd)(1), [exa](/man/exa)(1)
