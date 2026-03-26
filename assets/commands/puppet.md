# TAGLINE

Declarative configuration management tool

# TLDR

**Apply manifest locally**

```puppet apply [manifest.pp]```

**Check manifest syntax**

```puppet parser validate [manifest.pp]```

**Run puppet agent in test mode**

```puppet agent --test```

**Run puppet agent in dry-run mode**

```puppet agent --test --noop```

**List available modules**

```puppet module list```

**Install a module from Puppet Forge**

```puppet module install [author-module]```

**Inspect a resource on the system**

```puppet resource [user] [root]```

**View or set a configuration value**

```puppet config print [server]```

# SYNOPSIS

**puppet** _subcommand_ [_options_]

# PARAMETERS

**apply**
> Compile and apply a Puppet manifest locally.

**agent**
> Request a catalog from a Puppet server and enforce it.

**parser**
> Validate Puppet manifest syntax.

**module**
> Install, list, upgrade, and manage Puppet modules.

**resource**
> Inspect and manipulate resources on the system.

**config**
> View and change Puppet configuration settings.

**ssl**
> Manage SSL keys and certificates.

**help**
> Display help for subcommands.

**--test**
> Run the agent once in the foreground with verbose output.

**--noop**
> Simulate changes without applying them (dry run).

**--verbose**
> Enable verbose logging.

**--debug**
> Enable full debug logging.

**--environment** _env_
> Select a specific Puppet environment.

# DESCRIPTION

**puppet** is a configuration management tool that automates the provisioning and management of infrastructure using a declarative language. Administrators describe the desired state of systems through manifests written in Puppet's DSL, and the tool ensures machines converge to that state by installing packages, managing files, configuring services, and handling users.

Puppet operates in two modes: a client-server architecture where agents pull catalogs from a Puppet server, and a standalone mode using **puppet apply** for local manifest execution. The resource abstraction layer handles platform differences automatically, so the same manifest can manage packages across Debian, Red Hat, and other distributions without modification.

The ecosystem includes a module system for sharing reusable configuration code through Puppet Forge, Facter for gathering system facts, and Hiera for separating data from code. Puppet supports environments for testing changes before production rollout and provides detailed reporting on configuration drift and enforcement actions.

# CONFIGURATION

**/etc/puppetlabs/puppet/puppet.conf**
> Main configuration file controlling server address, environment, run interval, certificate settings, and module paths.

**/etc/puppetlabs/code/environments/production/manifests/**
> Default location for site manifests that define node configurations in the production environment.

**/etc/puppetlabs/code/environments/production/modules/**
> Module directory containing reusable Puppet modules with classes, defined types, and templates.

**FACTERLIB**
> Environment variable specifying additional directories to search for custom Facter facts.

# CAVEATS

Requires Puppet installation. Master-agent or standalone. The **--test** flag combines --onetime, --verbose, --no-daemonize, and a non-zero exit code on failures.

# HISTORY

Puppet was created by **Puppet Labs** (now Perforce) for IT automation.

# SEE ALSO

[puppet-apply](/man/puppet-apply)(1), [puppet-agent](/man/puppet-agent)(1), [ansible](/man/ansible)(1), [chef](/man/chef)(1)
