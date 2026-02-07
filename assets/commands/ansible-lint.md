# TAGLINE

Check playbooks for best practices

# TLDR

**Lint** a playbook

```ansible-lint [playbook.yml]```

Lint **all files** in directory

```ansible-lint```

Lint with **specific profile**

```ansible-lint -p [production] [playbook.yml]```

**List** all rules

```ansible-lint -L```

**Skip** specific rules

```ansible-lint --skip-list [yaml,risky-shell-pipe] [playbook.yml]```

Output in **JSON** format

```ansible-lint -f json [playbook.yml]```

# SYNOPSIS

**ansible-lint** [_-p profile_] [_-x skip_] [_-f format_] [_playbooks_]

# DESCRIPTION

**ansible-lint** checks Ansible playbooks, roles, and collections for practices and behaviors that could potentially be improved. It identifies deprecated syntax, security concerns, style issues, and best practice violations.

The tool helps maintain consistent, high-quality Ansible code and catch common mistakes before deployment.

# PARAMETERS

**-L**, **--list-rules**
> List all available rules

**-x** _rules_, **--skip-list** _rules_
> Skip specific rules

**-w** _rules_, **--warn-list** _rules_
> Treat rules as warnings only

**-p** _profile_, **--profile** _profile_
> Select rule profile (min, basic, moderate, safety, shared, production)

**-f** _format_, **--format** _format_
> Output format: rich, plain, json, codeclimate, sarif

**--fix**
> Attempt to fix linting errors

**-q**, **--quiet**
> Quieter output

**--strict**
> Treat warnings as errors

**-c** _file_, **--config-file** _file_
> Configuration file

# CONFIGURATION

**.ansible-lint**
> Project-level configuration file for rule selection, skip lists, and profiles.

**~/.config/ansible-lint/config.yml**
> User-level default configuration.

# CAVEATS

Not all rules apply to all use cases; configure skip-list appropriately. The --fix option may not handle all issues. False positives may occur with complex variable usage.

# HISTORY

**ansible-lint** was created to help enforce best practices in Ansible projects. It became an official Ansible project and has been actively maintained with evolving rule sets.

# SEE ALSO

[ansible](/man/ansible)(1), [ansible-playbook](/man/ansible-playbook)(1), [yamllint](/man/yamllint)(1)
