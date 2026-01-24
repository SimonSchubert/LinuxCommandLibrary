# TLDR

**Compile file**

```swc [input.js] -o [output.js]```

**Compile directory**

```swc [src/] -d [dist/]```

**Watch mode**

```swc [src/] -d [dist/] -w```

**With source maps**

```swc [input.js] -o [output.js] --source-maps```

**Use config file**

```swc [input.js] -o [output.js] --config-file [.swcrc]```

# SYNOPSIS

**swc** [_-o output_] [_-d dir_] [_-w_] [_options_] _input_

# PARAMETERS

**-o** _FILE_
> Output file.

**-d** _DIR_
> Output directory.

**-w**
> Watch mode.

**--source-maps**
> Generate source maps.

**--config-file** _FILE_
> Configuration file.

**--sync**
> Synchronous mode.

# DESCRIPTION

**swc** compiles JavaScript/TypeScript. It's a fast Rust compiler.

Babel alternative. Much faster.

TypeScript support. No tsc needed.

JSX transformation. React support.

Minification included. Production builds.

# CAVEATS

Less plugins than Babel. Rust ecosystem. Config differs from Babel.

# HISTORY

**SWC** (Speedy Web Compiler) was created by **Donny** as a fast JavaScript/TypeScript compiler written in Rust.

# SEE ALSO

[babel](/man/babel)(1), [tsc](/man/tsc)(1), [esbuild](/man/esbuild)(1)
