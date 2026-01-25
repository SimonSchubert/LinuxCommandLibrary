# TLDR

**Start Forth interpreter (Gforth)**

```gforth```

**Run Forth script**

```gforth [script.fs]```

**Evaluate expression**

```gforth -e "[1 2 + .] [bye]"```

**Include file then go interactive**

```gforth [script.fs] -```

# SYNOPSIS

**gforth** [_options_] [_file_...]

# PARAMETERS

**-e** _code_
> Evaluate Forth code.

**-m** _size_
> Dictionary size.

**-d** _size_
> Data stack size.

**-r** _size_
> Return stack size.

_file_
> Forth source file to load.

**-**
> Read from stdin.

# DESCRIPTION

**Forth** is a stack-based programming language known for its simplicity and extensibility. Gforth is the GNU implementation of Forth, conforming to the ANS Forth standard.

Forth uses reverse Polish notation (RPN) with an explicit stack. Words (functions) are defined with `:` and `;`. The language is highly interactive and extensible, commonly used in embedded systems.

# BASIC OPERATIONS

```forth
\ Push numbers, add, print
2 3 + .   \ prints 5

\ Define a word
: square ( n -- n^2 ) dup * ;
5 square .   \ prints 25

\ Stack manipulation
1 2 3 swap   \ 1 3 2
dup          \ duplicates top
drop         \ removes top
```

# CAVEATS

Stack-based paradigm differs from most languages. Manual memory management. Limited standard library compared to modern languages. Debugging can be challenging.

# HISTORY

Forth was invented by **Charles H. Moore** in the late **1960s** for controlling radio telescopes. It became popular in embedded systems due to its small footprint and efficiency. Gforth was started in **1992** by Anton Ertl and Bernd Paysan.

# SEE ALSO

[gforth](/man/gforth)(1), [lisp](/man/lisp)(1), [dc](/man/dc)(1)
