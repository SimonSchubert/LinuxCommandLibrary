# TLDR

**Publish a package** to npm registry

```bun publish```

**Publish with a specific tag**

```bun publish --tag [beta]```

**Publish with public access** (scoped packages)

```bun publish --access public```

**Dry run** without actually publishing

```bun publish --dry-run```

# SYNOPSIS

**bun** **publish** [_options_]

# PARAMETERS

**--tag** _tag_
> Publish with a specific dist-tag (default: latest).

**--access** _public|restricted_
> Set access level for scoped packages.

**--dry-run**
> Show what would be published without actually publishing.

**--otp** _code_
> One-time password for 2FA.

# DESCRIPTION

**bun publish** publishes the current package to the npm registry. It reads package configuration from package.json and uploads the package tarball.

Before publishing, ensure you're logged in with **bun login** or have appropriate credentials configured.

# CAVEATS

Requires authentication to the npm registry. Scoped packages (@org/name) are private by default; use **--access public** for public scoped packages.

# SEE ALSO

[bun](/man/bun)(1), [npm-publish](/man/npm-publish)(1)
