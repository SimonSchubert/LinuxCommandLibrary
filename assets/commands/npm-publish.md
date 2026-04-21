# TAGLINE

Upload a package to the npm registry

# TLDR

**Publish the package in the current directory**

```npm publish```

**Publish with a distribution tag (e.g. beta, next)**

```npm publish --tag [beta]```

**Publish a scoped package publicly**

```npm publish --access public```

**Simulate a publish without uploading**

```npm publish --dry-run```

**Publish a specific tarball or folder**

```npm publish [./package.tgz]```

**Publish with 2FA one-time password**

```npm publish --otp=[123456]```

**Publish with supply-chain provenance (CI only)**

```npm publish --provenance --access public```

# SYNOPSIS

**npm** **publish** [_package-spec_] [_options_]

# PARAMETERS

_package-spec_
> Path to a folder or tarball to publish. Defaults to the current directory.

**--tag** _TAG_
> Register the published version under the given dist-tag instead of `latest`.

**--access** _restricted_|_public_
> Set initial access for a scoped package. Required as `public` for new scoped packages or when using `--provenance`.

**--dry-run**
> Report what would be published without uploading anything.

**--otp** _CODE_
> Supply a one-time password from a 2FA authenticator.

**--provenance**
> Generate and attach a supply-chain provenance statement (npm >= 9.5.0, supported CI only).

**--provenance-file** _FILE_
> Attach a pre-generated provenance bundle instead of creating one.

**-w**, **--workspace** _NAME_
> Publish a specific workspace package.

**--workspaces**
> Publish every configured workspace.

**--include-workspace-root**
> Also include the workspace root when `--workspaces` is used.

**--help**
> Display help information.

# DESCRIPTION

**npm publish** packs the current project (or a given folder/tarball) and uploads it to the configured registry, making the new version installable by others.

Files included in the tarball follow the rules in `.npmignore`, the `files` field of `package.json`, and the standard npm defaults. The `name` and `version` fields must together be unique on the registry; republishing an already-published version is not allowed.

For scoped packages (`@scope/name`), npm treats the package as private by default; pass `--access public` on first publish to make it publicly available.

# CAVEATS

Publishing requires an authenticated npm account (`npm login` or a token via `NPM_TOKEN`). Versions cannot be overwritten; use `npm version` to bump before republishing. Unpublishing is heavily restricted after 72 hours — plan releases carefully. `--provenance` only works from supported CI environments with the right `repository` field set in `package.json`.

# HISTORY

**npm publish** has been the primary mechanism for sharing JavaScript packages since npm's early releases. Supply-chain provenance via Sigstore was added in **npm 9.5.0 (2023)**, and trusted publishing (OIDC-based, tokenless) was introduced for npm in subsequent releases.

# SEE ALSO

[npm](/man/npm)(1), [npm-version](/man/npm-version)(1), [npm-unpublish](/man/npm-unpublish)(1)

