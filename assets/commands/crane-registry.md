# TAGLINE

local in-memory container registry

# TLDR

**Start a local registry**

```crane registry serve```

**Serve on a specific address and port**

```crane registry serve --address [localhost:5000]```

**Serve with on-disk blob storage**

```crane registry serve --disk [path/to/storage]```

# SYNOPSIS

**crane** **registry** **serve** [_options_]

# PARAMETERS

**--address** _addr_
> Address to listen on (default: port chosen automatically from $PORT or :0).

**--disk** _dir_
> Store blobs on disk in the specified directory instead of in memory.

**-h**, **--help**
> Show help for the command.

# DESCRIPTION

**crane registry** starts a local container registry for testing and development without needing a full registry deployment. By default, data is stored in memory. Use **--disk** to persist blobs to a directory.

# CAVEATS

In-memory storage is lost when the server stops. The **--disk** option provides persistence but this is still not intended for production use. No authentication or TLS is provided.

# SEE ALSO

[crane](/man/crane)(1), [crane-push](/man/crane-push)(1), [crane-pull](/man/crane-pull)(1)
