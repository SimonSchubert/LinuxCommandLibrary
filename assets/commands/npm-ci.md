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
> Skip devDependencies (npm 6; use --omit=dev in npm 7+).

**--omit** _TYPE_
> Omit dependency type (dev, optional, peer).

**--legacy-peer-deps**
> Ignore peer dep conflicts.

**--silent**
> Suppress output.

**--help**
> Display help information.

# DESCRIPTION

**npm ci** performs a clean install of dependencies based exactly on the package-lock.json file. It is designed for automated environments like CI/CD pipelines where reproducibility is critical.

The command deletes any existing node_modules directory before installing, ensuring a clean state. Unlike **npm install**, it never modifies the lockfile — if package.json and package-lock.json are out of sync, it fails with an error rather than silently updating.

# CAVEATS

Requires package-lock.json. Deletes node_modules. Fails on lockfile mismatch.

# HISTORY

npm ci was added to **npm 5.7** for deterministic builds in continuous integration pipelines.

# SEE ALSO

[npm](/man/npm)(1), [npm-install](/man/npm-install)(1), [package-lock.json](/man/package-lock.json)(5)

