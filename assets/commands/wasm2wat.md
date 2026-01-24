# TLDR

**Convert to WAT**

```wasm2wat [input.wasm]```

**Output to file**

```wasm2wat [input.wasm] -o [output.wat]```

**Fold expressions**

```wasm2wat --fold-exprs [input.wasm]```

**Generate names**

```wasm2wat --generate-names [input.wasm]```

# SYNOPSIS

**wasm2wat** [_-o output_] [_--fold-exprs_] [_options_] _input_

# PARAMETERS

**-o** _FILE_
> Output file.

**--fold-exprs**
> Fold expressions.

**--generate-names**
> Generate names.

**--inline-exports**
> Inline exports.

**--help**
> Show help.

# DESCRIPTION

**wasm2wat** disassembles WebAssembly. It converts to text format.

Binary to text. Human readable.

WAT format output. S-expression syntax.

Debug WASM modules. Inspect contents.

Part of WABT. Standard tool.

# CAVEATS

One-way mostly. Part of WABT. Large output for big modules.

# HISTORY

**wasm2wat** is part of **WABT** (WebAssembly Binary Toolkit), converting binary WASM to readable WAT text format.

# SEE ALSO

[wat2wasm](/man/wat2wasm)(1), [wasm2c](/man/wasm2c)(1), [wasm-objdump](/man/wasm-objdump)(1)
