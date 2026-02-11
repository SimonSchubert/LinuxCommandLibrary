# TAGLINE

Remove stored Pulumi backend credentials

# TLDR

**Logout from current backend**

```pulumi logout```

**Logout from specific backend**

```pulumi logout [url]```

**Logout from all backends**

```pulumi logout --all```

# SYNOPSIS

**pulumi** **logout** [_options_] [_url_]

# PARAMETERS

**--all**
> Logout from all backends.

**--local**
> Logout from local backend.

# DESCRIPTION

**pulumi logout** removes stored credentials for a Pulumi backend. Does not affect deployed resources or state, only local authentication.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-login](/man/pulumi-login)(1)

