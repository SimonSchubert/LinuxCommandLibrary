# TLDR

**Add dependency**

```cargo add [serde]```

**Add with specific version**

```cargo add [serde@1.0]```

**Add with features**

```cargo add [tokio] --features [full]```

**Add as dev dependency**

```cargo add [mockall] --dev```

**Add as build dependency**

```cargo add [cc] --build```

**Add from git repository**

```cargo add --git [https://github.com/user/repo]```

**Add from local path**

```cargo add --path [../my-crate]```

**Add as optional dependency**

```cargo add [feature-crate] --optional```

**Rename dependency**

```cargo add [serde] --rename [my_serde]```

# SYNOPSIS

**cargo add** [_options_] _crate_...
**cargo add** [_options_] --path _path_
**cargo add** [_options_] --git _url_ [_crate_...]

# DESCRIPTION

**cargo add** adds or modifies dependencies in Cargo.toml. It fetches crate information from the registry and updates the manifest with the correct version constraints. Built into Cargo since v1.62.

# PARAMETERS

**--dev**, **-D**
> Add as development dependency

**--build**, **-B**
> Add as build dependency

**--optional**
> Mark dependency as optional

**--rename** _name_
> Rename the dependency

**--features** _features_
> Enable specific features

**--no-default-features**
> Disable default features

**--default-features**
> Re-enable default features

**--path** _path_
> Add dependency from local path

**--git** _url_
> Add dependency from git repository

**--branch** _branch_
> Git branch to use

**--tag** _tag_
> Git tag to use

**--rev** _sha_
> Git commit to use

**-p**, **--package** _spec_
> Package to modify

**--dry-run**
> Show changes without modifying files

# OUTPUT

Lists enabled (+) and disabled (-) features of added dependencies.

# CAVEATS

Updates existing entries with specified flags. For Cargo versions before 1.62, install cargo-edit for this functionality.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-remove](/man/cargo-remove)(1), [cargo-update](/man/cargo-update)(1)
