# TAGLINE

Build custom Caddy with modules

# TLDR

**Build Caddy with modules**

```xcaddy build --with [github.com/module]```

**Build specific Caddy version**

```xcaddy build [v2.7.0] --with [github.com/module]```

**Build a module at a specific version**

```xcaddy build --with [github.com/module@v1.0.0]```

**Replace a module with a local copy** for development

```xcaddy build --with [github.com/module=../local/path]```

**Run Caddy with a module** for development and testing

```xcaddy run --config [Caddyfile]```

**Write the binary to a path**

```xcaddy build --output [/path/to/caddy] --with [github.com/module]```

# SYNOPSIS

**xcaddy** **build** [_caddy_version_] [_--output file_] [_--with module[@version][=replacement]_]... [_options_]

**xcaddy** **run** [_caddy_args_...]

**xcaddy** **version**

# PARAMETERS

**build**
> Build a custom Caddy binary. An optional Caddy version (e.g. v2.7.0 or a Git ref) can be given as the first argument.

**run**
> Build and run Caddy with the modules from the current Go module, passing any remaining arguments to the caddy command. Intended for plugin development.

**version**
> Print the xcaddy version.

**--with** _MODULE[@VERSION][=REPLACEMENT]_
> Add a Caddy module. Repeat to include several. An optional @version pins the module, and =replacement points it at a local path or fork.

**--replace** _OLD=NEW_
> Add a Go module replace directive without importing the module (for transitive dependencies).

**--output** _FILE_
> Path of the output binary. Defaults to ./caddy.

**--embed** _[ALIAS]:PATH_
> Embed a directory into the binary, accessible at the given alias.

**--pgo** _FILE_
> Profile-guided optimization profile to pass to the Go compiler.

# DESCRIPTION

**xcaddy** is a build tool for creating custom Caddy web server binaries with additional modules compiled in. It uses the Go toolchain to compile Caddy from source with the specified plugins included, producing a single binary with all desired functionality.

The build command compiles a specific Caddy version with one or more modules, while the run command temporarily builds and runs Caddy with the specified modules for development and testing without producing a permanent binary. Multiple modules can be included using repeated --with flags.

# CAVEATS

Requires a working Go toolchain. The Caddy core version can also be set with the **CADDY_VERSION** environment variable. Other variables tune the build: **XCADDY_RACE_DETECTOR=1**, **XCADDY_DEBUG=1**, **XCADDY_SKIP_CLEANUP=1**, and **XCADDY_GO_BUILD_FLAGS**.

# HISTORY

**xcaddy** was created by the **Caddy** project for building custom Caddy binaries with plugins.

# SEE ALSO

[caddy](/man/caddy)(1), [go](/man/go)(1)
