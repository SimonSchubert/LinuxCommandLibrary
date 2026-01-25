# TLDR

**Start Metro bundler**

```npx react-native start```

**Start with cache reset**

```npx react-native start --reset-cache```

**Start on specific port**

```npx react-native start --port [8082]```

**Bundle for production**

```npx react-native bundle --entry-file [index.js] --bundle-output [bundle.js]```

**Enable verbose logging**

```npx react-native start --verbose```

# SYNOPSIS

**metro** [_options_]

# PARAMETERS

**--port** _port_
> Server port.

**--reset-cache**
> Clear bundler cache.

**--verbose**
> Verbose output.

**--config** _file_
> Config file path.

**--entry-file** _file_
> Entry point file.

**--bundle-output** _file_
> Output bundle file.

**--platform** _platform_
> Target platform.

# DESCRIPTION

**Metro** is the JavaScript bundler used by React Native. It compiles and bundles JavaScript code and assets, handles module resolution, and provides hot reloading during development.

Metro is optimized for React Native's requirements with fast incremental builds.

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

React Native specific. Cache issues may require reset. Port conflicts with multiple instances.

# HISTORY

Metro was developed by **Facebook** (Meta) as the bundler for React Native, optimized for mobile development workflows.

# SEE ALSO

[react-native](/man/react-native)(1), [webpack](/man/webpack)(1), [babel](/man/babel)(1), [expo](/man/expo)(1)
