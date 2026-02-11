# TAGLINE

Apply Puppet manifests locally

# TLDR

**Apply manifest**

```puppet apply [manifest.pp]```

**Dry run**

```puppet apply --noop [manifest.pp]```

**Verbose output**

```puppet apply --verbose [manifest.pp]```

**Debug mode**

```puppet apply --debug [manifest.pp]```

**Apply inline code**

```puppet apply -e "package { 'nginx': ensure => present }"```

# SYNOPSIS

**puppet apply** [_options_] _manifest_

# PARAMETERS

_MANIFEST_
> Puppet manifest file.

**--noop**
> Dry run mode.

**--verbose**
> Verbose output.

**--debug**
> Debug output.

**-e** _CODE_
> Inline code.

**--modulepath** _PATH_
> Module search path.

# DESCRIPTION

**puppet apply** executes Puppet manifests directly on the local system without requiring a Puppet server. It compiles and applies the specified manifest file, making it ideal for standalone configuration management, testing manifests during development, and bootstrapping systems before they join a Puppet infrastructure.

The command accepts manifest files written in Puppet's declarative DSL or inline code via the **-e** flag. It supports **--noop** for dry-run previews of changes, **--verbose** and **--debug** for detailed execution output, and **--modulepath** for specifying where to find Puppet modules. Since it operates independently of a server, puppet apply is commonly used in container image builds, Vagrant provisioning, and one-off system configuration tasks.

# CONFIGURATION

**/etc/puppetlabs/puppet/puppet.conf**
> Configuration file controlling module paths, log level, environment settings, and other Puppet behavior for local apply runs.

**/etc/puppetlabs/code/modules/**
> Default module path searched when resolving classes and defined types referenced in manifests.

# CAVEATS

Requires Puppet installed. Masterless operation.

# HISTORY

puppet apply provides **local Puppet** manifest execution.

# SEE ALSO

[puppet](/man/puppet)(1), [puppet-agent](/man/puppet-agent)(1)

