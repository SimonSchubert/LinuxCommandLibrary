# TLDR

**Install** the br shell function

```broot --install```

Start **interactive** navigation

```broot```

Show file **sizes**

```broot -s```

Show **permissions**

```broot -p```

Show **only directories**

```broot -f```

Show **hidden** files

```broot -h```

Start in **specific directory**

```broot path/to/directory```

# SYNOPSIS

**broot** [_options_] [_path_]

# DESCRIPTION

**broot** is an interactive directory tree navigator that provides a better way to navigate directories. It offers fuzzy searching, file previews, and can integrate with the shell via the br function.

# PARAMETERS

**--install**
> Install or reinstall the br shell function

**-s, --sizes**
> Display file and directory sizes

**-p, --permissions**
> Display file permissions

**-f, --only-folders**
> Show only directories (no files)

**-h, --hidden**
> Show hidden files and directories

**-d, --dates**
> Display file modification dates

**-g, --git-status**
> Show git status of files

**-w, --whale-hierarchical**
> Show hierarchical directory sizes

**--cmd COMMAND**
> Execute command on startup

**-c, --conf PATH**
> Use specified configuration file

**--outcmd PATH**
> Write command to file for shell integration

# CAVEATS

The br shell function is recommended over direct broot invocation for changing directories. Install it with --install and use br instead of broot for full shell integration. Configuration is stored in ~/.config/broot/.

# HISTORY

**broot** was created as a modern alternative to tree and cd, providing fuzzy search, visual navigation, and efficient handling of large directory trees.

# SEE ALSO

[tree](/man/tree)(1), [ranger](/man/ranger)(1), [lf](/man/lf)(1), [nnn](/man/nnn)(1)
