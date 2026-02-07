# TAGLINE

Live-reloading development server for Go applications

# TLDR

**Start live reload** in the current directory

```air```

**Initialize a default configuration** file

```air init```

**Run with arguments** passed to the built binary

```air [server] --port [8080]```

**Use a custom configuration** file

```air -c [path/to/.air.toml]```

**Specify custom build** and run commands without config file

```air --build.cmd "go build -o bin/api cmd/run.go" --build.bin "./bin/api"```

**Separate air arguments from binary arguments** with --

```air -- -h```

# SYNOPSIS

**air** [_OPTIONS_] [_ARGS_...]

**air** **init**

# PARAMETERS

**init**
> Generate a default .air.toml configuration file in the current directory.

**-c** _FILE_
> Specify a custom configuration file path.

**--build.cmd** _COMMAND_
> Set the build command directly from command line.

**--build.bin** _PATH_
> Set the path to the built binary.

**--build.entrypoint** _PATH_
> Set the entrypoint for the binary.

**-d**
> Enable debug mode with verbose output.

**--**
> Separator to pass remaining arguments to the built binary.

# DESCRIPTION

**Air** is a live-reloading command line utility designed for Go application development. It watches your source files for changes and automatically rebuilds and restarts your application, eliminating the need to manually stop, rebuild, and restart during development.

Run air in your project root directory and it monitors file changes based on configured extensions and directories. When changes are detected, Air rebuilds the application and restarts the binary. Configuration is managed through a **.air.toml** file that controls watched directories, excluded paths, file extensions, build commands, and environment variables.

Air can load environment variables from .env files before building and running. The tool is intended for development workflows only and is not designed for production hot-deploy scenarios.

# CONFIGURATION

**.air.toml**
> Project-level configuration file controlling watched directories, excluded paths, file extensions, build commands, and environment variables. Generated with `air init`.

# CAVEATS

Air is a development tool and should not be used for production deployments. The default configuration watches common Go file patterns but may need adjustment for projects with non-standard layouts. Build errors are displayed in the terminal but the watcher continues running, waiting for fixes.

# HISTORY

Air was created as an open-source project to address the need for live reloading in Go development, similar to tools available in other ecosystems like nodemon for Node.js. The project is maintained on GitHub under the air-verse organization and has become one of the most popular live reload solutions in the Go community.

# SEE ALSO

[go](/man/go)(1), [make](/man/make)(1), [nodemon](/man/nodemon)(1)
