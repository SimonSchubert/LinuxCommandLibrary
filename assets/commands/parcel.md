# TLDR

**Start development server**

```parcel [index.html]```

**Build for production**

```parcel build [index.html]```

**Specify output directory**

```parcel build [index.html] --dist-dir [dist]```

**Watch mode without server**

```parcel watch [index.html]```

**Specify port**

```parcel [index.html] --port [3000]```

**Build library**

```parcel build [src/index.js] --target [node]```

# SYNOPSIS

**parcel** [_command_] [_options_] _entries_...

# PARAMETERS

**build**
> Production build.

**watch**
> Watch without server.

**serve**
> Development server (default).

**--dist-dir** _dir_
> Output directory.

**--port** _port_
> Dev server port.

**--target** _target_
> Build target.

**--no-cache**
> Disable cache.

**--no-source-maps**
> Disable source maps.

# DESCRIPTION

**Parcel** is a zero-configuration web application bundler. It supports JavaScript, CSS, HTML, images, and other assets out of the box with automatic transforms.

Parcel uses worker processes for parallel builds and has built-in dev server with HMR.

# FEATURES

```
- Zero configuration
- Hot Module Replacement
- Code splitting
- Tree shaking
- TypeScript/JSX support
- CSS/SCSS/LESS support
```

# CAVEATS

Parcel 2 has different CLI than v1. Cache in .parcel-cache. May need @parcel/config-default.

# HISTORY

Parcel was created by **Devon Govett** in **2017** as a zero-configuration alternative to webpack.

# SEE ALSO

[webpack](/man/webpack)(1), [vite](/man/vite)(1), [esbuild](/man/esbuild)(1), [rollup](/man/rollup)(1)
