# TLDR

**Inspect a container**

```docker inspect [container]```

**Inspect an image**

```docker inspect [image]```

**Get specific field**

```docker inspect -f '{{.State.Status}}' [container]```

**Get IP address**

```docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' [container]```

**Output as JSON**

```docker inspect --format '{{json .Config}}' [container]```

# SYNOPSIS

**docker** **inspect** [_options_] _name|id_ [_name|id..._]

# PARAMETERS

**-f**, **--format** _string_
> Format output using Go template.

**-s**, **--size**
> Display total file sizes (containers only).

**--type** _string_
> Return JSON for specified type (container or image).

# DESCRIPTION

**docker inspect** returns low-level information on Docker objects including containers, images, volumes, and networks. Output is JSON by default.

# SEE ALSO

[docker-container-inspect](/man/docker-container-inspect)(1), [docker-image-inspect](/man/docker-image-inspect)(1)

