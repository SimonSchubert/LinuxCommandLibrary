# TLDR

**Add a dependency**

```bun add [lodash]```

**Add a dev dependency**

```bun add -D [jest]```

**Add multiple packages**

```bun add [react] [react-dom]```

**Add with exact version**

```bun add --exact [typescript@5.0.0]```

**Add globally**

```bun add -g [typescript]```

**Add from git repository**

```bun add git+https://github.com/[user]/[repo]```

**Add as peer dependency**

```bun add -P [react]```

**Dry run without changes**

```bun add --dry-run [package]```

# SYNOPSIS

**bun add** [_options_] _package_ ...

# DESCRIPTION

**bun add** adds packages to package.json and installs them into node_modules. It updates or creates bun.lockb for reproducible installs. The command is significantly faster than npm or yarn alternatives.

# PARAMETERS

**-D, --dev**
> Add to devDependencies

**-P, --peer**
> Add to peerDependencies

**-O, --optional**
> Add to optionalDependencies

**-E, --exact**
> Use exact version without ^ or ~ prefix

**-g, --global**
> Install globally to Bun's global store

**--production**
> Skip devDependencies

**--registry** _url_
> Use custom npm registry

**--lockfile-only**
> Update lockfile without installing

**--dry-run**
> Simulate without making changes

**--force**
> Force install despite warnings

# PACKAGE SOURCES

Supports npm registry packages, semver ranges, git URLs (git+https://...), local paths (file:../path), and workspace packages (workspace:*).

# CAVEATS

Creates bun.lockb lockfile format. Package versions default to caret (^) ranges unless --exact is specified. Global packages are stored in Bun's global store, not system-wide.

# SEE ALSO

[bun](/man/bun)(1), [bun-install](/man/bun-install)(1), [bun-remove](/man/bun-remove)(1), [npm-install](/man/npm-install)(1)
