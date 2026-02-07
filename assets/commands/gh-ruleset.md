# TAGLINE

Manage GitHub repository rulesets and policies

# TLDR

**List rulesets**

```gh ruleset list```

**View a ruleset**

```gh ruleset view [ruleset_id]```

**Check branch rules**

```gh ruleset check [branch]```

# SYNOPSIS

**gh** **ruleset** _command_ [_options_]

# SUBCOMMANDS

**list**
> List rulesets.

**view**
> View a ruleset.

**check**
> Check rules for branch.

# PARAMETERS

**-R**, **--repo** _owner/repo_
> Repository.

**--org** _name_
> Organization.

# DESCRIPTION

**gh ruleset** manages GitHub repository rulesets, which define branch protection rules, required status checks, and merge requirements. Rulesets provide more flexible and powerful protections than traditional branch protection rules.

Rulesets can target multiple branches using patterns, apply to specific repositories in an organization, or enforce organization-wide policies. The check command evaluates which rules apply to a specific branch, useful for understanding why certain operations are blocked.

# SEE ALSO

[gh](/man/gh)(1), [gh-repo](/man/gh-repo)(1)
