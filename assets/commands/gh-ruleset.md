# TAGLINE

Manage GitHub repository and organization rulesets

# TLDR

**List rulesets in the current repository**

```gh ruleset list```

**List rulesets including those inherited from parents**

```gh ruleset list --parents```

**View a specific ruleset** by ID

```gh ruleset view [ruleset_id]```

**View a ruleset in the web browser**

```gh ruleset view [ruleset_id] --web```

**Check which rules apply to a given branch**

```gh ruleset check [branch]```

**List organization-level rulesets**

```gh ruleset list --org [organization]```

# SYNOPSIS

**gh** **ruleset** _command_ [_flags_]

# SUBCOMMANDS

**check** [_branch_]
> Show rules that apply to a given branch in the current repository.

**list**
> List rulesets for a repository or organization.

**view** [_ruleset-id_]
> View information about a ruleset. Without an ID, runs interactively.

# PARAMETERS

**-R**, **--repo** _\[HOST/\]OWNER/REPO_
> Select another repository using the \[HOST/\]OWNER/REPO format.

**-o**, **--org** _organization_
> Operate on an organization's rulesets instead of a repository's.

**-p**, **--parents**
> Include inherited rulesets from parent organizations (list/view).

**-L**, **--limit** _int_
> Maximum number of rulesets to list (default 30).

**-w**, **--web**
> Open the ruleset in the browser (view).

**-t**, **--default-branch**
> Check rules for the repository's default branch (check).

# DESCRIPTION

**gh ruleset** manages GitHub repository and organization rulesets, which define branch and tag protection rules, required status checks, required reviews, deployment protections, and merge requirements. Rulesets are a more expressive replacement for classic branch protection rules.

A ruleset can target multiple branches or tags using fnmatch patterns, apply across all repositories in an organization, and define bypass actors. The **check** command evaluates which rules currently apply to a specific branch, useful for understanding why a push or merge was rejected.

Creating and editing rulesets is not supported directly from the CLI; use the GitHub web UI or the REST API via **gh api**.

# CAVEATS

Requires authentication via **gh auth login**. Viewing organization rulesets requires organization permissions. Rules defined at the enterprise or organization level may not appear unless **--parents** is used.

# SEE ALSO

[gh](/man/gh)(1), [gh-api](/man/gh-api)(1), [gh-repo](/man/gh-repo)(1), [gh-auth](/man/gh-auth)(1)
