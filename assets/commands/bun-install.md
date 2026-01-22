# TLDR

**Install all dependencies**

```bun install```

**Add a dependency**

```bun add [package]```

**Add a dev dependency**

```bun add -d [package]```

**Add with exact version**

```bun add --exact [package]```

**Remove a dependency**

```bun remove [package]```

**Install without running lifecycle scripts**

```bun install --ignore-scripts```

**Install for production only**

```bun install --production```

# SYNOPSIS

**bun install** [_options_]

**bun add** [_options_] _package_ ...

**bun remove** _package_ ...

# DESCRIPTION

**bun install** is Bun's built-in package manager, a fast alternative to npm, yarn, and pnpm. It installs dependencies from package.json into a node_modules folder compatible with Node.js.

The package manager uses a global cache to avoid re-downloading packages and employs the fastest system calls available for writing files.

# PARAMETERS

**-d, --dev**
> Add as development dependency

**--exact**
> Pin package to exact version

**--production**
> Install only production dependencies

**--ignore-scripts**
> Skip running lifecycle scripts

**--frozen-lockfile**
> Error if lockfile needs update

**--force**
> Force re-download of all packages

**--global**
> Install package globally

# LOCKFILE

Bun uses **bun.lock** (text-based) as the default lockfile since v1.2. Remove other lockfiles (package-lock.json, yarn.lock, pnpm-lock.yaml) before first install to avoid conflicts.

# TRUSTED DEPENDENCIES

Bun does not run dependency lifecycle scripts by default for security. Allow-list trusted packages using **trustedDependencies** in package.json.

# CAVEATS

Compatible with existing package.json files. Supports workspaces, git/http/tarball dependencies, and custom registries. Some npm-specific features may behave differently.

# SEE ALSO

[bun](/man/bun)(1), [bun-add](/man/bun-add)(1), [bun-remove](/man/bun-remove)(1), [npm](/man/npm)(1), [yarn](/man/yarn)(1)
