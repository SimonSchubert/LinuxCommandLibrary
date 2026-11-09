# TAGLINE

Start the React Native Metro bundler server

# TLDR

**Start Metro bundler**

```npx react-native start```

**Start on specific port**

```npx react-native start --port [8082]```

**Start and reset cache**

```npx react-native start --reset-cache```

**Start with verbose output**

```npx react-native start --verbose```

**Start bound to a specific host**

```npx react-native start --host [0.0.0.0]```

**Start without interactive key commands**, e.g. in CI

```npx react-native start --no-interactive```

**Serve over HTTPS** with a custom certificate

```npx react-native start --https --key [path/to/key.pem] --cert [path/to/cert.pem]```

# SYNOPSIS

**react-native start** [_options_]

# PARAMETERS

**--port** _number_
> Server port (default 8081).

**--host** _string_
> Server hostname (default localhost).

**--reset-cache**, **--resetCache**
> Remove cached files before starting.

**--projectRoot** _path_
> Path to the project root.

**--watchFolders** _list_
> Comma-separated additional folders to watch.

**--assetPlugins** _list_
> Comma-separated additional asset plugins.

**--sourceExts** _list_
> Comma-separated additional source extensions to bundle.

**--max-workers** _number_
> Maximum number of transform workers. Defaults to the number of CPU cores.

**--transformer** _string_
> Use a custom transformer.

**--custom-log-reporter-path**, **--customLogReporterPath** _string_
> Module path exporting a replacement for TerminalReporter.

**--https**
> Enable HTTPS connections.

**--key** _path_
> Path to a custom SSL key.

**--cert** _path_
> Path to a custom SSL certificate.

**--config** _path_
> Metro config file.

**--no-interactive**
> Disable interactive key commands.

**--client-logs**
> Deprecated. Enable plain text JavaScript log streaming for all connected apps.

**--verbose**
> Increase logging verbosity. A global option of the React Native CLI.

# DESCRIPTION

**react-native start** launches the Metro JavaScript bundler, a development server that compiles and serves JavaScript bundles to React Native apps running on simulators, emulators, or physical devices. It watches source files for changes and pushes updates to connected apps through Fast Refresh, enabling rapid development without full rebuilds.

The bundler listens on port 8081 by default and can be customized with **--port**. The **--reset-cache** flag clears the bundler's transformation cache, which is useful when resolving stale module resolution issues or after changing configuration. Use **--host 0.0.0.0** to make the server accessible from other devices on the network, such as physical phones on the same Wi-Fi.

# CAVEATS

Run it from the project directory through **npx**, which uses the project's own CLI version; the available options follow the installed React Native release. The old **--experimental-debugger** flag is gone from current releases.

# HISTORY

The command now lives in React Native's own **@react-native/community-cli-plugin** package and is exposed through **@react-native-community/cli**.

# SEE ALSO

[react-native](/man/react-native)(1), [metro](/man/metro)(1)

# RESOURCES

```[Source code](https://github.com/react/react-native)```

```[Homepage](https://reactnative.dev)```

```[Documentation](https://reactnative.dev/docs/metro)```

<!-- verified: 2026-11-09 -->
