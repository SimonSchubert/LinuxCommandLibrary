# TAGLINE

VS Code extension manager CLI

# TLDR

**Package** an extension into a .vsix file

```vsce package```

**Publish** an extension to the Marketplace

```vsce publish```

**Publish with an automatic** version bump

```vsce publish [patch|minor|major]```

**Log in** as a publisher

```vsce login [publisher_name]```

**Verify a Personal Access Token**

```vsce verify-pat [publisher_name]```

**Show metadata** for an extension

```vsce show [publisher.extension]```

**List files** that would be included in the package

```vsce ls```

**Unpublish** an extension

```vsce unpublish [publisher.extension]```

# SYNOPSIS

**vsce** _command_ [_options_]

# PARAMETERS

**package**
> Package the extension into a .vsix file.

**publish** [_VERSION_]
> Publish the extension to the Marketplace. _VERSION_ may be `major`, `minor`, `patch`, or an explicit version.

**login** _PUBLISHER_
> Store credentials for a publisher.

**logout** _PUBLISHER_
> Remove a publisher's stored credentials.

**verify-pat** [_PUBLISHER_]
> Verify that the Personal Access Token has publish rights.

**show** _EXTENSION_
> Show metadata (downloads, ratings, versions) for an extension.

**search** _TEXT_
> Search the Marketplace for extensions.

**ls**
> List files that would be packaged or published.

**ls-publishers**
> List known publishers.

**delete-publisher** _NAME_
> Delete a publisher.

**unpublish** [_EXTENSION_]
> Remove an extension from the Marketplace.

**-p**, **--pat** _TOKEN_
> Personal Access Token used to authenticate.

**-t**, **--target** _TARGET_
> Target platform (e.g., `linux-x64`, `win32-x64`).

**-o**, **--out** _PATH_
> Output file or directory for the packaged .vsix.

**--pre-release**
> Mark the package or publication as a pre-release.

**--no-yarn** / **--yarn**
> Force use of npm or Yarn for dependency installation.

**--skip-duplicate**
> Skip publishing when the same version already exists.

# DESCRIPTION

**vsce** (Visual Studio Code Extension Manager) is Microsoft's official CLI for packaging, publishing, and managing VS Code extensions on the Visual Studio Marketplace. It handles the full lifecycle of extension development from local packaging to public distribution.

The `package` command bundles an extension project into a `.vsix` file that can be installed locally or shared directly. The `publish` command uploads the packaged extension to the Marketplace, with optional automatic version bumping using semver increments (major, minor, patch).

A publisher identity is required for Marketplace operations. Authentication uses Azure DevOps Personal Access Tokens. Additional commands handle publisher credentials, inspection of package contents, and querying Marketplace metadata.

# CAVEATS

Requires a Marketplace account and an Azure DevOps PAT with the Marketplace (Manage) scope. Extensions must follow the Marketplace publishing guidelines. The package is typically installed via `npm install -g @vscode/vsce`.

# HISTORY

**vsce** (Visual Studio Code Extension Manager) is developed by **Microsoft** and distributed on npm as `@vscode/vsce`. It has been the primary tool for packaging and publishing VS Code extensions since the Marketplace launched.

# SEE ALSO

[code](/man/code)(1), [npm](/man/npm)(1)
