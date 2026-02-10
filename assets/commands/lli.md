# TAGLINE

executes LLVM bitcode using a JIT compiler

# TLDR

**Run LLVM bitcode**

```lli [program.bc]```

**Run LLVM IR**

```lli [program.ll]```

**With arguments**

```lli [program.bc] [arg1] [arg2]```

**Force JIT compilation**

```lli -force-interpreter=false [program.bc]```

**Use interpreter**

```lli -force-interpreter [program.bc]```

**Set JIT kind**

```lli -jit-kind=[orc] [program.bc]```

# SYNOPSIS

**lli** [_options_] _file_ [_args_]

# PARAMETERS

_FILE_
> LLVM bitcode or IR file.

_ARGS_
> Program arguments.

**-force-interpreter**
> Use interpreter instead of JIT.

**-jit-kind** _KIND_
> JIT engine type (mcjit, orc).

**-entry-function** _NAME_
> Entry function name.

**--help**
> Display help information.

# DESCRIPTION

**lli** directly executes programs in LLVM bitcode (.bc) or LLVM assembly (.ll) format using a just-in-time (JIT) compiler. Rather than producing a standalone executable on disk, lli compiles the LLVM IR to native machine code in memory at runtime and immediately begins execution, making it a convenient tool for quickly testing and prototyping LLVM IR without a separate compilation and linking step.

The tool supports two execution engines: the JIT compiler (default), which translates functions to native code on demand for near-native performance, and a slower interpreter mode enabled with `-force-interpreter`. The JIT backend can be selected between MCJIT and the newer ORC engine via the `-jit-kind` flag. Program arguments can be passed after the bitcode filename, allowing lli to run LLVM programs just like native executables.

# CAVEATS

Requires LLVM bitcode input. JIT overhead on startup. Part of LLVM toolchain.

# HISTORY

lli is part of the **LLVM** project, providing a way to directly execute LLVM intermediate representation.

# SEE ALSO

[llc](/man/llc)(1), [llvm-as](/man/llvm-as)(1), [clang](/man/clang)(1)

