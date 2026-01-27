# TLDR

**Show all information**

```wasm-objdump [file.wasm]```

**Display headers only**

```wasm-objdump -h [file.wasm]```

**Disassemble function bodies**

```wasm-objdump -d [file.wasm]```

**Show section details**

```wasm-objdump -x [file.wasm]```

**Show raw section contents**

```wasm-objdump -s [file.wasm]```

**Examine specific section**

```wasm-objdump -j [Code] [file.wasm]```

**Show relocations with disassembly**

```wasm-objdump -d -r [file.wasm]```

# SYNOPSIS

**wasm-objdump** [_options_] _file_

# PARAMETERS

**-h**, **--headers**
> Print section headers.

**-d**, **--disassemble**
> Disassemble function bodies.

**-x**, **--details**
> Show section details.

**-s**, **--full-contents**
> Print raw section contents.

**-j**, **--section** _name_
> Select specific section.

**-r**, **--reloc**
> Show relocations with disassembly.

**--debug**
> Print debug information.

**--section-offsets**
> Show section offsets in disassembly.

**--help**
> Display help.

**--version**
> Display version.

# DESCRIPTION

**wasm-objdump** displays information about WebAssembly binary (.wasm) files. It's part of WABT (WebAssembly Binary Toolkit) and functions similarly to objdump for native binaries.

The tool inspects module structure including imports, exports, functions, globals, memory layout, and WebAssembly bytecode instructions. It's essential for debugging, reverse engineering, and understanding compiled WebAssembly output.

Use cases include performance analysis, security audits, and verifying compiler output. The disassembly mode shows WebAssembly instructions with function boundaries.

# CAVEATS

Only works with WebAssembly binaries, not native executables. Large modules may produce verbose output. Part of WABT package.

# HISTORY

**wasm-objdump** is part of WABT, the WebAssembly Binary Toolkit developed by the WebAssembly Community Group. WABT provides essential tools for working with the WebAssembly format, enabling developers to inspect and manipulate .wasm files.

# SEE ALSO

[wasm-validate](/man/wasm-validate)(1), [wasm-strip](/man/wasm-strip)(1), [wasm2wat](/man/wasm2wat)(1), [wat2wasm](/man/wat2wasm)(1)
