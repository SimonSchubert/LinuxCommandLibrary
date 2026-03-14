# TAGLINE

Alias for crane copy

# TLDR

**Copy an image** between registries

```crane cp [source_image] [destination_image]```

**Copy with platform selection**

```crane cp --platform linux/amd64 [source_image] [destination_image]```

# SYNOPSIS

**crane** **cp** [_options_] _source_ _destination_

# DESCRIPTION

**crane cp** is an alias for **crane copy**. It copies container images between registries without pulling to local storage, performing a server-side copy when possible.

# SEE ALSO

[crane](/man/crane)(1), [crane-copy](/man/crane-copy)(1), [crane-push](/man/crane-push)(1), [crane-pull](/man/crane-pull)(1)
