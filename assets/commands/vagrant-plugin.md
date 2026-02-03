# TLDR

**List plugins**

```vagrant plugin list```

**Install plugin**

```vagrant plugin install [name]```

**Uninstall plugin**

```vagrant plugin uninstall [name]```

**Update plugins**

```vagrant plugin update```

**Repair plugins**

```vagrant plugin repair```

# SYNOPSIS

**vagrant** **plugin** _command_ [_options_]

# PARAMETERS

**list**
> List installed plugins.

**install** _name_
> Install plugin.

**uninstall** _name_
> Remove plugin.

**update** _name_
> Update plugin.

**repair**
> Fix plugin issues.

**expunge**
> Remove all plugins.

**--plugin-version** _ver_
> Specific version.

# DESCRIPTION

**vagrant plugin** manages Vagrant plugins. Plugins extend Vagrant with providers, provisioners, and commands. Install from RubyGems or local files.

# SEE ALSO

[vagrant](/man/vagrant)(1)

