# TAGLINE

Check playbooks for best practices

# TLDR

**Lint** a playbook

```ansible-lint [playbook.yml]```

Lint **all files** in directory

```ansible-lint```

Lint with **specific profile**

```ansible-lint --profile [production] [playbook.yml]```

**List** all rules

```ansible-lint -L```

**Skip** specific rules

```ansible-lint --skip-list [yaml,risky-shell-pipe] [playbook.yml]```

Output in **JSON** format

```ansible-lint -f json [playbook.yml]```

# SYNOPSIS

**ansible-lint** [_--profile profile_] [_-x skip_] [_-f format_] [_files_]

# DESCRIPTION

**ansible-lint** checks Ansible playbooks, roles, and collections for practices and behaviors that could potentially be improved. It identifies deprecated syntax, security concerns, style issues, and best practice violations.

The tool helps maintain consistent, high-quality Ansible code and catch common mistakes before deployment.

# PARAMETERS

**-L**, **--list-rules**
> List all available rules

**-T**, **--list-tags**
> List all the tags and the rules they cover

**-x** _rules_, **--skip-list** _rules_
> Skip specific rules or tags

**-w** _rules_, **--warn-list** _rules_
> Treat the listed rules or tags as warnings only

**--profile** _profile_
> Select a rule profile: min, basic, moderate, safety, shared, or production

**-f** _format_, **--format** _format_
> Output format: brief, full, md, json (alias of codeclimate), codeclimate, quiet, pep8, sarif

**--fix** [_rules_]
> Auto-fix violations, optionally limited to specific rules or tags

**-q**, **--quiet**
> Quieter output (may be given twice)

**--strict**
> Return a non-zero exit code on warnings

**--offline**
> Disable installation of requirements and dependencies

**-c** _file_, **--config-file** _file_
> Use the specified configuration file

# CONFIGURATION

**.ansible-lint**
> Project-level configuration file for rule selection, skip lists, and profiles.

**~/.config/ansible-lint/config.yml**
> User-level default configuration.

# CAVEATS

Not all rules apply to all use cases; configure skip-list appropriately. The --fix option may not handle all issues. False positives may occur with complex variable usage.

# HISTORY

**ansible-lint** was created to help enforce best practices in Ansible projects. It became an official Ansible project and has been actively maintained with evolving rule sets.

# INSTALL

```pacman: sudo pacman -S ansible-lint```

```apk: sudo apk add ansible-lint```

```zypper: sudo zypper install ansible-lint```

```brew: brew install ansible-lint```

```nix: nix profile install nixpkgs#ansible-lint```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[ansible](/man/ansible)(1), [ansible-playbook](/man/ansible-playbook)(1), [yamllint](/man/yamllint)(1)

# RESOURCES

```[Source code](https://github.com/ansible/ansible-lint)```

```[Documentation](https://docs.ansible.com/projects/lint/)```

<!-- verified: 2026-06-11 -->
