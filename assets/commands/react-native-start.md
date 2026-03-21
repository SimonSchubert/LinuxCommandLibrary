# TAGLINE

Start the React Native Metro bundler server

# TLDR

**Start Metro bundler**

```react-native start```

**Start on specific port**

```react-native start --port [8082]```

**Start and reset cache**

```react-native start --reset-cache```

**Start with verbose output**

```react-native start --verbose```

**Start bound to a specific host**

```react-native start --host [0.0.0.0]```

# SYNOPSIS

**react-native start** [_options_]

# PARAMETERS

**--port** _port_
> Server port (default 8081).

**--reset-cache**
> Clear bundler cache.

**--verbose**
> Verbose output.

**--host** _host_
> Server hostname.

**--https**
> Enable HTTPS.

**--config** _path_
> Metro config file.

**--experimental-debugger**
> Enable the new JS debugger (Hermes debugger).

# DESCRIPTION

**react-native start** launches the Metro JavaScript bundler, a development server that compiles and serves JavaScript bundles to React Native apps running on simulators, emulators, or physical devices. It watches source files for changes and pushes updates to connected apps via hot reloading, enabling rapid development without full rebuilds.

The bundler listens on port 8081 by default and can be customized with **--port**. The **--reset-cache** flag clears the bundler's transformation cache, which is useful when resolving stale module resolution issues or after changing configuration. Use **--host 0.0.0.0** to make the server accessible from other devices on the network, such as physical phones on the same Wi-Fi.

# SEE ALSO

[react-native](/man/react-native)(1), [metro](/man/metro)(1)

