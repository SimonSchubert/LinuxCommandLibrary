# TAGLINE

zero-configuration web application bundler

# TLDR

**Start development server**

```parcel [index.html]```

**Build for production**

```parcel build [index.html]```

**Specify output directory**

```parcel build [index.html] --dist-dir [dist]```

**Watch mode without server**

```parcel watch [index.html]```

**Specify port and open in browser**

```parcel [index.html] --port [3000] --open```

**Build only a specific target defined in package.json**

```parcel build [index.html] --target [main]```

**Build without minification or content hashing**

```parcel build [index.html] --no-optimize --no-content-hash```

# SYNOPSIS

**parcel** [_command_] [_options_] _entries_...

# PARAMETERS

**build**
> Production build and exit.

**watch**
> Watch for changes and rebuild without starting a dev server.

**serve**
> Start a development server with HMR (default command).

**--dist-dir** _dir_
> Output directory (default value for distDir in package.json targets).

**-p**, **--port** _port_
> Dev server port (also settable via PORT env var).

**--host** _host_
> Dev server host (default: all interfaces).

**--open**
> Automatically open entry in the default browser.

**--lazy**
> Defer building files until requested in the browser.

**--https**
> Enable HTTPS for the dev server.

**--target** _target_
> Build only a specific target defined in package.json. May be specified multiple times.

**--public-url** _url_
> Path prefix for absolute URLs.

**--no-cache**
> Disable reading from the filesystem cache.

**--cache-dir** _dir_
> Set cache directory (default: .parcel-cache).

**--no-source-maps**
> Disable source maps.

**--no-optimize**
> Disable optimizations such as minification.

**--no-content-hash**
> Disable content hashing of output file names.

**--log-level** _level_
> Set the log level (none, error, warn, info, verbose).

**--config** _config_
> Specify Parcel config to use (default: @parcel/config-default).

# DESCRIPTION

**Parcel** is a zero-configuration web application bundler. It supports JavaScript, CSS, HTML, images, and other assets out of the box with automatic transforms.

Parcel uses worker processes for parallel builds and has a built-in dev server with Hot Module Replacement (HMR).

# CAVEATS

Parcel 2 has a different CLI than v1. Cache is stored in .parcel-cache. Build targets are configured in package.json, not via `--target node` as in v1.

# HISTORY

Parcel was created by **Devon Govett** in **2017** as a zero-configuration alternative to webpack.

# SEE ALSO

[webpack](/man/webpack)(1), [vite](/man/vite)(1), [esbuild](/man/esbuild)(1), [rollup](/man/rollup)(1), [npm](/man/npm)(1)
