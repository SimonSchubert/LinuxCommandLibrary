# TLDR

**Print working directory**

```pwd```

**Print physical path (no symlinks)**

```pwd -P```

**Print logical path (with symlinks)**

```pwd -L```

# SYNOPSIS

**pwd** [_options_]

# PARAMETERS

**-L**
> Logical path (follow symlinks).

**-P**
> Physical path (resolve symlinks).

# DESCRIPTION

**pwd** prints current working directory. Shows absolute path.

The tool displays current location. Essential navigation command.

pwd shows directory.

# CAVEATS

Shell built-in and external command. Behavior may differ.

# HISTORY

pwd is a **classic Unix** command for directory display.

# SEE ALSO

[cd](/man/cd)(1), [dirs](/man/dirs)(1), [basename](/man/basename)(1)

