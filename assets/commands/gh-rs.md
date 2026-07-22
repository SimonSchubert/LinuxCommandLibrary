# TAGLINE

View GitHub repository rulesets (alias for gh ruleset)

# TLDR

**List rulesets** for the current repository

```gh rs list```

**List rulesets** for a different repository, including inherited ones

```gh rs list --repo [owner/repo] --parents```

**List organization-wide** rulesets

```gh rs list --org [org-name]```

**View a specific ruleset** by ID

```gh rs view [43]```

**Open a ruleset** in the web browser

```gh rs view [43] --web```

**Check rules** that apply to the current branch

```gh rs check```

**Check rules** that apply to the default branch of another repository

```gh rs check --default --repo [owner/repo]```

# SYNOPSIS

**gh rs** _command_ [_flags_]

# PARAMETERS

**list**
> List rulesets for a repository or organization.

**view** [_ruleset-id_]
> View information about a ruleset. Prompts interactively if no ID is given.

**check** [_branch_]
> View rules that would apply to a given branch. Uses the current branch if none is given.

**-R**, **--repo** _[HOST/]OWNER/REPO_
> Select another repository instead of the current one.

# LIST FLAGS

**-L**, **--limit** _int_
> Maximum number of rulesets to list (default 30).

**-o**, **--org** _string_
> List organization-wide rulesets. Requires the **admin:org** token scope.

**-p**, **--parents**
> Include rulesets configured at higher levels that also apply (default true).

**-w**, **--web**
> Open the list of rulesets in the web browser.

# VIEW/CHECK FLAGS

**-o**, **--org** _string_
> Organization name, when the ID given to **view** is an organization-level ruleset.

**--default**
> With **check**, view rules on the repository's default branch.

**-w**, **--web**
> Open the ruleset or branch rules page in the web browser.

# DESCRIPTION

**gh rs** is the built-in alias for **gh ruleset**, part of the official **GitHub CLI**. Rulesets let repository and organization admins enforce rules (required reviews, status checks, branch naming, force-push restrictions, etc.) on branches and tags. This command group is read-only: it lists and inspects rulesets and shows which rules apply to a given branch, but does not create or edit rulesets.

# CAVEATS

Read-only: rulesets themselves are created and edited on GitHub.com or via the API, not through **gh ruleset**. Listing organization-wide rulesets with **--org** requires a token with the **admin:org** scope, obtainable via **gh auth refresh -s admin:org**.

# INSTALL

```apt: sudo apt install gh```

```dnf: sudo dnf install gh```

```pacman: sudo pacman -S github-cli```

```apk: sudo apk add github-cli```

```zypper: sudo zypper install gh```

```brew: brew install gh```

```nix: nix profile install nixpkgs#gh```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gh](/man/gh)(1), [gh-repo](/man/gh-repo)(1)

# RESOURCES

```[Manual](https://cli.github.com/manual/gh_ruleset)```

```[Source code](https://github.com/cli/cli)```

<!-- verified: 2026-07-17 -->
