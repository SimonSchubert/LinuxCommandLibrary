# TLDR

**Analyze and slim an image**

```docker-slim build [image]```

**Profile an image**

```docker-slim profile [image]```

**Lint a Dockerfile**

```docker-slim lint [Dockerfile]```

**Generate Dockerfile from image**

```docker-slim xray [image]```

**Slim with HTTP probes**

```docker-slim build --http-probe [image]```

**Slim keeping shell access**

```docker-slim build --include-shell [image]```

# SYNOPSIS

**docker-slim** _command_ [_options_] [_image_]

# SUBCOMMANDS

**build**
> Analyze and create optimized image.

**profile**
> Analyze image without building.

**xray**
> Inspect image internals.

**lint**
> Lint Dockerfile.

**version**
> Show version info.

# PARAMETERS

**--http-probe**
> Enable HTTP probing.

**--include-shell**
> Include shell in slimmed image.

**--target** _string_
> Target output image name.

**--expose** _port_
> Expose additional ports.

# DESCRIPTION

**docker-slim** (also known as SlimToolkit) analyzes and optimizes Docker images, reducing size significantly while maintaining functionality. Uses static and dynamic analysis.

# SEE ALSO

[docker-build](/man/docker-build)(1), [docker-images](/man/docker-images)(1)

