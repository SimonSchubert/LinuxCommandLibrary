# TLDR

**Get image configuration**

```crane config [image]```

**Get config as JSON**

```crane config [image] | jq .```

# SYNOPSIS

**crane** **config** [_options_] _image_

# DESCRIPTION

**crane config** retrieves the configuration blob for a container image. This includes environment variables, entrypoint, command, labels, and other image metadata.

Output is in JSON format.

# SEE ALSO

[crane](/man/crane)(1), [crane-manifest](/man/crane-manifest)(1)
