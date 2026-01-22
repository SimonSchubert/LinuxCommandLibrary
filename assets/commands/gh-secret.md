# TLDR

**List repository secrets**

```gh secret list```

**Set a secret**

```gh secret set [SECRET_NAME]```

**Set secret from file**

```gh secret set [SECRET_NAME] < [secret.txt]```

**Delete a secret**

```gh secret delete [SECRET_NAME]```

**List org secrets**

```gh secret list --org [orgname]```

# SYNOPSIS

**gh secret** _command_ [_options_]

# PARAMETERS

**list**
> List secrets.

**set** _NAME_
> Create or update a secret.

**delete** _NAME_
> Delete a secret.

**--org** _ORGNAME_
> Target organization secrets.

**--env** _ENVIRONMENT_
> Target environment secrets.

**--visibility** _SCOPE_
> Secret visibility (all, private, selected).

**--repos** _REPOS_
> Repositories for selected visibility.

**--help**
> Display help information.

# DESCRIPTION

**gh secret** manages encrypted secrets for GitHub Actions workflows. Secrets are encrypted and only exposed to workflows at runtime, providing secure credential storage.

The command supports repository, organization, and environment-level secrets. Organization secrets can be scoped to specific repositories. Values are encrypted before transmission and storage.

gh secret enables secure CI/CD configuration from the command line.

# CAVEATS

Secrets are write-only; values cannot be retrieved. Admin access required for org secrets. Secret names are case-insensitive.

# HISTORY

gh secret was added to the **GitHub CLI** to support GitHub Actions secret management, critical for secure CI/CD workflows.

# SEE ALSO

[gh](/man/gh)(1), [gh-secret-set](/man/gh-secret-set)(1), [gh-run](/man/gh-run)(1)
