# TAGLINE

mass moves and renames files

# TLDR

**Rename with pattern**

```mmv '[*.txt]' '#1.bak'```

**Move files**

```mmv '[dir1/*.c]' 'dir2/#1.c'```

**Lowercase filenames**

```mmv '[*]' '#l1'```

**Preview changes**

```mmv -n '[*.JPG]' '#1.jpg'```

**Force overwrite**

```mmv -o '[*.old]' '#1.new'```

# SYNOPSIS

**mmv** [_options_] _from_ _to_

# PARAMETERS

_FROM_
> Source pattern.

_TO_
> Target pattern.

**-n**
> Dry run (no execute).

**-o**
> Overwrite existing.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**mmv** performs mass file moves, copies, appends, and links using shell-like wildcard patterns. It matches source files with a **from** pattern containing wildcards, then constructs target names using a **to** pattern where **#1**, **#2**, etc. refer to the text matched by each wildcard in the source pattern.

Special substitutions in the target pattern include **#l** and **#u** for lowercase and uppercase conversion. The tool plans all operations before executing, detecting and resolving collisions and cycles.

# CAVEATS

Pattern syntax differs from standard shell globbing. Always preview with **-n** before executing. Quoting patterns is essential to prevent shell expansion.

# HISTORY

mmv was written by **Vladimir Lanin** and published in **1990**. It provides mass file operations using pattern matching and substitution.

# SEE ALSO

[rename](/man/rename)(1), [mv](/man/mv)(1), [prename](/man/prename)(1)

