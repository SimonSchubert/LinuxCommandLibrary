# TLDR

**Validate Vagrantfile**

```vagrant validate```

**Validate with specific file**

```vagrant validate -p [path]```

# SYNOPSIS

**vagrant** **validate** [_options_]

# PARAMETERS

**-p**, **--path** _path_
> Path to Vagrantfile.

**--ignore-provider**
> Skip provider validation.

# DESCRIPTION

**vagrant validate** checks Vagrantfile for syntax errors. Validates configuration without creating machines. Useful for CI/CD pipelines and pre-commit checks.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-init](/man/vagrant-init)(1)

