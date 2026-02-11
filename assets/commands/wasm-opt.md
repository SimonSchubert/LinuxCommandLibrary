# TAGLINE

Optimize WebAssembly binary modules

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

**wasm-opt** is a WebAssembly optimizer from the Binaryen toolkit that applies various optimization passes to reduce module size and improve execution speed. It processes .wasm binary files and outputs optimized versions suitable for production deployment.

Optimization levels range from -O (standard) through -O4 (maximum), with each level enabling progressively more aggressive transformations. The -Os flag optimizes specifically for code size, which is important for web delivery where download size affects load time. Available passes include dead code elimination, inlining, constant folding, and many WebAssembly-specific optimizations.

The tool can also validate modules for specification conformance and print module contents in text format for inspection. It is commonly used as a post-processing step in WebAssembly build pipelines after compilation from source languages.

# CAVEATS

Part of Binaryen. WASM specific. May change semantics rarely.

# HISTORY

**wasm-opt** is part of **Binaryen**, a compiler infrastructure library for WebAssembly.

# SEE ALSO

[wasm2wat](/man/wasm2wat)(1), [wat2wasm](/man/wat2wasm)(1), [wasm-strip](/man/wasm-strip)(1)
