# TAGLINE

deploy Cradle PHP applications to servers

# TLDR

**Deploy to production** server

```cradle deploy production```

**Deploy to staging** environment

```cradle deploy staging```

**Deploy with custom configuration**

```cradle deploy --config [deploy.yml]```

**Preview changes** without deploying

```cradle deploy --dry-run production```

**Deploy specific branch**

```cradle deploy production --branch [release]```

**Skip database migrations** during deploy

```cradle deploy --no-migrate production```

# SYNOPSIS

**cradle deploy** [_options_] _environment_

# PARAMETERS

_ENVIRONMENT_
> Target deployment environment (production, staging, development).

**--config** _FILE_
> Use custom deployment configuration file.

**--dry-run**
> Preview deployment without making changes.

**--branch** _BRANCH_
> Deploy a specific Git branch.

**--no-migrate**
> Skip database migrations during deployment.

**--force**
> Force deployment even with uncommitted changes.

**--verbose**
> Show detailed deployment output.

**--help**
> Display help information.

# DESCRIPTION

**cradle deploy** is a deployment command for the Cradle PHP framework. It automates the process of deploying applications to remote servers, handling tasks like code synchronization, dependency installation, database migrations, and cache clearing.

The command reads deployment configuration specifying server details, deployment paths, and environment-specific settings. It supports multiple environments, allowing different configurations for production, staging, and development servers.

Deployment typically involves pushing code changes, running composer install, executing migrations, and clearing caches. The dry-run option lets you preview what changes will be made before committing to the deployment.

# CAVEATS

Requires SSH access to target servers. Deployment configuration must specify correct paths and credentials. Use **--dry-run** first to verify deployment steps. Database migrations should be tested before production deployment.

# HISTORY

cradle deploy was created as part of the Cradle framework's CLI tooling to simplify the deployment workflow. It follows patterns established by other PHP framework deployment tools, providing a consistent interface for pushing applications to servers.

# SEE ALSO

[cradle](/man/cradle)(1), [rsync](/man/rsync)(1), [ssh](/man/ssh)(1), [deployer](/man/deployer)(1)
