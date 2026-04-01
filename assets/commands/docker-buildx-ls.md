# TAGLINE

List Docker Buildx builder instances

# TLDR

**List all builder** instances

```docker buildx ls```

**List builders** without truncating output

```docker buildx ls --no-trunc```

**List builders** with a custom format

```docker buildx ls --format "{{.Name}}: {{.Status}}"```

**List builders** as JSON

```docker buildx ls --format json```

# SYNOPSIS

**docker buildx ls** [_options_]

# PARAMETERS

**--format** _format_
> Format output using a Go template or predefined format. Default: table.

**--no-trunc**
> Do not truncate output.

**--timeout** _duration_
> Override default timeout for loading builder status (default: 20s).

# DESCRIPTION

**docker buildx ls** lists all builder instances and their associated nodes. The output shows the builder name, driver, endpoint, status, BuildKit version, and supported platforms. The currently selected builder is marked with an asterisk (**\***).

Each builder may have multiple nodes representing different build environments or platforms. The default builder uses the Docker daemon's built-in build capabilities, while additional builders can use the **docker-container**, **kubernetes**, or **remote** drivers.

# CAVEATS

Builder status is loaded with a default 20-second timeout. Builders using remote drivers or Kubernetes may appear as inactive if the endpoint is unreachable within the timeout window.

# SEE ALSO

[docker-buildx-rm](/man/docker-buildx-rm)(1), [docker-buildx-du](/man/docker-buildx-du)(1), [docker-build](/man/docker-build)(1), [docker](/man/docker)(1)
