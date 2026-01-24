# TLDR

**Sort dependencies**

```tsort [dependencies.txt]```

**From stdin**

```echo -e "a b\nb c" | tsort```

**Sort makefile dependencies**

```tsort [makefile_deps]```

# SYNOPSIS

**tsort** [_file_]

# DESCRIPTION

**tsort** performs topological sorting. It orders items respecting dependencies.

Input is pairs of items. First depends on second.

Output lists items in order. Dependencies come before dependents.

Cycles are reported as errors. Circular dependencies can't be sorted.

Common for build systems. Determine compilation order.

# INPUT FORMAT

```
a b    # a depends on b
b c    # b depends on c
c d    # c depends on d
```

# OUTPUT

Items in dependency order: d, c, b, a

# EXAMPLE

```
$ echo -e "main util\nutil lib\nlib" | tsort
lib
util
main
```

# CAVEATS

Detects cycles but can't resolve. Single dependency per line pair. Whitespace separated.

# HISTORY

**tsort** is part of POSIX and has been in Unix since early versions. It was originally used for ordering object files in linker commands.

# SEE ALSO

[sort](/man/sort)(1), [make](/man/make)(1)
