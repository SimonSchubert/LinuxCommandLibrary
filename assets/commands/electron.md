# TLDR

**Run Electron app**

```electron [.]```

**Run specific directory**

```electron [path/to/app]```

**Run with remote debugging**

```electron --remote-debugging-port=[9222] [.]```

**Show version**

```electron --version```

**Run with verbose logging**

```electron --enable-logging [.]```

**Disable GPU acceleration**

```electron --disable-gpu [.]```

# SYNOPSIS

**electron** [_options_] [_path_]

# PARAMETERS

_path_
> Path to app directory or package.json.

**--version**
> Show Electron version.

**--remote-debugging-port** _port_
> Enable remote debugging.

**--enable-logging**
> Enable logging to console.

**--disable-gpu**
> Disable GPU hardware acceleration.

**--no-sandbox**
> Disable sandbox (not recommended).

**--inspect** _port_
> Enable Node.js inspector.

**--inspect-brk** _port_
> Enable inspector and break on start.

# DESCRIPTION

**Electron** is a framework for building cross-platform desktop applications using web technologies (HTML, CSS, JavaScript). It embeds Chromium for rendering and Node.js for backend functionality.

Applications are packaged with their own Electron runtime, enabling deployment without system dependencies. Popular Electron apps include VS Code, Slack, Discord, and Atom.

# PROJECT STRUCTURE

```
my-app/
├── package.json    # Main entry point defined
├── main.js         # Main process
├── preload.js      # Preload script
├── index.html      # Renderer content
└── renderer.js     # Renderer process
```

# CAVEATS

Large application size due to bundled Chromium. High memory usage. Security requires proper configuration (context isolation, preload scripts). Updates require careful handling. Multiple processes (main and renderer).

# HISTORY

Electron was originally developed by **GitHub** as **Atom Shell** for the Atom editor in **2013**. It was renamed to Electron in **2015** and released as open source. The project revolutionized desktop app development by enabling web developers to build native applications.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [nw](/man/nw)(1)
