# TLDR

**Set secret interactively**

```gh secret set [SECRET_NAME]```

**Set secret from value**

```echo "[value]" | gh secret set [SECRET_NAME]```

**Set from file**

```gh secret set [SECRET_NAME] < [secret.txt]```

**Set environment secret**

```gh secret set [SECRET_NAME] --env [production]```

**Set with body flag**

```gh secret set [SECRET_NAME] --body "[value]"```

# SYNOPSIS

**gh secret set** _name_ [_options_]

# PARAMETERS

_NAME_
> Secret name.

**--body** _VALUE_
> Secret value (avoid for sensitive data).

**--env** _ENVIRONMENT_
> Target deployment environment.

**--org** _ORGNAME_
> Set organization secret.

**--repos** _REPOS_
> Limit to specific repositories.

**--visibility** _SCOPE_
> Secret visibility scope.

**--help**
> Display help information.

# DESCRIPTION

**gh secret set** creates or updates encrypted secrets for GitHub Actions. When run interactively, it prompts for the secret value securely without echoing to the terminal.

The command encrypts secrets using repository or organization public keys before transmission. Secrets can be scoped to specific environments for deployment workflows or to selected repositories in organizations.

Pipe or redirect input to avoid exposing secrets in shell history.

# CAVEATS

Avoid --body for sensitive values (visible in history). Secrets encrypted in transit. Organization secrets need admin permissions.

# HISTORY

gh secret set is part of the **GitHub CLI's** secret management commands, providing secure secret configuration for CI/CD workflows.

# SEE ALSO

[gh-secret](/man/gh-secret)(1), [gh-run](/man/gh-run)(1)
