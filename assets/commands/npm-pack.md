# TLDR

**Pack current package**

```npm pack```

**Pack specific package**

```npm pack [package]```

**Pack without gzip**

```npm pack --pack-destination [./dist]```

**Dry run (list contents)**

```npm pack --dry-run```

**Output as JSON**

```npm pack --json```

# SYNOPSIS

**npm pack** [_options_] [_packages_...]

# PARAMETERS

**--dry-run**
> Show contents without packing.

**--json**
> Output as JSON.

**--pack-destination** _dir_
> Output directory.

**--workspace** _ws_
> Pack specific workspace.

# DESCRIPTION

**npm pack** creates a tarball of a package exactly as it would be published. This is useful for testing what will be included in a published package.

The tarball can be installed locally to test the package.

# WORKFLOW

```bash
# Create tarball
npm pack
# Creates package-1.0.0.tgz

# Test installation
npm install ./package-1.0.0.tgz

# Check contents without creating file
npm pack --dry-run
```

# FILES INCLUDED

```
- Files in package.json "files"
- package.json
- README
- LICENSE
- CHANGELOG
Excluded by .npmignore
```

# CAVEATS

Different from npm publish. Respects .npmignore and files field. Useful for pre-publish testing.

# HISTORY

npm pack was added to allow developers to test package contents before publishing to the registry.

# SEE ALSO

[npm](/man/npm)(1), [npm-publish](/man/npm-publish)(1), [npm-install](/man/npm-install)(1)
