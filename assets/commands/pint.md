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

**pint** validates Prometheus alerting and recording rules, catching errors before deployment. It goes beyond basic syntax checking by querying a live Prometheus server to verify that referenced metrics actually exist and that selectors return data.

Key capabilities include: PromQL syntax validation, series existence checks against live Prometheus, alert template validation (annotation and label rendering), duplicate rule detection, and cost estimation for expensive queries.

The **ci** mode is designed for pull request workflows — it only reports problems in changed files, making it practical for large rule repositories. The **watch** mode continuously monitors rule files and re-checks on changes.

# CAVEATS

Live checks require network access to a Prometheus server. Some checks may produce false positives for metrics that are intermittently scraped. Configuration is required to connect pint to Prometheus instances.

# HISTORY

**pint** was created by **Cloudflare** for validating their Prometheus rules at scale. It provides deeper analysis than Prometheus's built-in rule checking.

# SEE ALSO

[promtool](/man/promtool)(1), [prometheus](/man/prometheus)(1), [amtool](/man/amtool)(1)
