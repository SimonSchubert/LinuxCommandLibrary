# TAGLINE

retrieve container image manifest

# TLDR

**Get image manifest**

```crane manifest [image:tag]```

**Get manifest for specific platform**

```crane manifest --platform [linux/amd64] [image:tag]```

**Pretty print manifest**

```crane manifest [image] | jq .```

# SYNOPSIS

**crane** **manifest** [_options_] _image_

# PARAMETERS

**--platform** _platform_
> Get manifest for specific platform.

# DESCRIPTION

**crane manifest** retrieves the manifest for a container image. The manifest describes the image's layers, configuration, and platform information.

Output is in JSON format (OCI or Docker manifest schema).

# SEE ALSO

[crane](/man/crane)(1), [crane-config](/man/crane-config)(1), [crane-digest](/man/crane-digest)(1)
