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

**mmv** mass moves and renames files. It uses patterns to transform filenames.

The tool handles complex renaming operations. Supports wildcards and transformations.

mmv renames files by pattern.

# CAVEATS

Different pattern syntax. Preview first. Powerful but complex.

# HISTORY

mmv was created for **mass file renaming** using pattern matching and substitution.

# SEE ALSO

[rename](/man/rename)(1), [mv](/man/mv)(1), [prename](/man/prename)(1)

