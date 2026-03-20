# TAGLINE

Bundle JavaScript modules for distribution

# TLDR

**Bundle JavaScript**

```rollup [main.js] --file [bundle.js]```

**Use configuration file**

```rollup -c```

**Output format**

```rollup [main.js] -o [bundle.js] -f [es]```

**Watch for changes**

```rollup -c --watch```

**Generate sourcemap**

```rollup [main.js] -o [bundle.js] -m```

**Bundle with a specific plugin**

```rollup [main.js] -o [bundle.js] -p [node-resolve]```

# SYNOPSIS

**rollup** [_options_] _input_

# DESCRIPTION

**rollup** is a JavaScript module bundler focused on ES modules. It compiles small pieces of code into larger bundles, with excellent tree-shaking to eliminate unused code.

The tool produces efficient bundles for libraries and applications, supporting multiple output formats.

# PARAMETERS

**-c** _file_, **--config** _file_
> Configuration file.

**-o** _file_, **--file** _file_
> Output file.

**-f** _fmt_, **--format** _fmt_
> Output format (es, cjs, umd, iife, amd, system).

**-n** _name_, **--name** _name_
> UMD/IIFE global name.

**-m**, **--sourcemap**
> Generate sourcemap.

**-w**, **--watch**
> Watch mode.

**-p** _plugin_, **--plugin** _plugin_
> Use plugin.

**-d** _dir_, **--dir** _dir_
> Output directory (for code splitting).

**-e** _modules_, **--external** _modules_
> Comma-separated list of external module IDs.

**-g** _pairs_, **--globals** _pairs_
> Comma-separated global:module pairs for UMD/IIFE.

**--no-treeshake**
> Disable tree shaking.

# CONFIGURATION

**rollup.config.js** / **rollup.config.mjs**
> Project-level configuration file defining input entry points, output formats, plugins, and external dependencies. Loaded automatically with **-c** or by specifying a path.

# CAVEATS

Configuration needed for complex projects. Plugin ecosystem essential. CommonJS needs plugin. Build time can be slow for large projects.

# HISTORY

**Rollup** was created by **Rich Harris** in **2015**. It pioneered ES module bundling with tree-shaking, influencing later bundlers. Harris also created Svelte.

# SEE ALSO

[webpack](/man/webpack)(1), [esbuild](/man/esbuild)(1), [vite](/man/vite)(1), [parcel](/man/parcel)(1)
