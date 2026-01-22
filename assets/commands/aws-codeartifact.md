# TLDR

**Login to a CodeArtifact repository** for npm

```aws codeartifact login --tool npm --domain [my-domain] --repository [my-repo]```

**Get an authorization token** for a domain

```aws codeartifact get-authorization-token --domain [my-domain] --query authorizationToken --output text```

**Create a new domain** for artifact storage

```aws codeartifact create-domain --domain [my-domain]```

**Create a repository** within a domain

```aws codeartifact create-repository --domain [my-domain] --repository [my-repo]```

**List all packages** in a repository

```aws codeartifact list-packages --domain [my-domain] --repository [my-repo]```

**Get repository endpoint** for a specific format

```aws codeartifact get-repository-endpoint --domain [my-domain] --repository [my-repo] --format [npm|pypi|maven|nuget]```

# SYNOPSIS

**aws codeartifact** _command_ [_options_]

# DESCRIPTION

**aws codeartifact** is the AWS CLI interface for AWS CodeArtifact, a fully managed artifact repository service compatible with npm, PyPI, Maven, NuGet, Swift, Ruby, Cargo, and generic package formats. It enables teams to publish, share, and fetch packages from both CodeArtifact and public repositories.

CodeArtifact organizes packages into **repositories** within **domains**. Domains provide centralized asset storage with a single encryption key, while repositories can chain together through **upstream** connections to fetch packages from external sources.

# COMMANDS

**login**
> Configure package manager credentials for repository access

**get-authorization-token**
> Get temporary credentials for API access

**create-domain**
> Create a new domain for organizing repositories

**create-repository**
> Create a repository within a domain

**list-packages**
> List packages in a repository

**describe-package-version**
> Get details about a specific package version

**copy-package-versions**
> Copy package versions between repositories

**associate-external-connection**
> Connect repository to public registries (npmjs, PyPI, etc.)

# CAVEATS

Authorization tokens expire after 12 hours by default. The **login** command must be re-run when tokens expire. Cross-account access requires explicit domain permissions policies. Upstream repository resolution follows a specific order and cached packages may not reflect latest upstream versions.

# HISTORY

AWS CodeArtifact was launched in **June 2020** as a managed artifact repository service. It was designed to replace self-hosted solutions like Nexus or Artifactory. Support for additional package formats including Swift, Ruby, and Cargo was added in subsequent releases through **2022-2023**.

# SEE ALSO

[aws](/man/aws)(1), [npm](/man/npm)(1), [pip](/man/pip)(1), [maven](/man/maven)(1)
