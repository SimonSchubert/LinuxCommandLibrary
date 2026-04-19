# TAGLINE

deletes a GitHub repository

# TLDR

**Delete a repository under your user**

```hub delete [name]```

**Delete an organization repository**

```hub delete [organization]/[name]```

**Skip the confirmation prompt**

```hub delete -y [user]/[name]```

# SYNOPSIS

**hub delete** [**-y**] [_organization_/]_name_

# PARAMETERS

[_ORGANIZATION_/]_NAME_
> The name of the repository on GitHub, optionally prefixed by an organization.

**-y**, **--yes**
> Skip the confirmation prompt and immediately delete the repository.

**--help**
> Display help information.

# DESCRIPTION

**hub delete** deletes a GitHub repository. The repository name is required and may be prefixed with an organization for repositories not owned by the current user.

The command requires interactive confirmation unless **-y** is provided. It permanently removes the repository including all issues, pull requests, and wiki data.

# CAVEATS

Destructive and irreversible. Requires authentication and the **delete_repo** scope on the GitHub token. Owner or admin permissions on the target repository are required.

# HISTORY

hub delete is part of **hub**, GitHub's original CLI for repository management.

# SEE ALSO

[hub](/man/hub)(1), [gh](/man/gh)(1), [hub-create](/man/hub-create)(1)
