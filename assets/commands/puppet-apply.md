# TAGLINE

Apply Puppet manifests locally

# TLDR

**Apply a manifest**

```puppet apply [manifest.pp]```

**Dry run without making changes**

```puppet apply --noop [manifest.pp]```

**Apply with verbose output**

```puppet apply --verbose [manifest.pp]```

**Apply with full debug output**

```puppet apply --debug [manifest.pp]```

**Execute inline Puppet code**

```puppet apply -e "package { 'nginx': ensure => present }"```

**Apply with common testing options** (verbose, detailed-exitcodes, show_diff)

```puppet apply --test [manifest.pp]```

**Log output to a file**

```puppet apply --logdest [/var/log/puppet.log] [manifest.pp]```

# SYNOPSIS

**puppet apply** [_options_] _manifest_

# PARAMETERS

_MANIFEST_
> Puppet manifest file to compile and apply.

**--noop**
> Dry run mode; shows what changes would be made without applying them.

**-v**, **--verbose**
> Print extra information during execution.

**-d**, **--debug**
> Enable full debugging output.

**-e**, **--execute** _CODE_
> Execute a specific piece of Puppet code instead of a manifest file.

**--test**
> Enable common testing options: verbose, detailed-exitcodes, and show_diff.

**--detailed-exitcodes**
> Provide extra information via exit codes (0=no changes, 2=changes applied, 4=failures, 6=both).

**-l**, **--logdest** _DEST_
> Where to send log messages (syslog, eventlog, console, or a file path). Defaults to console.

**--catalog** _CATALOG_
> Apply a JSON catalog instead of compiling a manifest. Accepts a file path or stdin.

**-L**, **--loadclasses**
> Load any stored classes from the classfile.

**--modulepath** _PATH_
> Module search path for resolving classes and defined types.

# DESCRIPTION

**puppet apply** executes Puppet manifests directly on the local system without requiring a Puppet server. It compiles and applies the specified manifest file, making it ideal for standalone configuration management, testing manifests during development, and bootstrapping systems before they join a Puppet infrastructure.

The command accepts manifest files written in Puppet's declarative DSL or inline code via the **-e** flag. It supports **--noop** for dry-run previews of changes, **--verbose** and **--debug** for detailed execution output, and **--modulepath** for specifying where to find Puppet modules. Since it operates independently of a server, puppet apply is commonly used in container image builds, Vagrant provisioning, and one-off system configuration tasks.

# CONFIGURATION

**/etc/puppetlabs/puppet/puppet.conf**
> Configuration file controlling module paths, log level, environment settings, and other Puppet behavior for local apply runs.

**/etc/puppetlabs/code/modules/**
> Default module path searched when resolving classes and defined types referenced in manifests.

# CAVEATS

Requires Puppet installed. Operates without a Puppet server (masterless mode). Must be run as root to manage system resources.

# HISTORY

puppet apply provides **local Puppet** manifest execution.

# SEE ALSO

[puppet](/man/puppet)(1), [puppet-agent](/man/puppet-agent)(1)

