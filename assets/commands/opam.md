# TAGLINE

OCaml Package Manager

# TLDR

**Initialize opam**

```opam init```

**Install package**

```opam install [package]```

**Search packages**

```opam search [query]```

**Update package list**

```opam update```

**Upgrade packages**

```opam upgrade```

**Create switch**

```opam switch create [name] [compiler_version]```

# SYNOPSIS

**opam** [_command_] [_options_]

# PARAMETERS

**init**
> Initialize opam.

**install** _PACKAGE_
> Install package.

**search** _QUERY_
> Search packages.

**update**
> Update repository.

**upgrade**
> Upgrade packages.

**switch** _COMMAND_
> Manage compiler switches.

**--help**
> Display help information.

# DESCRIPTION

**opam** is the OCaml Package Manager. Manages OCaml libraries and compilers.

The tool handles package installation and dependency resolution. Supports switches.

# CAVEATS

Requires initialization. Switches isolate environments. Shell configuration needed.

# HISTORY

opam was created for **OCaml package management** with compiler version switching.

# SEE ALSO

[ocaml](/man/ocaml)(1), [dune](/man/dune)(1)

