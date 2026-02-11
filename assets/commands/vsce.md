# TAGLINE

VS Code extension manager CLI

# TLDR

**Package extension**

```vsce package```

**Publish extension**

```vsce publish```

**Publish with version bump**

```vsce publish [minor]```

**Login to marketplace**

```vsce login [publisher-name]```

**Show extension info**

```vsce show [publisher.extension]```

**List files in package**

```vsce ls```

**Create publisher**

```vsce create-publisher [name]```

# SYNOPSIS

**vsce** _command_ [_options_]

# PARAMETERS

**package**
> Create .vsix file.

**publish** [_VERSION_]
> Publish to marketplace.

**login** _PUBLISHER_
> Authenticate.

**show** _EXTENSION_
> Extension info.

**ls**
> List package files.

**create-publisher** _NAME_
> Create publisher.

**unpublish** _EXTENSION_
> Remove from marketplace.

**-p**, **--pat** _TOKEN_
> Personal access token.

# DESCRIPTION

**vsce** (Visual Studio Code Extension Manager) is the official command-line tool for packaging, publishing, and managing VS Code extensions on the Visual Studio Marketplace. It handles the full lifecycle of extension development from local packaging to public distribution.

The packaging command bundles an extension project into a .vsix file that can be installed locally or shared directly. Publishing uploads the packaged extension to the Visual Studio Marketplace, with support for automatic version bumping using semver increments (major, minor, patch).

A publisher identity is required for marketplace operations, which can be created through the tool or the marketplace web interface. Authentication uses Azure DevOps personal access tokens. The tool also provides commands for listing package contents before publishing and displaying extension metadata such as download counts and ratings.

# CAVEATS

Requires marketplace account. Azure DevOps PAT needed. Extension guidelines apply.

# HISTORY

**vsce** (Visual Studio Code Extension Manager) is Microsoft's CLI for VS Code extension management.

# SEE ALSO

[code](/man/code)(1), [npm](/man/npm)(1)
