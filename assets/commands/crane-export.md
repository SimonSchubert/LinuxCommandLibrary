# TAGLINE

export flattened image filesystem

# TLDR

**Export image filesystem** to tarball

```crane export [image] [output.tar]```

**Export to stdout**

```crane export [image] - | tar -tvf -```

# SYNOPSIS

**crane** **export** [_options_] _image_ _output_

# DESCRIPTION

**crane export** exports the filesystem of a container image to a tarball. This flattens all layers into a single archive representing the final filesystem state.

Use **-** as output to write to stdout.

# SEE ALSO

[crane](/man/crane)(1), [crane-pull](/man/crane-pull)(1)
