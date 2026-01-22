# TLDR

**Show current context**

```ic```

**Switch context**

```ic [context-name]```

**List contexts**

```ic -l```

**Create context**

```ic -c [name]```

# SYNOPSIS

**ic** [_options_] [_context_]

# PARAMETERS

_CONTEXT_
> Context name to switch to.

**-l**, **--list**
> List contexts.

**-c**, **--create** _NAME_
> Create new context.

**-d**, **--delete** _NAME_
> Delete context.

**--help**
> Display help information.

# DESCRIPTION

**ic** is a context switcher for various tools. Different implementations exist for kubectl contexts, AWS profiles, and other multi-environment tools.

The tool simplifies switching between configurations. It provides quick access to different environments or clusters.

ic switches tool contexts.

# CAVEATS

Multiple tools use this name. Check which version installed. Context-specific behavior.

# HISTORY

ic is commonly used as a shorthand for interactive context switching in various CLI tools.

# SEE ALSO

[kubectx](/man/kubectx)(1), [aws-vault](/man/aws-vault)(1)
