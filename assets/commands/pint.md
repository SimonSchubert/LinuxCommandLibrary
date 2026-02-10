# TAGLINE

validates Prometheus alerting and recording rules

# TLDR

**Lint Prometheus rules**

```pint lint [rules.yaml]```

**Check rules against live Prometheus**

```pint -c [config.yaml] lint [rules.yaml]```

**Watch for changes**

```pint watch [rules/]```

**Show rule problems**

```pint lint --output=json [rules.yaml]```

**CI mode**

```pint ci```

**List available checks**

```pint checks```

# SYNOPSIS

**pint** [_-c config_] _command_ [_options_] [_files_]

# PARAMETERS

**lint**
> Check rules for problems.

**watch**
> Watch and lint continuously.

**ci**
> CI/CD mode.

**checks**
> List available checks.

**-c**, **--config** _FILE_
> Configuration file.

**--output** _FORMAT_
> Output format.

**--no-color**
> Disable colors.

**-v**, **--verbose**
> Verbose output.

# CHECKS

**promql/syntax** - Query syntax
**promql/series** - Series existence
**alerts/for** - Alert duration
**alerts/template** - Template errors
**rule/duplicate** - Duplicate rules

# DESCRIPTION

**pint** validates Prometheus alerting and recording rules. It catches errors before deployment.

Syntax checking validates PromQL queries. Invalid queries won't load in Prometheus.

Live checking queries actual Prometheus. This verifies metrics exist and selectors match.

Template validation catches annotation and label errors. Alert messages are verified.

Watch mode monitors rule files. Changes trigger immediate re-checking.

# CAVEATS

Live checks need Prometheus access. Some checks have false positives. Configuration complexity.

# HISTORY

**pint** was created by **Cloudflare** for validating their Prometheus rules at scale. It provides deeper analysis than Prometheus's built-in rule checking.

# SEE ALSO

[promtool](/man/promtool)(1), [prometheus](/man/prometheus)(1), [amtool](/man/amtool)(1)
