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

**Generate header file**

```ecpg -h [file.pgc]```

# SYNOPSIS

**ecpg** [_options_] _file_...

# PARAMETERS

**-o** _file_
> Write output to file.

**-I** _directory_
> Include search path.

**-c**
> Generate C code (default).

**-C** _mode_
> Compatibility mode (INFORMIX, INFORMIX_SE).

**-D** _name_
> Define preprocessor symbol.

**-h**
> Parse header file only.

**-i**
> Parse system includes.

**-t**
> Turn on autocommit.

# DESCRIPTION

**ecpg** is the PostgreSQL embedded SQL preprocessor. It converts C programs with embedded SQL statements into regular C code that uses the libpq library.

The tool reads .pgc files containing EXEC SQL statements embedded in C code and generates standard C files that can be compiled and linked with PostgreSQL's libpq library. This enables database operations to be written directly in the application code rather than as separate SQL strings.

# SEE ALSO

[psql](/man/psql)(1), [pg_config](/man/pg_config)(1)

