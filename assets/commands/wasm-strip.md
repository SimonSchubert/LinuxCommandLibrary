# TLDR

**Strip all custom sections**

```wasm-strip [file.wasm]```

**Strip and write to different file**

```wasm-strip -o [output.wasm] [input.wasm]```

# SYNOPSIS

**wasm-strip** [_options_] _file_

# PARAMETERS

**-o**, **--output** _file_
> Output to specified file instead of modifying in place.

**--help**
> Display help.

**--version**
> Display version.

# DESCRIPTION

**wasm-strip** removes custom sections from WebAssembly binary files, reducing file size. It's part of WABT (WebAssembly Binary Toolkit).

Custom sections contain optional metadata like debug information, names, and source maps that aren't required for execution. Stripping these sections creates smaller modules suitable for production deployment.

The tool modifies files in place by default. Use -o to preserve the original and write stripped output to a new file.

# CAVEATS

Stripping removes debug information, making debugging harder. Only affects custom sections; standard sections remain. Irreversible without backup. Part of WABT package.

# HISTORY

**wasm-strip** is part of WABT (WebAssembly Binary Toolkit), developed by the WebAssembly Community Group. Like the traditional strip command for native binaries, it helps reduce binary size for distribution while removing non-essential metadata.

# SEE ALSO

[wasm-objdump](/man/wasm-objdump)(1), [wasm-validate](/man/wasm-validate)(1), [wasm2wat](/man/wasm2wat)(1), [strip](/man/strip)(1)
