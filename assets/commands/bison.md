# TLDR

**Generate** parser

```bison [grammar.y]```

Generate with **verbose output**

```bison -v [grammar.y]```

**Specify** output file

```bison -o [parser.c] [grammar.y]```

Generate **header** file

```bison -d [grammar.y]```

# SYNOPSIS

**bison** [_options_] _file_

# DESCRIPTION

**bison** is a general-purpose parser generator that converts grammar descriptions (in .y files) into C, C++, or Java parsers. It's compatible with yacc and used for building compilers, interpreters, and other language processors.

The tool is a GNU replacement for yacc with additional features and better error handling.

# PARAMETERS

**-o**, **--output=**_file_
> Output file name

**-d**, **--defines**
> Generate header file with token definitions

**-v**, **--verbose**
> Create .output file with parser states

**-t**, **--debug**
> Enable debug output in parser

**-g**, **--graph**
> Generate VCG graph of parser

**-r**, **--report=**_things_
> Generate report (state, itemset, lookahead)

**-W**, **--warnings**
> Enable warnings

**-l**, **--no-lines**
> Don't generate #line directives

# GRAMMAR FILE FORMAT

```yacc
%{
#include <stdio.h>
%}

%token NUMBER
%%

expr: NUMBER '+' NUMBER { $$ = $1 + $3; }
    ;

%%
```

# FEATURES

- LALR(1) parser generation
- GLR parsing support
- C++, Java output
- Location tracking
- Error recovery
- Precedence declarations
- Semantic actions

# WORKFLOW

```bash
# Generate parser
bison -d calculator.y

# Compile with flex lexer
flex lexer.l
gcc lex.yy.c calculator.tab.c -o calculator

# View parser details
bison -v grammar.y
cat grammar.output
```

# CAVEATS

Learning curve for grammar syntax. Shift/reduce and reduce/reduce conflicts possible. Generated code can be large. Error messages sometimes cryptic. Usually paired with flex for lexical analysis.

# HISTORY

**Bison** was written by Robert Corbett in **1985** as a free replacement for Unix yacc, later adopted by the GNU Project.

# SEE ALSO

[flex](/man/flex)(1), [yacc](/man/yacc)(1), [antlr](/man/antlr)(1)
