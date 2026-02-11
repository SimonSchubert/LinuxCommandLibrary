# TAGLINE

Assemble WebAssembly text to binary

# TLDR

**Compile WAT to WASM**

```wat2wasm [input.wat]```

**Output to file**

```wat2wasm [input.wat] -o [output.wasm]```

**Validate only**

```wat2wasm --validate [input.wat]```

**Verbose output**

```wat2wasm -v [input.wat]```

**Debug names**

```wat2wasm --debug-names [input.wat]```

# SYNOPSIS

**wat2wasm** [_-o output_] [_-v_] [_options_] _input_

# PARAMETERS

**-o** _FILE_
> Output file.

**-v**
> Verbose.

**--validate**
> Validate only.

**--debug-names**
> Include debug names.

**--help**
> Show help.

# DESCRIPTION

**wat2wasm** is an assembler from the WABT (WebAssembly Binary Toolkit) that compiles WebAssembly Text Format (WAT) files into binary WebAssembly (.wasm) modules. It is the counterpart to wasm2wat, which performs the reverse conversion.

The tool validates the input WAT source against the WebAssembly specification during compilation, reporting syntax and type errors before producing output. A validate-only mode can check files without generating binary output, which is useful in build pipelines.

The --debug-names option embeds function and variable names from the WAT source into the binary as custom sections, making the output easier to debug in browsers and other tools that display named symbols.

# CAVEATS

WAT syntax required. Part of WABT. Strict validation.

# HISTORY

**wat2wasm** is part of **WABT** (WebAssembly Binary Toolkit), compiling WAT text format to binary WASM.

# SEE ALSO

[wasm2wat](/man/wasm2wat)(1), [wasm-opt](/man/wasm-opt)(1), [wasm-validate](/man/wasm-validate)(1)
