# TAGLINE

catch segmentation faults and print backtraces

# TLDR

**Run program with segfault catching**

```catchsegv [./program]```

**Run with arguments**

```catchsegv [./program] [arg1] [arg2]```

# SYNOPSIS

**catchsegv** _program_ [_args_...]

# DESCRIPTION

**catchsegv** is a debugging wrapper that intercepts segmentation faults in a program and prints a symbolic backtrace to help diagnose the crash. It works by using LD_PRELOAD to inject libSegFault.so, which installs a signal handler for SIGSEGV and other fatal signals.

When the wrapped program crashes, catchsegv displays a stack trace with function names, source file locations (if debug symbols are available), and memory map information. This provides a lightweight alternative to running programs under a full debugger when you only need crash diagnostics.

The tool was part of the glibc debug utilities but has been removed from glibc 2.35 and later. Modern alternatives include AddressSanitizer and core dump analysis with GDB.

# ENVIRONMENT

**SEGFAULT_OUTPUT_NAME**
> Output file (default: stderr)

**SEGFAULT_SIGNALS**
> Signals to handle: segv, ill, bus, stkflt, abrt, fpe

**SEGFAULT_USE_ALTSTACK**
> Use alternate stack for handler

# DEBUG SYMBOLS

Compile with -g flag for function names and line numbers in backtrace:

```gcc -g -o program program.c```

Without debug symbols, only memory addresses are shown.

# CAVEATS

Removed from glibc 2.35+. Modern alternatives include out-of-process debuggers and post-mortem analysis tools. Uses non-async-signal-safe functions in handler.

# ALTERNATIVES

- GDB with core dumps
- AddressSanitizer (-fsanitize=address)
- Custom signal handlers with backtrace()
- Valgrind

# SEE ALSO

[gdb](/man/gdb)(1), [addr2line](/man/addr2line)(1), [backtrace](/man/backtrace)(3)
