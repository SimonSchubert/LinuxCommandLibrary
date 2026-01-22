# TLDR

**Start server in current directory**

```browser-sync start --server```

**Start server from specific directory**

```browser-sync start --server [app]```

**Start server watching all files**

```browser-sync start --server --files "**/*"```

**Watch specific file types**

```browser-sync start --server --files "*.html, css/*.css"```

**Proxy existing server**

```browser-sync start --proxy "[localhost:8080]"```

**Create configuration file**

```browser-sync init```

**Send reload event**

```browser-sync reload```

**Start with custom port**

```browser-sync start --server --port [3000]```

# SYNOPSIS

**browser-sync** _command_ [_options_]

# DESCRIPTION

**browser-sync** is a development tool that keeps multiple browsers and devices synchronized while building websites. It watches files for changes and either injects CSS/images or triggers full page reloads.

The tool works by injecting an asynchronous script tag after the body tag during initial requests, enabling real-time synchronization across all connected browsers.

# COMMANDS

**start**
> Start Browsersync server

**init**
> Create a configuration file

**reload**
> Send a reload event over HTTP protocol

# PARAMETERS

**--server** _directory_
> Serve files from specified directory

**--proxy** _url_
> Proxy an existing server

**--files** _pattern_
> File patterns to watch for changes

**--port** _number_
> Port to use (default: 3000)

**--https**
> Enable HTTPS for localhost development

**--no-open**
> Don't open browser on start

**--browser** _name_
> Browser to open (chrome, firefox, etc.)

**--config** _file_
> Path to configuration file

**--reload-delay** _ms_
> Milliseconds to wait before reloading

# CAVEATS

Requires the body tag to be present in HTML files. HTTPS is automatically inferred when proxying HTTPS targets. CSS and image changes are injected without full reload; other changes trigger full reload.

# SEE ALSO

[live-server](/man/live-server)(1), [webpack](/man/webpack)(1), [gulp](/man/gulp)(1)
