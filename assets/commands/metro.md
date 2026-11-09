# TAGLINE

JavaScript bundler used by React Native

# TLDR

**Start Metro bundler**

```npx react-native start```

**Start with cache reset**

```npx react-native start --reset-cache```

**Start on specific port**

```npx react-native start --port [8082]```

**Bundle for production**

```npx react-native bundle --platform [android] --dev false --entry-file [index.js] --bundle-output [bundle.js]```

**Start the dev server** with the Metro CLI directly

```npx metro serve --port [8081]```

**Build a bundle** with the Metro CLI

```npx metro build [index.js] --out [bundle.js] --platform [ios]```

**List the files** included in a bundle

```npx metro get-dependencies "[/path/to/index.js]" --platform [ios]```

# SYNOPSIS

**metro** **serve** [_options_]

**metro** **build** _entry_ **--out** _file_ [_options_]

**metro** **get-dependencies** [_entry_] [_options_]

**npx react-native start** [_options_]

**npx react-native bundle** **--entry-file** _file_ **--platform** _platform_ **--bundle-output** _file_ [_options_]

# PARAMETERS

**serve**, **start**
> Run a development server that builds bundles on request (Metro CLI).

**build** _entry_
> Build a bundle from an entry point (Metro CLI).

**get-dependencies** [_entry_]
> List the files in a bundle as absolute paths, one per line (Metro CLI).

**--port** _port_
> Server port (default: 8081).

**--host** _host_
> Host to listen on (default: localhost).

**-O**, **--out** _file_
> Output bundle file (**metro build**, required).

**--entry-file** _file_
> Entry point file (**react-native bundle**).

**--bundle-output** _file_
> Output bundle file (**react-native bundle**).

**--platform** _platform_
> Target platform (e.g. ios, android, web).

**--dev** _boolean_
> Development build, in which `__DEV__` is true (**react-native bundle** default: true).

**--minify**
> Minify the bundle.

**--source-map**
> Generate a source map (**metro build**).

**-c**, **--config** _file_
> Config file path.

**-j**, **--max-workers** _N_
> Number of transformer workers.

**--reset-cache**
> Clear bundler cache. Deprecated on the **metro** CLI in favor of the **resetCache** config option.

# DESCRIPTION

**Metro** is the JavaScript bundler used by React Native. It compiles and bundles JavaScript code and assets, handles module resolution, and provides hot reloading during development.

Metro is optimized for React Native's requirements with fast incremental builds. React Native apps typically use **npx react-native start** and **npx react-native bundle**, which call the same APIs as the **metro** CLI.

# CONFIGURATION

```javascript
// metro.config.js
module.exports = {
  resolver: {
    sourceExts: ['js', 'jsx', 'ts', 'tsx'],
  },
  transformer: {
    getTransformOptions: async () => ({
      transform: { experimentalImportSupport: false },
    }),
  },
};
```

# CAVEATS

Primarily built for React Native. Cache issues may require reset. Port conflicts with multiple instances.

# HISTORY

Metro was developed by **Facebook** (Meta) as the bundler for React Native, optimized for mobile development workflows.

# SEE ALSO

[react-native](/man/react-native)(1), [webpack](/man/webpack)(1), [babel](/man/babel)(1), [expo](/man/expo)(1)

# RESOURCES

```[Source code](https://github.com/react/metro)```

```[Homepage](https://metrobundler.dev)```

```[Documentation](https://metrobundler.dev/docs/getting-started/)```

<!-- verified: 2026-11-09 -->
