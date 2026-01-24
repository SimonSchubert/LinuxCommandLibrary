# TLDR

**Optimize WASM**

```wasm-opt -O [input.wasm] -o [output.wasm]```

**Maximum optimization**

```wasm-opt -O4 [input.wasm] -o [output.wasm]```

**Size optimization**

```wasm-opt -Os [input.wasm] -o [output.wasm]```

**Print stats**

```wasm-opt --print [input.wasm]```

**Validate only**

```wasm-opt --validate [input.wasm]```

# SYNOPSIS

**wasm-opt** [_-O_] [_-Os_] [_-o output_] [_options_] _input_

# PARAMETERS

**-O**
> Optimize (levels 0-4).

**-Os**
> Optimize for size.

**-o** _FILE_
> Output file.

**--print**
> Print module.

**--validate**
> Validate only.

**--debug**
> Emit debug info.

# DESCRIPTION

**wasm-opt** optimizes WebAssembly. It's part of Binaryen.

Size reduction. Smaller modules.

Speed optimization. Faster execution.

Multiple passes. Various optimizations.

Validation included. Check correctness.

# CAVEATS

Part of Binaryen. WASM specific. May change semantics rarely.

# HISTORY

**wasm-opt** is part of **Binaryen**, a compiler infrastructure library for WebAssembly.

# SEE ALSO

[wasm2wat](/man/wasm2wat)(1), [wat2wasm](/man/wat2wasm)(1), [wasm-strip](/man/wasm-strip)(1)
