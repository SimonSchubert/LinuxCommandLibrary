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
> Execute default optimization passes.

**-O0**
> No optimization passes.

**-O1**
> Quick and useful optimizations for iteration builds.

**-O2**
> Most optimizations, generally gets most performance.

**-O3**
> Aggressive optimizations, may take significant time.

**-O4**
> Also flatten the IR; can take a lot more time and memory.

**-Os**
> Optimize for code size.

**-Oz**
> Optimize aggressively for code size.

**-o** _FILE_
> Output file.

**--print**
> Print module in text format.

**--validate**
> Validate the module without optimizing.

**--converge**
> Keep iterating optimization passes until no further improvement.

**-g**, **--debuginfo**
> Preserve debug info in output.

**-ism** _FILE_
> Read input source map.

**-osm** _FILE_
> Write output source map.

# DESCRIPTION

**wasm-opt** is a WebAssembly optimizer from the Binaryen toolkit that applies various optimization passes to reduce module size and improve execution speed. It processes .wasm binary files and outputs optimized versions suitable for production deployment.

Optimization levels range from -O0 (none) through -O4 (maximum), with each level enabling progressively more aggressive transformations. -O1 provides quick wins for iteration builds, -O2 covers most optimizations, -O3 is more aggressive, and -O4 additionally flattens the IR. The -Os and -Oz flags optimize for code size, which is important for web delivery. Available passes include dead code elimination, inlining, constant folding, and many WebAssembly-specific optimizations.

The tool can also validate modules for specification conformance and print module contents in text format for inspection. It is commonly used as a post-processing step in WebAssembly build pipelines after compilation from source languages.

# CAVEATS

Part of Binaryen. WASM specific. May change semantics rarely.

# HISTORY

**wasm-opt** is part of **Binaryen**, a compiler infrastructure library for WebAssembly.

# SEE ALSO

[wasm2wat](/man/wasm2wat)(1), [wat2wasm](/man/wat2wasm)(1), [wasm-strip](/man/wasm-strip)(1)
