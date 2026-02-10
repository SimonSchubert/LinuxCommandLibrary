# TAGLINE

displays Perl documentation

# TLDR

**View module documentation**

```perldoc [Module::Name]```

**View function documentation**

```perldoc -f [function]```

**View FAQ**

```perldoc -q "[keyword]"```

**View built-in variable**

```perldoc perlvar```

**Search documentation**

```perldoc -f [pattern]```

# SYNOPSIS

**perldoc** [_options_] [_topic_]

# PARAMETERS

_TOPIC_
> Module, function, or document.

**-f** _FUNCTION_
> Look up function.

**-q** _QUERY_
> Search FAQ.

**-v** _VARIABLE_
> Look up variable.

**-m** _MODULE_
> Show module source.

**-t**
> Plain text output.

# DESCRIPTION

**perldoc** displays Perl documentation. Accesses POD format docs.

The tool browses Perl documentation. Core and module docs.

# CAVEATS

POD format. Module must be installed. Pager used for display.

# HISTORY

perldoc is part of **core Perl** for accessing documentation.

# SEE ALSO

[perl](/man/perl)(1), [pod2man](/man/pod2man)(1), [pod2html](/man/pod2html)(1)

