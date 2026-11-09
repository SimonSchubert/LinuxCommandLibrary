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

**Print per-asset sizes** in the build report

```parcel build [index.html] --detailed-report```

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
> Output directory to write to when unspecified by targets.

**-p**, **--port** _port_
> Dev server port (serve and watch). Defaults to $PORT or 1234.

**--host** _host_
> Dev server host (default: all interfaces).

**--open** [_browser_]
> Automatically open the entry in the specified browser, or the default browser (serve only).

**--lazy** [_includes_]
> Build async bundles on demand when requested in the browser, optionally limited to a comma-separated list of source globs (serve only).

**--lazy-exclude** _excludes_
> Comma-separated source globs whose async bundles are not built lazily. Only valid with --lazy.

**--https**
> Serve over HTTPS.

**--cert** _path_
> Path to the certificate to use with HTTPS.

**--key** _path_
> Path to the private key to use with HTTPS.

**--no-hmr**
> Disable hot module replacement.

**--hmr-port** _port_
> Hot module replacement port.

**--hmr-host** _host_
> Hot module replacement host.

**--no-cors**
> Disable CORS.

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
> Disable minification (build only).

**--no-scope-hoist**
> Disable scope hoisting (build only).

**--no-content-hash**
> Disable content hashing of output file names (build and watch).

**--no-autoinstall**
> Disable automatic installation of missing dependencies.

**--watch-dir** _path_
> Root watch directory. Defaults to the nearest lockfile or source control directory.

**--watch-ignore** _paths_
> Comma-separated directories the watcher should not track. Defaults to .git and .hg.

**--detailed-report** [_count_]
> Print asset timings and sizes in the build report.

**--reporter** _name_
> Run an additional reporter. May be specified multiple times.

**--profile**
> Enable sampling build profiling.

**--trace**
> Enable build tracing.

**-V**, **--version**
> Output the version number.

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

# RESOURCES

```[Source code](https://github.com/parcel-bundler/parcel)```

```[Homepage](https://parceljs.org/)```

```[Documentation](https://parceljs.org/features/cli/)```

<!-- verified: 2026-11-09 -->
