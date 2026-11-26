# TAGLINE

Compile Type-C, a C11 dialect, by translating it to C

# TLDR

**Compile** a Type-C file the way cc compiles C

```typec -c [file.tc]```

**Build** an executable

```typec -std=c11 -Wall -o [program] [file.tc]```

**Print** the C that would be handed to the C compiler

```typec --emit-c [file.tc]```

Use typec **as cc** in a build

```make CC=typec```

Print the **target** the backend would use

```typec --print-target```

# SYNOPSIS

**typec** [_options_] _file_...

# PARAMETERS

**--cc** _path_
> Use the C compiler at path as the backend. The last one given wins. The default is **cc**, or the compiler named in the environment.

**--emit-c**
> Lower one **.tc** file to C and write it to the **-o** file, or to standard output. Do not compile that C.

**--emit-c-header**
> Write the C header for one **.tci** interface so C code can use its types, and compile nothing.

**--print-target**
> Run the backend with the other arguments as target options and print the target model, one field per line.

**--stats**
> On standard error, print what each Type-C input counts against Type-C's translation limits.

**--version**
> Print the version and exit.

_cc options_
> Every other option is a cc option. Inputs that are not Type-C files, and their options, are passed to the backend unchanged.

# DESCRIPTION

**typec** compiles Type-C, which is C11 plus variants, generics, and errors returned as values. It takes the command line of **cc**, translates each Type-C unit to C, and hands that C to GCC or Clang. A file whose name ends in **.tc** is a Type-C unit. A file whose name ends in **.tci** is an interface. A C file is already valid Type-C, so a program can move one file at a time.

There is no separate runtime library. A variant becomes a structure the C compiler lays out, and a match becomes a switch. When the command line has no Type-C input, **typec** replaces itself with the backend, so it can stand in for **cc** in a makefile.

Install a release from the upstream Homebrew tap, or build it with dune from a checkout. The manual page installed with the compiler lists every option.

# CAVEATS

**typec** stops at the first error in a Type-C file. Options that belong to typec are not forwarded to the backend, and they are not accepted as the value of another option such as **-o**. The backend must be a GCC or Clang new enough for the generated C.

# SEE ALSO

[cc](/man/cc)(1), [gcc](/man/gcc)(1), [clang](/man/clang)(1), [make](/man/make)(1)

# RESOURCES

```[Source code](https://github.com/stass/type-c)```

```[Documentation](https://github.com/stass/type-c/blob/master/docs/typec.1)```

<!-- verified: 2026-11-26 -->
