# TAGLINE

Validate Vagrantfile syntax

# TLDR

**Validate the Vagrantfile in the current directory**

```vagrant validate```

**Validate while ignoring provider-specific configuration**

```vagrant validate -p```

# SYNOPSIS

**vagrant** **validate** [_options_]

# PARAMETERS

**-p**, **--ignore-provider**
> Ignore provider-specific configuration options during validation.

# DESCRIPTION

**vagrant validate** checks the Vagrantfile for syntax errors. It validates the configuration without creating or modifying machines, making it useful for CI/CD pipelines and pre-commit checks. If valid, it prints "Vagrantfile validated successfully."

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-init](/man/vagrant-init)(1)

