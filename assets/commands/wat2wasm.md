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

**wat2wasm** assembles WebAssembly. It compiles text to binary.

Text to binary. WAT to WASM.

Validation included. Check errors.

Debug info option. Names in output.

Part of WABT. Standard tool.

# CAVEATS

WAT syntax required. Part of WABT. Strict validation.

# HISTORY

**wat2wasm** is part of **WABT** (WebAssembly Binary Toolkit), compiling WAT text format to binary WASM.

# SEE ALSO

[wasm2wat](/man/wasm2wat)(1), [wasm-opt](/man/wasm-opt)(1), [wasm-validate](/man/wasm-validate)(1)
