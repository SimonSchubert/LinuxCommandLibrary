# TLDR

**Compile a Rust file**

```rustc [main.rs]```

**Compile with output name**

```rustc [main.rs] -o [program]```

**Compile with optimizations**

```rustc -O [main.rs]```

**Compile in release mode**

```rustc -C opt-level=3 [main.rs]```

**Compile with debugging info**

```rustc -g [main.rs]```

**Show warnings**

```rustc -W warnings [main.rs]```

**Emit assembly**

```rustc --emit=asm [main.rs]```

**Emit LLVM IR**

```rustc --emit=llvm-ir [main.rs]```

**Check without compiling**

```rustc --emit=metadata [main.rs]```

**Show version**

```rustc --version```

# SYNOPSIS

**rustc** [_options_] _input_

# DESCRIPTION

**rustc** is the compiler for the Rust programming language. It compiles Rust source code (.rs files) into executables or libraries. The compiler performs type checking, borrow checking, and optimization.

While rustc can be used directly, most Rust development uses Cargo which invokes rustc with appropriate settings. Direct rustc usage is common for simple programs, learning, or advanced build customization.

rustc uses LLVM for code generation, providing excellent optimization and support for many target platforms.

# PARAMETERS

**-o** _file_
> Output filename.

**-O**
> Optimize (equivalent to -C opt-level=2).

**-g**
> Include debug information.

**-C** _option_
> Codegen options.

**-W** _lint_
> Set lint warning level.

**-A** _lint_
> Allow lint.

**-D** _lint_
> Deny lint (make it error).

**--emit=** _type_
> Output type (asm, llvm-ir, obj, link).

**--crate-type=** _type_
> Crate type (bin, lib, dylib, staticlib).

**--edition=** _year_
> Rust edition (2015, 2018, 2021).

**--target=** _triple_
> Target platform.

**--explain** _code_
> Explain an error code.

**-L** _path_
> Add library search path.

**--extern** _name=path_
> Specify external crate location.

# CAVEATS

Direct rustc usage requires manual dependency management. Most projects should use Cargo instead. Edition differences may cause compatibility issues. Cross-compilation requires target toolchain installation.

# HISTORY

**rustc** was developed as part of the **Rust programming language** project, started by **Graydon Hoare** at Mozilla in **2006**. Rust reached version 1.0 in **May 2015**. The compiler was originally written in OCaml but was rewritten in Rust (self-hosted) by version 1.0. Development continues under the Rust Foundation, established in **2021**.

# SEE ALSO

[cargo](/man/cargo)(1), [rustup](/man/rustup)(1), [rustfmt](/man/rustfmt)(1), [clippy](/man/clippy)(1)
