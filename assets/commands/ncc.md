# TLDR

**Compile Node.js project**

```ncc build [src/index.js]```

**Compile with output directory**

```ncc build [src/index.js] -o [dist/]```

**Compile with minification**

```ncc build [src/index.js] -m```

**Compile with source maps**

```ncc build [src/index.js] -s```

**Compile and watch**

```ncc build [src/index.js] -w```

**Run directly** (compile and execute)

```ncc run [src/index.js]```

**Compile TypeScript**

```ncc build [src/index.ts]```

# SYNOPSIS

**ncc** [_build_] [_run_] [_-o dir_] [_-m_] [_-s_] [_-w_] [_options_] _file_

# PARAMETERS

**build** _FILE_
> Compile to single file.

**run** _FILE_
> Compile and run.

**-o** _DIR_
> Output directory.

**-m**, **--minify**
> Minify output.

**-s**, **--source-map**
> Generate source maps.

**-w**, **--watch**
> Watch for changes.

**-e**, **--external** _PKG_
> Keep package external.

**-a**, **--asset-builds**
> Emit asset files separately.

**--license** _FILE_
> Output license file.

**-q**, **--quiet**
> Quiet mode.

**-v**, **--version**
> Show version.

# DESCRIPTION

**ncc** (Node.js Compiler Collection) compiles Node.js projects into a single file. It bundles code and dependencies, producing portable output that runs without node_modules.

The compiler handles CommonJS and ES modules, automatically resolving imports. Native modules and assets are extracted alongside the bundle.

TypeScript and modern JavaScript features are transpiled automatically. The output targets Node.js, maintaining compatibility with Node's module system.

Externals keep specific packages out of the bundle. This is useful for native modules that can't be bundled or for reducing size when dependencies are available at runtime.

Minification reduces output size. Source maps enable debugging of bundled code by mapping back to original sources.

Watch mode recompiles on file changes, useful during development.

# CAVEATS

Native modules need special handling. Dynamic requires may not resolve. Some packages have bundling issues. Large bundles can be slow to build.

# HISTORY

**ncc** was created by **Vercel** (formerly ZEIT) around **2018** to simplify Node.js deployment. It enables distributing Node.js applications as single files, similar to Go binaries, addressing node_modules complexity.

# SEE ALSO

[webpack](/man/webpack)(1), [esbuild](/man/esbuild)(1), [rollup](/man/rollup)(1), [pkg](/man/pkg)(1)
