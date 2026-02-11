# TAGLINE

Automated semantic versioning from commits

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

**standard-version** automates semantic versioning and changelog generation for Node.js projects based on the Conventional Commits specification. It analyzes commit messages (feat, fix, BREAKING CHANGE) to determine whether to bump the major, minor, or patch version.

The tool updates the version in package.json, generates or updates a CHANGELOG.md from commit messages, creates a git commit with the version bump, and tags it with the new version number. A dry run mode previews changes without modifying files. Pre-release tags (alpha, beta, rc) are supported for staged releases.

# CAVEATS

Needs conventional commits. Node.js project. Git repository required.

# HISTORY

**standard-version** was created for automated semantic versioning based on Conventional Commits specification.

# SEE ALSO

[npm-version](/man/npm-version)(1), [semantic-release](/man/semantic-release)(1), [git](/man/git)(1)
