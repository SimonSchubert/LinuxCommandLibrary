# TLDR

**Yank version from registry**

```cargo yank [crate@1.0.0]```

**Yank with version flag**

```cargo yank --version [1.0.0] [crate]```

**Undo yank**

```cargo yank --undo [crate@1.0.0]```

**Yank from alternate registry**

```cargo yank --registry [my-registry] [crate@1.0.0]```

# SYNOPSIS

**cargo yank** [_options_] _crate_@_version_
**cargo yank** [_options_] --version _version_ [_crate_]

# DESCRIPTION

**cargo yank** marks a crate version as yanked on the registry. Yanked versions cannot be used as new dependencies but existing Cargo.lock files continue to work. Does not delete data.

Requires authentication via cargo login.

# PARAMETERS

**--version** _version_
> Version to yank

**--undo**
> Restore yanked version

**--registry** _name_
> Target registry

**--index** _url_
> Registry index URL

**--token** _token_
> API token

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

# BEHAVIOR

**Yanked versions**
- Cannot be added as new dependencies
- Existing Cargo.lock references still work
- Not deleted from registry

# WHEN TO YANK

- Accidental publish
- Unintentional semver breakage
- Significantly broken functionality
- Security issues (consider RustSec instead)

# BEST PRACTICE

Publish a fixed version (e.g., 1.5.1) before yanking the broken version (1.5.0).

# CAVEATS

crates.io is a permanent archive; yanking marks version unavailable but doesn't delete. For security issues, RustSec advisories are less disruptive.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-publish](/man/cargo-publish)(1), [cargo-owner](/man/cargo-owner)(1)
