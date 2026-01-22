# TLDR

**Run** a .NET assembly

```mono [path/to/program.exe]```

Run a .NET assembly in **debug mode**

```mono --debug [path/to/program.exe]```

Run with **specific runtime version**

```mono --runtime=v4.0 [path/to/program.exe]```

**Trace method calls** during execution

```mono --trace [path/to/program.exe]```

Run using the **interpreter** instead of JIT

```mono --interpreter [path/to/program.exe]```

**Pre-compile** assembly to native code (AOT)

```mono --aot [path/to/assembly.dll]```

# SYNOPSIS

**mono** [_options_] _file_ [_arguments_...]

# PARAMETERS

**--debug[=_options_]**
> Enable debugging mode; options include casts, mdb-optimizations, gdb

**--aot[=_options_]**
> Pre-compile CIL to native code; options: llvm, full, static, asmonly

**--full-aot**
> Run exclusively on pre-generated AOT code without runtime JIT

**--interpreter**
> Use interpreter instead of JIT compilation

**--llvm**
> Use LLVM backend for code generation when available

**--gc=_engine_**
> Select garbage collector: boehm or sgen

**-O=_mode_**
> Enable/disable optimizations (inline, sse2, tailc, abcrem, etc.)

**--trace[=_expression_]**
> Trace method invocations with optional filtering

**--config _filename_**
> Load custom configuration file

**--runtime=_version_**
> Override runtime version selection (e.g., v4.0)

**--debugger-agent=_options_**
> Configure remote debugging capabilities

**--profile[=_profiler_]**
> Enable profiling with specified profiler

# DESCRIPTION

**Mono** is an open-source implementation of the ECMA Common Language Infrastructure (CLI) that executes .NET applications on Linux, macOS, and other platforms. It provides a runtime environment for C#, VB.NET, and other .NET languages.

The runtime loads assembly files (.exe or .dll) and compiles Common Intermediate Language (CIL) bytecode to native machine code using Just-in-Time (JIT) compilation. Ahead-of-Time (AOT) compilation is also supported for improved startup performance.

# CAVEATS

MONO_PATH environment variable should not be used by deployed applications as it breaks the assembly loader. AOT-generated code typically cannot be moved between computers due to CPU-specific optimizations. Some Windows-specific APIs may not be available or may behave differently.

# HISTORY

**Mono** was started by **Miguel de Icaza** and **Ximian** in **2001** as an open-source implementation of the .NET Framework. It was later sponsored by Novell, Xamarin, and Microsoft. The project enabled cross-platform .NET development before Microsoft's official .NET Core release.

# SEE ALSO

[mcs](/man/mcs)(1), [gacutil](/man/gacutil)(1), [dotnet](/man/dotnet)(1)
