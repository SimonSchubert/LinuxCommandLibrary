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

**puppet apply** applies Puppet manifests locally. Standalone configuration.

The tool executes configuration code. No master required.

puppet apply configures locally.

# CAVEATS

Requires Puppet installed. Masterless operation.

# HISTORY

puppet apply provides **local Puppet** manifest execution.

# SEE ALSO

[puppet](/man/puppet)(1), [puppet-agent](/man/puppet-agent)(1)

