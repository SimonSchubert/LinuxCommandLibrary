# TAGLINE

Topological sort of dependency pairs

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

**tsort** performs topological sorting on a set of dependency pairs read from standard input or a file. Each line contains two whitespace-separated items where the first item depends on the second. The output lists all items in an order where every dependency appears before the items that depend on it.

The tool is commonly used in build systems to determine compilation order, in package managers to resolve installation sequences, and in any scenario where items must be processed in dependency order. If the input contains cycles (circular dependencies), tsort reports an error since no valid ordering exists.

Input with a single item on a line introduces that item without declaring a dependency, ensuring it appears in the output.

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
