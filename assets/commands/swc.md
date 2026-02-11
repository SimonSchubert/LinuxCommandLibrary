# TAGLINE

Fast Rust-based JavaScript and TypeScript compiler

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

**swc** (Speedy Web Compiler) is a JavaScript and TypeScript compiler written in Rust, designed as a significantly faster alternative to Babel. It handles transpilation, JSX transformation, TypeScript stripping, and minification in a single tool.

The compiler supports modern JavaScript features, downlevel compilation to older targets, and React JSX transformation. TypeScript files are compiled by stripping types without performing type checking, making it much faster than tsc for builds where type checking is handled separately.

SWC can process individual files, entire directories with watch mode for development, and generates source maps for debugging. It is used as the compilation engine by tools like Next.js and Parcel.

# CONFIGURATION

**.swcrc**
> Project configuration file in JSON format defining compilation target, module type, JSX settings, and minification options.

# CAVEATS

Less plugins than Babel. Rust ecosystem. Config differs from Babel.

# HISTORY

**SWC** (Speedy Web Compiler) was created by **Donny** as a fast JavaScript/TypeScript compiler written in Rust.

# SEE ALSO

[babel](/man/babel)(1), [tsc](/man/tsc)(1), [esbuild](/man/esbuild)(1)
