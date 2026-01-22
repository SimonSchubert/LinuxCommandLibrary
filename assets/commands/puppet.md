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

**puppet** is configuration management tool. Infrastructure as code.

The tool automates system configuration. Declarative resource management.

puppet manages systems.

# CAVEATS

Requires Puppet installation. Master-agent or standalone.

# HISTORY

Puppet was created by **Puppet Labs** for IT automation.

# SEE ALSO

[puppet-apply](/man/puppet-apply)(1), [ansible](/man/ansible)(1), [chef](/man/chef)(1)

