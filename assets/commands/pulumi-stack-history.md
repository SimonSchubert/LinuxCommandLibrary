# TLDR

**Show stack deployment history**

```pulumi stack history```

**Show in JSON format**

```pulumi stack history --json```

**Show specific number of entries**

```pulumi stack history --page-size [n]```

**Show history for specific stack**

```pulumi stack history -s [stack]```

# SYNOPSIS

**pulumi** **stack** **history** [_options_]

# PARAMETERS

**-s**, **--stack** _name_
> Target stack.

**--json**
> Output as JSON.

**--page-size** _n_
> Number of entries to show.

**--page** _n_
> Page number.

# DESCRIPTION

**pulumi stack history** displays deployment history for a stack. Shows updates, previews, and operations with timestamps, results, and resource changes.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-stack](/man/pulumi-stack)(1)

