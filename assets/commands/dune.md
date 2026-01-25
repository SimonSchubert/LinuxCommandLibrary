# TLDR

**Build the project**

```dune build```

**Run tests**

```dune test```

**Run an executable**

```dune exec [program]```

**Clean build artifacts**

```dune clean```

**Build and watch for changes**

```dune build --watch```

**Format code**

```dune fmt```

**Create new project**

```dune init project [name]```

# SYNOPSIS

**dune** _command_ [_options_]

# PARAMETERS

**build** [_targets_]
> Build specified targets or all.

**test**
> Run tests.

**exec** _program_
> Build and execute program.

**clean**
> Remove build artifacts.

**runtest** _test_
> Run specific test.

**init** _component_ _name_
> Initialize new component (project, library, executable).

**fmt**
> Format source code.

**promote**
> Promote expected test outputs.

**--watch**
> Rebuild on file changes.

**--force**
> Force rebuild of targets.

**--release**
> Build in release mode.

# DESCRIPTION

**Dune** is the standard build system for OCaml and Reason projects. It automatically discovers project structure, handles dependencies, and provides fast incremental builds with caching.

Projects are configured with **dune** files using an S-expression syntax. Dune integrates with opam for package management and supports cross-compilation, multiple build contexts, and IDE integration.

# DUNE FILE EXAMPLE

```lisp
(library
 (name mylib)
 (libraries str unix))

(executable
 (name main)
 (libraries mylib))

(test
 (name test_mylib)
 (libraries mylib alcotest))
```

# CAVEATS

Requires OCaml or Reason compiler. Build artifacts are in _build directory. Dune files use S-expression syntax, not YAML or TOML. Package management requires opam. Large projects benefit from dune-workspace files.

# HISTORY

Dune was originally called **jbuilder**, created by **Jane Street** in **2016**. It was renamed to Dune in **2018** and became the de facto standard build system for the OCaml ecosystem. The project aims to provide a modern, fast, and user-friendly build experience.

# SEE ALSO

[ocaml](/man/ocaml)(1), [opam](/man/opam)(1), [ocamlfind](/man/ocamlfind)(1), [make](/man/make)(1)
