# TAGLINE

V programming language compiler

# TLDR

**Compile file**

```v [file.v]```

**Run file**

```v run [file.v]```

**Build optimized**

```v -prod [file.v]```

**Format code**

```v fmt [file.v]```

**Start REPL**

```v repl```

**Test module**

```v test [module]```

# SYNOPSIS

**v** [_run_] [_-prod_] [_options_] _file_

# PARAMETERS

**run**
> Compile and run.

**-prod**
> Production build.

**fmt**
> Format code.

**repl**
> Interactive mode.

**test**
> Run tests.

**-o** _FILE_
> Output name.

# DESCRIPTION

**v** is the compiler for the V programming language, a statically typed systems language designed for simplicity and fast compilation. It compiles V source code to native machine code via C, achieving near-instant build times even for large projects.

The compiler includes a built-in code formatter, test runner, REPL, and package manager. V emphasizes memory safety through features like no null pointers, immutable variables by default, and optional garbage collection. It provides seamless C interoperability, allowing direct calls to C libraries without bindings.

Production builds with the **-prod** flag enable additional optimizations. The compiler can also generate C source code for portability to platforms without a V compiler available.

# CAVEATS

Young language. Ecosystem growing. V-specific.

# HISTORY

**V** was created by **Alexander Medvednikov** as a simple, fast, and safe systems programming language.

# SEE ALSO

[gcc](/man/gcc)(1), [go](/man/go)(1), [zig](/man/zig)(1)
