# TLDR

**Generate a parser** from a grammar file

```yacc [grammar.y]```

**Generate parser with header file** for token definitions

```yacc -d [grammar.y]```

**Use a custom file prefix** instead of y

```yacc -b [prefix] [grammar.y]```

**Use a custom symbol prefix** instead of yy

```yacc -p [prefix] [grammar.y]```

**Generate verbose output** describing the parser

```yacc -v [grammar.y]```

**Enable debugging** in generated code

```yacc -t [grammar.y]```

**Generate separate files** for code and tables

```yacc -r [grammar.y]```

# SYNOPSIS

**yacc** [_-dgilrtv_] [_-b prefix_] [_-p prefix_] _filename_

# PARAMETERS

**-b** _prefix_
> Use prefix for output filenames instead of **y**.

**-d**
> Generate header file **y.tab.h** with token definitions.

**-g**
> Generate graphviz format file **y.dot** for visualization.

**-i**
> Generate supplementary header file **y.tab.i**.

**-l**
> Do not insert **#line** directives in generated code.

**-p** _prefix_
> Use prefix for yacc-generated symbols instead of **yy**.

**-P**
> Create a reentrant (pure) parser.

**-r**
> Generate separate files for code (**y.code.c**) and tables (**y.tab.c**).

**-t**
> Enable debugging statements in compiled code.

**-v**
> Generate verbose description file **y.output**.

**-V**
> Print version information.

# DESCRIPTION

**yacc** (Yet Another Compiler Compiler) is an LALR(1) parser generator that reads grammar specifications and generates C code for a parser. The grammar file defines tokens, syntax rules, and semantic actions.

yacc produces **y.tab.c** containing parsing tables and a driver routine. When used with **-d**, it also generates **y.tab.h** with token definitions for use with lex/flex lexers.

On most Linux systems, **yacc** is actually **bison** (GNU parser generator) or **byacc** (Berkeley Yacc), both compatible with traditional AT&T yacc.

# CAVEATS

yacc reports shift/reduce and reduce/reduce conflicts that may indicate grammar ambiguities. Rules that are never reduced are also reported. The generated parser uses global variables by default; use **-P** for reentrant parsers.

# HISTORY

yacc was written by **Stephen C. Johnson** at Bell Labs and first released in **1975** for Unix Version 6. The name stands for "Yet Another Compiler Compiler". **Berkeley Yacc** (byacc) was written by Robert Corbett in **1989** as a public domain implementation. **GNU Bison**, a compatible replacement with extensions, was first released in **1985** and is the standard yacc on GNU/Linux systems.

# SEE ALSO

[bison](/man/bison)(1), [lex](/man/lex)(1), [flex](/man/flex)(1), [cc](/man/cc)(1)
