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

**lli** executes LLVM bitcode using a JIT compiler. It runs compiled LLVM IR directly without generating executables.

The tool supports both JIT compilation and interpretation. Useful for testing LLVM IR.

lli executes LLVM bitcode.

# CAVEATS

Requires LLVM bitcode input. JIT overhead on startup. Part of LLVM toolchain.

# HISTORY

lli is part of the **LLVM** project, providing a way to directly execute LLVM intermediate representation.

# SEE ALSO

[llc](/man/llc)(1), [llvm-as](/man/llvm-as)(1), [clang](/man/clang)(1)

