# TAGLINE

change the current working directory

# TLDR

**Change** to directory

```cd [/path/to/directory]```

**Go** to home directory

```cd```

**Go** to previous directory

```cd -```

**Go** up one directory

```cd ..```

**Go** up two directories

```cd ../..```

# SYNOPSIS

**cd** [_directory_]

# DESCRIPTION

**cd** (change directory) is a shell built-in command that changes the current working directory. It updates the shell's current directory and the PWD environment variable.

The command is fundamental for navigating the filesystem in shell sessions.

# PARAMETERS

_directory_
> Path to change to (default: $HOME)

**-**
> Change to previous directory (OLDPWD)

**-L**
> Follow symbolic links (default)

**-P**
> Use physical directory structure

# SPECIAL DIRECTORIES

**~**
> Home directory ($HOME)

**~user**
> Specified user's home directory

**.**
> Current directory

**..**
> Parent directory

**-**
> Previous directory

# ENVIRONMENT VARIABLES

**PWD**
> Current working directory

**OLDPWD**
> Previous working directory

**HOME**
> User's home directory

**CDPATH**
> Search path for cd command

# CAVEATS

Shell built-in (behavior varies by shell). Spaces in paths need quoting. Symbolic links can be confusing (-P vs -L). No cd command history by default. Cannot cd to files, only directories.

# HISTORY

**cd** has been a shell built-in command since the earliest Unix shells in the **1970s**, essential for directory navigation.

# SEE ALSO

[pwd](/man/pwd)(1), [pushd](/man/pushd)(1), [popd](/man/popd)(1)
