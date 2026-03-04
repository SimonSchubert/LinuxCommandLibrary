# TAGLINE

Rust debugger for Linux x86-64

# TLDR

**Debug** a Rust binary

```bs [path/to/binary]```

**Debug** with arguments

```bs [path/to/binary] -- [arg1] [arg2]```

# SYNOPSIS

**bs** [_options_] _binary_ [**--** _args_...]

# DESCRIPTION

**bugstalker** (binary name **bs**) is a debugger specifically designed for **Rust** programs on **Linux x86-64** systems. It provides a terminal user interface for debugging with Rust-aware features such as understanding Rust types, enums, and data structures natively.

The debugger supports setting breakpoints, stepping through code, inspecting variables with Rust-specific formatting, viewing backtraces, and navigating through threads. Its TUI provides a source code view alongside debug controls.

# CAVEATS

Only supports **Linux x86-64** targets. Requires debug symbols in the binary (compile with `cargo build` without `--release`, or with `debug = true` in the release profile). Limited to Rust and C programs — not a general-purpose debugger for all languages.

# HISTORY

**bugstalker** was developed as a modern Rust-native debugging tool, aiming to provide a better debugging experience for Rust developers compared to using GDB or LLDB with Rust pretty-printers.

# SEE ALSO

[gdb](/man/gdb)(1), [lldb](/man/lldb)(1), [rust-gdb](/man/rust-gdb)(1)
