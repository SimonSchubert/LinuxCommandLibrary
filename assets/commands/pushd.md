# TAGLINE

Navigate directories using a stack

# TLDR

**Push directory to stack**

```pushd [/path/to/dir]```

**Swap top two directories**

```pushd```

**Push without changing directory**

```pushd -n [/path/to/dir]```

**Show directory stack**

```dirs```

**Pop from stack**

```popd```

# SYNOPSIS

**pushd** [**-n**] [**+N** | **-N** | _dir_]

# PARAMETERS

_DIR_
> Directory to push.

**-n**
> Suppress the change of directory when rotating or adding, so only the stack is manipulated.

**+N**
> Rotate the stack so the Nth entry, counting from the left of the **dirs** list starting at zero, is at the top.

**-N**
> Rotate the stack so the Nth entry, counting from the right of the **dirs** list starting at zero, is at the top.

# DESCRIPTION

**pushd** is a shell built-in that changes the current directory while saving the previous directory on a stack. This allows quick navigation between multiple working directories without needing to remember or retype full paths.

When called with a directory argument, pushd changes to that directory and pushes the old directory onto the stack. Called without arguments, it swaps the top two directories on the stack. The **-n** flag adds a directory to the stack without actually changing to it. Use **dirs** to view the current stack contents, **popd** to return to the previous directory, and **+N** or **-N** notation to rotate to specific stack positions.

# CAVEATS

Shell built-in and not part of POSIX, so plain **sh** scripts cannot rely on it. On success, Bash prints the resulting stack by running **dirs**; redirect the output to silence it. Returns non-zero if the change of directory fails.

# HISTORY

**pushd** originated in the **C shell (csh)** and was adopted by **bash**, **zsh**, and other shells as a built-in command for directory stack management.

# SEE ALSO

[popd](/man/popd)(1), [dirs](/man/dirs)(1), [cd](/man/cd)(1)

