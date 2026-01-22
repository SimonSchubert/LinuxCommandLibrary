# TLDR

Print current **security context**

```runcon```

Specify **domain** to run command in

```runcon -t domain_t command```

Specify context **role**

```runcon -r role_r command```

Specify **full context**

```runcon user_u:role_r:domain_t command```

# SYNOPSIS

**runcon** [_options_] [_context_] _command_ [_args_...]

# PARAMETERS

**-t**, **--type** _type_
> Specify SELinux domain type

**-r**, **--role** _role_
> Specify SELinux role

# DESCRIPTION

**runcon** runs a program in a different SELinux security context. It allows executing commands with specific SELinux user, role, and type labels.

This is useful for testing SELinux policies and running programs in restricted contexts.

# CAVEATS

Requires SELinux to be enabled. Transitions must be allowed by SELinux policy. Not all context transitions are permitted.

# HISTORY

Part of **GNU Coreutils**, providing SELinux context manipulation for command execution.

# SEE ALSO

[secon](/man/secon)(1), [run_init](/man/run_init)(8), [chcon](/man/chcon)(1)
