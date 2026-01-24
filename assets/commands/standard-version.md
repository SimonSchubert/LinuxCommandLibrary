# TLDR

**Release new version**

```standard-version```

**First release**

```standard-version --first-release```

**Pre-release version**

```standard-version --prerelease alpha```

**Dry run**

```standard-version --dry-run```

**Specific version bump**

```standard-version --release-as [major|minor|patch]```

**Skip changelog**

```standard-version --skip.changelog```

# SYNOPSIS

**standard-version** [_--release-as type_] [_--prerelease tag_] [_options_]

# PARAMETERS

**--first-release**
> First version.

**--release-as** _TYPE_
> Version bump type.

**--prerelease** _TAG_
> Pre-release tag.

**--dry-run**
> Preview only.

**--skip.changelog**
> Skip changelog.

**--sign**
> Sign tags.

# DESCRIPTION

**standard-version** automates versioning. It follows conventional commits.

Automatic version bumps. Based on commit types.

Changelog generation. From commit messages.

Git tag creation. Semantic versions.

Conventional commits. feat, fix, breaking.

# CAVEATS

Needs conventional commits. Node.js project. Git repository required.

# HISTORY

**standard-version** was created for automated semantic versioning based on Conventional Commits specification.

# SEE ALSO

[npm-version](/man/npm-version)(1), [semantic-release](/man/semantic-release)(1), [git](/man/git)(1)
