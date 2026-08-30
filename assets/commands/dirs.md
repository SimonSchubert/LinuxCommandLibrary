# TAGLINE

directory stack display command

# TLDR

Show the current directory stack

```dirs```

**Number** every entry, which is the form `pushd +N` expects

```dirs -v```

Print **absolute paths** instead of abbreviating the home directory

```dirs -l```

Print **one entry per line**, ready to pipe

```dirs -p```

Number the entries **and** expand the home directory

```dirs -v -l```

Show only the **top** of the stack, the current directory

```dirs +0```

Show only the **oldest** entry

```dirs -0```

**Count** how many directories are stacked

```dirs -p | wc -l```

**Empty** the stack

```dirs -c```

# SYNOPSIS

**dirs** [**-clpv**] [**+**_n_] [**-**_n_]

# PARAMETERS

**-c**
> Clear the directory stack.

**-l**
> Display full paths (no ~ abbreviation).

**-p**
> Print one directory per line.

**-v**
> Print with index numbers, one per line.

**+n**
> Display nth entry from left (0 = top).

**-n**
> Display nth entry from right (0 = bottom).

# DESCRIPTION

**dirs** displays the directory stack managed by **pushd** and **popd**. The stack provides a way to remember and return to previously visited directories without typing full paths.

The directory stack is a list where the top (leftmost in default view) is the current directory. Each pushd adds to the stack and changes to that directory; popd removes from the stack and returns to the previous directory.

Combined with **+n** and **-n** notation, you can reference directories by position, enabling quick navigation in complex directory structures.

# CAVEATS

dirs is a bash/zsh builtin; behavior may vary in other shells. The stack is per-shell and doesn't persist across sessions. POSIX sh doesn't include directory stack functionality. The ~ abbreviation depends on the HOME environment variable.

# HISTORY

The directory stack concept originated in the **C shell (csh)** developed at UC Berkeley in the late **1970s**. The pushd, popd, and dirs commands were designed by **Bill Joy** to simplify navigation. These commands were adopted by bash and other shells, becoming standard tools for power users managing complex directory structures.

# SEE ALSO

[pushd](/man/pushd)(1), [popd](/man/popd)(1), [cd](/man/cd)(1), [pwd](/man/pwd)(1)
