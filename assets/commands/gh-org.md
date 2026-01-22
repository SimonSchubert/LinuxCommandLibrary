# TLDR

**List organizations**

```gh org list```

**View organization**

```gh org view [orgname]```

**List organization members**

```gh api orgs/[orgname]/members```

# SYNOPSIS

**gh org** _command_ [_options_]

# PARAMETERS

**list**
> List organizations you belong to.

**view** _ORGNAME_
> View organization details.

**--help**
> Display help information.

# DESCRIPTION

**gh org** manages GitHub organization information from the command line. It provides access to organization membership, details, and settings for organizations you belong to.

The command enables viewing organization information without visiting github.com. For more complex organization management like team operations and member management, the gh api command provides full API access.

gh org simplifies organization navigation in terminal workflows.

# CAVEATS

Available operations depend on your role in the organization. Some features require admin permissions. Full org management may need gh api.

# HISTORY

gh org was added to the **GitHub CLI** to provide basic organization commands, complementing the repository and user management features.

# SEE ALSO

[gh](/man/gh)(1), [gh-repo](/man/gh-repo)(1)
