# TAGLINE

starts a built-in HTTP server for the repository

# TLDR

**Start HTTP server**

```hg serve```

**Specify port**

```hg serve -p [8080]```

**Specify address**

```hg serve -a [0.0.0.0]```

**Allow push**

```hg serve --config web.push_ssl=false --config web.allow_push=*```

**Run in background**

```hg serve -d```

# SYNOPSIS

**hg serve** [_options_]

# PARAMETERS

**-p**, **--port** _PORT_
> Listen port (default 8000).

**-a**, **--address** _ADDR_
> Listen address.

**-d**, **--daemon**
> Run in background.

**--pid-file** _FILE_
> PID file location.

**-n**, **--name** _NAME_
> Repository name.

**--web-conf** _FILE_
> Web config file.

**--help**
> Display help information.

# DESCRIPTION

**hg serve** starts a built-in HTTP server for the repository. It provides read access via web browser and clone/pull access for other clients.

The server is convenient for quick sharing but not for production. It supports multiple repositories with configuration.

# CAVEATS

Not production-ready. Push disabled by default. Single-threaded.

# HISTORY

Serve is a **Mercurial** built-in feature for quick repository sharing since version 1.0.

# SEE ALSO

[hg](/man/hg)(1), [hg-clone](/man/hg-clone)(1), [hg-pull](/man/hg-pull)(1)
