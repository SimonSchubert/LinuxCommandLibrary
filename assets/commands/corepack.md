# TAGLINE

Node.js package manager manager

# TLDR

**Enable Corepack**

```corepack enable```

**Disable Corepack**

```corepack disable```

**Prepare specific package manager version**

```corepack prepare [yarn@4.0.0] --activate```

**Update package.json with package manager**

```corepack use [pnpm@9.x]```

**Install from downloaded archive**

```corepack hydrate [./corepack.tgz]```

**Pack package manager for offline use**

```corepack pack [yarn@4.0.0]```

# SYNOPSIS

**corepack** _command_ [_arguments_]

# DESCRIPTION

**corepack** is Node.js's package manager manager. It transparently manages Yarn, npm, and pnpm versions per project, using the "packageManager" field in package.json. This ensures that each project uses its specified package manager version without requiring global installations or manual version switching.

Included with Node.js from version 14.19.0 to 24.x, Corepack acts as a shim that intercepts package manager commands and automatically downloads and uses the correct version specified in the project's configuration. This eliminates "works on my machine" issues caused by package manager version mismatches across development teams.

The tool maintains a local cache of package manager versions and can operate in offline mode using packed archives. Zero runtime dependencies make it lightweight and reliable for CI/CD environments.

# COMMANDS

**enable**
> Install shims for package managers in PATH

**disable**
> Remove shims, restore direct access

**prepare**
> Download and cache package manager version

**use**
> Update package.json with packageManager field

**hydrate**
> Install package manager from archive

**pack**
> Create archive for offline installation

# PARAMETERS

**--activate**
> Set as default after preparing

# PACKAGE.JSON INTEGRATION

```json
{
  "packageManager": "pnpm@9.0.0"
}
```

Corepack reads this field and ensures the correct version is used.

# ENVIRONMENT

**COREPACK_HOME**
> Cache directory for package managers

**COREPACK_ENABLE_DOWNLOAD_PROMPT**
> Prompt before downloading

**COREPACK_ENV_FILE**
> Custom env file path (set to 0 to disable)

# OFFLINE USAGE

```
corepack pack yarn@4.0.0           # Create archive
corepack hydrate ./yarn.tgz        # Install from archive
```

# CAVEATS

Must be enabled before use. Respects packageManager in nearest package.json. Zero runtime dependencies.

# SEE ALSO

[npm](/man/npm)(1), [yarn](/man/yarn)(1), [pnpm](/man/pnpm)(1), [node](/man/node)(1)
