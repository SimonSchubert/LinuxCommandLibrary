# TAGLINE

Next-generation frontend build tool

# TLDR

**Start the development server**

```vite```

**Start dev server on a specific port**

```vite --port [3000]```

**Build for production**

```vite build```

**Preview production build** locally

```vite preview```

**Use a specific config file**

```vite --config [vite.config.js]```

**Build with a specific base path**

```vite build --base [/my/public/path/]```

**Force dependency pre-bundling**

```vite --force```

**Build in specific mode**

```vite build --mode [production]```

# SYNOPSIS

**vite** [_command_] [_options_]

# PARAMETERS

**dev**, **serve**
> Start development server (default command).

**build**
> Build for production.

**preview**
> Locally preview production build.

**optimize**
> Pre-bundle dependencies.

**-c**, **--config** _file_
> Use specified config file.

**--base** _path_
> Public base path for the build.

**--mode** _mode_
> Set env mode (development, production).

**--port** _port_
> Port number for dev server.

**--host** _host_
> Hostname to listen on.

**--open** [_path_]
> Open browser on server start.

**--force**
> Force dependency pre-bundling.

**--clearScreen**
> Clear terminal screen on start.

**-l**, **--logLevel** _level_
> Log level: info, warn, error, silent.

**-d**, **--debug** [_filter_]
> Enable debug mode with optional filter.

**-h**, **--help**
> Display help message.

**-v**, **--version**
> Display version.

# DESCRIPTION

**Vite** is a next-generation frontend build tool that provides an extremely fast development experience. It leverages native ES modules in the browser during development, eliminating the bundling step for faster hot module replacement (HMR).

For production, Vite bundles code using Rollup, producing optimized static assets. It supports TypeScript, JSX, CSS preprocessing, and various frameworks (Vue, React, Svelte) out of the box.

Configuration is typically stored in **vite.config.js** or **vite.config.ts**. Vite requires Node.js 20.19+ or 22.12+.

# CAVEATS

The preview server is not designed for production use; deploy the built files with a proper static file server. Some Node.js APIs are not available in the browser during development. Legacy browser support requires the @vitejs/plugin-legacy plugin.

# HISTORY

Vite was created by **Evan You** (creator of Vue.js) and first released in **April 2020**. The name means "fast" in French. Vite 2.0, released in **February 2021**, was a major rewrite that made it framework-agnostic. It has rapidly gained adoption as an alternative to webpack, influencing the broader JavaScript tooling ecosystem.

# SEE ALSO

[npm](/man/npm)(1), [webpack](/man/webpack)(1), [rollup](/man/rollup)(1), [esbuild](/man/esbuild)(1)
