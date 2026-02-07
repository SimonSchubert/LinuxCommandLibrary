# TAGLINE

local in-memory container registry

# TLDR

**Start a local registry**

```crane registry serve```

**Serve on specific port**

```crane registry serve -address [localhost:5000]```

# SYNOPSIS

**crane** **registry** **serve** [_options_]

# PARAMETERS

**-address** _addr_
> Address to listen on.

# DESCRIPTION

**crane registry** starts a local, in-memory container registry. This is useful for testing and development without needing a full registry deployment.

# CAVEATS

Data is stored in memory and lost when the server stops. Not intended for production use.

# SEE ALSO

[crane](/man/crane)(1), [docker-registry](/man/docker-registry)(1)
