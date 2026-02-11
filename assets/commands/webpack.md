# TAGLINE

Static module bundler for JavaScript

# TLDR

**Build the project** using default configuration

```webpack```

**Build with a specific configuration file**

```webpack --config [webpack.config.js]```

**Build for production**

```webpack --mode production```

**Build for development**

```webpack --mode development```

**Watch for changes** and rebuild

```webpack --watch```

**Specify output directory**

```webpack --output-path [path/to/dist]```

**Start the development server**

```webpack serve```

**Show build statistics**

```webpack --stats verbose```

# SYNOPSIS

**webpack** [_command_] [_entries..._] [_options_]

# PARAMETERS

**build**, **bundle**, **b**
> Run webpack to bundle the project (default command).

**serve**, **server**, **s**
> Run webpack dev server.

**watch**, **w**
> Run webpack and watch for file changes.

**init**, **create**, **c**
> Initialize a new webpack project.

**info**, **i**
> Output information about your system.

**configtest**, **t**
> Validate a webpack configuration file.

**-c**, **--config** _file_
> Path to webpack configuration file.

**--config-name** _name_
> Name of the configuration to use.

**-m**, **--merge**
> Merge multiple configurations.

**--mode** _mode_
> Set mode: **production**, **development**, or **none**.

**-o**, **--output-path** _path_
> Output directory (absolute path).

**-w**, **--watch**
> Watch mode, rebuild on file change.

**--env** _value_
> Environment variables passed to config function.

**--stats** _preset_
> Stats output level: errors-only, minimal, normal, verbose.

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**webpack** is a static module bundler for modern JavaScript applications. It builds a dependency graph from entry points and bundles modules into optimized output files for browsers.

The CLI is provided by **webpack-cli** and wraps webpack's configuration options. Most options can be specified via command line or in **webpack.config.js**. CLI options override configuration file settings.

webpack supports code splitting, lazy loading, tree shaking, and various loaders and plugins for processing different file types (CSS, images, TypeScript, etc.).

# CAVEATS

webpack-cli must be installed separately from webpack core (**npm install webpack webpack-cli**). The dev server (**webpack serve**) requires webpack-dev-server. Complex configurations are better maintained in config files rather than CLI arguments.

# HISTORY

webpack was created by **Tobias Koppers** and first released in **March 2012**. It revolutionized JavaScript build tooling by introducing concepts like code splitting and hot module replacement. webpack 4 (2018) focused on zero-config defaults, and webpack 5 (2020) improved build performance and module federation. The CLI was separated into webpack-cli starting with webpack 4.

# SEE ALSO

[npm](/man/npm)(1), [vite](/man/vite)(1), [rollup](/man/rollup)(1), [esbuild](/man/esbuild)(1), [parcel](/man/parcel)(1)
