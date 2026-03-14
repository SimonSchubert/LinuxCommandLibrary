# TAGLINE

Check correctness of a Cargo.toml manifest

# TLDR

**Verify current project manifest**

```cargo verify-project```

**Verify specific manifest**

```cargo verify-project --manifest-path [path/to/Cargo.toml]```

**Verify with locked dependencies**

```cargo verify-project --locked```

**Verify offline** (no network access)

```cargo verify-project --frozen```

# SYNOPSIS

**cargo verify-project** [_options_]

# DESCRIPTION

**cargo verify-project** parses and validates the local Cargo.toml manifest file. It outputs a JSON object indicating whether the manifest is syntactically correct and contains all required fields, along with error details on failure.

This command is useful in CI/CD pipelines and pre-commit hooks for catching manifest errors early. It checks syntax correctness, valid dependency specifications, proper metadata formatting, and required fields. It does not verify that dependencies actually exist on a registry, only that the manifest itself is well-formed. The exit status is 0 for valid manifests and 1 for invalid ones.

# PARAMETERS

**--manifest-path** _path_
> Path to Cargo.toml file.

**--locked**
> Assert that Cargo.lock is up-to-date.

**--frozen**
> Assert that Cargo.lock is up-to-date and prevent network access.

**--offline**
> Run without accessing the network.

**-v**, **--verbose**
> Use verbose output.

**-q**, **--quiet**
> Suppress cargo output messages.

**--config** _KEY=VALUE_
> Override a Cargo configuration value.

**-C** _path_
> Change to directory before executing.

# OUTPUT

**Success**
```json
{"success":"true"}
```

**Failure**
```json
{"invalid":"error message"}
```

# EXIT STATUS

**0**
> Manifest is valid.

**1**
> Manifest is invalid.

# CAVEATS

Does not verify that dependencies actually exist on a registry, only that the manifest syntax is well-formed. Useful for CI/CD pipelines and pre-commit hooks.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-check](/man/cargo-check)(1)
