# TAGLINE

Build custom Caddy with modules

# TLDR

**Build Caddy with modules**

```xcaddy build --with [github.com/module]```

**Build specific version**

```xcaddy build [v2.7.0] --with [github.com/module]```

**Run with module**

```xcaddy run --with [github.com/module]```

**Multiple modules**

```xcaddy build --with [mod1] --with [mod2]```

# SYNOPSIS

**xcaddy** [_build|run_] [_version_] [_--with module_] [_options_]

# PARAMETERS

**build**
> Build Caddy.

**run**
> Run Caddy.

**--with** _MODULE_
> Include module.

**--output** _FILE_
> Output path.

**--replace** _REPL_
> Go replace directive.

# DESCRIPTION

**xcaddy** is a build tool for creating custom Caddy web server binaries with additional modules compiled in. It uses the Go toolchain to compile Caddy from source with the specified plugins included, producing a single binary with all desired functionality.

The build command compiles a specific Caddy version with one or more modules, while the run command temporarily builds and runs Caddy with the specified modules for development and testing without producing a permanent binary. Multiple modules can be included using repeated --with flags.

# CAVEATS

Go required. Build time varies. For custom Caddy.

# HISTORY

**xcaddy** was created by the **Caddy** project for building custom Caddy binaries with plugins.

# SEE ALSO

[caddy](/man/caddy)(1), [go](/man/go)(1)
