# TAGLINE

Ruby version manager for multiple installations

# TLDR

**Install Ruby version**

```rvm install [3.2.0]```

**List installed versions**

```rvm list```

**Use specific version**

```rvm use [3.2.0]```

**Set default version**

```rvm use [3.2.0] --default```

**Create gemset**

```rvm gemset create [myproject]```

**Use version with gemset**

```rvm use [3.2.0]@[myproject]```

**List available versions**

```rvm list known```

# SYNOPSIS

**rvm** [_options_] _command_ [_args_...]

# DESCRIPTION

**rvm** (Ruby Version Manager) manages multiple Ruby installations and gemsets. It handles Ruby installation, version switching, and isolated gem environments.

The tool modifies shell environment to switch between Ruby versions and provides gemsets for project-specific gem isolation.

# PARAMETERS

**install** _version_
> Install Ruby version.

**use** _version_
> Switch to version.

**list**
> List installed versions.

**list known**
> List available versions.

**gemset create** _name_
> Create gemset.

**gemset use** _name_
> Use gemset.

**gemset list**
> List gemsets.

**--default**
> Set as default.

**implode**
> Remove RVM completely.

# CAVEATS

Modifies shell initialization. Can conflict with system Ruby. Gemsets add complexity. Some prefer rbenv's simpler approach.

# HISTORY

**RVM** was created by **Wayne E. Seguin** in **2009** to simplify Ruby version management. It became the dominant Ruby version manager before rbenv offered a simpler alternative. Now maintained by **Michal Papis**.

# SEE ALSO

[ruby](/man/ruby)(1), [gem](/man/gem)(1), [rbenv](/man/rbenv)(1), [bundler](/man/bundler)(1)
