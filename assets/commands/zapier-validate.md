# TAGLINE

Validate Zapier integration configuration

# TLDR

**Validate integration**

```zapier-platform validate```

**Skip the server-side style checks**

```zapier-platform validate --without-style```

**Skip the build step** before validating

```zapier-platform validate --skip-build```

**Fail in CI** on checks that would block publishing

```zapier-platform validate --fail-for-publishing```

**Print results as JSON**

```zapier-platform validate --format json```

# SYNOPSIS

**zapier-platform** **validate** [_--without-style_] [_--skip-build_] [_--fail-for-publishing_] [_-f_ _format_]

# PARAMETERS

**--without-style**
> Skip pinging the Zapier server to run further checks.

**--skip-build**
> Skip running the _zapier-build script before validation.

**--fail-for-publishing**
> Also exit non-zero when a check would block promoting or publishing the integration.

**-f**, **--format** _FORMAT_
> Output format: plain, json, raw, row, or table (default: table).

**-d**, **--debug**
> Show extra debugging output.

# DESCRIPTION

**zapier-platform validate** (formerly **zapier validate**) checks a Zapier integration for structural errors using a JSON Schema routine, the same one that runs during **zapier-platform build**, **upload**, **push**, and **test**. Run it before **zapier-platform push** to catch issues early, since invalid integrations cannot be uploaded.

Further style checks are performed on the Zapier server unless **--without-style** is passed. By default the command exits non-zero only when the integration is structurally invalid.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-test](/man/zapier-test)(1), [zapier-push](/man/zapier-push)(1)

# RESOURCES

```[Source code](https://github.com/zapier/zapier-platform)```

```[Documentation](https://docs.zapier.com/integrations/build-cli/overview)```

<!-- verified: 2026-11-09 -->
