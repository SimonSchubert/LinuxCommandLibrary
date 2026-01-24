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

**vsce** manages VS Code extensions. It packages and publishes to the marketplace.

Packaging creates .vsix file. Install locally or distribute.

Publishing uploads to marketplace. Version bumping automatic.

Publisher identity required. Create or login to publish.

Show displays metadata. Stars, downloads, description.

Listing reveals package contents. Verify before publishing.

# CAVEATS

Requires marketplace account. Azure DevOps PAT needed. Extension guidelines apply.

# HISTORY

**vsce** (Visual Studio Code Extension Manager) is Microsoft's CLI for VS Code extension management.

# SEE ALSO

[code](/man/code)(1), [npm](/man/npm)(1)
