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

**xcaddy** builds custom Caddy. It compiles with modules.

Plugin compilation. Add modules.

Version selection. Specific Caddy.

Development mode. Run without building.

Go-based building. Uses Go toolchain.

# CAVEATS

Go required. Build time varies. For custom Caddy.

# HISTORY

**xcaddy** was created by the **Caddy** project for building custom Caddy binaries with plugins.

# SEE ALSO

[caddy](/man/caddy)(1), [go](/man/go)(1)
