# TAGLINE

OCaml native-code compiler

# TLDR

**Compile to native code**

```ocamlopt -o [program] [source.ml]```

**Compile multiple files**

```ocamlopt -o [program] [file1.ml] [file2.ml]```

**Compile with optimization**

```ocamlopt -O3 -o [program] [source.ml]```

**Compile to object file**

```ocamlopt -c [source.ml]```

**Create native library**

```ocamlopt -a -o [library.cmxa] [file1.ml] [file2.ml]```

# SYNOPSIS

**ocamlopt** [_options_] _files_...

# PARAMETERS

**-o** _file_
> Output filename.

**-c**
> Compile only.

**-O** _level_
> Optimization level (0-3).

**-I** _dir_
> Include directory.

**-g**
> Debug info.

**-a**
> Create library.

**-inline** _n_
> Inline threshold.

# DESCRIPTION

**ocamlopt** is the OCaml native-code compiler. It produces fast executables by compiling OCaml to native machine code instead of bytecode.

Native code runs significantly faster than bytecode but isn't portable across architectures.

# FILE EXTENSIONS

```
.ml   - Implementation
.mli  - Interface
.cmx  - Native object
.cmxa - Native library
.o    - Object file
```

# COMPARISON

```
ocamlc   - Bytecode, portable, slower
ocamlopt - Native, fast, arch-specific
```

# CAVEATS

Compilation slower than bytecode. Platform-specific output. Debugging harder than bytecode.

# HISTORY

The OCaml native compiler was developed at **INRIA** to provide high-performance compilation while maintaining OCaml's type safety.

# SEE ALSO

[ocamlc](/man/ocamlc)(1), [dune](/man/dune)(1), [opam](/man/opam)(1), [ocamldebug](/man/ocamldebug)(1)
