# TLDR

**Run filter on I/O**

```auth required pam_filter.so run1 /path/to/filter```

**Multiple filters**

```session required pam_filter.so run1 /path/filter1 run2 /path/filter2```

# SYNOPSIS

**pam_filter.so** [_options_] _filter_

# PARAMETERS

**run1** _FILTER_
> Run filter program on stdio.

**run2** _FILTER_
> Run additional filter.

**new_term**
> Allocate new terminal.

# DESCRIPTION

**pam_filter** runs filter programs on terminal I/O. Transforms input/output.

The module filters user interaction. Experimental PAM feature.

pam_filter processes I/O.

# CAVEATS

Experimental module. Filter must be executable. Security sensitive.

# HISTORY

pam_filter provides **I/O filtering** capability for PAM sessions.

# SEE ALSO

[pam](/man/pam)(8)

