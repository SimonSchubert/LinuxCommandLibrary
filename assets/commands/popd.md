# TAGLINE

Pop directory from shell directory stack

# TLDR

**Pop directory from stack**

```popd```

**Remove the Nth entry** (counting from zero)

```popd +[N]```

**Pop without changing directory**

```popd -n```

**Show directory stack**

```dirs```

# SYNOPSIS

**popd** [**-n**] [**+**_N_|**-**_N_]

# PARAMETERS

**+N**
> Remove the Nth entry counting from the left of the stack, starting at zero.

**-N**
> Remove the Nth entry counting from the right of the stack, starting at zero.

**-n**
> Suppress the directory change, manipulating only the stack.

# DESCRIPTION

**popd** removes the top directory from the shell's directory stack and changes to the new top directory. This complements **pushd**, which adds directories to the stack.

Use **+N** or **-N** to remove a specific entry from the stack by position. The **-n** flag removes the entry without actually changing the current directory. Use **dirs** to view the current stack contents. This is a shell built-in available in bash, zsh, and other shells.

# CAVEATS

Shell built-in. Works with pushd and dirs.

# HISTORY

popd is a **shell built-in** for directory stack management.

# SEE ALSO

[pushd](/man/pushd)(1), [dirs](/man/dirs)(1), [cd](/man/cd)(1)

