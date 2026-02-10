# TAGLINE

installs from package-lock

# TLDR

**Clean install from lockfile**

```npm ci```

**Install production only**

```npm ci --production```

**Install with legacy peer deps**

```npm ci --legacy-peer-deps```

**Silent install**

```npm ci --silent```

# SYNOPSIS

**npm** **ci** [_options_]

# PARAMETERS

**--production**
> Skip devDependencies.

**--legacy-peer-deps**
> Ignore peer dep conflicts.

**--silent**
> Suppress output.

**--help**
> Display help information.

# DESCRIPTION

**npm ci** installs from package-lock.json exactly. Designed for CI environments.

The command removes node_modules first. Faster and more deterministic than npm install.

# CAVEATS

Requires package-lock.json. Deletes node_modules. Fails on lockfile mismatch.

# HISTORY

npm ci was added to **npm 5.7** for deterministic builds in continuous integration pipelines.

# SEE ALSO

[npm](/man/npm)(1), [npm-install](/man/npm-install)(1), [package-lock.json](/man/package-lock.json)(5)

