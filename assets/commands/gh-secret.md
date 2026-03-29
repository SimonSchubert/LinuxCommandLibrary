# TAGLINE

Manage GitHub secrets

# TLDR

**List repository secrets**

```gh secret list```

**Set a secret**

```gh secret set [SECRET_NAME]```

**Set secret from a value**

```gh secret set [SECRET_NAME] --body "[secret_value]"```

**Set secret from file**

```gh secret set [SECRET_NAME] < [secret.txt]```

**Set secrets from a dotenv file**

```gh secret set --env-file [.env]```

**Delete a secret**

```gh secret delete [SECRET_NAME]```

**List org secrets**

```gh secret list --org [orgname]```

**Set a secret for a specific application**

```gh secret set [SECRET_NAME] --app [actions|codespaces|dependabot]```

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

**-a**, **--app** _APP_
> Target application: actions, codespaces, or dependabot.

**-b**, **--body** _STRING_
> Provide the secret value directly (reads from stdin if omitted).

**-f**, **--env-file** _FILE_
> Import secret names and values from a dotenv-formatted file.

**--visibility** _SCOPE_
> Secret visibility for org secrets (all, private, selected). Default: private.

**--repos** _REPOS_
> Repositories for selected visibility.

**-u**, **--user**
> Set or list a secret for your user (Codespaces).

**-R**, **--repo** _[HOST/]OWNER/REPO_
> Target a specific repository.

**--no-store**
> Output the encrypted, base64-encoded value without storing on GitHub.

**--help**
> Display help information.

# DESCRIPTION

**gh secret** manages encrypted secrets for GitHub Actions, Codespaces, and Dependabot. Secrets are encrypted and only exposed to workflows at runtime, providing secure credential storage for CI/CD pipelines.

The command supports repository, organization, environment, and user-level secrets. Organization secrets can be scoped to specific repositories via **--visibility** and **--repos**. Values are encrypted before transmission and storage. The **--app** flag selects which application the secret is for (actions, codespaces, or dependabot).

# CAVEATS

Secrets are write-only; values cannot be retrieved. Admin access required for org secrets. Secret names are case-insensitive.

# HISTORY

gh secret was added to the **GitHub CLI** to support GitHub Actions secret management, critical for secure CI/CD workflows.

# SEE ALSO

[gh](/man/gh)(1), [gh-secret-set](/man/gh-secret-set)(1), [gh-variable](/man/gh-variable)(1), [gh-run](/man/gh-run)(1)
