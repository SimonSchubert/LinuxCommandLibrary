# TLDR

**Initialize Elm project**

```elm init```

**Compile Elm file**

```elm make [src/Main.elm]```

**Compile to JavaScript**

```elm make [src/Main.elm] --output=[main.js]```

**Start development** server

```elm reactor```

**Start interactive** REPL

```elm repl```

**Install package**

```elm install [elm/http]```

# SYNOPSIS

**elm** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: init, make, reactor, repl, install, etc.

**init**
> Initialize new Elm project.

**make** _FILE_
> Compile Elm source file.

**--output** _FILE_
> Output file path.

**--optimize**
> Enable optimizations.

**reactor**
> Start development server.

**repl**
> Start interactive shell.

**install** _PACKAGE_
> Install Elm package.

**--help**
> Display help information.

# DESCRIPTION

**elm** is the command-line tool for the Elm programming language, a functional language for frontend web development. It handles project initialization, compilation, package management, and development tools.

Elm compiles to JavaScript with no runtime exceptions through its strong type system. The compiler provides friendly error messages that help fix issues.

The reactor provides a development server with hot reloading, while repl offers interactive Elm evaluation.

# CAVEATS

Breaks with major versions (0.19 not compatible with 0.18). Limited JavaScript interop. Smaller ecosystem than mainstream languages. Strict type system has learning curve.

# HISTORY

Elm was created by **Evan Czaplicki** as his thesis project in **2012**. It pioneered the "Elm Architecture" pattern that influenced React/Redux and other frontend frameworks.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [purescript](/man/purescript)(1)
