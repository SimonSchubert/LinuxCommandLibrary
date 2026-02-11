# TAGLINE

Racket package and project management tool

# TLDR

**Install package**

```raco pkg install [package-name]```

**Update packages**

```raco pkg update```

**Remove package**

```raco pkg remove [package-name]```

**Show installed packages**

```raco pkg show```

**Create executable**

```raco exe [program.rkt]```

**Run tests**

```raco test [file.rkt]```

**Build documentation**

```raco docs```

**Make distribution**

```raco distribute [dir] [executable]```

# SYNOPSIS

**raco** _command_ [_options_] [_args_]

# PARAMETERS

**pkg**
> Package management.

**exe**
> Create executable.

**test**
> Run tests.

**docs**
> Documentation.

**setup**
> Setup collections.

**distribute**
> Create distribution.

**make**
> Compile files.

**check-requires**
> Check dependencies.

# DESCRIPTION

**raco** is Racket's command-line tool for managing packages and building programs.

Package management installs from the Racket package catalog. Dependencies are resolved automatically.

Executable creation compiles Racket programs. Standalone binaries include runtime.

Testing runs unit tests in source files. Test submodules are discovered automatically.

Documentation generation builds HTML docs. Scribble documentation is compiled.

Distribution bundles executables with dependencies. Creates portable packages.

# CAVEATS

Some commands require setup first. Large packages may take time. Platform-specific executables.

# HISTORY

**raco** is the standard tool distributed with **Racket** (formerly PLT Scheme). It consolidates package management, building, and development tasks.

# SEE ALSO

[racket](/man/racket)(1), [drracket](/man/drracket)(1)
