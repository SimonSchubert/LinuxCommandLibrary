# TAGLINE

OCaml bytecode compiler

# TLDR

**Compile to bytecode**

```ocamlc -o [program] [source.ml]```

**Compile multiple files**

```ocamlc -o [program] [file1.ml] [file2.ml]```

**Compile with library**

```ocamlc -I +[library] [library].cma [source.ml] -o [program]```

**Compile to object file**

```ocamlc -c [source.ml]```

**Compile with debug info**

```ocamlc -g -o [program] [source.ml]```

# SYNOPSIS

**ocamlc** [_options_] _files_...

# PARAMETERS

**-o** _file_
> Output filename.

**-c**
> Compile only (no link).

**-I** _dir_
> Add include directory.

**-g**
> Include debug info.

**-i**
> Print inferred types.

**-a**
> Create library archive.

**-linkall**
> Link all modules.

# DESCRIPTION

**ocamlc** is the OCaml bytecode compiler. It compiles OCaml source files to bytecode that runs on the OCaml virtual machine.

For native code compilation with better performance, use ocamlopt instead.

# FILE EXTENSIONS

```
.ml   - Implementation
.mli  - Interface
.cmo  - Bytecode object
.cma  - Bytecode library
.cmi  - Compiled interface
```

# EXAMPLE

```bash
# Compile simple program
ocamlc -o hello hello.ml

# With standard library
ocamlc -I +str str.cma program.ml -o program
```

# CAVEATS

Bytecode slower than native. Link order matters. Use ocamlopt for production.

# HISTORY

OCaml was developed at **INRIA** (French computing research institute), evolving from Caml Light. The bytecode compiler has been part of OCaml since its creation.

# SEE ALSO

[ocamlopt](/man/ocamlopt)(1), [ocamldep](/man/ocamldep)(1), [dune](/man/dune)(1), [opam](/man/opam)(1)
