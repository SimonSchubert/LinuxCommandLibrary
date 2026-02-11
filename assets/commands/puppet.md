# TAGLINE

Declarative configuration management tool

# TLDR

**Apply manifest locally**

```puppet apply [manifest.pp]```

**Check manifest syntax**

```puppet parser validate [manifest.pp]```

**Run puppet agent**

```puppet agent --test```

**List available modules**

```puppet module list```

**Generate module skeleton**

```puppet module generate [name]```

# SYNOPSIS

**puppet** _subcommand_ [_options_]

# PARAMETERS

**apply**
> Apply manifest.

**agent**
> Run puppet agent.

**parser**
> Parse manifests.

**module**
> Manage modules.

**resource**
> Query resources.

**--test**
> Test run.

**--noop**
> Dry run.

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

Requires Puppet installation. Master-agent or standalone.

# HISTORY

Puppet was created by **Puppet Labs** for IT automation.

# SEE ALSO

[puppet-apply](/man/puppet-apply)(1), [ansible](/man/ansible)(1), [chef](/man/chef)(1)

