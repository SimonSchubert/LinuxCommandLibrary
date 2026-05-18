# TAGLINE

return low-level information on Docker objects

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

**docker inspect** returns low-level information on Docker objects including containers, images, volumes, and networks. Output is JSON by default, an array of result objects, one per argument.

The **--format** flag accepts a Go template for extracting specific fields, useful in shell scripts to capture values like IP addresses, mount points, or exit codes. The **{{json .Field}}** template emits raw JSON for a sub-object. The **--type** flag disambiguates when an image and container share the same name.

# CAVEATS

When multiple objects share a name, **--type** must be used to disambiguate. For containers, **--size** adds **SizeRw** and **SizeRootFs** fields but is expensive on large filesystems. The output schema differs between containers, images, networks, and volumes, so format templates are not portable across object types.

# SEE ALSO

[docker](/man/docker)(1), [docker-ps](/man/docker-ps)(1), [docker-images](/man/docker-images)(1)

