# TAGLINE

Modern filesystem tree utility with git integration

# TLDR

**Display** directory tree

```erdtree [directory]```

**Show** sizes of directories and files

```erdtree -s [directory]```

**Show** git status alongside tree

```erdtree --git [directory]```

**Limit** depth of tree

```erdtree -L 3 [directory]```

**Show** only directories

```erdtree -d [directory]```

# SYNOPSIS

**erdtree** [_options_] [_directory_]

# PARAMETERS

**-d, --dirs-only**
> Show only directories

**-L, --level** _N_
> Limit tree depth to N levels

**-s, --size**
> Show file and directory sizes

**-h, --human-readable**
> Show sizes in human-readable format

**--git**
> Show git status (modified, untracked, ignored)

**--no-git**
> Disable git integration

**--ignore** _PATTERN_
> Ignore files matching pattern

**-I, --ignore-git**
> Respect .gitignore rules

**-a, --all**
> Show hidden files

**-P, --prune**
> Prune empty directories

**--sort** _TYPE_
> Sort by: name, size, time, git

**--dirs-first**
> Show directories before files

**-o, --output** _FILE_
> Output to file instead of stdout

**-v, --version**
> Display version and exit

**--help**
> Display help and exit

# DESCRIPTION

**erdtree** is a modern tree command replacement with additional features like disk usage reporting, git integration, and improved visual formatting. It combines the functionality of tree and du with a clean, fast interface.

The tool can display file sizes, git status indicators, and customizable sorting. It's designed to be faster than traditional tree implementations while providing more useful information.

# CAVEATS

Large directories may take time to process. Git status checking adds overhead. Symbolic links are handled according to options. Unicode filenames require proper terminal support.

# HISTORY

**erdtree** was created by Benji Nguyen as a modern replacement for the traditional tree command, addressing performance and feature limitations while maintaining compatibility.

# SEE ALSO

[tree](/man/tree)(1), [du](/man/du)(1), [ls](/man/ls)(1), [exa](/man/exa)(1), [lsd](/man/lsd)(1)