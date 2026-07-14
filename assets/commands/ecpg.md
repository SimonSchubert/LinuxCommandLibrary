# TAGLINE

PostgreSQL embedded SQL preprocessor

# TLDR

**Preprocess embedded SQL file**

```ecpg [file.pgc]```

**Specify output file**

```ecpg -o [output.c] [input.pgc]```

**Include search path**

```ecpg -I [/include/path] [file.pgc]```

**Enable compatibility mode**

```ecpg -C [INFORMIX] [file.pgc]```

**Process a header file** containing embedded SQL declarations

```ecpg -h [header.pgh]```

**Use question marks** as parameter placeholders (Informix style)

```ecpg -r [questionmarks] [file.pgc]```

# SYNOPSIS

**ecpg** [_options_] _file_...

# PARAMETERS

**-o** _file_
> Write output to file.

**-I** _directory_
> Include search path.

**-c**
> Automatically generate C code from SQL code, currently for EXEC SQL TYPE declarations.

**-C** _mode_
> Compatibility mode: INFORMIX, INFORMIX_SE or ORACLE.

**-D** _symbol_[**=**_value_]
> Define a C preprocessor symbol.

**-h**
> Process a header file. Implies **-c** and writes a .h file rather than a .c file.

**-i**
> Parse system include files as well.

**-r** _option_
> Set a run-time behavior: no_indicator, prepare, questionmarks.

**-t**
> Turn on autocommit of transactions.

**-v**
> Print version, include path and other build information.

**--version**
> Print version and exit.

# DESCRIPTION

**ecpg** is the PostgreSQL embedded SQL preprocessor. It converts C programs with embedded SQL statements into regular C code that calls the ECPG runtime library, which in turn talks to the server through libpq.

The tool reads .pgc files containing EXEC SQL statements embedded in C code and generates standard C files. By default the output for `prog.pgc` is written to `prog.c`. The generated code must be compiled and linked against **libecpg** (for example with `gcc prog.c -lecpg`), and the include path from `pg_config --includedir` is usually needed.

# CAVEATS

The generated C file links against libecpg, not libpq directly, so the PostgreSQL client development package must be installed. Compatibility modes change SQL parsing and null handling to match Informix or Oracle, and code written for one mode is generally not portable to another.

# SEE ALSO

[psql](/man/psql)(1), [pg_config](/man/pg_config)(1), [postgres](/man/postgres)(1)

# RESOURCES

```[Source code](https://github.com/postgres/postgres)```

```[Homepage](https://www.postgresql.org/)```

```[Documentation](https://www.postgresql.org/docs/current/app-ecpg.html)```

<!-- verified: 2026-07-14 -->

