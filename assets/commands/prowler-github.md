# TAGLINE

GitHub organization security assessment

# TLDR

**Run GitHub security assessment**

```prowler github```

**Check specific organization**

```prowler github --organization [org-name]```

**Run specific checks**

```prowler github --checks [repository_secret_scanning]```

# SYNOPSIS

**prowler github** [_options_]

# PARAMETERS

**--organization** _name_
> GitHub organization.

**--repository** _name_
> Specific repository.

**--checks** _checks_
> Specific checks to run.

**-M**, **--output-modes** _format_
> Output format.

**-o**, **--output-directory** _dir_
> Output directory.

# DESCRIPTION

**prowler github** performs security assessment of GitHub organizations and repositories. Checks for security misconfigurations, missing protections, and best practices compliance.

# INSTALL

```brew: brew install prowler```

```nix: nix profile install nixpkgs#prowler```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[prowler](/man/prowler)(1), [gh](/man/gh)(1)

