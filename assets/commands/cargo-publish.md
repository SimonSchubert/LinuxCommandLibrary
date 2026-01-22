# TLDR

**Publish to crates.io**

```cargo publish```

**Dry run without uploading**

```cargo publish --dry-run```

**Publish without verification**

```cargo publish --no-verify```

**Allow uncommitted changes**

```cargo publish --allow-dirty```

**Publish to alternate registry**

```cargo publish --registry [my-registry]```

**Publish specific package**

```cargo publish -p [crate_name]```

# SYNOPSIS

**cargo publish** [_options_]

# DESCRIPTION

**cargo publish** uploads a package to crates.io or another registry. Creates .crate archive, verifies it builds, and uploads. Publishes are permanent and cannot be deleted.

Requires authentication via cargo login.

# PARAMETERS

**--dry-run**
> Perform checks without uploading

**--no-verify**
> Skip build verification

**--allow-dirty**
> Allow uncommitted VCS changes

**--registry** _name_
> Target registry

**--index** _url_
> Registry index URL

**--token** _token_
> API token

**-p**, **--package** _spec_
> Package to publish

**--target** _triple_
> Build target for verification

**-j**, **--jobs** _n_
> Parallel jobs

**--features** _features_
> Enable features for verification

**--all-features**
> Enable all features

# PREPARATION

1. Create account on crates.io
2. Verify email address
3. Generate API token
4. Run cargo login

# RELEASING NEW VERSIONS

1. Update version in Cargo.toml
2. Optionally run cargo package
3. Run cargo publish

# CAVEATS

Publishes are permanent. Use cargo yank to mark versions as deprecated but not delete them. Follow semver for version changes.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-package](/man/cargo-package)(1), [cargo-yank](/man/cargo-yank)(1)
