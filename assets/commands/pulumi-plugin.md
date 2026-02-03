# TLDR

**List installed plugins**

```pulumi plugin ls```

**Install plugin**

```pulumi plugin install resource [name] [version]```

**Remove plugin**

```pulumi plugin rm resource [name]```

**Remove all unused plugins**

```pulumi plugin rm --all```

# SYNOPSIS

**pulumi** **plugin** _command_ [_options_]

# PARAMETERS

**ls**
> List installed plugins.

**install** _kind_ _name_ _version_
> Install plugin.

**rm** _kind_ _name_
> Remove plugin.

**--all**
> Remove all plugins.

**--yes**
> Skip confirmation.

# DESCRIPTION

**pulumi plugin** manages Pulumi plugins. Plugins provide resource providers for cloud platforms. Install, update, and remove plugins for different cloud providers and services.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-install](/man/pulumi-install)(1)

