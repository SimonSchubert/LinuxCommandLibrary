# TAGLINE

arbitrary-precision reverse Polish notation calculator

# TLDR

**Start interactive** calculator

```dc```

**Evaluate expression** directly

```echo "[5 3 + p]" | dc```

**Multiply two numbers**

```echo "[4 7 * p]" | dc```

**Calculate with decimal** precision

```echo "[10 k 22 7 / p]" | dc```

**Execute from file**

```dc [script.dc]```

**Store and recall** values

```echo "[5 sa la 3 + p]" | dc```

**Calculate factorial** of 5

```echo "[5 [d 1 - d 1 <f *] d sf x p]" | dc```

# SYNOPSIS

**dc** [_options_] [_file_...]

# PARAMETERS

_FILE_
> File containing dc commands to execute.

**-e** _EXPR_, **--expression** _EXPR_
> Evaluate expression from command line.

**-f** _FILE_, **--file** _FILE_
> Read commands from file.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**dc** is an arbitrary precision desk calculator using reverse Polish notation (RPN). Numbers and operators are entered sequentially, with operators acting on values in a stack. It supports arithmetic, comparisons, and programmable macros.

Basic operations push numbers onto the stack and apply operators: 5 3 + pushes 5 and 3, then adds them. The p command prints the top of stack. The k command sets decimal precision for division and other operations.

dc provides registers (a-z) for storing values, conditional execution, loops through macros, and string manipulation. Despite its terse syntax, it can implement complex algorithms including recursion.

# CAVEATS

RPN syntax can be unintuitive for users accustomed to infix notation. Error messages are minimal. Complex programs are difficult to read and debug. Some extended features vary between implementations.

# HISTORY

dc is one of the oldest Unix utilities, written by **Lorinda Cherry** and **Robert Morris** at Bell Labs around **1969-1971**. It predates the C programming language and was originally implemented in B. The bc calculator was later written as a preprocessor for dc.

# SEE ALSO

[bc](/man/bc)(1), [calc](/man/calc)(1), [expr](/man/expr)(1)
