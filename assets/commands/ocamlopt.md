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
> Specify the output filename.

**-c**
> Compile only; suppress the linking phase. Produces `.cmx` and `.o` files.

**-a**
> Build a library (`.cmxa` and `.a` files) from the given object files.

**-shared**
> Build a dynamically loadable plugin (`.cmxs` file).

**-pack**
> Combine multiple `.cmx` files into a single compilation unit.

**-O** _level_
> Optimization level: `0` disables all optimizations, `3` enables aggressive optimization including unboxing. Default is `1`.

**-I** _dir_
> Add _dir_ to the search path for `.cmi` and `.cmx` files.

**-g**
> Add debugging information to enable stack backtraces at runtime.

**-S**
> Keep the assembly code produced during compilation in a `.s` file.

**-inline** _n_
> Set the aggressiveness of inlining (default 10; higher means more inlining).

**-compact**
> Optimize the produced code for space rather than speed.

**-unsafe**
> Disable bounds checking on array/string accesses and zero-division checks; faster but unsafe.

**-for-pack** _module-path_
> Generate an object file that can later be included as a sub-module in a `-pack` compilation.

**-linkall**
> Force all modules contained in libraries to be linked in.

**-pp** _command_
> Pipe source files through the given preprocessor command.

**-ppx** _command_
> Pipe the abstract syntax tree through the given preprocessor.

**-w** _warning-list_
> Enable, disable, or mark as fatal specific compiler warnings.

**-warn-error** _warning-list_
> Turn the specified warnings into errors.

**-open** _Module_
> Open the named module before processing each source file.

**-nostdlib**
> Do not include the standard library directory in the search path.

**-cc** _ccomp_
> Use _ccomp_ as the C linker when building executables.

**-cclib** _-llib_
> Link with the given C library.

**-ccopt** _option_
> Pass _option_ to the C compiler and linker.

**-verbose**
> Print all external commands as they are executed.

**-v**
> Print the version number of the compiler and the location of the standard library.

**-i**
> Print inferred interface to stdout; do not produce object files.

**-bin-annot**
> Generate detailed type and location information in `.cmt` and `.cmti` files.

# DESCRIPTION

**ocamlopt** is the OCaml native-code compiler. It compiles OCaml source files directly to native machine code, producing significantly faster executables than the bytecode compiler **ocamlc**. The output is architecture-specific and not portable across platforms.

Compilation proceeds in three phases: type-checking and compilation to `.cmx` / `.o` files (`-c`), optional library archiving (`-a`), and linking. Interface files (`.mli`) are compiled to `.cmi` files shared with the bytecode compiler.

# CAVEATS

Native-code compilation is slower than bytecode compilation. The resulting executables are platform-specific. Debugging native code is harder than debugging bytecode; **ocamldebug** does not support native executables (use `-g` and system debuggers such as `gdb`).

# HISTORY

The OCaml native-code compiler was developed at **INRIA** alongside the bytecode compiler as part of the Caml/OCaml project to provide high-performance compilation while retaining the language's type safety guarantees.

# SEE ALSO

[ocamlc](/man/ocamlc)(1), [ocamlfind](/man/ocamlfind)(1), [opam](/man/opam)(1), [dune](/man/dune)(1)
