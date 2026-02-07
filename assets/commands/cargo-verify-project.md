# TAGLINE

Check correctness of a Cargo.toml manifest

# TLDR

**Verify current project manifest**

```cargo verify-project```

**Verify specific manifest**

```cargo verify-project --manifest-path [path/to/Cargo.toml]```

**Verify offline**

```cargo verify-project --offline```

# SYNOPSIS

**cargo verify-project** [_options_]

# DESCRIPTION

**cargo verify-project** parses and validates the local Cargo.toml manifest file. It outputs a JSON object indicating whether the manifest is syntactically correct and contains all required fields, along with error details on failure.

This command is useful in CI/CD pipelines and pre-commit hooks for catching manifest errors early. It checks syntax correctness, valid dependency specifications, proper metadata formatting, and required fields. It does not verify that dependencies actually exist on a registry, only that the manifest itself is well-formed. The exit status is 0 for valid manifests and 1 for invalid ones.

# PARAMETERS

**--manifest-path** _path_
> Path to Cargo.toml

**--locked**
> Assert Cargo.lock is up-to-date

**--frozen**
> Assert Cargo.lock is up-to-date and no network

**--offline**
> Don't access network

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

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
> Manifest is valid

**1**
> Manifest is invalid

# VALIDATION

Checks:
- Syntax correctness
- Valid dependency specifications
- Proper metadata formatting
- Required fields present

# CAVEATS

Useful for CI/CD pipelines and pre-commit hooks. Does not verify dependencies exist, only manifest syntax.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-check](/man/cargo-check)(1)
