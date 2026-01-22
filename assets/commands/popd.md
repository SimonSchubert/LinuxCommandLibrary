# TLDR

**Pop directory from stack**

```popd```

**Pop and go to Nth directory**

```popd +[N]```

**Pop without changing directory**

```popd -n```

**Show directory stack**

```dirs```

# SYNOPSIS

**popd** [_options_] [_+N_|-N_]

# PARAMETERS

**+N**
> Remove Nth entry from left.

**-N**
> Remove Nth entry from right.

**-n**
> Suppress directory change.

# DESCRIPTION

**popd** removes directories from the stack. Returns to previous directory.

The tool complements pushd. Manages directory history.

popd navigates directories.

# CAVEATS

Shell built-in. Works with pushd and dirs.

# HISTORY

popd is a **shell built-in** for directory stack management.

# SEE ALSO

[pushd](/man/pushd)(1), [dirs](/man/dirs)(1), [cd](/man/cd)(1)

