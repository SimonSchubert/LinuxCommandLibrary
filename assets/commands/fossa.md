# TLDR

**Analyze dependencies**

```fossa analyze```

**Test for license issues**

```fossa test```

**Report on a project**

```fossa report attribution```

**Initialize configuration**

```fossa init```

**List analyzed projects**

```fossa list-targets```

# SYNOPSIS

**fossa** _command_ [_options_]

# SUBCOMMANDS

**analyze**
> Analyze project dependencies.

**test**
> Check for license issues.

**report**
> Generate reports.

**init**
> Initialize configuration.

**list-targets**
> List analysis targets.

# PARAMETERS

**--project** _name_
> Project name.

**--revision** _rev_
> Project revision.

**--config** _file_
> Config file path.

# DESCRIPTION

**fossa** analyzes dependencies for license compliance and security vulnerabilities. Integrates with CI/CD pipelines to enforce license policies.

# SEE ALSO

[snyk](/man/snyk)(1), [npm-audit](/man/npm-audit)(1)

