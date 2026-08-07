# TAGLINE

Wyzer programming language compiler and runner

# TLDR

**Build** the compiler from a source checkout (OCaml / Dune)

```dune build```

**Run** a Wyzer program (interpreter path)

```wyzerc run [file.wyz]```

**Build** a program to a native binary via LLVM + clang

```wyzerc build [file.wyz]```

**Project** a choreography to a specific role, then run

```wyzerc run [file.wyz] --role [RoleName]```

**Build** for a specific role (outputs _base_Role.ll_ and a linked binary)

```wyzerc build [file.wyz] --role [RoleName]```

# SYNOPSIS

**wyzerc** **run**|**build** _file.wyz_ [**--role** _RoleName_]

# DESCRIPTION

**wyzerc** is the compiler front end for **Wyzer**, a statically typed, resource-oriented programming language with Perceus-style memory management and choreographic programming for distributed safety. Source files use the **.wyz** extension.

Invoked as **wyzerc run** _file.wyz_, the tool parses and typechecks the program, applies Perceus transformation, and evaluates it in the built-in OCaml interpreter. **wyzerc build** takes the same front-end path, then generates LLVM IR (**_base_Role.ll_**) and invokes **clang** with the Wyzer runtime (**lib/wyzer_runtime.c**) to produce a native binary named **_base_Role_** (default role **Poly** when **--role** is omitted).

Optional **--role** selects a choreographic projection so multi-party programs can be specialized per participant. The project is early research; several language and distributed features are still unfinished.

# PARAMETERS

**run** _file.wyz_
> Typecheck, transform, and execute _file.wyz_ with the interpreter.

**build** _file.wyz_
> Typecheck, transform, emit LLVM IR, and compile with **clang -O3** plus the Wyzer C runtime.

**--role** _RoleName_
> Project the program to _RoleName_ before evaluation or codegen. Default role for build is **Poly**.

# CAVEATS

Requires an OCaml toolchain (Dune, Menhir, LLVM bindings, and related opam packages) to build **wyzerc** itself; **build** mode additionally needs **clang** and the in-tree **lib/wyzer_runtime.c**. There is no polished package-manager install path yet—typical workflow is clone, **opam** deps, and **dune build** / **dune exec wyzerc**. Older docs sometimes show **dune exec wyzerc -- file.wyz** without a **run**/**build** subcommand; current usage requires **run** or **build** as the first argument. Project status is experimental research, not production-ready.

# HISTORY

**Wyzer** is a research language exploring one ownership rule for memory, concurrency, and network protocols, combining Perceus reference counting with choreographic programming. The **wyzerc** binary is the public Dune executable name for the compiler in the upstream repository.

# SEE ALSO

[clang](/man/clang)(1), [dune](/man/dune)(1), [opam](/man/opam)(1)

# RESOURCES

```[Source code](https://github.com/Wyzer-Lang/wyzer)```

```[Documentation](https://github.com/Wyzer-Lang/wyzer/tree/master/docs)```

<!-- verified: 2026-08-07 -->
