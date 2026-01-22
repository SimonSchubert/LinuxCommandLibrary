# TLDR

**Bundle JavaScript file**

```esbuild [app.js] --bundle --outfile=[out.js]```

**Bundle with minification**

```esbuild [app.js] --bundle --minify --outfile=[out.js]```

**Bundle TypeScript**

```esbuild [app.ts] --bundle --outfile=[out.js]```

**Watch mode**

```esbuild [app.js] --bundle --watch --outfile=[out.js]```

**Start dev server**

```esbuild [app.js] --bundle --serve=[8000]```

**Bundle for browser**

```esbuild [app.js] --bundle --platform=browser --outfile=[out.js]```

**Generate source maps**

```esbuild [app.js] --bundle --sourcemap --outfile=[out.js]```

# SYNOPSIS

**esbuild** [_options_] [_entry_points_...]

# PARAMETERS

_ENTRY_POINTS_
> Input files to process.

**--bundle**
> Bundle dependencies.

**--outfile** _FILE_
> Output file path.

**--minify**
> Minify output.

**--watch**
> Rebuild on changes.

**--serve** [_PORT_]
> Start development server.

**--platform** _PLATFORM_
> Target: browser, node, neutral.

**--sourcemap**
> Generate source maps.

**--target** _VERSION_
> JavaScript target version.

**--help**
> Display help information.

# DESCRIPTION

**esbuild** is an extremely fast JavaScript and TypeScript bundler and minifier. Written in Go, it's 10-100x faster than traditional bundlers like webpack or Parcel.

The tool handles bundling, minification, code splitting, tree shaking, and transpilation. It supports JSX, TypeScript, and modern JavaScript features without configuration.

esbuild's speed makes it ideal for development builds and as a lower-level tool in build pipelines.

# CAVEATS

Plugin ecosystem smaller than webpack. Some transformations not supported. Configuration differs from other bundlers. May need plugins for complex setups.

# HISTORY

esbuild was created by **Evan Wallace** (co-founder of Figma) and released in **2020**. Its dramatic speed improvement over existing tools came from being written in Go with parallelization.

# SEE ALSO

[webpack](/man/webpack)(1), [rollup](/man/rollup)(1), [vite](/man/vite)(1), [swc](/man/swc)(1)
